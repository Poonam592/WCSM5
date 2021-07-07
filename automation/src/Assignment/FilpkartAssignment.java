package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FilpkartAssignment {

	public static void main(String[] args) throws InterruptedException {
		
				System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
				WebDriver driver=new ChromeDriver();
				driver.get("https://www.flipkart.com/");
				driver.manage().window().maximize();
				Thread.sleep(3000);
				driver.findElement(By.xpath("//button[text()='✕']")).click();
				WebElement text = driver.findElement(By.xpath("//input[@class='_3704LK']"));
				text.sendKeys("Laptop");
				Thread.sleep(3000);
				driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
				Thread.sleep(3000);
				driver.findElement(By.xpath("//div[@class='_3879cV' and .='Core i5']/preceding-sibling::div")).click();
				Thread.sleep(3000);
			    driver.findElement(By.xpath("//div[@class='_3879cV' and .='HP']/preceding-sibling::div")).click();
				Thread.sleep(3000);
				driver.findElement(By.xpath("//div[@class='_2gmUFU _3V8rao' and .='Operating System']")).click();
				Thread.sleep(3000);
				driver.findElement(By.xpath("//div[@class='_3879cV' and .='Windows 10']/preceding-sibling::div")).click();
                Thread.sleep(3000);
                String priceOfFirstLaptop = driver.findElement(By.xpath("(//div[@class='_4rR01T']/ancestor::div[@class='_3pLy-c row']/descendant::div[@class='_25b18c']/div[@class='_3I9_wc _27UcVY'])[1]")).getText();
                System.out.println("The price of first Lapto:"+ priceOfFirstLaptop);

	}

}
