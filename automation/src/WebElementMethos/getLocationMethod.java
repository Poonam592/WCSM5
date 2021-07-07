package WebElementMethos;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class getLocationMethod {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.amazon.com/");
		Thread.sleep(3000);
		WebElement pratiallink = driver.findElement(By.id("twotabsearchtextbox"));
		Thread.sleep(3000);
		Point loc = pratiallink.getLocation();
        int x1 = loc.getX();
        int y1 = loc.getY();
        System.out.println("X axis distance is:"+x1);
        System.out.println("Y axis distance is:"+y1);
        
	}
	

}
