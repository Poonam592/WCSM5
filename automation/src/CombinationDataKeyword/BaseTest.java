package CombinationDataKeyword;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest implements IAutoConstant {
	static WebDriver driver;
	public void setUp() throws IOException
	{
		Flib fb = new Flib();
		String browser = fb.readPropertyFile(pro_path,"browser");
		String baseurl = fb.readPropertyFile(pro_path,"url");
		if(browser.equalsIgnoreCase("chrome"))
		{
			System.setProperty(chrome_key,chrome_path);
			driver=new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);//implicitlywait
			driver.manage().window().maximize();// for maximize the browser
			driver.get(baseurl);
		}

		else if(browser.equalsIgnoreCase("firefox"))
		{
			System.setProperty(gecko_key,gecko_path);
			driver=new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);//implicitlywait
			driver.manage().window().maximize();// for maximize the browser
			driver.get(baseurl);
		}
		else
		{
			System.out.println("Invalid broswer");
		}
	   }

	public void tearDown()
	{
		driver.close();
	}

}
