package dataDrivenFramework;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ValidActiTimeLogin { //Showing Pass status

	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");//we avoid IllegalStateException we set the path of driver executable file
		WebDriver driver=new ChromeDriver();// launch the chrome browser
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);//implicitlywait
		driver.manage().window().maximize();// for maximize the browser
		driver.get("http://desktop-std4f8r/login.do");
		Thread.sleep(3000);
		CreateMethodExcelsheet reuse = new CreateMethodExcelsheet();
		
	    String username = reuse.readexcel("./Data/ActiTime.xlsx", "ValidCredentials", 1,0);
	    String password = reuse.readexcel("./Data/ActiTime.xlsx", "ValidCredentials", 1,1);
		
		driver.findElement(By.name("username")).sendKeys(username);
		driver.findElement(By.name("pwd")).sendKeys(password);
		driver.findElement(By.xpath("//a[.='Login']")).click();
		
		WebDriverWait web = new WebDriverWait(driver,30);
		web.until(ExpectedConditions.titleContains("Enter"));
        reuse.writeExcelsheet("./Data/ActiTIme.xlsx","ValidCredentials",1,2,"Pass");
	}

}
