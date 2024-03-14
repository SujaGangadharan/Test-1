package basic;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alertprogram {
	ChromeDriver driver;
	
	@Before
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("file:///C:/Users/Admin%20pc/Desktop/Desktop%20files/alert2.html");
	}
	@Test
	public void alert()
	{
		driver.findElement(By.xpath("/html/body/input[1]")).click();
		//driver.switchTo().alert().accept();
		
		
		Alert a=driver.switchTo().alert();
		String text=a.getText();
		if(text.equals("Hello! am an alert box!!"))
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}
		
		a.accept();
		
		driver.findElement(By.xpath("/html/body/input[2]")).sendKeys("abcd");
		driver.findElement(By.xpath("/html/body/input[3]")).sendKeys("1234");
	}

}
