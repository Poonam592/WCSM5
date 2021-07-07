package WebElementMethos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class getTextMethod {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.skillrary.com/");
		Thread.sleep(3000);
		WebElement pratiallink = driver.findElement(By.partialLinkText("SERVICES"));
		Thread.sleep(3000);
		String text = pratiallink.getText();
        System.out.println(text);
	}

}
