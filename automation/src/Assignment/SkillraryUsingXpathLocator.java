package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SkillraryUsingXpathLocator {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.skillrary.com/");
		Thread.sleep(3000);
        driver.findElement(By.xpath("//a[@class='dropdown-toggle ignorelink' and  text()=' GEARS ']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//a[text()=' GEARS ']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//a[@class='close_cookies']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//a[text()='Sign In']")).click();
        WebElement email = driver.findElement(By.xpath(" //input[@id='email']"));//same field using unique attribute
        email.sendKeys("Abc@gmail.com");
        Thread.sleep(3000);
        WebElement pwd = driver.findElement(By.xpath("//input[@name='password']"));
        pwd.sendKeys("ABCD");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//a[@class='close_cookies']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//button[text()=' Submit ']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//a[text()='Sign Up']")).click();
        Thread.sleep(3000);
        driver.navigate().back();
        driver.navigate().back();
        driver.navigate().back();
        driver.manage().window().maximize();
        WebElement course = driver.findElement(By.xpath("//input[@placeholder='Search for Courses']"));
        course.sendKeys("Java");
        driver.findElement(By.xpath("//input[@type='submit']")).click();
        driver.findElement(By.xpath("//a[text()='Corporates']")).click();
        
       
        
        

        
        
        
	}

}
