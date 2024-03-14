package basic;



import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CountRediff {
	ChromeDriver driver;
	
	@Before
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
		driver.manage().window().maximize();
	}
	
	@Test
	public void countdropdown()
	{
		WebElement day=driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[22]/td[3]/select[1]"));
		Select ob=new Select(day);
		ob.selectByValue("01");
		List<WebElement> li = ob.getOptions();
		System.out.println("count of days : "+li.size());

	
		
		
		WebElement month=driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[22]/td[3]/select[2]"));
		Select ob1=new Select(month);
		ob1.selectByVisibleText("FEB");
	List<WebElement> li1 = ob1.getOptions();
		System.out.println("count of mnth: " +li1.size());

		WebElement year=driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[22]/td[3]/select[3]"));
		Select ob2=new Select(year);
		ob2.selectByIndex(06);
	List<WebElement> li2 = ob2.getOptions();
	System.out.println("count of year: "+ li2.size());
	
	}

}
