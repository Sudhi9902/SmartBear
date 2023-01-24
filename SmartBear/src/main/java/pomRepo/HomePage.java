package pomRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(partialLinkText = "Register")
	private WebElement registerButton;
	
	@FindBy(id="UsernameOrEmail")
	private WebElement usernameTextBox;
	
	@FindBy(id="Password")
	private WebElement passwordTextBox;
	
	@FindBy(id="RememberMe")
	private WebElement rememberMeCheckBox;
	
	@FindBy(xpath="//button[contains(text(),'Log in')]")
	private WebElement loginButton;

	public WebElement getRegisterButton() {
		return registerButton;
	}

	public WebElement getUsernameTextBox() {
		return usernameTextBox;
	}

	public WebElement getPasswordTextBox() {
		return passwordTextBox;
	}

	public WebElement getRememberMeCheckBox() {
		return rememberMeCheckBox;
	}

	public WebElement getLoginButton() {
		return loginButton;
	}

}
