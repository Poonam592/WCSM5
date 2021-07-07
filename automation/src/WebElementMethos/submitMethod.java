package WebElementMethos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class submitMethod {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.instagram.com/");
		Thread.sleep(3000);
		WebElement username = driver.findElement(By.xpath("//input[@class='_2hvTZ pexuQ zyHYP' and @name='username']"));
        username.sendKeys("Abc@gmail.com");
        Thread.sleep(3000);
        WebElement pwd = driver.findElement(By.xpath("//input[@class='_2hvTZ pexuQ zyHYP' and @name='password']"));
        pwd.sendKeys("1345");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//button[contains(@class,'sqdOP')]  ")).submit();
	}
	

}
