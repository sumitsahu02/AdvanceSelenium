package Generic_Utility;

import java.io.FileInputStream;
import java.util.Properties;

/**
 * @author ASUS
 */
public class propertyFile_Utility extends WebDriver_Utitlity{

	/**
	 * this method is used to give the data which is stored in the property file
	 * @param key
	 * @return
	 * @throws Throwable
	 */
	public static String propertyData(String key) throws Throwable
	{
		FileInputStream fis=new FileInputStream(Iconstant.property_path);
		p=new Properties();
		p.load(fis);
		return p.getProperty(key);
	}
}
