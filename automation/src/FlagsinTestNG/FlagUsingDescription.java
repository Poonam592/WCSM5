package FlagsinTestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class FlagUsingDescription {

	
	@Test(description = "This is used to the login from tha application")
	public void login()
	{
		Reporter.log("Login from the application",true);
	}
	@Test(description = "This method is used to the LogOut from the application")
	public void logout()
	{
		Reporter.log("LogOut from the application");
	}
	@Test
	public void createUser()
	{
		Reporter.log("CreateUser from the application",true);
	}
	@Test
	public void viewUser()
	{
		Reporter.log("ViewUser from the applicaton",true);
	}
}
