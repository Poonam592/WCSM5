package HandlingExcelSheet;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import dataDrivenFramework.CreateMethodExcelsheet;

public class RowCount {

	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");//we avoid IllegalStateException we set the path of driver executable file
		WebDriver driver=new ChromeDriver();// launch the chrome browser
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);//implicitlywait
		driver.manage().window().maximize();// for maximize the browser
		driver.get("http://desktop-std4f8r/login.do");
		Thread.sleep(3000);
		
		CreateMethodExcelsheet fib = new CreateMethodExcelsheet();
		
		int row = fib.getRowCount("./Data/ActiTime.xlsx","InvalidCredentials");
		System.out.println("The total row the excelsheet :" + row);

	}

}
