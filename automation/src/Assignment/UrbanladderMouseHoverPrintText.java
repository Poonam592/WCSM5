package Assignment;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class UrbanladderMouseHoverPrintText {

			public static void main(String[] args) throws InterruptedException {
				System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
				WebDriver driver=new ChromeDriver();
				driver.manage().window().maximize();//maximize the window
				driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
				driver.get("https://www.urbanladder.com/");//Launch the web application
		        Thread.sleep(1000);
		        //print the options of text
		        List<WebElement> target = driver.findElements(By.xpath("//span[@class='topnav_itemname']"));
		        int j=target.size();
		        //select the options using mousehover-------------
		        List<WebElement> text = driver.findElements(By.xpath("(//div[@class='subnavlist_wrapper clearfix'])[5]"));
		        for(int i=0;i<=j;i++)
		        {
		        	Thread.sleep(1000);
		        	for(WebElement web:text)
		        	{
		        		 String data=web.getText();
		        		 System.out.println(data);
		        		 Thread.sleep(4000);
		        	}
		        	Actions act = new Actions(driver);
		            act.moveToElement(target.get(i)).perform();
		            Thread.sleep(1000);
		            	        	
		        }		        

			}

	}


