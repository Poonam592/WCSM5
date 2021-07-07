package FlagsinTestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class FlagUsingPriority {
	
	@Test(priority = 0)
	public void d()
	{
		Reporter.log("hiee I am from method A");
	}
	
	@Test
	public void z()
	{
		Reporter.log("hiee I am from method Z");
	}
	@Test(priority = 1)
	public void b()
	{
		Reporter.log("hiee I am from method B");
	}
	@Test(priority = 3)
	public void e()
	{
		Reporter.log("hiee I am from method E");
	}
}
