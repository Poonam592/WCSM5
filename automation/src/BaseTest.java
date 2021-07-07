
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import CombinationDataKeyword.Flib;

public class BaseTest {
	static WebDriver driver;

	public void openBrowser() throws IOException {
		// get the required data from prop file
		Flib flib = new Flib();
		String browservalue = flib.readPropertyFile("./Data/config.properties", "browser");
		String baseUrl = flib.readPropertyFile("./Data/config.properties", "url");

		if (browservalue.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.manage().window().maximize();
			driver.get(baseUrl);
		}

		else if (browservalue.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
			driver = new FirefoxDriver();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.manage().window().maximize();
			driver.get(baseUrl);
		}

		else {
			System.out.println("invalid input");
		}

	}

	public void closeBrowser() {
		driver.close();
	}

}
