package TestScript;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class sample8Test {

	@Test
	public void testCase()
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		String image = driver.getScreenshotAs(OutputType.BASE64);
		
        ExtentSparkReporter ESR=new ExtentSparkReporter("C:\\Users\\ASUS\\Desktop\\my java\\java\\Demoweb\\ExtentReport\\report.html");
		
		ExtentReports er=new ExtentReports();
		
		er.attachReporter(ESR);
		
		ExtentTest et = er.createTest("sample7Test");
		
		et.log(Status.INFO,"test case succesfully attached to report");
		
		et.addScreenCaptureFromBase64String(image);
		
		er.flush();
	}
}
