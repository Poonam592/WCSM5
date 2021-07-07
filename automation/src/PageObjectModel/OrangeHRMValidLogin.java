package PageObjectModel;

import java.io.IOException;

public class OrangeHRMValidLogin extends BaseTest{

	public static void main(String[] args) throws IOException {
		BaseTest bt = new BaseTest();
		bt.OpenBrowser();
		Flib fb = new Flib();
		String username = fb.readPropertyFile(pro_path,"username");
		String pwd = fb.readPropertyFile(pro_path, "pwd");
		LoginPageOrangeHRM login = new LoginPageOrangeHRM(driver);
		login.validLogin(username, pwd);

	}

}
