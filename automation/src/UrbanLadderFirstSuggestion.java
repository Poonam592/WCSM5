import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UrbanLadderFirstSuggestion {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("https://www.urbanladder.com/");//lunch the webpage
		Thread.sleep(10000);
		driver.findElement(By.xpath("//a[@class='close-reveal-modal hide-mobile']")).click();//close the pop-up
		WebElement textbox = driver.findElement(By.xpath("//input[@class='typeahead tt-input']"));//Enter the text in textBox
		textbox.sendKeys("Dining");
		Thread.sleep(10000);
		driver.findElement(By.xpath("//button[@id='search_button']")).click();
		String FirstTableprice = driver.findElement(By.xpath("//span[.='Catria 4 Seater Dining Table ']/ancestor::a[@class='product-title-block']/descendant::div[@class='product-title product-title-sofa-mattresses']/following-sibling::div[@class='price-number']/span")).getText();
		System.out.println("The first price of table:" +FirstTableprice);

	}

}
