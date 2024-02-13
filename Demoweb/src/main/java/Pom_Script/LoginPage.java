package Pom_Script;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {

	public LoginPage(WebDriver driver)
	{
		super(driver);
	}
	
	@FindBy(id = "Email")
	private WebElement emaillink;

	public WebElement getEmaillink() {
		return emaillink;
	}
	
	@FindBy(id = "Password")
	private WebElement passwordlink;

	public WebElement getPasswordlink() {
		return passwordlink;
	}
	
	@FindBy(css = "[value='Log in']")
	private WebElement loginbuttonlink;

	public WebElement getLoginbuttonlink() {
		return loginbuttonlink;
	}
}
