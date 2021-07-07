package Assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class UrbanLadderPrintTextonSuboptions {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();//maximize the window
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("https://www.urbanladder.com/");//Launch the web application
        Thread.sleep(1000);
        WebElement target = driver.findElement(By.xpath("(//span[@class='topnav_itemname'])[1]"));
        Actions act = new Actions(driver);
        act.moveToElement(target).perform();
        Thread.sleep(1000);
        String text = driver.findElement(By.xpath("(//div[@class='subnavlist_wrapper clearfix'])[1]")).getText();
        System.out.println(text);
	}

}
