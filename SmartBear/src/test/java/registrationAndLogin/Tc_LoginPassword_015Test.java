package registrationAndLogin;

import org.testng.Reporter;
import org.testng.annotations.Test;

import genericLibrary.LoginClass;
import genericLibrary.ReadData;
import pomRemo.HomePage;

public class Tc_LoginPassword_015Test extends LoginClass {
	
	@Test
	public void password() {
		HomePage hp=new HomePage(driver);
		String password = ReadData.fromPropertyFile("password");
		hp.getPasswordTextBox().sendKeys(password);
		Reporter.log("password entered succesfully",true);
	}

}
