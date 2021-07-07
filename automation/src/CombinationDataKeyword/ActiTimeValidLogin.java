package CombinationDataKeyword;

import java.io.IOException;


import org.openqa.selenium.By;

public class ActiTimeValidLogin extends BaseTest implements IAutoConstant  {

	public static void main(String[] args) throws IOException, InterruptedException {
		BaseTest base = new BaseTest();
		base.setUp();
		Flib fb = new Flib();
        String user = fb.readPropertyFile(pro_path,"username");
        String password = fb.readPropertyFile(pro_path, "pwd");
        driver.findElement(By.name("username")).sendKeys(user);
        
        driver.findElement(By.name("pwd")).sendKeys(password);
        Thread.sleep(3000);
        driver.findElement(By.xpath("//a[.='Login']")).click();
        
	}

}
