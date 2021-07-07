package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiTimeLoginPage {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://desktop-std4f8r/login.do");
		driver.findElement(By.name("username")).sendKeys("xyz@gmail.com");
		Thread.sleep(3000);
		driver.findElement(By.name("pwd")).sendKeys("12345");
		Thread.sleep(3000);
		driver.findElement(By.id("loginButton")).click();

	}

}
