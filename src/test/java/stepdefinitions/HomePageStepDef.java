package stepdefinitions;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.factory.DriverFactory;
import com.pageobjects.HomePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HomePageStepDef {
	private HomePage homePage = new HomePage(DriverFactory.getDriver());
	public Logger logger = LogManager.getLogger(this.getClass());
	private void logMessage(String strMsg)
	{
		logger.info(strMsg);
	}
	
	@Given("User opens the dsalgo portal link")
	public void user_opens_the_dsalgo_portal_link() {
		logMessage("User opens the dsalgo portal link");
		DriverFactory.getDriver()
		.get("https://dsportalapp.herokuapp.com");
	}

	@When("User clicks on {string} button")
	public void user_clicks_on_button(String string) {
		logMessage("User clicks on" +string );
		homePage.clickOnGetStarted();   
	}

	@Given("User is on Home Page")
	public void user_is_on_home_page() {
		logMessage("User is on Home Page");
		DriverFactory.getDriver()
		.get("https://dsportalapp.herokuapp.com/home");   
	}

	@When("User clicks on data structure dropdown before signin")
	public void user_clicks_on_data_structure_dropdown_before_signin() throws InterruptedException {
		logMessage("User clicks on data structure dropdown before signin");
		homePage.dropDownClick();
	}

	@Then("User selects any dropdown menu {string}")
	public void user_selects_any_dropdown_menu(String value) throws InterruptedException {
		logMessage("User selects any dropdown menu" +value);
	    homePage.dropdown(value);
	}
	
	@Then("It should Alert the user with the message {string}")
	public void it_should_alert_the_user_with_the_message(String string) throws InterruptedException {
		logMessage("Alerts the user with the message:" +string);
	    homePage.displayErrorMsg();
	}

	@When("User clicks any of the Get started link before signin {string}")
	public void user_clicks_any_of_the_get_started_link_before_signin(String value) {
		logMessage("User clicks any of the Get started link before signin" +value);
	    homePage.getStartedhome(value);
	}

	@When("User clicks on SignIn link")
	public void user_clicks_on_sign_in_link() {
		logMessage("User clicks on SignIn link");
		homePage.clickOnSignIn();
	}

}
