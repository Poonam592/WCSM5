package DataParameterization;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class OrangeHRMLogin {
	WebDriver driver;
	@Parameters({"username","Password","browser"})
	@Test
	public void LoginPage(String usn,String pwd,String browservalue)
	{
		if(browservalue.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
			driver.get("https://opensource-demo.orangehrmlive.com/");
			driver.findElement(By.name("txtUsername")).sendKeys(usn);
			driver.findElement(By.name("txtPassword")).sendKeys(pwd);
			driver.findElement(By.id("btnLogin")).click();
			
		}
		
		else if(browservalue.equalsIgnoreCase("firefox"))
		{

			System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
			driver=new FirefoxDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
			driver.get("https://opensource-demo.orangehrmlive.com/");
			driver.findElement(By.name("txtUsername")).sendKeys(usn);
			driver.findElement(By.name("txtPassword")).sendKeys(pwd);
			driver.findElement(By.id("btnLogin")).click();	
		}
		else
		{
			Reporter.log("Invalid browser",true);
		}
	}

}
