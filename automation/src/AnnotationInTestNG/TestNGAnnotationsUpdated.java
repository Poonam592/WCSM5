package AnnotationInTestNG;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNGAnnotationsUpdated {
	
	 @Test
	  public void addEmployee() 
	  {
			 Reporter.log("Add employee ",true);  
	  }
	 
	 @Test
	  public void createUser() 
	  {
			 Reporter.log("The user is created",true);  
	  }
	  
	  @BeforeMethod
	  public void openBrowser()
	  {
		  
		  Reporter.log("Open browser",true); 
	  }
	 
	  @AfterMethod
	  public void closeBrowser() 
	  {
		  Reporter.log("Close browser",true); 
	  }


}
