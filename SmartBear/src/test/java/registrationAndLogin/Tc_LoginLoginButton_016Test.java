package registrationAndLogin;

import org.testng.Reporter;
import org.testng.annotations.Test;

import genericLibrary.LoginClass;
import genericLibrary.ReadData;
import pomRemo.HomePage;

public class Tc_LoginLoginButton_016Test  extends LoginClass{
	
	@Test
	public void LoginButton() {
		HomePage hp=new HomePage(driver);
		hp.getLoginButton().click();
		Reporter.log("user clicked on loginButton succesfully",true);
	}

}
