package WebElementMethos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class isSelectedMethod {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/Poonam%20Lembhe/Desktop/New%20folder/checkbox.html");
		Thread.sleep(3000);
		WebElement marathi = driver.findElement(By.id("id1"));
		boolean select = marathi.isSelected();
		System.out.println(select);

	}

}
