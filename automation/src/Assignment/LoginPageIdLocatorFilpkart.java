package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPageIdLocatorFilpkart {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://affiliate.flipkart.com/login");
		driver.findElement(By.id("inputEmail")).sendKeys("Abc@gmail.com");
		Thread.sleep(3000);
		driver.findElement(By.id("inputPassword")).sendKeys("12345");
		Thread.sleep(3000);
		driver.findElement(By.id("submitLogin")).click();
		///driver.close();
		
		
		

	}

}
