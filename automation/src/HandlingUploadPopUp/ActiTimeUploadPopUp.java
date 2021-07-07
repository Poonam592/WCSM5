package HandlingUploadPopUp;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActiTimeUploadPopUp {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");//we avoid IllegalStateException we set the path of driver executable file
		WebDriver driver=new ChromeDriver();// launch the chrome browser
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.manage().window().maximize();//maximize the browser
		driver.get("http://desktop-std4f8r/login.do");//launch the web
		driver.findElement(By.xpath("//input[@class='textField' and @name='username']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@class='textField' and @name='pwd']")).sendKeys("manager");
		driver.findElement(By.xpath("//a[@id='loginButton' and .='Login']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[ @class='content administration']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[.='Logo & Color Scheme']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='uploadNewLogoOption']")).click();
		Thread.sleep(1000);
		WebElement target = driver.findElement(By.xpath("//input[@name='formCustomInterfaceLogo.logo']"));
		
		
		Actions act = new Actions(driver);
	    act.doubleClick(target).perform();
	    Thread.sleep(1000);

        /*File ff = new File("./autoit/ActiTimeFilePopUP.exe");
		String abs = ff.getAbsolutePath();
		Runtime.getRuntime().exec(abs);*/
		Runtime.getRuntime().exec("C:\\Users\\Poonam Lembhe\\Desktop\\workspacewcsm5\\automation\\autoit\\ActiTimeFileUpload.exe");

	}

}
