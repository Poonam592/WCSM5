package ScrollingOperations;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrolling {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");//we avoid IllegalStateException we set the path of driver executable file
		WebDriver driver=new ChromeDriver();// launch the chrome browser
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.manage().window().maximize();//maximize the browser
		driver.get("https://www.ajio.com");//launch the web application
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,4500)");
		Thread.sleep(3000);
		jse.executeScript("window.scrollBy(0,-4500)");
		Thread.sleep(3000);
		jse.executeScript("window.scrollBy(-10,0)");
		Thread.sleep(3000);
		jse.executeScript("window.scrollBy(10,0)");
			
	}

}
