package TestScript;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class sample6Test {

	@Test
	public void testcase()
	{
		Reporter.log("hello",true);
	}
	
	@Test
	public void testcase1()
	{
		Reporter.log("hii",true);
	}
	
	@Test
	public void testcase2()
	{
		Reporter.log("bye",true);
	}
}
