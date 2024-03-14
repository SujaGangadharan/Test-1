package testNG;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Amazonwindowhandling {
	WebDriver driver;
	
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
	}
	@BeforeMethod
	public void urlloading()
	{
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
	}
	@Test
	public void test() throws Exception
	{
		 String parentwindow=driver.getWindowHandle();
		 System.out.println("amazon.in: mobilephones" + driver.getTitle());
		 driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys("mobile phones",Keys.ENTER);
		 
		 driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[3]/div/div/div/div/span/div/div/div/div[1]/div/div[2]/div/span/a/div/img")).click();
		 
		 Set<String> allwindowhandles= driver.getWindowHandles();
		 for(String handle:allwindowhandles)
		  {
			  System.out.println(handle);
			  
			  if(!handle.equalsIgnoreCase(parentwindow))
			  {
				  driver.switchTo().window(handle);
				  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
				 driver.findElement(By.xpath("/html/body/div[4]/div/div[3]/div[8]/div[8]/div/div[1]/div/div[1]/div/div/div[2]/div/div[2]/div/form/div/div/div[37]/div[1]/span/span/span/input")).click();
				 driver.findElement(By.xpath("/html/body/div[10]/div[3]/div[3]/div/div[1]/div[3]/div[1]/div[2]/div[3]/form/span/span/input"));
				 
			  }
		  }
	}
}

