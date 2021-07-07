package Assignment;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class BluestoneMouseHover {

	    public static void main(String[] args) throws InterruptedException {
	    	
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();//maximize the window
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("https://www.bluestone.com/");
	    List<WebElement> target = driver.findElements(By.xpath("//li[@class='menuparent repb nav-goldmine-link']/following-sibling::li"));
	    //List<WebElement> text = driver.findElements(By.xpath("li[@class='menu-col-1' ]/following-sibling::li"));
	    int k=target.size();
	    for(int i=0;i<=k;i++)
        {
	    	//for(WebElement web:text)
        	/*{
        		 String data=web.getText();
        		 System.out.println(data);
        		 Thread.sleep(4000);
        	}*/
    
   
        	Actions act = new Actions(driver);
            act.moveToElement(target.get(i)).perform();
            Thread.sleep(3000);
            	        	
        }		        

	}
}

