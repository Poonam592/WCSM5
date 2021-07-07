package KeyworddrivenFramework;

import java.io.IOException;

import org.openqa.selenium.By;

public class ActiTimeLOginUsingMethod extends BaseTest {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		BaseTest base = new BaseTest();
		base.OpenBrowser();
		Thread.sleep(3000);
		
		Fib fb = new Fib();
		String user = fb.readpropertyFile("./Data/config.properties", "username");
		String pwd1 = fb.readpropertyFile("./Data/config.properties","pwd");
		
		driver.findElement(By.name("username")).sendKeys(user);
		driver.findElement(By.name("pwd")).sendKeys(pwd1);
		driver.findElement(By.xpath("//a[.='Login']")).click();
		
		

	}

}
