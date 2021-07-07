package HandlingExcelSheet;
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
public class ReadExcelSheet   { 

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
	
		FileInputStream fis = new FileInputStream("./Data/Testdata.xlsx");
		Workbook wb = WorkbookFactory.create(fis); //create method is used to make the file ready to operation
		org.apache.poi.ss.usermodel.Sheet sh = wb.getSheet("Sub");//the sheet in which data is present
		Row row = sh.getRow(0);//the row which data is prsent
		org.apache.poi.ss.usermodel.Cell cell = row.getCell(0);// the cell which data is present
		String data = cell.getStringCellValue();//to get the string present in the specified cell
		System.out.println(data);//print the data in the console
	
	    
        
	}

}
