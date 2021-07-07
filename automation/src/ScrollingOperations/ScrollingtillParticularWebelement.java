package ScrollingOperations;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollingtillParticularWebelement {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");//we avoid IllegalStateException we set the path of driver executable file
		WebDriver driver=new ChromeDriver();// launch the chrome browser
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.manage().window().maximize();//maximize the browser
		driver.get("https://www.urbanladder.com/");//launch the web application
		WebElement target = driver.findElement(By.xpath("//h2[contains(text(),'furniture online to fuel your creativity:')]"));
		Point loc = target.getLocation();
		int xaxis = loc.getX();
		int yaxis = loc.getY();
		
		System.out.println(xaxis);
		System.out.println(yaxis);
		
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy("+xaxis+",+"+(yaxis-90)+")");

	}

}

