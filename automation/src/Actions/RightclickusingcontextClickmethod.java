package Actions;

import java.awt.AWTException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightclickusingcontextClickmethod {

	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();//maximize the window
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("https://www.myntra.com/");//Launch the web application
        Thread.sleep(3000);
        //click on men link on site-------------
        WebElement target = driver.findElement(By.xpath("//a[@class='desktop-main' and .='Men']"));
         
        //using actions class
        Actions act = new Actions(driver);
        act.contextClick(target).perform();
        
        
        
        
	}

}
