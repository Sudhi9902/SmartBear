package registrationAndLogin;

import static org.testng.Assert.assertEquals;

import org.testng.Reporter;
import org.testng.annotations.Test;

import FrameWorkLibrary.LoginClass;

import FrameWorkLibrary.ReadData1;
import pomRepo.HomePage;
import pomRepo.RegistrationPage;
/***
 * 
 * @author Praveen
 *
 */
public class Tc_RegistrationCompanyName_010Test extends LoginClass{
	@Test(groups = "functionality")
	public void companyName() {
		HomePage hp=new HomePage(driver);
		hp.getRegisterButton().click();
		RegistrationPage reg=new RegistrationPage(driver);
		assertEquals("Shop. Register", driver.getTitle(),"title mismatched");
		Reporter.log("Landed succesfully on the Register page",true);
		String data = ReadData1.fromExcel("TestCases", 7, 1);
		reg.getPasswordTextBox().sendKeys(data);
		Reporter.log("CompanyName Entered Succesfully",true);
	}

}
