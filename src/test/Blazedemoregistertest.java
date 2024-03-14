package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.Blazedemoregister;

public class Blazedemoregistertest {
	WebDriver driver;
	
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
	}
	@BeforeMethod
	public void url()
	{
		driver.get("https://blazedemo.com/register");
	}
	@Test
	public void testregister()
	{
		Blazedemoregister ob=new Blazedemoregister(driver);
		ob.setvalues("Suja", "Luminar", "sujaalingal@gmail.com", "Suja@123", "Suja@123");
		ob.register();
	}
	
	
}
