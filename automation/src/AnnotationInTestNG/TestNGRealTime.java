package AnnotationInTestNG;

import org.testng.Reporter;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class TestNGRealTime {

	  @Test
	  public void addemployee() 
	  {
			 Reporter.log("TestCase ",true);  
	  }
	  
	  @BeforeMethod
	  public void beforeMethod()
	  {
		  
		  Reporter.log("before method",true); 
	  }

	  @AfterMethod
	  public void afterMethod() 
	  {
		  Reporter.log("after method ",true); 
	  }


	}



