package frames;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class BlueStoneFrame {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");//we avoid IllegalStateException we set the path of driver executable file
		WebDriver driver=new ChromeDriver();// launch the chrome browser
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.manage().window().maximize();//maximize the browser
		driver.get("https://www.bluestone.com/");//launch the web
		Thread.sleep(3000);
		WebElement target = driver.findElement(By.xpath("//iframe[@id='chat-widget']"));//open the frame window
		driver.switchTo().frame(target);
		Thread.sleep(6000);
		driver.findElement(By.xpath("//p[.='CHAT with our experts !']")).click();//click on chat window
		driver.findElement(By.id("name")).sendKeys("Poonam");//Enter the name
		driver.findElement(By.id("email")).sendKeys("ABC@gmail.com");//Enter the pwd
		driver.findElement(By.xpath("//span[.='Start the chat']")).click();//click on start chat button
		

	}

}
