package registrationAndLogin;

import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.Test;

import FrameWorkLibrary.LoginClass;

import FrameWorkLibrary.ReadData1;
import pomRepo.HomePage;
/***
 * 
 * @author Praveen
 *
 */
public class Tc_SystemLogin_017Test extends LoginClass{
	WebDriverWait explicitWait;
	
	@Test(groups = "system")
	public void login() throws Exception {
		explicitWait =new WebDriverWait(driver, 15);
		HomePage hp=new HomePage(driver);
		String emailId = ReadData1.fromPropertyFile("email");
		hp.getUsernameTextBox().sendKeys(emailId);
		Reporter.log("Email Entered succesfully",true);
		Thread.sleep(1000);
		//explicitWait.until(ExpectedConditions.elementToBeClickable(By.id("UsernameOrEmail"));
		String password = ReadData1.fromPropertyFile("password");
		hp.getPasswordTextBox().sendKeys(password);
		Reporter.log("password entered succesfully",true);
		Thread.sleep(1000);
		hp.getLoginButton().click();
		Reporter.log("user clicked on loginButton succesfully",true);
		Thread.sleep(1000);
		
	}

}
