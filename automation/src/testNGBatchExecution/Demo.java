package testNGBatchExecution;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo {
	
  @Test
  public void run() 
  {
	  Reporter.log("Hiee I am from a",true);
  }
  
}
