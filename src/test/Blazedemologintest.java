package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.Blazedemologin;


public class Blazedemologintest {
WebDriver driver;
	
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
	}
	@BeforeMethod
	public void url()
	{
		driver.get("https://blazedemo.com/login");
	}
	@Test
	public void testlogin ()
	{
		Blazedemologin ob=new Blazedemologin(driver);
		ob.setvalues("sujaalingal@gmail.com", "Suja@123");
		ob.login();
	
		
		
	}
	
}
