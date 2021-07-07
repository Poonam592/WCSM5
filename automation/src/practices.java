
import java.awt.AWTException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;


import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class practices {
     //read the data
	public static void main(String[] args) throws InterruptedException, AWTException, EncryptedDocumentException, IOException {
       /*FileInputStream fb = new FileInputStream("./Data/Testdata.xlsx");
       Workbook web = WorkbookFactory.create(fb);
        Sheet sh = web.getSheet("Sub");
        Row row = sh.getRow(0);
        Cell cell = row.getCell(0);
        String str = cell.getStringCellValue();
        System.out.println(str);
        */
       //
        
        FileInputStream fib = new FileInputStream("./Data/Testdata.xlsx");
        Workbook web = WorkbookFactory.create(fib);
        Sheet sh = web.getSheet("Sub");
        Row row = sh.createRow(4); 
        Cell cell = row.createCell(2);
        cell.setCellValue("Subject");
        
        FileOutputStream fos = new FileOutputStream("./Data/Testdata.xlsx");
        web.write(fos);
        web.close();
        
        
        
        

	}

}
