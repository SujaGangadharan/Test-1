package testNG;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Fileupload_robot {
	
	WebDriver driver;
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}
	@BeforeMethod
	public void urlloading()
	{
		driver.get("https://www.ilovepdf.com/pdf_to_word");
	}
	@Test
	public void test() throws AWTException
	{
		driver.findElement(By.xpath("//*[@id=\"pickfiles\"]/span")).click();
		
		fileupload("D:\\QA Manual Tester - Template 6"
				+ "");
	}
	public void fileupload(String a) throws AWTException {
		//to copy path to clipboard
		StringSelection strSelection=new StringSelection(a);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(strSelection, null);
		
		//to paste into systemwindow
		Robot robot=new Robot();
		 robot.delay(3000);
		
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		
		robot.keyPress(KeyEvent.VK_ENTER);
		
		
	}

}
