package Pom_Script;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ShoppingPage extends BasePage {

	public ShoppingPage(WebDriver driver)
	{
		super(driver);
	}
	
	@FindBy(css = "[name='removefromcart']")
	private WebElement checkbox1;

	public WebElement getCheckbox1() {
		return checkbox1;
	}
	
	@FindBy(css = "[name='termsofservice']")
	private WebElement checkbox2;

	public WebElement getCheckbox2() {
		return checkbox2;
	}
	
	@FindBy(css = "[name='checkout']")
	private WebElement checkbox;

	public WebElement getCheckbox() {
		return checkbox;
	}
}
