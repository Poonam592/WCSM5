package frames;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Frame {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");//we avoid IllegalStateException we set the path of driver executable file
		WebDriver driver=new FirefoxDriver();// launch the chrome browser
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.manage().window().maximize();//maximize the browser
		driver.get("file:///C:/Users/Poonam%20Lembhe/Desktop/New%20folder/username.html");//launch the web
		Thread.sleep(3000);
		driver.findElement(By.id("un")).sendKeys("Poonam");//Enter the usrname
		Thread.sleep(1000);
		driver.switchTo().frame("frid");//go to the framw window
		Thread.sleep(1000);
		driver.findElement(By.id("pwd")).sendKeys("poonam12");//Enter the pwd

	}

}
