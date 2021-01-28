package stepDefinition;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LoginPage;
import pages.RegisterPage;
import utility.BaseTest;

public class RegisterStepDef extends BaseTest {
	
	RegisterPage rp;
	LoginPage lp;
	
	public RegisterStepDef() {
		super();
	}
	
		
	@And("I click on Register")
	public void i_click_on_register() {
		try {
		rp = new RegisterPage();
		rp.clickRegister();
		}catch(Exception e) {
			e.printStackTrace();
		}
		}
	

	@When("I enter my {string}, {string}, {string}, {string}")
	public void i_enter_my(String FirstName, String LastName, String Email, String Password) {
	    try {
	    
	    rp.enterFirstName(FirstName);
	    rp.enterLastName(LastName);
	    rp.enterEmailAddress(Email);
	    rp.enterPassword(Password);
	    rp.reenterPwd(Password);
	    }catch(Exception e) {
	    	e.printStackTrace();
	    }
	}

	@Then("I am registered successfully")
	public void i_am_registered_successfully() {
		rp.verifyPostRegisterURL();
	    
	}
	
	
	
}
	


