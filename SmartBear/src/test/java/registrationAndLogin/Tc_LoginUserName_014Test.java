package registrationAndLogin;

import org.testng.Reporter;
import org.testng.annotations.Test;

import genericLibrary.LoginClass;
import genericLibrary.ReadData;
import pomRemo.HomePage;

public class Tc_LoginUserName_014Test extends LoginClass {
	
	@Test
	public void userName() {
		HomePage hp=new HomePage(driver);
		String emailId = ReadData.fromPropertyFile("email");
		hp.getUsernameTextBox().sendKeys(emailId);
		Reporter.log("Email Entered succesfully",true);
	}

}
