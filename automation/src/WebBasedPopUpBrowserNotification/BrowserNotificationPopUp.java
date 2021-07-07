package WebBasedPopUpBrowserNotification;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BrowserNotificationPopUp {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");//we avoid IllegalStateException we set the path of driver executable file
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--disable-notifications");
		Thread.sleep(3000);
		WebDriver driver=new ChromeDriver(co);// launch the chrome browser
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.manage().window().maximize();//maximize the browser
		driver.get("https://www.irctc.co.in/nget/train-search");
		

	}

}
