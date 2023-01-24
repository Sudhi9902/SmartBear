package registrationAndLogin;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

import genericLibrary.LoginClass;
import pomRemo.HomePage;
import pomRemo.RegistrationPage;

public class Tc_RegistrationDay_011Test  extends LoginClass{
	@Test
	public void date() {
		HomePage hp=new HomePage(driver);
		hp.getRegisterButton().click();
		Reporter.log("Clicked on Register button",true);
		RegistrationPage reg=new RegistrationPage(driver);
		assertEquals("Shop. Register", driver.getTitle(),"title mismatched");
		Reporter.log("Landed succesfully on the Register page",true);
		reg.getDate().click();
		driver.findElement(By.xpath("//option[text()='1']"));
		Reporter.log("Day Entered Sussesfully",true);
		
	}
	
	

}
