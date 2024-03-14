package basic;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpathcontains {
	
	ChromeDriver driver;
	
	@Before
	public void setup() 
	{
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
	}
	
	@Test
	public void test()
	{
		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("sujaalinkal");
		driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys("abc@123");
		driver.findElement(By.xpath("//*[contains(@id,'u_0_5')]")).click();
		
	}

}
