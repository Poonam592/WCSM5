package WebDriverMethod;

import org.openqa.selenium.chrome.ChromeDriver;

public class QuitMethod {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		Thread.sleep(70000);
		driver.get("https://www.amazon.com");
		driver.quit();//It closes parent as well as child browsers

	}

}
