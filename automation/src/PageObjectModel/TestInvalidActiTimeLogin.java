package PageObjectModel;

import java.io.IOException;

public class TestInvalidActiTimeLogin extends BaseTest{

	public static void main(String[] args) throws IOException, InterruptedException {
		BaseTest bt = new BaseTest();
		bt.OpenBrowser();
		Flib fb = new Flib();
		
		LoginPage login = new LoginPage(driver);
		int rc = fb.RowCount(Excel_path,"InvalidCredentials");
		for(int i=1;i<=rc;i++)
		{
			String username = fb.readExcelsheet(Excel_path,"InvalidCredentials",i,0);
			String pwd = fb.readExcelsheet(Excel_path,"InvalidCredentials", i,1);
			Thread.sleep(2000);
			
		    login.invalidLogin(username,pwd);

	}

}
}
