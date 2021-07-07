package FlagsinTestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class FlagUsingdepencies {
	
  @Test(priority = 3)
  public void logOut()
  {
	  Reporter.log("Hiee I am from the logout",true);
  }
  
  @Test
  public void login()
  {
	  Reporter.log("Hiee I am from the login",true);
  }
  
  @Test(priority = 1)
  public void createUser()
  {
	  Reporter.log("Hiee I am from the createUser",true);  
  }
  
  @Test(priority = 2)
  public void viewUser()
  {
	  Reporter.log("Hiee I am from the viewUser",true);
  }
  
  @Test(dependsOnMethods = "login")
  public void AddUser()
  {
	  Reporter.log("Hiee I am from the AddUser",true);
  }
  
}
