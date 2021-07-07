package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathUsingcontainsLoginPage {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://twitter.com/LOGIN");
		Thread.sleep(3000);
		WebElement username = driver.findElement(By.xpath("//input[contains(@class,'r-30o5')]"));
		username.sendKeys("ABCD");
		WebElement password = driver.findElement(By.xpath("//input[contains(@type,'pass')]"));
		password.sendKeys("12345");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[contains(@class,'css-901oao ')]")).click();
		

	}

}
