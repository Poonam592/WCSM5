package qsp;

import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchChrome {
	
	static
	{
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");//this is used to avoid the IllegalstateException
	}

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();//open the Chrome browser
		driver.get("https://www.facebook.com");//it is used to launch the web app by url
		driver.manage().window().maximize();
		Thread.sleep(7000);
		driver.close();//close the browser

	}

}
