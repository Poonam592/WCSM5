package XpathLocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LooginPageUsingXpathContains {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.instagram.com/");
		Thread.sleep(3000);
		WebElement username = driver.findElement(By.name("username"));
		username.sendKeys("abcd");
		Thread.sleep(3000);
		WebElement password = driver.findElement(By.name("password"));
		password.sendKeys("Abc123");
		Thread.sleep(3000);
		//WebElement button = driver.findElement(By.xpath("// div[contains(@class,'Igw0E ')] "));
		//button.click();
		

		
	}

}
