package registrationAndLogin;

import org.testng.Reporter;
import org.testng.annotations.Test;

import FrameWorkLibrary.LoginClass;

import FrameWorkLibrary.ReadData1;
import pomRepo.HomePage;
/***
 * 
 * @author Praveen
 *
 */
public class Tc_LoginUserName_014Test extends LoginClass {
	
	@Test(groups = "functionality")
	public void userName() {
		HomePage hp=new HomePage(driver);
		String emailId = ReadData1.fromPropertyFile("email");
		hp.getUsernameTextBox().sendKeys(emailId);
		Reporter.log("Email Entered succesfully",true);
	}

}
