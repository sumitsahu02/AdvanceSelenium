package Generic_Utility;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class BaseClass extends WebDriver_Utitlity {

	
	@BeforeSuite
	public void ConnectServer()
	{
		Reporter.log("connection to server",true);
	}
	
	@BeforeTest
	public void ConnectDatabase()
	{
		Reporter.log("connection to database",true);
	}
	
	@BeforeClass
	public void ConnectServer1() throws Throwable
	{
		Reporter.log("open the browser",true);
        driver=new ChromeDriver();
        maximise();
        impicitWait();
        String url = propertyFile_Utility.propertyData("url");
		getUrl(url);
		
	}
	
	@AfterClass
	public void disConnectServer1()
	{
		Reporter.log("closing the browser",true);
		
	}
	@AfterTest
	public void disconnectDatabase()
	{
		Reporter.log("disconnection to database",true);
	}
	@AfterSuite
	public void disConnectServer()
	{
		Reporter.log("disconnection to server",true);
	}
}
