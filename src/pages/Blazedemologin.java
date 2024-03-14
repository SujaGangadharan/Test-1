package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Blazedemologin {
	WebDriver driver;//null
    
	By Bdemail=By.id("email");
	By Bdpassword=By.id("password");
	By Bdlogin=By.xpath("//*[@id=\"app\"]/div/div/div/div/div[2]/form/div[4]/div/button");
	
public Blazedemologin(WebDriver driver)
{
this.driver=driver;
}
public void setvalues(String email,String password)
{

driver.findElement(Bdemail).sendKeys(email);
driver.findElement(Bdpassword).sendKeys(password);


}
public void login()
{
driver.findElement(Bdlogin).click();
}



}
