package registrationAndLogin;

import static org.testng.Assert.assertEquals;

import org.testng.Reporter;
import org.testng.annotations.Test;


import genericLibrary.LoginClass;
import genericLibrary.ReadData;
import pomRemo.HomePage;
import pomRemo.RegistrationPage;

public class Tc_RegistrationEmail_005Test extends LoginClass{
	@Test(groups = "functionality")
	public void emailTextBox() {
		HomePage hp=new HomePage(driver);
		hp.getRegisterButton().click();
		RegistrationPage reg=new RegistrationPage(driver);
		assertEquals("Shop. Register", driver.getTitle(),"title mismatched");
		Reporter.log("Landed succesfully on the Register page",true);
		String data = ReadData.fromExcel("TestCases", 3, 1);
		reg.getEmailTextBox().sendKeys(data);
		Reporter.log("Email Entered Succesfully",true);
		
	}
}
