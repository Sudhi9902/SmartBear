package registrationAndLogin;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

import genericLibrary.LoginClass;
import genericLibrary.ReadData;
import pomRemo.HomePage;
import pomRemo.RegistrationPage;

public class Tc_SystemRegistration_018Test extends LoginClass {
	@Test
	public void register() {
		HomePage hp=new HomePage(driver);
		hp.getRegisterButton().click();
		Reporter.log(driver.getTitle(),true);
		RegistrationPage reg=new RegistrationPage(driver);
		assertEquals("Shop. Register", driver.getTitle(),"title mismatched");
		Reporter.log("Landed succesfully on the Register page",true);
		// Click on Male Gender Radio button
		reg.getMaleGenderRadioButton().click();
		Reporter.log(" Clicked on Male Gender button",true);
		String data = ReadData.fromExcel("TestCases", 1, 1);
		reg.getFirstNameTextBox().sendKeys(data);
		Reporter.log("First Name Entered Sussesfully",true);
		String data1 = ReadData.fromExcel("TestCases", 2, 1);
		reg.getLastNameTextBox().sendKeys(data1);
		Reporter.log("Last name entered Succesfully",true);
		reg.getDate().click();
		driver.findElement(By.xpath("//option[text()='1']"));
		Reporter.log("Day Entered Sussesfully",true);
		reg.getMonth().click();
		driver.findElement(By.xpath("//option[text()='January']"));
		Reporter.log("Month Entered Sussesfully",true);
		reg.getYear().click();
		driver.findElement(By.xpath("//option[text()='1998']"));
		Reporter.log("Year Entered Sussesfully",true);
		String data3 = ReadData.fromExcel("TestCases", 3, 1);
		reg.getEmailTextBox().sendKeys(data3);
		Reporter.log("Email Entered Succesfully",true);
		String data4 = ReadData.fromExcel("TestCases", 5, 1);
		reg.getPasswordTextBox().sendKeys(data4);
		Reporter.log("Password Entered Succesfully");
		String data5 = ReadData.fromExcel("TestCases", 6, 1);
		reg.getPasswordTextBox().sendKeys(data5);
		Reporter.log("Confirm Password Entered Succesfully");
		String data6 = ReadData.fromExcel("TestCases", 7, 1);
		reg.getPasswordTextBox().sendKeys(data6);
		Reporter.log("CompanyName Entered Succesfully",true);
		reg.getRegisterButton();
		Reporter.log("Driver clicked on Register button",true);

		
		
	}

}
