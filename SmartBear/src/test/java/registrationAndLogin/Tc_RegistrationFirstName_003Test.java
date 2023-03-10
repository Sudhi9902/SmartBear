package registrationAndLogin;

import static org.testng.Assert.assertEquals;

import org.testng.Reporter;
import org.testng.annotations.Test;

import FrameWorkLibrary.LoginClass;

import FrameWorkLibrary.ReadData1;
import pomRepo.HomePage;
import pomRepo.RegistrationPage;

public class Tc_RegistrationFirstName_003Test extends LoginClass{
	
	@Test(groups = "functionality")
	public void firstNameTextBox() {
		HomePage hp=new HomePage(driver);
		hp.getRegisterButton().click();
		RegistrationPage reg=new RegistrationPage(driver);
		assertEquals("Shop. Register", driver.getTitle(),"title mismatched");
		
		Reporter.log("Landed succesfully on the Register page",true);
		String data = ReadData1.fromExcel("TestCases", 1, 1);
		reg.getFirstNameTextBox().sendKeys(data);
		Reporter.log("First Name Entered Sussesfully",true);
		
		
		
	}

}
