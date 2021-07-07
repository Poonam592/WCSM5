package CombinationDataKeyword;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ActiTimeInvalidLogin extends BaseTest {

	public static void main(String[] args) throws IOException, InterruptedException {
		BaseTest base = new BaseTest();
		base.setUp();
		
		Flib fb = new Flib();
		int rc = fb.RowCount("./Data/ActiTime.xlsx","InvalidCredentials" );
		
		for(int i=0;i<=rc;i++)
		{
			String username = fb.readExcelsheet("./Data/ActiTime.xlsx","InvalidCredentials",i,0);
			WebElement username1 = driver.findElement(By.name("username"));
			username1.clear();
			username1.sendKeys(username);
			Thread.sleep(3000);
			String password = fb.readExcelsheet("./Data/ActiTime.xlsx","InvalidCredentials",i,1);
			WebElement pwd = driver.findElement(By.name("pwd"));
			pwd.sendKeys(password);
			Thread.sleep(3000);
			driver.findElement(By.xpath("//a[.='Login']")).click();
			Thread.sleep(3000);
			
		}
		
		base.tearDown();
		
}
}
