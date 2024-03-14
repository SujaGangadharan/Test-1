package basic;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chromium.ChromiumDriver;


public class Facebookid {
	
	ChromiumDriver driver;
	@Before
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
	}
	@Test
	public void test()
	{
		driver.findElement(By.id("email")).sendKeys("abc123");
		driver.findElement(By.id("pass")).sendKeys("abcd");
		driver.findElement(By.name("login")).click();
		
	}
}
