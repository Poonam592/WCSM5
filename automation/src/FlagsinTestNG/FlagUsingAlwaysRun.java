package FlagsinTestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class FlagUsingAlwaysRun {

	@Test
	public void login()//this method get failed
	{
		int i=0;
		int res=9/i;
		Reporter.log("Login from the application",true);
	}
	@Test
	public void logout()
	{
		Reporter.log("Hiee I am from LogOut");
	}
	@Test(dependsOnMethods = "login",alwaysRun = true)//contin the execution
	public void createUser()
	{
		Reporter.log("Hiee I am from createUser",true);
	}
	@Test
	public void viewUser()
	{
		Reporter.log("Hiee I am from viewUser",true);
	}
}
