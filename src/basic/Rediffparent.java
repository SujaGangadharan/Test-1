package basic;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Rediffparent {
	ChromeDriver driver;
	
	
	
	@Before
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://www.rediffmail.com");
		driver.manage().window().maximize();
	}
	
	@Test
	public void test()
	{
		driver.findElement(By.xpath("//*[@id='signin_info']/a[2]")).click();
		driver.findElement(By.xpath("//*[@id='tblcrtac']/tbody/tr[3]/td[3]/input")).sendKeys("Suja G");
		driver.findElement(By.xpath("//*[@name='namebe5ddf22']/td[3]/tr[5]/td[3]/input")).sendKeys("sujaalingal");
	}
	
	//*[@id='tblcrtac']/tbody/tr[3]/td[3]/input/td[3]/tr[5]/td[3]
}
