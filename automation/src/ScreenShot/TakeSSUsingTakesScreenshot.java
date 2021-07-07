package ScreenShot;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;


public class TakeSSUsingTakesScreenshot {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		TakesScreenshot driver=new ChromeDriver();
		//cannot access webdriver method-----------------
		//driver.get("https://www.instagram.com");//launch web app
		//driver.manage().window().maximize();
		File src = driver.getScreenshotAs(OutputType.FILE);
		File dest = new File("./screenshots/firstscreenshot3.jpeg");
		//Files.copy(src, dest);
		
		

	}

}
