package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginpageIdMethod {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/Poonam%20Lembhe/Desktop/New%20folder/Text.html");
		driver.findElement(By.id("search")).sendKeys("abcdefc");
		Thread.sleep(3000);
		driver.findElement(By.id("search1")).sendKeys("12345");
		Thread.sleep(3000);
		driver.findElement(By.id("Login")).click();
		

	}

}
