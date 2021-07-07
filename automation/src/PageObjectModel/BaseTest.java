package PageObjectModel;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class BaseTest implements IAutoConstant {
	
	static WebDriver driver;
	
	public void OpenBrowser() throws IOException
	{
		//get the requried data from property file
		Flib fb = new Flib();
		String browservalue = fb.readPropertyFile("./Data/config.properties","browser");
		String baseurl = fb.readPropertyFile("./Data/config.propertiesorange_hrm","url");
		if(browservalue.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");//we avoid IllegalStateException we set the path of driver executable file
			driver=new ChromeDriver();// launch the chrome browser
			driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);//implicitlywait
			driver.manage().window().maximize();// for maximize the browser
			driver.get(baseurl);
				
		}
		else if(browservalue.equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");//we avoid IllegalStateException we set the path of driver executable file
			driver=new FirefoxDriver();// launch the chrome browser
			driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);//implicitlywait
			driver.manage().window().maximize();// for maximize the browser
			driver.get(baseurl);
		}
		
		else
		{
			System.out.println("invalid input");
		}
	    
	}
		
		public void closeBrowser()
		{
			
			driver.close();
		}
		
	}
	


