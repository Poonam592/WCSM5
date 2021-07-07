package Actions;

import java.awt.AWTException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick {

	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();//maximize the window
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("file:///C:/Users/Poonam%20Lembhe/Desktop/New%20folder/DoubleClick.html");//Launch the web application
        Thread.sleep(3000);
        //double click on button 
        WebElement target = driver.findElement(By.xpath("//button[.='Double-click here']"));
        
        //using actions class
        Actions act = new Actions(driver);
        act.doubleClick(target).perform();
        
       
		
		
        
	}

}
