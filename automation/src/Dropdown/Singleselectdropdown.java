package Dropdown;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Singleselectdropdown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();//maximize the window
		 driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		 driver.get("file:///C:/Users/Poonam%20Lembhe/Desktop/New%20folder/SingleDropdown.html");//Launch the web application
         Thread.sleep(3000);
         WebElement select = driver.findElement(By.id("menu"));
         Select drop = new Select(select);
         drop.selectByIndex(3);//using index method--------------->
         
         drop.selectByValue("i4");//using by value -------------------->
         
         drop.selectByVisibleText("Misal Pav");//using by text------------------>
         //check the dropdown is multi-select or not
         boolean status = drop.isMultiple();
         System.out.println(status);
 		
	}
	

}
