package ScreenShot;
import java.io.File;
import java.io.IOException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import com.google.common.io.Files;

public class TakeScreenshotUsingChromeDriver { //first way1---------

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");//we avoid IllegalStateException we set the path of driver executable file
		ChromeDriver driver=new ChromeDriver();// launch the chrome browser
		driver.manage().window().maximize();//maximize the browser
		driver.get("https://www.craftsvilla.com");//launch the web application
		
		File src = driver.getScreenshotAs(OutputType.FILE);
		File dest = new File("./screenshots/firstscreenshot1.png");
		Files.copy(src, dest);


	}

}
