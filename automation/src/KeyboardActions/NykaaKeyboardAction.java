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

public class NykaaKeyboardAction {

	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
        driver.get("https://www.nykaafashion.com/");
        Thread.sleep(1000);
        WebElement target = driver.findElement(By.xpath("//div[@class='c-title' and .='Bags']"));
        //double click on text-----------------
        Actions act = new Actions(driver);
        act.doubleClick(target).perform();
        //keyboard click-----------------------
        Thread.sleep(2000);
        Robot rb = new Robot();
        rb.keyPress(KeyEvent.VK_CONTROL);
        rb.keyPress(KeyEvent.VK_C);
        rb.keyRelease(KeyEvent.VK_C);
        rb.keyRelease(KeyEvent.VK_CONTROL);
        
        driver.findElement(By.className("css-mrhw0s")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div[contains(@class,'e76h6xl1 css-c')]"));
        rb.keyPress(KeyEvent.VK_CONTROL);
        rb.keyPress(KeyEvent.VK_V);
        rb.keyRelease(KeyEvent.VK_V);
        rb.keyRelease(KeyEvent.VK_CONTROL);
        
        
        
      
	}

}
