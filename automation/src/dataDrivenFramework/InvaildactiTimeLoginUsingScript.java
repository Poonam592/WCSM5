package dataDrivenFramework;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class InvaildactiTimeLoginUsingScript {

	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");//we avoid IllegalStateException we set the path of driver executable file
		WebDriver driver=new ChromeDriver();// launch the chrome browser
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);//implicitlywait
		driver.manage().window().maximize();// for maximize the browser
		driver.get("http://desktop-std4f8r/login.do");
		Thread.sleep(3000);
		
		CreateMethodExcelsheet fib = new CreateMethodExcelsheet();
		
		int row = fib.getRowCount("./Data/ActiTime.xlsx","InvalidCredentials");
		
		
		for(int i=0;i<=row;i++)
		{
			String username = fib.readexcel("./Data/ActiTime.xlsx","InvalidCredentials",i,0);
			WebElement user = driver.findElement(By.name("username"));
			user.clear();
			user.sendKeys(username);
			String pwd = fib.readexcel("./Data/ActiTime.xlsx","InvalidCredentials",i,1);
			WebElement pwd1 = driver.findElement(By.name("pwd"));
			pwd1.sendKeys(pwd);
			Thread.sleep(3000);
			driver.findElement(By.xpath("//a[.='Login']")).click();
			Thread.sleep(3000);
		}
		
		
		
	}

}
