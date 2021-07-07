package Dropdown;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class getAllselectedOptions {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();//maximize the window
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("file:///C:/Users/Poonam%20Lembhe/Desktop/New%20folder/dropdown.html");//Launch the web application
        Thread.sleep(3000);
        WebElement dropdown = driver.findElement(By.id("menu"));
        Select sel = new Select(dropdown);
        for(int i=2;i<=4;i++)
        {
       	sel.selectByIndex(i); 
        }
        List<WebElement> allselected = sel.getAllSelectedOptions();
        for(WebElement web:allselected)
        {
        	String str=web.getText();
        	Thread.sleep(3000);
        	System.out.println(str);
        	
        }
        
        for(int j=0;j<allselected.size();j++)
        {
        	String str2=allselected.get(j).getText();
        	System.err.println(str2);
        }
	}

}
