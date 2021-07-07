package WebElementMethos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class isEnabledMethod {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.instagram.com/accounts/login/");
		Thread.sleep(3000);
		WebElement button = driver.findElement(By.xpath("//button[contains(@class,'sqdOP  ')]  "));
		boolean status = button.isEnabled();
		System.out.println(status);
	}

}
