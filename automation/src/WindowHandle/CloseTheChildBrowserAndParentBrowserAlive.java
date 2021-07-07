package WindowHandle;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseTheChildBrowserAndParentBrowserAlive {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();//maximize the window
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("https://www.naukri.com/");//Launch the web application
		Thread.sleep(3000);
		String parenttitle = driver.getTitle();
		Set<String> allhandles = driver.getWindowHandles();
		
		for(String str:allhandles)
		{
			String title = driver.switchTo().window(str).getTitle();
			
			if(!title.equals(parenttitle))
			{
				driver.close();
			}
			
			}
		}
	}



