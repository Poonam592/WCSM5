package Dropdown;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiDropdownUsingDeselectionmethod {

	public static void main(String[] args) throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();//maximize the window
		 driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		 driver.get("file:///C:/Users/Poonam%20Lembhe/Desktop/New%20folder/dropdown.html");//Launch the web application
         Thread.sleep(6000);
         WebElement select = driver.findElement(By.id("menu"));
         Select drop = new Select(select);
         drop.selectByIndex(3);//using index method--------------->
         
         drop.selectByValue("i7");//using by value -------------------->
         
         drop.selectByVisibleText("Misal Pav");//using by text------------------>
         
         Thread.sleep(10000);
         drop.deselectByIndex(3);//using index------------>
         
         drop.deselectByValue("i7");//using value------------->
         
         drop.deselectByVisibleText("Misal Pav");//using text------------->

	}

}
