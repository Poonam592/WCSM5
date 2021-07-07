package PageObjectModel;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Flib {
	public String readExcelsheet(String excelsheet, String sheet, int rowcount, int cellcount) throws EncryptedDocumentException, IOException
	{
		FileInputStream flib = new FileInputStream(excelsheet);
		Workbook web = WorkbookFactory.create(flib);
		Sheet sh = web.getSheet(sheet);
		Row row = sh.getRow(rowcount);
		Cell cell = row.getCell(cellcount);
	    String data = cell.getStringCellValue();
		return data;
		
	}
	
	public int RowCount(String excelsheet, String sheet) throws EncryptedDocumentException, IOException
	{
		FileInputStream flib = new FileInputStream(excelsheet);
		Workbook web = WorkbookFactory.create(flib);
		Sheet sh = web.getSheet(sheet);
		int rc = sh.getLastRowNum();
		return rc;
		
	}
	
	public String WriteExcelsheet(String excelsheet, String sheet, int rowcount, int setcell) throws EncryptedDocumentException, IOException
	{
		FileInputStream fib = new FileInputStream(excelsheet);
		Workbook web = WorkbookFactory.create(fib);
		Sheet sh = web.getSheet(sheet);
	    Row row = sh.getRow(rowcount);
	    Cell cell = row.createCell(setcell);
	    String data = cell.getStringCellValue();
		FileOutputStream fos = new FileOutputStream(excelsheet);
		web.write(fos);
		return data;
		
	}
	
	public String readPropertyFile(String Propath, String key) throws IOException
	{
		FileInputStream fib = new FileInputStream(Propath);
		Properties pro = new Properties();
		pro.load(fib);
		String value = pro.getProperty(key);
		return value;
		
	}

	}



