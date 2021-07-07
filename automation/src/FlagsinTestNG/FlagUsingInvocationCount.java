package FlagsinTestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class FlagUsingInvocationCount {

	@Test
	public void login()
	{
		Reporter.log("Login from the application",true);
	}
	@Test(invocationCount = 10)
	public void logout()
	{
		Reporter.log("LogOut from the application");
	}
	@Test(dependsOnMethods = "login")
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
