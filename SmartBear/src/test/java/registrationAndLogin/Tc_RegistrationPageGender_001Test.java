package registrationAndLogin;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.Test;


import genericLibrary.LoginClass;
import pomRemo.HomePage;
import pomRemo.RegistrationPage;

public class Tc_RegistrationPageGender_001Test  extends LoginClass{
	WebDriverWait explicitwait;
	
	@Test(groups = "functionality")
	public void malegenderButton() {
		//explicitWait=new WebDriverWait(driver, 15);
		HomePage hp=new HomePage(driver);
		hp.getRegisterButton().click();
		Reporter.log(driver.getTitle(),true);
		RegistrationPage reg=new RegistrationPage(driver);
		assertEquals("Shop. Register", driver.getTitle(),"title mismatched");
		Reporter.log("Landed succesfully on the Register page",true);
		// Click on Male Gender Radio button
		reg.getMaleGenderRadioButton().click();
		Reporter.log(" Clicked on Male Gender button",true);
		
		
	}
	


}
