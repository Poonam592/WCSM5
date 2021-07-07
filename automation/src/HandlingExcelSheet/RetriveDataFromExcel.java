package HandlingExcelSheet;
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import dataDrivenFramework.CreateMethodExcelsheet;

public class RetriveDataFromExcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		FileInputStream fs=new FileInputStream("./Data/ActiTime.xlsx");
		Workbook wb=WorkbookFactory.create(fs);//make the excel file ready for read operation
		org.apache.poi.ss.usermodel.Sheet sh = wb.getSheet("InvalidCredentials");//go to that sheet
		CreateMethodExcelsheet fil = new CreateMethodExcelsheet();
		int rc = fil.getRowCount("./Data/ActiTime.xlsx","InvalidCredentials");
		
		for(int i=0;i<=rc;i++)
		{
			Row row = sh.getRow(i);
			for(int j=0 ; j<=1 ;j++)
			{
				Cell cell = row.getCell(j);
				String data = cell.getStringCellValue();
			    System.out.println(data);
			}
		}
	}

}
