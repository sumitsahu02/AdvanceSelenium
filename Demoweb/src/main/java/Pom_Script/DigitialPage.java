package Pom_Script;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DigitialPage extends BasePage {

public DigitialPage(WebDriver driver) {
		
		super(driver);
	}
	
	@FindBy(xpath = "//div[@data-productid=\"31\"]//input")
	private WebElement addtocart;

	public WebElement getAddtocart() {
		return addtocart;
	}
	
	@FindBy(xpath = "//div[@data-productid='72']//input")
	private WebElement addtocart2;

	public WebElement getAddtocart2() {
		return addtocart2;
	}
	
	@FindBy(xpath = "//div[@data-productid='2']//input")
	private WebElement addcart3;

	public WebElement getAddcart3() {
		return addcart3;
	}
	
	@FindBy(id = "add-to-cart-button-72")
	private WebElement addcart;

	public WebElement getAddcart() {
		return addcart;
	}
	
}
