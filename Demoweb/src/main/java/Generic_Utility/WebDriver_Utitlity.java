package Generic_Utility;

import java.time.Duration;
import java.util.Properties;
import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
/**
 * @author ASUS
 */
public class WebDriver_Utitlity {

	public static WebDriver driver;
	public static WebDriverWait wait;
	public static Select s;
	public static Actions a;
	public static JavascriptExecutor js;
	public static Properties p;
	
	/**
	 * this method is used to navigate to the particular url
	 * @param url
	 */
	public static void getUrl(String url)
	{
		driver.get(url);
	}
	
	
	/**
	 * this method is used to get the current url of the webpage
	 * @return
	 */
	public static String currentUrl()
	{
		return driver.getCurrentUrl();
	}
	
	/**
	 * this method is used to get the page source of web page
	 * @return
	 */
	public static String pageSource()
	{
		return driver.getPageSource();
	}
	
	/**
	 * this method is used to get the title of web page
	 * @return
	 */
	public static String title()
	{
		return driver.getTitle();
	}
	/**
	 * this method is used to give implicit wait
	 */
	public static void impicitWait() {
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}	
	/**
	 * this method is used to get the current window id.
	 * @return
	 */
	public static String currentWindow()
	{
		return driver.getWindowHandle();
	}
	
	/**
	 * this method is used to get all the window id.
	 * @return
	 */
	public static Set<String> allWiindow()
	{
		return driver.getWindowHandles();
	}
	
	/**
	 * this method is used to maximise the page
	 */
	public static void maximise()
	{
		driver.manage().window().maximize();
	}
	
	
	/**
	 * this method is used to minimise the page
	 */
	public static void minimise()
	{
		driver.manage().window().minimize();
	}
	
	
	/**
	 * this method is used to forward the web page
	 */
	
	public static void forward()
	{
		driver.navigate().forward();
	}
	
	/**
	 * this method is used to backward the web page
	 */
	public static void backward()
	{
		driver.navigate().back();
	}
	
	/**
	 * this method is used to refresh the web page
	 */
	public static void refresh()
	{
		driver.navigate().refresh();
	}
	
	/**
	 * this method is used to access the application in web page
	 * @param url
	 */
	public static void toUrl(String url)
	{
		driver.navigate().to(url);
	}
	
	/**
	 * this method is used to close the current window
	 */
	public static void closeWindow()
	{
		driver.close();
	}
	
	/**
	 * this method is used to close all the window
	 */
	public static void quitWindow()
	{
		driver.quit();
	}
	
	/**
	 * this method is used to give explicitwait
	 * @param element
	 */
	public static void ExplicitWait(WebElement element)
	{
		wait=new WebDriverWait(driver, Duration.ofSeconds(15));
		wait.until(ExpectedConditions.visibilityOf(element));
	}
	
	/**
	 * this method is sued to select the option from the dropdown by index
	 * @param i
	 * @param element
	 */
	public static void dropDown(int i, WebElement element)
	{
		s=new Select(element);
		s.selectByIndex(i);
	}
	
	/**
	 * this method is sued to select the option from the dropdown by attribute value
	 * @param value
	 * @param element
	 */
	public static void dropDown(String value, WebElement element)
	{
		s=new Select(element);
		s.selectByValue(value);
	}
	
	/**
	 * this method is used to select the option from dropdown by visible text
	 * @param element
	 * @param visibletext
	 */
	public static void dropDown(WebElement element, String visibletext)
	{
		s=new Select(element);
		s.selectByVisibleText(visibletext);
	}
	
	/**
	 * this method is used to move the cursor to particular element
	 * @param element
	 */
	public static void moveCursor(WebElement element)
	{
		a=new Actions(driver);
		a.moveToElement(element).perform();
	}
	/**
	 * this methid is used to right click on particular element
	 * @param element
	 */
	public static void rightClick(WebElement element)
	{
		a=new Actions(driver);
		a.contextClick(element).perform();				
	}
	
	/**
	 * this method is used to double click on particular element
	 * @param element
	 */
	public static void doubleClick(WebElement element)
	{
		a=new Actions(driver);
		a.doubleClick(element).perform();;
	}
	
	/**
	 * this method is used to drag and drop the element
	 * @param source
	 * @param destination
	 */
	public static void dragAndDrop(WebElement source, WebElement destination)
	{
		a=new Actions(driver);
		a.dragAndDrop(source, destination).perform();
	}
	/**
	 * this method is used left click on particular element
	 * @param element
	 */
	public static void clickElement(WebElement element)
	{
		a=new Actions(driver);
		a.click(element).perform();
	}
	/**
	 * this method is used to click
	 */
	public static void click()
	{
		a=new Actions(driver);
		a.click().perform();
	}
}


