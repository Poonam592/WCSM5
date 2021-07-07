package ImpliciltyWaitStat;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyActiTime {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();//maximize the window
		 driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		 driver.get("http://desktop-std4f8r/login.do");//lunch the web 
		 String titleofloginpage = driver.getTitle();//get title of the web page
		 if(titleofloginpage.equals("actiTIME - Login"))
		 {
		 System.out.println("THE TITLE OF LOGIN PAGE----------TEST IS PASSED:"+ titleofloginpage);

	}
		 else
		 {
			 System.out.println("THE TITLE OF LOGIN PAGE----------TEST IS FAILED:"+ titleofloginpage);
		 }

		 //Login page
		 driver.findElement(By.name("username")).sendKeys("Admin");
		 driver.findElement(By.name("pwd")).sendKeys("manager");
		 driver.findElement(By.id("loginButton")).click();
		 
		String welcomepagetitle = driver.getTitle();
		System.out.println(welcomepagetitle + "Poonam");
		if(welcomepagetitle.equals("actiTIME - Enter Time-Track"))
		{
			System.out.println("THE TITLE OF WELCOME PAGE----------TEST IS PASSED"+  welcomepagetitle);	
		}
		else
		{
			System.out.println("THE TITLE OF WELCOME PAGE----------TEST IS FAILED"+  welcomepagetitle);
		}
}
}