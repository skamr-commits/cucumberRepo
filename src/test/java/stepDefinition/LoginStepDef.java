package stepDefinition;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LoginPage;
import utility.BaseTest;

public class LoginStepDef extends BaseTest {
	
	LoginPage lp;
	
	public LoginStepDef() {
		super();
	}
	
	@Before
	public void setUp() {
		initialisationDriver();
	}
	
	@Given("I am on the Home Page")
	public void i_am_on_the_home_page() {
		driver.get("https://www.thewarehouse.co.nz/");
		verifyHomePage();
	}

	@When("I enter my {string} and {string}")
	public void i_enter_my_and(String Username, String Password) {
		try {
		lp = new LoginPage();
		lp.clickSignIn();
		lp.enterUserName(Username);
		lp.enterPassword(Password);
		lp.clickLogin();
	}catch(Exception e) {
		e.printStackTrace();
	}
	}

	@Then("I should see the MyAccount page")
	public void i_should_see_the_my_account_page() {
		lp.verifyLogOut();
		
	}
	
	@After
	public void tearDown() {
		try {
			closeDriver();
		}catch(Exception e) {
			e.printStackTrace();	
		}
	}


}
