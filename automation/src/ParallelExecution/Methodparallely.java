package ParallelExecution;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Methodparallely {
	WebDriver driver;
	@Test
	public void methodA()
	{
      System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
      driver=new ChromeDriver();
      driver.manage().window().maximize();
      driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
      driver.get("https://www.google.com");
      driver.switchTo().activeElement().sendKeys("mumbai");  
	}

	@Test
	public void methodB()
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	    driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	    driver.get("https://www.google.com");
	    driver.switchTo().activeElement().sendKeys("pune");  	
	}
}
