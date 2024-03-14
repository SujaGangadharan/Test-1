package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.PageFactory_fblogin;

public class Fblogintest_pgfactory {
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
		PageFactory_fblogin ob=new PageFactory_fblogin(driver);
		ob.setvalues("sujaalingal@gmail.com","Suja@8774");
		ob.login();
		
	}

}
