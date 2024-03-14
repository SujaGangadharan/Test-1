package basic;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Blazedemo {
	
	ChromeDriver driver;
	@Before
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://blazedemo.com/register");
	}
	@Test
	public void test()
	{
		driver.findElement(By.name("name")).sendKeys("Suja");
		driver.findElement(By.name("company")).sendKeys("Luminar");
		driver.findElement(By.name("email")).sendKeys("sujagangadharan99@gmail.com");
		driver.findElement(By.name("password")).sendKeys("Suja@123");
		driver.findElement(By.id("password-confirm")).sendKeys("Suja@123");
		
	}

}
