package ScreenShot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class UsingExplicitTypeCasting {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//accessible webdriver method-----------------
		driver.get("https://www.Myntra.com");//launch web app
		driver.manage().window().maximize();
		//explicit Typecasting
		TakesScreenshot  ts =(TakesScreenshot)driver;
		//not accessible getScreenshot method------------
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("./screenshots/firstscreenshot3.png");
		Files.copy(src, dest);

	}

}
