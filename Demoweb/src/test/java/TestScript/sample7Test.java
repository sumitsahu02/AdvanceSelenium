package TestScript;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class sample7Test {

	@Test
	public void testCase()
	{
		ExtentSparkReporter ESR=new ExtentSparkReporter("C:\\Users\\ASUS\\Desktop\\my java\\java\\Demoweb\\ExtentReport\\report.html");
		
		ExtentReports er=new ExtentReports();
		
		er.attachReporter(ESR);
		
		ExtentTest et = er.createTest("sample7Test");
		
		et.log(Status.INFO,"test case succesfully attached to report");
		
		er.flush();
	}
}
