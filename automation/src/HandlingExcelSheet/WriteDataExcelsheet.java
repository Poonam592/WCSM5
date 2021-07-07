package HandlingExcelSheet;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;


public class WriteDataExcelsheet {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		FileInputStream fs=new FileInputStream("./Data/ActiTime.xlsx");
		Workbook wb=WorkbookFactory.create(fs);//create method is used to make the file ready for the write operation
		org.apache.poi.ss.usermodel.Sheet sh = wb.getSheet("ValidCredentials");//the sheet in which you want to write the data
		Row row = sh.getRow(1);//the row in which i want to write data
		Cell cell = row.createCell(2);//make the cell empty for write operation
		cell.setCellValue("fail");//set the data
		
		FileOutputStream fos=new FileOutputStream("./Data/ActiTime.xlsx");
		wb.write(fos);
		wb.close();
		
		
	}

}
