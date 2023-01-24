package registrationAndLogin;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.Test;

import genericLibrary.LoginClass;
import genericLibrary.ReadData;
import pomRemo.HomePage;
/***
 * 
 * @author LENOVO 7XIN
 *
 */
public class Tc_SystemLogin_017Test extends LoginClass{
	WebDriverWait explicitWait;
	
	@Test
	public void login() throws Exception {
		explicitWait =new WebDriverWait(driver, 15);
		HomePage hp=new HomePage(driver);
		String emailId = ReadData.fromPropertyFile("email");
		hp.getUsernameTextBox().sendKeys(emailId);
		Reporter.log("Email Entered succesfully",true);
		Thread.sleep(1000);
		//explicitWait.until(ExpectedConditions.elementToBeClickable(By.id("UsernameOrEmail"));
		String password = ReadData.fromPropertyFile("password");
		hp.getPasswordTextBox().sendKeys(password);
		Reporter.log("password entered succesfully",true);
		Thread.sleep(1000);
		hp.getLoginButton().click();
		Reporter.log("user clicked on loginButton succesfully",true);
		Thread.sleep(1000);
		
	}

}
