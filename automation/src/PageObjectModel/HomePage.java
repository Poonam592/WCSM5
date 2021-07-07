package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	  //declaration
		@FindBy(xpath="//div[.='Settings']") private WebElement setting;
		@FindBy(xpath="//div[.='Users']") private WebElement users;
		
		
		//intialization
		public HomePage(WebDriver driver) 
		{
		PageFactory.initElements(driver, this);
		}
		
		
		//utilization
		public WebElement getSetting() {
			return setting;
		}
		public WebElement getUsers() {
			return users;
		}
		//action performing method
		public void clicksettings() 
		{
			setting.click();
		}
		
	}
	


