package basic;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Countfacebook {
	WebDriver driver;
	
	@Before
	public void setup()
	{
		driver= new ChromeDriver();
		driver.get("https://www.facebook.com/signup");
		driver.manage().window().maximize();
		
	}
	@Test
	public void test()
	{
		WebElement day = driver.findElement(By.xpath("//*[@id=\"day\"]"));
		Select obj=new Select(day);
		List<WebElement> days = obj.getOptions();
		System.out.println("count of days:" +days.size());
		
		WebElement month=driver.findElement(By.xpath("//*[@id=\"month\"]"));
		Select obj1=new Select(month);
		List<WebElement> months = obj1.getOptions();
		System.out.println("count of months: "+ months.size());
		
		WebElement year = driver.findElement(By.xpath("//*[@id=\"year\"]"));
		Select obj2=new Select(year);
		List<WebElement> years = obj2.getOptions();
		System.out.println("count of years:"+years.size());
	}

}
