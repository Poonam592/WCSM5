package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class cssSelector {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
		Thread.sleep(5000);
		driver.findElement(By.cssSelector("input[autocomplete='off']")).sendKeys("laptop");
		driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();

	}
}