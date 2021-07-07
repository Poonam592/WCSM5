package Dropdown;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelectDropdownUsingdeselectAll {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();//maximize the window
		 driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		 driver.get("file:///C:/Users/Poonam%20Lembhe/Desktop/New%20folder/dropdown.html");//Launch the web application
        Thread.sleep(3000);
        WebElement select = driver.findElement(By.id("menu"));
        Select drop = new Select(select);
        //using deslectAll() method
        for(int a=0;a<=5;a++)
        {
        	drop.selectByIndex(a);
        	Thread.sleep(3000);
        }
        drop.deselectAll();


}
}
