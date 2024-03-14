package assignment;

import java.io.File;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Herbalasgn {
	WebDriver driver;
	
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
	}
	@BeforeMethod
	public void urlloading()
	{
		driver.get("https://rishiherbalindia.linker.store/");
		driver.manage().window().maximize();;
	}
	@Test
	public void test() throws Exception
	{
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[1]/a/span")).click();
		driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[1]/ul/li[1]/a")).click();
		
		driver.findElement(By.xpath("//*[@id=\"ls-signup-overlay-v1\"]/div/div/div[2]/form/div[1]/input")).sendKeys("testinglmnr@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"ls-signup-overlay-v1\"]/div/div/div[2]/form/div[2]/input")).sendKeys("Test@123");
		driver.findElement(By.xpath("//*[@id=\"ls-signup-overlay-v1\"]/div/div/div[2]/form/div[3]/label/input")).click();
		driver.findElement(By.xpath("//*[@id=\"ls-signup-overlay-v1\"]/div/div/div[2]/form/button")).click();
	
		driver.findElement(By.xpath("//*[@id=\"register-model-signin-link\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"cont-login-with-email\"]/form/div[2]/input")).sendKeys("Test@123");
		driver.findElement(By.xpath("//*[@id=\"cont-login-with-email\"]/form/button[1]")).click();
		Thread.sleep(3000);
		driver.findElement(By.name("query")).sendKeys("Herbal Agro Growth Booster",Keys.ENTER);
		driver.findElement(By.xpath("//*[@id=\"content\"]/div[3]/div[1]/div/div/div[2]/h4/a")).click();
		driver.findElement(By.xpath("//*[@id=\"prod_cont\"]/div/div[4]/button[1]/span")).click();
		driver.navigate().back();
		driver.navigate().back();
		driver.findElement(By.xpath("//*[@id=\"menu\"]/ul/li[4]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"content\"]/div[3]/div[1]/div/div/div[2]/h4/a")).click();
		driver.findElement(By.xpath("//*[@id=\"prod_cont\"]/div/div[4]/button[1]/span")).click();
		driver.findElement(By.xpath("//*[@id=\"menu\"]/ul/li[1]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"menu\"]/ul/li[2]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"menu\"]/ul/li[3]/a")).click();
		Thread.sleep(1000);
		
		JavascriptExecutor obj=(JavascriptExecutor)driver;
		obj.executeScript("window.scrollBy(0,2400)","");
		driver.findElement(By.xpath("/html/body/div/footer/div[1]/div/div[2]/div[2]/div/ul/li[2]/a")).click();
}
	
	@Test
	public void Screensht() throws IOException
	{
	
			 WebElement screenshot=driver.findElement(By.xpath("/html/body/div/footer/div[1]/div/div[2]/div[4]/div/ul/li[1]/a"));
			 File ss = screenshot.getScreenshotAs(OutputType.FILE);
			 FileHandler.copy(ss,new File("D://ss1.png"));
	}
	
	@Test
	public void link() throws Exception
	{
	String baseurl="https://rishiherbalindia.linker.store/";
	driver.get(baseurl);
	URL obj1=new URL(baseurl);
	HttpURLConnection Cntn=(HttpURLConnection)obj1.openConnection();
	Cntn.connect();
	if(Cntn.getResponseCode()==200)
	{
	System.out.println("Valid link");
	}
	else
	{
	System.out.println("Invalid link");
	}
	
		
		
		
		
		
	}

}
