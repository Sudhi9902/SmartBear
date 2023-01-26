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
public class Tc_RegistrationLastName_004Test extends LoginClass{
	
	@Test(groups = "functionality")
	public void lastNameTextBox() {
		HomePage hp=new HomePage(driver);
		hp.getRegisterButton().click();
		RegistrationPage reg=new RegistrationPage(driver);
		assertEquals("Shop. Register", driver.getTitle(),"title mismatched");
		Reporter.log("Landed succesfully on the Register page",true);
		String data = ReadData1.fromExcel("TestCases", 2, 1);
		reg.getLastNameTextBox().sendKeys(data);
		Reporter.log("Last name entered Succesfully",true);
		
		
	}

}
