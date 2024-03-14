package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Dragdrop {
	WebDriver driver;
	
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
	}
	@BeforeMethod
	public void urlloading()
	{
		driver.get("https://demoqa.com/droppable");
		driver.manage().window().maximize();
		}
	@Test
	public void test()
	{
		WebElement dragme = driver.findElement(By.xpath("//*[@id=\"draggable\"]"));
		WebElement drophere=driver.findElement(By.xpath("//*[@id=\"droppable\"]"));
		Actions act=new Actions(driver);
		act.dragAndDrop(dragme, drophere);
		act.perform();
		
		String text=drophere.getText();
		if(text.equals("Droppped"))
		{
			System.out.println("dropped");
		}
		else
		{
			System.out.println("not expected");
		}
	}

}
