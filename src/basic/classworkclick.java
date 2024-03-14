package basic;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class classworkclick {
	ChromeDriver driver;
	
	@Before
	public void setup()
	{
		
		driver=new ChromeDriver();
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
		driver.manage().window().maximize();
	}
	
	@Test
	public void test()
	{
		
		Boolean c=driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[15]/td[2]/table/tbody/tr/td[1]/input")).isSelected();
		if(c)
		{
			System.out.println("selected");
		}
		else
		{
			System.out.println("not selected");
		}
		
		Boolean b=driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[24]/td[3]/input[1]")).isSelected();
		if(b)
		{
			System.out.println("selected");
		}
		else
		{
			System.out.println("not selected");
			
		}
		
		Boolean d=driver.findElement(By.xpath("//*[@id=\"wrapper\"]/table[1]/tbody/tr[1]/td[1]/img")).isDisplayed();
		if(d)
		{
			System.out.println("displayed");
		}
		else
		{
			System.out.println("not displayed");
		}
	}

}
