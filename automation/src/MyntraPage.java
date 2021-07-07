

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MyntraPage {

	public static void main(String[] args) throws InterruptedException {
	 System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	 WebDriver driver=new ChromeDriver();
	 driver.get("https://www.myntra.com/");//launch the web app
	 //enter kurtis in textbox
	 WebElement text = driver.findElement(By.className("desktop-searchBar"));
	 text.sendKeys("kurtis");
	 Thread.sleep(2000);
	 //create object for actions
	 Actions act = new Actions(driver);
	 act.moveToElement(text).perform();
	 Thread.sleep(1000);
	 //click on kurtis fro girls link
	 driver.findElement(By.xpath("//li[.='Kurtis For Girls']")).click();
	 
     
     
	}

}
