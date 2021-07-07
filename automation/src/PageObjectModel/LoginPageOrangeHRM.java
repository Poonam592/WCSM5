package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageOrangeHRM {
	//declaration
	@FindBy(name="txtUsername") private WebElement username;
	@FindBy(name="txtPassword") private WebElement password;
	@FindBy(id="btnLogin") private WebElement loginbutton;
	
	//initalization
	
	public LoginPageOrangeHRM(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	//utilization

	public WebElement getUsername() {
		return username;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLoginbutton() {
		return loginbutton;
	}
	
	public void validLogin(String usn,String pwd) {
        username.sendKeys(usn);
        password.sendKeys(pwd);
        loginbutton.click();
	}
	
	
	

}
