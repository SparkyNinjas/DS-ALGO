package stepdefinitions;

import static org.testng.Assert.assertEquals;

import org.junit.Assert;

import com.factory.DriverFactory;
import com.pageobjects.LoginPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDef {

	public static String success;
	public LoginPage loginPage = new LoginPage(DriverFactory.getDriver());
	
	@Given("User is on SignIn page")
	public void user_is_on_signin_page() {
		
		DriverFactory.getDriver()
		.get("https://dsportalapp.herokuapp.com/login");
	}

	@When("User clicks on Register link")
	public void user_clicks_on_register_link() {
	    
		loginPage.clickOnRegisterLink();
	}

	@Then("User is redirected to Register page")
	public void user_is_redirected_to_register_page() {
	    
		DriverFactory.getDriver()
		.get("https://dsportalapp.herokuapp.com/register");
	
	}

	@When("User enters username {string}")
	public void user_enters_username(String username) {
	    
		loginPage.enterUserName(username);
	}

	@When("User enters password {string}")
	public void user_enters_password(String password) {
	    
		loginPage.enterPassword(password);
	}

	@When("User clicks on Login button")
	public void user_clicks_on_login_button() {
	    
		loginPage.clickOnLogin();
	}

	@Then("User gets the logged in messege")
	public void user_gets_the_logged_in_messege() {
	    
		success = loginPage.successLoginMsg();
		System.out.println("Success: " + success);
	}

	@Then("Logout link should be displayed")
	public void logout_link_should_be_displayed() {
		Assert.assertTrue(loginPage.logoutLinkExist());   
	}

	@When("User clicks on login button with empty fields")
	public void user_clicks_on_login_button_with_empty_fields() {
		
		loginPage.clickOnLogin();
	    
	}

	@Then("User gets the error message {string}")
	public void user_gets_the_error_message(String string) {
		
		String errormsg = loginPage.emptyfieldsMsg(string);
		System.out.println("Error: " + errormsg);
		assertEquals(errormsg,string);
	}
	
	@When("User enters username as {string}")
	public void user_enters_username_as(String username) {
	    
		loginPage.enterUserName(username);
	}

	@When("User enters password as {string}")
	public void user_enters_password_as(String password) {
	    
		loginPage.enterPassword(password);
	}

	@When("User clicks login button")
	public void user_clicks_login_button() {
	 
		loginPage.clickOnLogin();
	}

	@Then("User gets the error message as {string}")
	public void user_gets_the_error_message_as(String string) {
		
		String alertmsg =loginPage.invalidCredentialsMsg();
	   assertEquals(alertmsg, string);
	}
	
	@When("User enters only username as {string}")
	public void user_enters_only_username_as(String username) {
		loginPage.enterUserName(username);   
	}



	@Then("User gets the message at password field as {string}")
	public void user_gets_the_message_at_password_field_as(String string) {
	 
		String text= loginPage.validatePasswordfield(string);
		
		assertEquals(text,"Please fill out this field.");
	}
	
	@When("User enters only password as {string}")
	public void user_enters_only_password_as(String password) {
		loginPage.enterPassword(password);
	}

	
	@Then("User gets the message at username field as {string}")
	public void user_gets_the_message_at_username_field_as(String string) {
	    
    String text= loginPage.validateUsernamefield(string);
		
		assertEquals(text,"Please fill out this field.");
	}

	@When("User enters valid {string} and {string}")
	public void user_enters_valid_and(String username, String password) {
		loginPage.enterUserName(username); 
		loginPage.enterPassword(password); 
	}
	

	@When("User clicks on signout button")
	public void user_clicks_on_signout_button() {
		loginPage.clickOnLogout();
	}

	@Then("User is redirected to homepage")
	public void user_is_redirected_to_homepage() {
		 DriverFactory.getDriver()
			.get("https://dsportalapp.herokuapp.com/home");
	}




}
