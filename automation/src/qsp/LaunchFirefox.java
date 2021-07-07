package qsp;

import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchFirefox {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
		//this is used to avoid the IllegalstateException
		new FirefoxDriver();// open the firefox browser

	}

}
