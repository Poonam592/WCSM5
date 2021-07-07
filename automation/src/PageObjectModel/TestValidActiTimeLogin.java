package PageObjectModel;
import java.io.IOException;
public class TestValidActiTimeLogin extends BaseTest {

	public static void main(String[] args) throws IOException, InterruptedException {
		BaseTest bt = new BaseTest();
		Flib fb = new Flib();
	    bt.OpenBrowser();
	    LoginPage login = new LoginPage(driver);
	    Thread.sleep(3000);
        login.validLogin(fb.readPropertyFile("./Data/config.properties","username"),fb.readPropertyFile("./Data/config.properties","pwd"));
	    HomePage homepage = new HomePage(driver);
	    homepage.clicksettings();
	}
	

}
