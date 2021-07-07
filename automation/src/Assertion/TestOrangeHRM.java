package Assertion;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;


public class TestOrangeHRM {
	WebDriver driver;
	@Test
	public void testOrangeHRM() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		String loginPageTitle = driver.getTitle();
		
		SoftAssert softassert = new SoftAssert();
		softassert.assertEquals(loginPageTitle,"OrangeHRM");
		
		WebElement usn = driver.findElement(By.name("txtUsername"));
		boolean statusOfusn = usn.isDisplayed();
		
		Assert.assertEquals(statusOfusn,true);
		
		
		WebElement pass = driver.findElement(By.name("txtPassword"));
		boolean statusOfpass = pass.isDisplayed();
		Assert.assertEquals(statusOfpass, true);
		
		
		WebElement loginBtn = driver.findElement(By.id("btnLogin"));
		boolean statusOfloginbtn = loginBtn.isDisplayed();
		
		Assert.assertEquals(statusOfloginbtn, true);//hard assert
		
		
		usn.sendKeys("Admin");
		pass.sendKeys("admin123");
		loginBtn.click();
		
		Thread.sleep(3000);
		
	    String homepageTitle = driver.getTitle();		
	    
		softassert.assertEquals(homepageTitle,"OrangeHRM");
		Reporter.log("Create the user",true);
		Reporter.log("Create settings",true);
		
		driver.findElement(By.id("welcome")).click();
		driver.findElement(By.xpath("//a[.=\"Logout\"]")).click();
		softassert.assertAll();
		
		
		
		
	}

}
