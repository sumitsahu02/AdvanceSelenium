package Generic_Utility;

import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

/**
 * @author ASUS
 */
public class ReadExcel_Utitlity {

	/**
	 * this method is used to fetch the value on particular sheet, row, and cell
	 * @param sheetname
	 * @param row
	 * @param cell
	 * @return
	 * @throws Throwable
	 */
	public static String fetchData(String sheetname, int row, int cell) throws Throwable
	{
		FileInputStream fis=new FileInputStream(Iconstant.excel_path);
		
		Workbook w=WorkbookFactory.create(fis);
		
		Sheet s = w.getSheet(sheetname);
		
		Row r = s.getRow(row);
		
		return r.getCell(cell).toString();
		
		
	}
	/**
	 * this method is used to return the row size
	 * @param sheetname
	 * @return
	 * @throws Throwable
	 */
	
	public static int rowSize(String sheetname) throws Throwable
	{
		FileInputStream fis=new FileInputStream(Iconstant.excel_path);
		
		Workbook w=WorkbookFactory.create(fis);
		
		Sheet s = w.getSheet(sheetname);
		
		return s.getPhysicalNumberOfRows();
		
		
	}
	/**
	 * this method is used to return the cell
	 * @param sheetname
	 * @return
	 * @throws Throwable
	 */
	public static int cellSize(String sheetname) throws Throwable
	{
       FileInputStream fis=new FileInputStream(Iconstant.excel_path);
		
		Workbook w=WorkbookFactory.create(fis);
		
		Sheet s = w.getSheet(sheetname);
		
		return s.getRow(0).getPhysicalNumberOfCells();
	}
	
	/**
	 * this method is used to fetch all the data from excel sheet
	 * @param sheetname
	 * @return
	 * @throws Throwable
	 */
	public static Object[][] fetchAllData(String sheetname) throws Throwable
	{
       FileInputStream fis=new FileInputStream(Iconstant.excel_path);
		
		Workbook w=WorkbookFactory.create(fis);
		
		Sheet s = w.getSheet(sheetname);
		
		int rowsize = s.getPhysicalNumberOfRows();
		
		int columnsize = s.getRow(0).getPhysicalNumberOfCells();
		
		Object[][] d=new Object[rowsize][columnsize];
		
		for(int i=0;i<rowsize; i++)
		{
			for(int j=0;j<columnsize; j++)
			{
				d[i][j]=s.getRow(i).getCell(j).toString();
			}
		}
		return d;
		
	}
}
