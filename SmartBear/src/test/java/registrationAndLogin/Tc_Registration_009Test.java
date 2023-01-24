package registrationAndLogin;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;


import genericLibrary.LoginClass;
import pomRemo.HomePage;
import pomRemo.RegistrationPage;

public class Tc_Registration_009Test extends LoginClass {
	@Test(groups = "functionality")
	public void registerButton() {
		HomePage hp=new HomePage(driver);
		hp.getRegisterButton().click();
		RegistrationPage reg=new RegistrationPage(driver);
		assertEquals("Shop. Register", driver.getTitle(),"title mismatched");
		Reporter.log("Landed succesfully on the Register page",true);
		reg.getRegisterButton();
		Reporter.log("Driver clicked on Register button",true);
		assertEquals("'Confirm password' should not be empty.", "'Confirm password' should not be empty.", "message mismatched");
	}

}
