package WebDriverMethod;

import org.openqa.selenium.chrome.ChromeDriver;

public class CloseMethod {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		Thread.sleep(1000);
		driver.get("https://www.facebook.com");
		driver.close();//it will close only the parent browser
		

	}

}
