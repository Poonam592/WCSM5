import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FilpkartExample {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(3000);
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		WebElement text = driver.findElement(By.className("_3704LK"));
		text.sendKeys("Laptop");
		driver.findElement(By.className("_34RNph")).click();
		Thread.sleep(3000);
		//driver.findElement(By.xpath("//div[@class='QvtND5 _2w_U27']/span[.='14 MORE']")).click();
		//Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='_3879cV' and .='HP']/preceding-sibling::div")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='_3879cV' and .='Core i5']/preceding-sibling::div")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='_3879cV' and .='DELL']/preceding-sibling::div")).click();
		Thread.sleep(3000);
		WebElement price = driver.findElement(By.xpath("//div[@class='_4rR01T']/ancestor::div[@class='col col-7-12']/following-sibling::div[@class='col col-5-12 nlI3QM']/descendant::div[@class='_30jeq3 _1_WHN1']"));
	    String FirstPriceOfsugg = price.getText();
	    System.out.println("The first price of laptop:"+FirstPriceOfsugg);
		
		
		
	}
		

}
