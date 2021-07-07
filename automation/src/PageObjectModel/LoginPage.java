package PageObjectModel;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	//declaration
	@FindBy(name="username") private WebElement user;
	@FindBy(name="pwd") private WebElement password;
	@FindBy(id="loginButton") private WebElement button;
	@FindBy(id="keepLoggedInCheckBox") private WebElement checkbox;
	
	//initalization
	public LoginPage(WebDriver driver) {
	PageFactory.initElements(driver,this);
		
	}
	//Utilization
	public WebElement getUser() {
		return user;
	}
	public WebElement getPassword() {
		return password;
	}
	public WebElement getButton() {
		return button;
	}
	public WebElement getCheckbox() {
		return checkbox;
	}

	//some action specific methods
	public void validLogin(String username,String pwd)
	{
		user.sendKeys(username);
		password.sendKeys(pwd);
		button.click();
	}
	
	public void invalidLogin(CharSequence username, CharSequence pwd)
	{
		user.sendKeys(username);
		password.sendKeys(pwd);
		button.click();
		user.clear();
	}
	
}
	

