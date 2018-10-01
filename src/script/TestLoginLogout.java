package script;

import org.testng.annotations.Test;

import generic.BaseTest;
import generic.Utility;
import page.HomePage;
import page.LoginPage;

public class TestLoginLogout extends BaseTest {
	
	@Test(priority=1,groups= {"login","smoke"})
	public void testLoginLogout() {
		String u = Utility.getXLData(INPUT_PATH, "TestLoginLogout", 1, 0);
		String p = Utility.getXLData(INPUT_PATH, "TestLoginLogout", 1, 1);
		LoginPage lp=new LoginPage(driver);
		lp.setUsername(u);
		lp.setPassword(p);
		lp.clickLoginBTN();	
		HomePage h=new HomePage(driver);
		h.clickLogout();
	}

}
