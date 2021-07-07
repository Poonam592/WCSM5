package dataDrivenFramework;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class CreateMethodExcelsheet {

	public String readexcel(String Excelpath,String sheetname,int rowcount,int cellcount) throws  EncryptedDocumentException,IOException
	{
		//generic reuseable method to read the data from excel sheet
		FileInputStream fs=new FileInputStream(Excelpath);
		Workbook wb=WorkbookFactory.create(fs);//make the excel file ready for read operation
		org.apache.poi.ss.usermodel.Sheet sh = wb.getSheet(sheetname);//go to that sheet
	    Row rw = sh.getRow(rowcount);//go to that req row
	    org.apache.poi.ss.usermodel.Cell cl=rw.getCell(cellcount);//go to the req. cell
	    String data = cl.getStringCellValue();//get the data out of cell
	    
		return data;
	}
	//generic reuseable method to get the rowcount	
	public int getRowCount(String excelpath,String sheetname) throws  EncryptedDocumentException,IOException
	
	{
		FileInputStream fs=new FileInputStream(excelpath);
		Workbook wb=WorkbookFactory.create(fs);//make the excel file ready for read operation
		org.apache.poi.ss.usermodel.Sheet sh = wb.getSheet(sheetname);//go to that sheet
		int rc = sh.getLastRowNum();
		return rc;
		
	}
	
	public void writeExcelsheet(String excelpath, String sheetname, int rowcount, int cellcount, String data) throws IOException
	{
		FileInputStream fs=new FileInputStream(excelpath);
		Workbook wb=WorkbookFactory.create(fs);//make the excel file ready for read operation
		org.apache.poi.ss.usermodel.Sheet sh = wb.getSheet(sheetname);//go to that sheet
		Row row = sh.getRow(rowcount);
		Cell cell = row.createCell(cellcount);
		cell.setCellValue(data);
		FileOutputStream fos=new FileOutputStream(excelpath);
	    wb.write(fos);
	    wb.close();
	
	
        
	}

}
