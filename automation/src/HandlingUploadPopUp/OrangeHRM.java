package HandlingUploadPopUp;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class OrangeHRM {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");//we avoid IllegalStateException we set the path of driver executable file
		WebDriver driver=new ChromeDriver();// launch the chrome browser
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.manage().window().maximize();//maximize the browser
		driver.get("https://opensource-demo.orangehrmlive.com/");//launch the web
		driver.findElement(By.name("txtUsername")).sendKeys("Admin");//Enter the Username
		Thread.sleep(1000);
		driver.findElement(By.name("txtPassword")).sendKeys("admin123");//Enter the pwd
		Thread.sleep(1000);
		driver.findElement(By.id("btnLogin")).click();//click on login button
		Thread.sleep(1000);
		driver.findElement(By.xpath("//b[.='PIM']")).click();//click on PIM option
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[.='Add Employee']")).click();//click on Add employee 
		Thread.sleep(1000);
		driver.findElement(By.id("firstName")).sendKeys("ABC");//Enter the firstname
		Thread.sleep(1000);
		driver.findElement(By.id("middleName")).sendKeys("XYZ");//enter the middlename
		driver.findElement(By.id("lastName")).sendKeys("QRS");//Enter the lastname
		Thread.sleep(1000);
		driver.findElement(By.id("employeeId")).clear();
		driver.findElement(By.id("employeeId")).sendKeys("123");
		WebElement target = driver.findElement(By.id("photofile"));
		Actions act = new Actions(driver);
	    act.doubleClick(target).perform();
	    
	    Runtime.getRuntime().exec("C:\\Users\\Poonam Lembhe\\Desktop\\workspacewcsm5\\automation\\autoit\\OrangeHRM.exe");
		

	}

}
