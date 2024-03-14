package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.Fbloginpage;

public class Fblogintest {
	WebDriver driver;
	
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
	}
	@BeforeMethod
	public void url()
	{
		driver.get("https://www.facebook.com/");
	}
	@Test
	public void testlogin()
	{
		Fbloginpage ob=new Fbloginpage(driver);
		ob.setvalues("sujaalingal@gmail.com", "Suja@8774");
		ob.login();
	}

}
