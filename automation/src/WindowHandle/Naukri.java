package WindowHandle;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Naukri {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();//maximize the window
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("https://www.naukri.com/");//Launch the web application
		Thread.sleep(3000);
		String parentwindow = driver.getWindowHandle();
		System.out.println(parentwindow);
		Set<String> allhandles = driver.getWindowHandles();
		System.out.println(allhandles);
		driver.close();//close only parent window
		driver.quit();//close child and parent window
		
		
		

	}

}
