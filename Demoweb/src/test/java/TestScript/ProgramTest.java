package TestScript;

import org.testng.Reporter;
import org.testng.annotations.Test;

import Generic_Utility.BaseClass;
import Pom_Script.LoginPage;
import Pom_Script.WelcomePage;

public class ProgramTest extends BaseClass {

	@Test
	public void testCase()
	{
		
		String username = System.getProperty("username");
		String password = System.getProperty("password");
		
		Reporter.log(username,true);
		Reporter.log(password,true);
		
		WelcomePage w=new WelcomePage(driver);
		w.getLoginlink().click();
		
		LoginPage l=new LoginPage(driver);
		l.getEmaillink().sendKeys(username);
		l.getPasswordlink().sendKeys(password);
		l.getLoginbuttonlink().click();
		w.getLogoutlink().click();
		driver.quit();
		
		
	}
}
