package WindowHandle;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PerformMaximizeOperOnPerticularChildwindow {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();//maximize the window
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("https://www.naukri.com/");//Launch the web application
		Thread.sleep(3000);
		String parentwindow = driver.getWindowHandle();
		System.out.println("This is parent window handle: "+parentwindow);
		Set<String> allhandles = driver.getWindowHandles();
		System.out.println("The total number of windows open: "+allhandles);
		
		for(String str:allhandles)
		{
			String title = driver.switchTo().window(str).getTitle();
			System.out.println(title);
			if(title.equals("Genpact"))
			{
				driver.manage().window().maximize();
				Thread.sleep(2000);
				driver.close();
				break;


			}
			
		}

	}

}
