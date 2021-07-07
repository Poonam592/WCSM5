package FlagsinTestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Flag1 {
  
	
  @Test(priority = 4)
  public void c()
  {
	  Reporter.log("Hiee I am from c",true); 
  }
  
  @Test()
  public void d()
  {
	  Reporter.log("Hiee I am from d",true);
  }
  
  @Test(priority = 2)
  public void b()
  {
	  Reporter.log("Hiee I am from a",true); 
  }
  
  @Test()
  public void a()
  {
	  Reporter.log("Hiee I am from e",true);
  }
  
  @Test(priority = 1)
  public void e()
  {
	  Reporter.log("Hiee I am from f",true);
  }
  
  @Test(priority = 0)
  public void f()
  {
	  Reporter.log("Hiee I am from f",true);
  }
}
