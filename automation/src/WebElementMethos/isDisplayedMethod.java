package WebElementMethos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class isDisplayedMethod {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.skillrary.com/");
		Thread.sleep(3000);
		WebElement pratiallink = driver.findElement(By.partialLinkText("SERVICES"));
		Thread.sleep(3000);
		boolean status = pratiallink.isDisplayed();
		System.out.println(status);
		

	}

}
