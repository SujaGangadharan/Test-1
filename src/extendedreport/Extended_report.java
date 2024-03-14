package extendedreport;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class Extended_report {
	WebDriver driver;
	
	ExtentHtmlReporter reporter;
	ExtentTest test;
	ExtentReports extent;
	
	@BeforeTest
	public void beftest()
	{
		//reporter=new	ExtentHtmlReporter(System.getProperty("user.dir")+"/reports/myreport.html");
		reporter=new ExtentHtmlReporter("./Reporter/myreport1.html");
		
		reporter.config().setDocumentTitle("Automationreport");
		reporter.config().setReportName("functional test");
		reporter.config().setTheme(Theme.DARK);
		
		extent=new ExtentReports();
		extent.attachReporter(reporter);
		extent.setSystemInfo("hostname", "localhost");
		extent.setSystemInfo("os", "windows10");
		extent.setSystemInfo("testername", "abc");
		extent.setSystemInfo("BrowserName", "chrome");
		 
		ChromeOptions options=new ChromeOptions();
		
		options.addArguments("--remote-allow-origins=*");
		driver=new ChromeDriver(options);
		
	}
	
	
	@BeforeTest
	public void setup()
	{
		driver.get("https://www.facebook.com");

	}
	@Test
	public void fbtitleverification()
	{
		
	}

}
