package Pom_Script;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckOutPage extends BasePage{

	public CheckOutPage(WebDriver driver)
	{
		super(driver);
	}
	
	@FindBy(id = "BillingNewAddress_Company")
	private WebElement company;

	public WebElement getCompany() {
		return company;
	}
	
	@FindBy(id="BillingNewAddress_CountryId")
	private WebElement country;

	public WebElement getCountry() {
		return country;
	}
	
	@FindBy(id = "BillingNewAddress_StateProvinceId")
	private WebElement state;

	public WebElement getState() {
		return state;
	}
	
	@FindBy(id = "BillingNewAddress_City")
	private WebElement city;

	public WebElement getCity() {
		return city;
	}
	
	@FindBy(id = "BillingNewAddress_Address1")
	private WebElement address;

	public WebElement getAddress() {
		return address;
	}
	
	@FindBy(id = "BillingNewAddress_ZipPostalCode")
	private WebElement zip;

	public WebElement getZip() {
		return zip;
	}
	
	@FindBy(id = "BillingNewAddress_PhoneNumber")
	private WebElement phone;

	public WebElement getPhone() {
		return phone;
	}
	
	@FindBy(css = "[id='billing-buttons-container'] [type='button']")
	private WebElement continuebutton;

	public WebElement getContinuebutton() {
		return continuebutton;
	}
	
	@FindBy(id = "PickUpInStore")
	private WebElement pick;

	public WebElement getPick() {
		return pick;
	}
	
	
	@FindBy(css = "[id='shipping-buttons-container'] [type='button']")
	private WebElement con;
	
	public WebElement getCon() {
		return con;
	}
	
	@FindBy(css = "[class='button-1 payment-method-next-step-button']")
	private WebElement paycon;

	public WebElement getPaycon() {
		return paycon;
	}
	
	@FindBy(css = "[class='button-1 payment-info-next-step-button']")
	private WebElement infocon;

	public WebElement getInfocon() {
		return infocon;
	}
	
	@FindBy(css = "[class='button-1 confirm-order-next-step-button']")
	private WebElement confirm;

	public WebElement getConfirm() {
		return confirm;
	}
	
	@FindBy(css = "[class='button-2 order-completed-continue-button']")
	private WebElement thankcon;

	public WebElement getThankcon() {
		return thankcon;
	}
	
}
