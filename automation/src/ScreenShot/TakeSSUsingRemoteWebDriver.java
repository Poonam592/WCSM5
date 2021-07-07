package ScreenShot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.google.common.io.Files;

public class TakeSSUsingRemoteWebDriver {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		RemoteWebDriver driver=new ChromeDriver();
		driver.get("https://www.instagram.com");//launch web app
		driver.manage().window().maximize();
		
		File src = driver.getScreenshotAs(OutputType.FILE);//mention file type 
		//mention relative path of file folder
		File dest = new File("./screenshots/firstscreenshot2.png");
		Files.copy(src, dest);
		
	
		
		
		

	}

}
