package basic;

import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookContent {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		
		 String src=driver.getPageSource();
		 if(src.contains("Search"))
		 {
			 System.out.println("pass");
		 }
		 else
		 {
			 System.out.println("fail");
		 }
	}

}
