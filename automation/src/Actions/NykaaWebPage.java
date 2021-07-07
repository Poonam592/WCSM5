package Actions;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class NykaaWebPage {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
        driver.get("https://www.nykaafashion.com/");
        Thread.sleep(1000);
        
       WebElement target = driver.findElement(By.xpath("(//div[@class=' css-28fvnq'])[1]"));
       Actions act = new Actions(driver);
       act.doubleClick(target).perform();
       Thread.sleep(1000);
       List<WebElement> movetoaction = driver.findElements(By.xpath("//nav[@class='css-1s78ehj e166w7co0']/div"));
       int j = movetoaction.size();
       for(int i=0;i<=j;i++)
       {
    	   act.moveToElement(movetoaction.get(i)).perform();
       }
	}

}
