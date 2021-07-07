import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MyntraPractices {

	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();//maximize the window
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("https://www.myntra.com/");//Launch the web application
		Thread.sleep(3000);
		WebElement text = driver.findElement(By.xpath("//input[@placeholder='Search for products, brands and more']"));
        text.sendKeys("kurtas");
        Robot robot = new Robot();
        
        Thread.sleep(3000);
		
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		
		Thread.sleep(1000);
        WebElement target = driver.findElement(By.xpath("//span[@class='header-title' and .='FILTERS']"));
        
        Thread.sleep(1000);
        //using actions class
        Actions act = new Actions(driver);
        act.doubleClick(target).perform();
       
        Robot robot1 = new Robot();
        robot1.keyPress(KeyEvent.VK_CONTROL);
		robot1.keyPress(KeyEvent.VK_C);
		
		robot1.keyRelease(KeyEvent.VK_C);
		robot1.keyRelease(KeyEvent.VK_CONTROL);
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@placeholder='Search for products, brands and more']")).click();
		
		Thread.sleep(1000);
		robot1.keyPress(KeyEvent.VK_CONTROL);
		robot1.keyPress(KeyEvent.VK_V);
		
		robot1.keyRelease(KeyEvent.VK_V);
		robot1.keyRelease(KeyEvent.VK_CONTROL);
		
		
		
        
        
		

	}

}
