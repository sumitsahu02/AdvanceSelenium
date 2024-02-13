package TestScript;

import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import Generic_Utility.WebDriver_Utitlity;
import Pom_Script.CheckOutPage;
import Pom_Script.WelcomePage;

public class sample5Test extends WebDriver_Utitlity {

	@Test(dependsOnMethods = "shopping")
	public static void checkout()
	{
		CheckOutPage cp=new CheckOutPage(driver);
		cp.getCompany().sendKeys("ibm");
		Select s=new Select(cp.getCountry());
		s.selectByVisibleText("India");
		cp.getCity().sendKeys("bhopal");
		cp.getAddress().sendKeys("bhawani campus");
		cp.getZip().sendKeys("462041");
		cp.getPhone().sendKeys("871059993");
		cp.getContinuebutton().click();
		cp.getPick().click();
		cp.getCon().click();
		cp.getPaycon().click();
		cp.getInfocon().click();
		cp.getConfirm().click();
		cp.getThankcon().click();
		
		WelcomePage w=new WelcomePage(driver);
		w.getLogoutlink().click();
	}
}
