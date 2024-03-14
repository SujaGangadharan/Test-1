package basic;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {
	ChromeDriver driver;
	@Before
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https:/www.facebook.com");
	}
	@Test
	public void titleverification()
	{
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div/div/div[2]/div/div[1]/form/div[1]/div[1]/input")).sendKeys("suja");
		driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("Suja@111");
		driver.findElement(By.xpath("//button[@name='login']")).click();
	}
	@After
	public void browserclose()
	{
		driver.close();
	}

}
