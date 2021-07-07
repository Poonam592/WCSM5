package FlagsinTestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class FlagUsingEnabled {
	@Test
	public void login()
	{
		Reporter.log("Login from the application",true);
	}
	@Test(enabled = false)
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
