package takeScreenshotdynamically;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(CustomListeners.class)
public class TestScreenshots extends Base {
	
	@BeforeMethod()
	public void setUp()
	{
		initalization();
	}

	@AfterMethod
	public void teardown()
	{
		driver.quit();
	}
	
	@Test
	public void verifyTitle1()
	{
	  	String loginPagetitle = driver.getTitle();
	    Assert.assertEquals(loginPagetitle,"actiTIME123 - Login");
	}
	
	@Test
	public void verifyTitle2()
	{
	  	String loginPagetitle = driver.getTitle();
	    Assert.assertEquals(loginPagetitle,"actiTIME1234 - Login");
	}
	
	@Test
	public void verifyTitle3()
	{
	  	String loginPagetitle = driver.getTitle();
	    Assert.assertEquals(loginPagetitle,"actiTIME1235 - Login");
	}
	
	@Test
	public void verifyTitle4()
	{
	  	String loginPagetitle = driver.getTitle();
	    Assert.assertEquals(loginPagetitle,"actiTIME1236 - Login");
	}
}
