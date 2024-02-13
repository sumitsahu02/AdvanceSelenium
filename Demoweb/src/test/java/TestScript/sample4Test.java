package TestScript;

import org.testng.annotations.Test;

import Generic_Utility.WebDriver_Utitlity;
import Pom_Script.ShoppingPage;

public class sample4Test extends WebDriver_Utitlity {

	@Test(dependsOnMethods = "addcart")
	public static void shopping()
	{
		ShoppingPage sp=new ShoppingPage(driver);
		sp.getCheckbox1().click();
		sp.getCheckbox2().click();
		sp.getCheckbox().click();
	}
}
