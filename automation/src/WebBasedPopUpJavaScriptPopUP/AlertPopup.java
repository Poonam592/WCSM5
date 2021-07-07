package WebBasedPopUpJavaScriptPopUP;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopup {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");//we avoid IllegalStateException we set the path of driver executable file
		WebDriver driver=new ChromeDriver();// launch the chrome browser
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.manage().window().maximize();//maximize the browser
		driver.get("file:///C:/Users/Poonam%20Lembhe/Desktop/New%20folder/Alert.html");
		driver.findElement(By.xpath("//button[.='Try it']")).click();
		Thread.sleep(3000);
		Alert al = driver.switchTo().alert();
		String textOfPopup = al.getText();
		System.out.println(textOfPopup);//to get the text of the alert popup
		al.dismiss();//this is used to dimiss the popUp(cancel button)

	}

}
