package WebBasedPopUpJavaScriptPopUP;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConfirmationPopUp {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");//we avoid IllegalStateException we set the path of driver executable file
		WebDriver driver=new ChromeDriver();// launch the chrome browser
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.manage().window().maximize();//maximize the browser
		driver.get("file:///C:/Users/Poonam%20Lembhe/Desktop/New%20folder/confirmation.html");
		driver.findElement(By.xpath("//button[.='I am Hungry']")).click();
		Thread.sleep(3000);
		Alert al = driver.switchTo().alert();
		String textofpopup = al.getText();
		System.out.println(textofpopup);
		//al.accept();//this is used to accept the popUp(ok button)
		
		
		al.dismiss();//this is used to dimiss the popup(cancel button)
		
		
	}

}
