package qsp;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchBrowser {
	static WebDriver driver;

	public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);//for the user input
      System.out.println("Please Enter the Browser name:");
      String browservalue=sc.next();//takes the user input
      System.out.println(browservalue);
      
      if(browservalue.equalsIgnoreCase("chrome"))
      {
    	  System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
    	  driver=new ChromeDriver();//launch the chrome browser
    	  driver.manage().window().maximize();//maximize the browser window
    	  driver.get("https://www.instagram.com");//launch the web App
      }
      else if(browservalue.equalsIgnoreCase("firefox"))
      {
    	  System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
    	  driver=new FirefoxDriver();//launch the firefox browser
    	  driver.manage().window().maximize();//maximize the browser window
    	  driver.get("https://www.instagram.com");//launch the web app
      }
      
      else
      {
    	  System.out.println("Enter the valid browser name");
      }
      
      

	}

}
