package FlagsinTestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class FlagUsingGroup {

	@Test(groups = "FunctionalTestCase")
	public void ft1()
	{
		Reporter.log("FunctionalTestCase");
	}
	@Test(groups = "IntegrationTestCase")
	public void it1()
	{
		Reporter.log("IntegrationTestCase");
	}
	@Test(groups = "SystemTestCase")
	public void st1()
	{
		Reporter.log("SystemTestCase");
	}
	//--------------------------------------------------------->
	@Test(groups = "FunctionalTestCase")
	public void ft2()
	{
		Reporter.log("FunctionalTestCase");
	}
	@Test(groups = "IntegrationTestCase")
	public void it2()
	{
		Reporter.log("IntegrationTestCase");
	}
	@Test(groups = "SystemTestCase")
	public void st2()
	{
		Reporter.log("SystemTestCase");
	}
	
	//-------------------------------------------------------------->
	@Test(groups = "FunctionalTestCase")
	public void ft3()
	{
		Reporter.log("FunctionalTestCase");
	}
	@Test(groups = "IntegrationTestCase")
	public void it3()
	{
		Reporter.log("IntegrationTestCase");
	}
	@Test(groups = "SystemTestCase")
	public void st3()
	{
		Reporter.log("SystemTestCase");
	}
	
}
