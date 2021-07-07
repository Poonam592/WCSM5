package TestNGAnnotationforApp;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class TestNG {
   WebDriver driver;
  @Test
  public void loginActiTime() throws InterruptedException 
  {
	    driver.findElement(By.name("username")).sendKeys("admin");
		Thread.sleep(3000);
		driver.findElement(By.name("pwd")).sendKeys("manager");
		Thread.sleep(3000);
		driver.findElement(By.id("loginButton")).click();
	  
  }
  
  @Test
  public void inValidloginActiTime() throws InterruptedException 
  {
	    driver.findElement(By.name("username")).sendKeys("xyz@gmail.com");
		Thread.sleep(3000);
		driver.findElement(By.name("pwd")).sendKeys("12345");
		Thread.sleep(3000);
		driver.findElement(By.id("loginButton")).click();
	  
  }
  
  @BeforeMethod
  public void setUp() {
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	  driver.get("http://desktop-std4f8r/login.do");
  }

  @AfterMethod
  public void tearDown()
  {
	  driver.close();
  }

  @BeforeTest
  public void setProp()
  {
	  System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	  
  }

  @AfterTest
  public void afterTest() 
  {
	 Reporter.log("Generate the report ",true); 
  }

}
