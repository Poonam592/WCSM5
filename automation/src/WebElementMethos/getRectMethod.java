package WebElementMethos;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class getRectMethod {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.amazon.com/");
		Thread.sleep(3000);
		WebElement id = driver.findElement(By.id("twotabsearchtextbox"));
		Thread.sleep(3000);
		Rectangle rect = id.getRect();
		int height = rect.getHeight();
		int width = rect.getWidth();
		int xaxis = rect.getX();
		int yaxis = rect.getY();
		System.out.println("The height of the textbox:"+height);
		System.out.println("The width of the textbox:"+width);
		System.out.println("X axis distance of textbox:"+xaxis);
		System.out.println("y axis distance of textbox:"+yaxis);
		
		
		
		
	}

}
