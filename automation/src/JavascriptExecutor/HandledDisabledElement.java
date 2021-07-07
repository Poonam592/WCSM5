package JavascriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandledDisabledElement {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");//we avoid IllegalStateException we set the path of driver executable file
		WebDriver driver=new ChromeDriver();// launch the chrome browser
		driver.manage().window().maximize();//maximize the browser
		driver.get("file:///C:/Users/Poonam%20Lembhe/Desktop/New%20folder/Text.html");//launch the web application
		WebElement username = driver.findElement(By.id("search"));
	    WebElement pwd = driver.findElement(By.id("search1"));
		
	    if(username.isEnabled())
	    {
	    	username.sendKeys("Poonam");
	    	
	    	
	    }
	    else
	    {
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript("document.getElementById('search').value='Poonam'");

	    }
	    
	    if(pwd.isEnabled())
	    {
	    	pwd.sendKeys("Lembhe");
	    	
	    }
	    else
	    {
	    	JavascriptExecutor jse=(JavascriptExecutor)driver;
			jse.executeScript("document.getElementById('search1').value='Lembhe'");
	    	
	    }
	}
	

}
