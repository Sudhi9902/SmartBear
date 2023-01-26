package registrationAndLogin;

import org.testng.Reporter;
import org.testng.annotations.Test;

import pomRepo.HomePage;
/***
 * 
 * @author Praveen
 *
 */
public class Tc_LoginLoginButton_016Test  extends FrameWorkLibrary.LoginClass{
	
	@Test(groups = "functionality")
	public void LoginButton() {
		HomePage hp=new HomePage(driver);
		hp.getLoginButton().click();
		Reporter.log("user clicked on loginButton succesfully",true);
	}

}
