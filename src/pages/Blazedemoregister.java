package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Blazedemoregister {
	WebDriver driver;//null
	        By Bdname=By.id("name");
			By Bdcompany=By.id("company");
			By Bdemail=By.id("email");
			By Bdpassword=By.id("password");
			By Bdconfirmpswd=By.id("password-confirm");
			By Bdregister=By.xpath("//*[@id=\"app\"]/div/div/div/div/div[2]/form/div[6]/div/button");
	public Blazedemoregister(WebDriver driver)
	{
		this.driver=driver;
	}
	public void setvalues(String name,String company,String email,String password,String confirmpswd)
	{
		driver.findElement(Bdname).sendKeys(name);
		driver.findElement(Bdcompany).sendKeys(company);
		driver.findElement(Bdemail).sendKeys(email);
		driver.findElement(Bdpassword).sendKeys(password);
		driver.findElement(Bdconfirmpswd).sendKeys(confirmpswd);
		
	}
	public void register()
	{
		driver.findElement(Bdregister).click();
	}
	

}
