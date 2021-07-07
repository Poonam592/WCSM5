package Dropdown;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class getOptionsMethod {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();//maximize the window
		 driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		 driver.get("file:///C:/Users/Poonam%20Lembhe/Desktop/New%20folder/SingleDropdown.html");//Launch the web application
        Thread.sleep(3000);
        WebElement select = driver.findElement(By.id("menu"));
        Select drop = new Select(select);
        List<WebElement> list = drop.getOptions();
        //get all the options of dropdown using for each loop---->
        for(WebElement web:list)
        {
        	String str=web.getText();
        	System.out.println(str);
        }
        
        //using for loop------------->
        
        for(int i=0;i<list.size();i++)
        {
        	String str=list.get(i).getText();
        	System.err.println(str);
        }
        

	}

}
