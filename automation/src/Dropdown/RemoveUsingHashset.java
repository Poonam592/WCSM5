package Dropdown;

import java.util.HashSet;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class RemoveUsingHashset {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();//maximize the window
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("file:///C:/Users/Poonam%20Lembhe/Desktop/New%20folder/dropdown.html");//Launch the web application
        Thread.sleep(3000);
        WebElement dropdown = driver.findElement(By.id("menu"));
        Select sel = new Select(dropdown);
        List<WebElement> option = sel.getOptions();
        //elimenating the duplicate values with different Hashset and order of
        //insertion won't be maintain
        HashSet<String> str = new HashSet<String>();
        
        //adding the all list options to set
        for(int i=0;i<option.size();i++)
        {
         String text = option.get(i).getText();
         str.add(text);
        }
        //read the set using for each
        for(String text1:str)
        {
        	System.out.println(text1);
        }

	}

}
