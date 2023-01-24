package registrationAndLogin;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.Test;


import genericLibrary.LoginClass;
import pomRemo.HomePage;
import pomRemo.RegistrationPage;

public class Tc_RegistrationPageGender_002Test extends LoginClass{
	WebDriverWait explicitwait;
	 
	@Test(groups = "functionality")
	public void femaleRadioButton() {
		HomePage hp=new HomePage(driver);
		hp.getRegisterButton().click();
		String actualTitle="Shop. Register";
		explicitWait=new WebDriverWait(driver, 12);
		RegistrationPage reg=new RegistrationPage(driver);
		assertEquals(actualTitle, driver.getTitle(),"title mismatched");
		Reporter.log("Landed succesfully on the register page",true );
		reg.getFemaleGenderRadioButton().click();
		Reporter.log("clicked on female readio button",true);
		
		
	}

}
