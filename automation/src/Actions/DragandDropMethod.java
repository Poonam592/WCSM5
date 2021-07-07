package Actions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDropMethod {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();//maximize the window
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("file:///C:/Users/Poonam%20Lembhe/Desktop/New%20folder/dragdrop.html");//Launch the web application
        Thread.sleep(3000);
        //src target 
        WebElement srctarget = driver.findElement(By.id("draggable-2"));
        //dest target
        WebElement desttarget = driver.findElement(By.id("droppable-2"));
        
        Actions act = new Actions(driver);
        act.dragAndDrop(srctarget, desttarget).perform();
        
        Thread.sleep(2000);
	    
	    String text = driver.findElement(By.xpath("//p[.='Dropped!']")).getText();
	    
	    if(text.equalsIgnoreCase("Dropped!"))
	    {
	    	System.out.println("The element is dragged and dropped");
	    }
	    
	}
	
}
