package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import utility.BaseTest;

public class RegisterPage extends BaseTest {
	
	
	@FindBy(xpath = ".//a[@data-twg-id ='header-register-desktop']")
	WebElement lnkRegister;
	
	@FindBy(name = "dwfrm_profile_customer_firstname")
	WebElement txtFirstName;
	
	@FindBy(name = "dwfrm_profile_customer_lastname")
	WebElement txtLastName;
	
	@FindBy(id = "dwfrm_profile_customer_email")
	WebElement txtEmail;
	
	@FindBy(id = "dwfrm_profile_login_password")
	WebElement txtPassword;
	
	@FindBy(id = "dwfrm_profile_login_passwordconfirm")
	WebElement txtPwdConfirm;
	
	@FindBy(name = "dwfrm_profile_confirm")
	WebElement btnSignUp;
	
	public RegisterPage() {
		super();
		PageFactory.initElements(driver, this);
	}
	
	public void clickRegister() {
		lnkRegister.click();
	}

	public void enterFirstName() {
		txtFirstName.sendKeys("Shireen");
		
	}
	
	public void enterLastName() {
		txtLastName.sendKeys("Kamra");
	}
	
	public void enterEmailAddress() {
		txtEmail.sendKeys("hgjhgjh@test.com");
	}
	
	public void enterPassword() {
		txtPassword.sendKeys("Shireen12");
		
	}
	
	public void reenterPwd() {
		txtPwdConfirm.sendKeys("Shireen12");
	}
	
	public void clickSignUp() {
		btnSignUp.click();
	}

	public void enterFirstName(String firstName) {
		txtFirstName.sendKeys(firstName);
		
	}

	public void enterLastName(String lastName) {
		txtLastName.sendKeys(lastName);
		
	}

	public void enterEmailAddress(String email) {
		txtEmail.sendKeys(email);
		
	}

	public void enterPassword(String password) {
		txtPassword.sendKeys(password);
		
	}
	
	public void reenterPwd(String password) {
		txtPwdConfirm.sendKeys(password);
	}
	
	public void verifyPostRegisterURL() {
		Assert.assertEquals(driver.getCurrentUrl(), "https://www.thewarehouse.co.nz/register");
		
	}

}
