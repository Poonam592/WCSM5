package XpathLocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathLocatorFirstCase {

	public static void main(String[] args) throws InterruptedException {//using unique attribute
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.craftsvilla.com/");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@id='searchval']")).sendKeys("jackets");
		

	}

}
