package Pom_Script;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WelcomePage extends BasePage {

	public WelcomePage(WebDriver driver) {
		
		super(driver);
	}
	
	@FindBy(linkText = "Register")
	private WebElement registerlink;

	public WebElement getRegisterlink() {
		return registerlink;
	}
	
	@FindBy(linkText = "Log in")
	private WebElement loginlink;

	public WebElement getLoginlink() {
		return loginlink;
	}
	
	@FindBy(linkText = "Shopping cart")
	private WebElement shoppingcartlink;

	public WebElement getShoppingcartlink() {
		return shoppingcartlink;
	}
	
	@FindBy(linkText = "Log out")
	private WebElement logoutlink;

	public WebElement getLogoutlink() {
		return logoutlink;
	}
}
