package WebElementMethos;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class getSizeMethod {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.amazon.com/");
		Thread.sleep(3000);
		WebElement id = driver.findElement(By.id("twotabsearchtextbox"));
		Thread.sleep(3000);
		Dimension d = id.getSize();
		int height = d.getHeight();
	    int width = d.getWidth();
	    System.out.println(height);
	    System.out.println(width);

	}

}
