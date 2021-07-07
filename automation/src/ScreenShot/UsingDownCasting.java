package ScreenShot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.google.common.io.Files;

public class UsingDownCasting {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//accessible webdriver method-----------------
		driver.get("https://www.facebook.com");//launch web app
		driver.manage().window().maximize();
		//perform downcasting
		RemoteWebDriver  rd =(RemoteWebDriver)driver;
		//not accessible getScreenshot method------------
		File src = rd.getScreenshotAs(OutputType.FILE);
		File dest = new File("./screenshots/firstscreenshot4.png");
		Files.copy(src, dest);

	}

}
