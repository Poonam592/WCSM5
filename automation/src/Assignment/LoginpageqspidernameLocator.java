package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginpageqspidernameLocator{

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://campus.qspiders.com/user");
		driver.findElement(By.name("name")).sendKeys("xyz@gmail.com");
		Thread.sleep(3000);
		driver.findElement(By.name("pass")).sendKeys("12345");
		Thread.sleep(3000);
		driver.findElement(By.name("op")).click();
		

	}

}
