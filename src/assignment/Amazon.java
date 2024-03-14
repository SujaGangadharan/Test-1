package assignment;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {
	ChromeDriver driver;
	
	@Before
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
	}
	@Test
	public void test()
	{
		driver.findElement(By.xpath("//*[@id='twotabsearchtextbox']")).sendKeys("mobiles");
        driver.findElement(By.xpath("//*[@id='nav-cart-count']")).click();
        driver.findElement(By.xpath("//*[@id='nav-link-accountList']/span")).click();
        driver.findElement(By.xpath("//*[@id='ap_email']")).sendKeys("abcd");
        driver.findElement(By.xpath("//*[@id='continue']")).click();
        driver.navigate().back();
        driver.navigate().back();
        driver.navigate().back();
        driver.findElement(By.xpath("//*[@id='nav-xshop']/a[6]")).click();
        driver.findElement(By.xpath("//*[@id='nav-main']/div/a[1]/i")).click();
	}
	

}
