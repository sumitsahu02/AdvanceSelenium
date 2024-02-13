package TestScript;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Generic_Utility.BaseClass;
import Generic_Utility.ReadExcel_Utitlity;
import Pom_Script.RegistrationPage;
import Pom_Script.WelcomePage;

public class sample1Test extends BaseClass {

	@Test(dataProvider = "ram")
	public void Reg(String s1, String s2, String s3, String s4, String s5)
	{
		WelcomePage w=new WelcomePage(driver);
		w.getRegisterlink().click();
		
		RegistrationPage r=new RegistrationPage(driver);
		r.getGenderlink().click();
		r.getFirstnamelink().sendKeys(s1);
		r.getLastnamelink().sendKeys(s2);
		r.getEmaillink().sendKeys(s3);
		r.getPasswordlink().sendKeys(s4);
		r.getConfirmpasswordlink().sendKeys(s5);
		r.getRegisterbuttonlink().click();
		
		w.getLogoutlink().click();

	}
	@DataProvider(name="ram")
	public Object[][] dataReg() throws Throwable
	{
		return ReadExcel_Utitlity.fetchAllData("Sheet6");
		
	}
	
	
	
	
}
