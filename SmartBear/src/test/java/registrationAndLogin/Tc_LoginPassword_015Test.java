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
public class Tc_LoginPassword_015Test extends LoginClass {
	
	@Test(groups = "fnctionality")
	public void password() {
		HomePage hp=new HomePage(driver);
		String password = ReadData1.fromPropertyFile("password");
		hp.getPasswordTextBox().sendKeys(password);
		Reporter.log("password entered succesfully",true);
	}

}
