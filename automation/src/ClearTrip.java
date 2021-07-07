import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClearTrip {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");//we avoid IllegalStateException we set the path of driver executable file
		WebDriver driver=new ChromeDriver();// launch the chrome browser
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.manage().window().maximize();//maximize the browser
		driver.get("https://www.cleartrip.com/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[.='×']")).click();
		Thread.sleep(3000);
		WebElement target = driver.findElement(By.xpath("//div[@class='row pl-4 pr-4 p-relative']"));
		Point loc = target.getLocation();
		int xaxis = loc.getX();
		int yaxis=loc.getY();
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy("+xaxis+",+"+yaxis+")");
		target.click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='DayPicker-Day' and .='18']")).click();
		

	}

}
