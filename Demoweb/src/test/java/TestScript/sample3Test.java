package TestScript;

import org.testng.annotations.Test;

import Generic_Utility.WebDriver_Utitlity;
import Pom_Script.DigitialPage;
import Pom_Script.WelcomePage;

public class sample3Test extends WebDriver_Utitlity {

	@Test(dependsOnMethods = "login")
	public void addcart()
	{
		DigitialPage dp=new DigitialPage(driver);
		dp.getAddtocart2().click();
		dp.getAddcart().click();
		WelcomePage w=new WelcomePage(driver);
		w.getShoppingcartlink().click();
	
	}
}
