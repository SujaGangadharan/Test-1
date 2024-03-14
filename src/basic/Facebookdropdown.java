package basic;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebookdropdown {
	
	ChromeDriver driver;
	
	
	@Before
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com/signup");
		driver.manage().window().maximize();
		
	}
	@Test
	public void dropdown()
	{
		WebElement day=driver.findElement(By.xpath("//*[@id=\"day\"]"));
		Select obj=new Select(day);
		obj.selectByValue("04");
		
		WebElement month=driver.findElement(By.xpath("//*[@id=\"month\"]"));
		Select obj1=new Select(month);
		obj1.selectByIndex(06);
		
	WebElement year	=driver.findElement(By.xpath("//*[@id=\"year\"]"));
	Select obj2=new Select(year);
	obj2.selectByVisibleText("1978");
	}

}
