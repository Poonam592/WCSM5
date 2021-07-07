package Assignment;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FilpkartAssignmantUsingWindowHandle {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();//launch the chrome browser
		driver.manage().window().maximize();//miximize the window
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com/");//open the web
		driver.findElement(By.xpath("//button[text()='✕']")).click();//close the hidden division popup
		WebElement text = driver.findElement(By.className("_3704LK"));
		text.sendKeys("Mobile");//enter text on search box
		driver.findElement(By.className("_34RNph")).click();//click on search icon
		
		driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();//
		
		WebElement target = driver.findElement(By.xpath("//span[.='Electronics']"));
		Actions action = new Actions(driver);
		action.moveToElement(target).perform();
		//select the brand (samsung)
		driver.findElement(By.xpath("//div[@class='_1fwVde']/a[.='Samsung']")).click();
		//select any mobile model
		driver.findElement(By.xpath("//img[@alt='SAMSUNG Galaxy M12 (Black, 128 GB)']")).click();
		Thread.sleep(3000);
		String parentandle = driver.getWindowHandle();// to get the window handle of current tab
		
		Set<String> handles = driver.getWindowHandles();// to get all window handles
		
		//switching the control to the newly opened tab
		for(String str:handles)
		{
			if(!str.equals(parentandle));
			driver.switchTo().window(str);
			
		}
		
		//select color of mobile
		driver.findElement(By.xpath("(//div[@class='_2C41yO'])[3]")).click();
		//select ram of mobile
		driver.findElement(By.xpath("(//a[@class='_1fGeJ5 qaAL3J'])[2]")).click();
		//click add to cart button
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2U9uOA _3v1-ww']")).click();
		//click on remove button
		driver.findElement(By.xpath("//div[.='Remove']")).click();
		driver.findElement(By.xpath("//div[@class='_3dsJAO _24d-qY FhkMJZ']")).click();
		
		

	}

}
