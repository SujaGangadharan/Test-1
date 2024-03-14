package testpkg;

import org.testng.annotations.Test;

import basepkg.Baseclass;
import pagepkg.Fbpage;
import utilities.Excelutil;

public class Fbtest extends Baseclass {
	@Test
	public void verifyLoginWithValidCred()
	{
		Fbpage p1=new Fbpage(driver);
		
		String xl="D:\\data.xlsx";
		
		String Sheet ="Sheet1";
		
		int rowCount = Excelutil.getRowCount(xl,Sheet);
		
		for(int i=1;i<=rowCount;i++)
		{
			String UserName =Excelutil.getCellValue(xl, Sheet, i, 0);
			System.out.println("username----"+UserName);
			String pwd=Excelutil.getCellValue(xl, Sheet, i, 1);
			System.out.println("password---"+ pwd);
			
			//passing username and password as paramters
			
			//submitting the data by clicking on login button
			
			//p1.setvalues("","");
			p1.setvalues(UserName, pwd);
			p1.login();
		}
	}

}
