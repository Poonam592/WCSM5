package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FilpkartPageUsingXpath {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("input[autocomplete='off']")).sendKeys("Laptop");
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("svg[viewBox='0 0 17 18']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[text()='Core i5']")).click();
		

	}

}
