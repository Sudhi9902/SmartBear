package registrationAndLogin;

import static org.testng.Assert.assertEquals;

import org.testng.Reporter;
import org.testng.annotations.Test;

import genericLibrary.LoginClass;
import genericLibrary.ReadData;
import pomRemo.HomePage;
import pomRemo.RegistrationPage;

public class Tc_RegistrationConfirmPassword_008Test extends LoginClass {
	@Test(groups = "functionality")
	public void confirmPassword() {
		HomePage hp=new HomePage(driver);
		hp.getRegisterButton().click();
		RegistrationPage reg=new RegistrationPage(driver);
		assertEquals("Shop. Register", driver.getTitle(),"title mismatched");
		Reporter.log("Landed succesfully on the Register page",true);
		String data = ReadData.fromExcel("TestCases", 6, 1);
		reg.getPasswordTextBox().sendKeys(data);
		Reporter.log("Confirm Password Entered Succesfully");
	}

}
