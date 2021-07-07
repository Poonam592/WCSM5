package WindowHandle;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseAllBrowserWithoutUsingQuit {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();//maximize the window
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("https://www.naukri.com/");//Launch the web application
		Thread.sleep(3000);
		//closing all the browser windows
		String parentwindow = driver.getWindowHandle();
		System.out.println("This is parent window handle: "+parentwindow);
		Set<String> allhandles = driver.getWindowHandles();
		System.out.println("The total number of windows open: "+allhandles);
		
		for(String str:allhandles)
		{
			driver.switchTo().window(str);
			driver.close();
			Thread.sleep(1000);
		}
	}

}
