package WebDriverMethod;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateMethod {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		WebDriver driver1=driver;
		driver1.get("https://www.google.com/");//to naviagte to the given web app
		driver1.switchTo().activeElement().sendKeys("java",Keys.ENTER);// go to search box and enter java and click enter
		Thread.sleep(3000);
		driver1.navigate().back();//go to the previous page
		Thread.sleep(3000);
		driver1.navigate().forward();//go to the next page
		Thread.sleep(3000);
		driver1.navigate().refresh();//refresh the browser
		driver1.close();// close the browser
		
		

	}

}
