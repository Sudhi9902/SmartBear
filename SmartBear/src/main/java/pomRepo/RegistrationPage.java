package pomRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegistrationPage {
	public RegistrationPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="gender-male")
	private WebElement maleGenderRadioButton;
	
	@FindBy(id="gender-female")
	private WebElement femaleGenderRadioButton;
	
	@FindBy(id="FirstName")
	private WebElement firstNameTextBox;
	
	@FindBy(id="LastName")
	private WebElement lastNameTextBox;
	
	@FindBy(name="DateOfBirthDay")
	private WebElement date;
	
	@FindBy(name="DateOfBirthMonth")
	private WebElement month;
	
	@FindBy(name="DateOfBirthYear")
	private WebElement year;
	
	public WebElement getMonth() {
		return month;
	}

	public WebElement getYear() {
		return year;
	}
	@FindBy(id="Email")
	private WebElement emailTextBox;
	
	public WebElement getDate() {
		return date;
	}
	@FindBy(id="Username")
	private WebElement userNameTextBox;
	
	@FindBy(id="Password")
	private WebElement passwordTextBox;
	
	@FindBy(id="ConfirmPassword")
	private WebElement confirmPasswordTextBox;
	
	@FindBy(id="Company")
	private WebElement companyNameTextBox;
	
	@FindBy(id="Newsletter")
	private WebElement newsletterCheckBOx;
	
	@FindBy(name="register-button")
	private WebElement registerButton;

	public WebElement getMaleGenderRadioButton() {
		return maleGenderRadioButton;
	}

	public WebElement getFemaleGenderRadioButton() {
		return femaleGenderRadioButton;
	}

	public WebElement getFirstNameTextBox() {
		return firstNameTextBox;
	}

	public WebElement getLastNameTextBox() {
		return lastNameTextBox;
	}

	public WebElement getEmailTextBox() {
		return emailTextBox;
	}

	public WebElement getUserNameTextBox() {
		return userNameTextBox;
	}

	public WebElement getPasswordTextBox() {
		return passwordTextBox;
	}

	public WebElement getConfirmPasswordTextBox() {
		return confirmPasswordTextBox;
	}

	public WebElement getCompanyNameTextBox() {
		return companyNameTextBox;
	}

	public WebElement getNewsletterCheckBOx() {
		return newsletterCheckBOx;
	}

	public WebElement getRegisterButton() {
		return registerButton;
	}

}
