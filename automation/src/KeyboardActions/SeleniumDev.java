package KeyboardActions;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SeleniumDev {

	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();//maximize the window
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("https://www.selenium.dev/");//Launch the web application
		Thread.sleep(3000);
		
		
        WebElement target = driver.findElement(By.xpath("//a[ @class='nav-item' and .='Downloads']"));
       
	    Actions act = new Actions(driver);
        act.contextClick(target).perform();
        
        
        Robot robot = new Robot();
        
        for(int i=0;i<=5;i++)
        {
        	robot.keyPress(KeyEvent.VK_DOWN);
        	robot.keyRelease(KeyEvent.VK_DOWN);
        }
        Thread.sleep(3000);
        robot.keyPress(KeyEvent.VK_ENTER);
    	robot.keyRelease(KeyEvent.VK_ENTER);
		
        
	}

}
