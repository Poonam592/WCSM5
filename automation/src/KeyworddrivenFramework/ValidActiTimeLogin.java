package KeyworddrivenFramework;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ValidActiTimeLogin {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");//we avoid IllegalStateException we set the path of driver executable file
		WebDriver driver=new ChromeDriver();// launch the chrome browser
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);//implicitlywait
		driver.manage().window().maximize();// for maximize the browser
		
		Thread.sleep(3000);
		
		Fib fb = new Fib();
		String url = fb.readpropertyFile("./Data/config.properties","url");
		driver.get(url);
		
		String username = fb.readpropertyFile("./Data/config.properties","username");
		String pwd = fb.readpropertyFile("./Data/config.properties", "pwd");
		
		driver.findElement(By.name("username")).sendKeys(username);
		
		driver.findElement(By.name("pwd")).sendKeys(pwd);
		
		driver.findElement(By.xpath("//a[.='Login']")).click();
		
		
		
		

	}

}
