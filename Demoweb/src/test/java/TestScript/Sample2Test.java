package TestScript;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Generic_Utility.ReadExcel_Utitlity;
import Generic_Utility.WebDriver_Utitlity;
import Pom_Script.LoginPage;
import Pom_Script.WelcomePage;

public class Sample2Test extends WebDriver_Utitlity {

	@Test(dataProvider = "credential", dependsOnMethods = "Reg")
	public void login(String username, String password) throws Throwable
	{	
		WelcomePage w=new WelcomePage(driver);
		w.getLoginlink().click();
		LoginPage l=new LoginPage(driver);
		l.getEmaillink().sendKeys(username);
		l.getPasswordlink().sendKeys(password);
		l.getLoginbuttonlink().click();	
	}
	
	@DataProvider(name="credential")
	public Object[][] data() throws Throwable
	{
		return ReadExcel_Utitlity.fetchAllData("sheet7");
	}
}
