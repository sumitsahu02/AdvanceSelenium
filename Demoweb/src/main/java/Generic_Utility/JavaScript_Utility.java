package Generic_Utility;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class JavaScript_Utility extends WebDriver_Utitlity{

	/**
	 * this method is used to scroll the the web page to particular co-ordinates
	 * @param x
	 * @param y
	 */
	public static void srollBy(int x, int y)
	{
		js=(JavascriptExecutor)driver;
		js.executeAsyncScript("window.scrollBy("+x+","+y+")");	
	}
	
	public static void scroll_To(int x,int y)
	{
		js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollTo("+x+","+y+")");
	}
	
	/**
	 * this method is used to scroll the page until th element is visible
	 * @param index
	 * @param b
	 * @param element
	 */
	public static void scroll_In_To_View(int index, Boolean b, WebElement element)
	{
		js=(JavascriptExecutor) driver;
		js.executeScript("arguments["+index+"].scrollInToview("+b+");",element);
	}
	
	/**
	 * this method is used to click the disable element
	 * @param element
	 */
	public static void  clickDisable(WebElement element)
	{
		js=(JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();",element);
	}
}
