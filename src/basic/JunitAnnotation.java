package basic;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class JunitAnnotation {
	
	ChromeDriver driver;
	@Before
	public void setup()
	{
		driver =new ChromeDriver();
		driver.get("https://www.google.com");
	}
	@Test
	public void titleverification()
	{
		String title=driver.getTitle();
		System.out.println(title);
		String expected="Google";
		if(title.equals(expected))
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}
	}
	@Test
	public void content()
	{
		String sc=driver.getPageSource();
		System.out.println(sc);
		 if(sc.contains("Gmail"))
		 {
			 System.out.println("pass");
		 }
		 else
		 {
			 System.out.println("fail");
		 }
	}
	@After
	public void browserclose()
	{
		driver.quit();
	}
	}
	


