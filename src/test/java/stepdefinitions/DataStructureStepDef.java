package stepdefinitions;

import com.factory.DriverFactory;
import com.pageobjects.DataStructuresPage;
import com.pageobjects.LoginPage;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DataStructureStepDef 
{
	public LoginPage lp=new  LoginPage(DriverFactory.getDriver());
	public DataStructuresPage ds =new DataStructuresPage(DriverFactory.getDriver());
	public Logger logger = LogManager.getLogger(this.getClass());
	private void logMessage(String strMsg)
	{
		logger.info(strMsg);
	}
	


	@Given("User is on Home page after logged in")
	public void user_is_on_home_page_after_logged_in() {
		DriverFactory.getDriver()
		.get("https://dsportalapp.herokuapp.com/login");
		logMessage("User is on Home page after logged in");
		lp.dologin("div","pwd@1234");
		
	}

	@When("User clicks on Getstarted button under Datastructures-Introduction")
	public void user_clicks_on_getstarted_button_under_datastructures_introduction() {
		logMessage("User clicks on Getstarted button under Datastructures-Introduction");
		ds.clickOnGetStartedButton();
	}

	@Then("User is redirected to page with title {string}")
	public void user_is_redirected_to_page_with_title(String string) {
		logMessage("User redirected to page with title:"+ string);
		String datstruct=ds.getPageTitle();
	    Assert.assertEquals(datstruct, string);
	    
	}

	@When("User clicks on Time Complexity")
	public void user_clicks_on_time_complexity() {
		logMessage("User clicks on Time Complexity");
		 ds.clickOnTimeComplexitylink();
	}

	@Then("It should navigate to corresponding page with title {string}")
	public void it_should_navigate_to_corresponding_page_with_title(String string) {
		logMessage("User is navigated to corresponding page with title:" +string);
		String tryedit=ds.getPageTitle();
	    Assert.assertEquals(tryedit, string);
	}

	@When("User clicks on Try here")
	public void user_clicks_on_try_here() {
		logMessage("User clicks on Try here Button");
		ds.clickTryHereBtn();
	}

	@When("User enters the Python code")
	public void user_enters_the_python_code(io.cucumber.datatable.DataTable pythonCode) throws InterruptedException {
		logMessage("User User enters the Python code");
		List<List<String>>data=pythonCode.cells(); 
		ds.enterCode(data.get(0).get(0));
	}

	@When("clicks on Run button")
	public void clicks_on_run_button() throws InterruptedException {
		logMessage("User clicks on Run button");
		ds.clickRunBtn();
	}
	
	@Then("The output has to be displayed")
	public void the_output_has_to_be_displayed() {
		logMessage("The output is displayed");
		ds.displayoutput();
	}
	
	@When("User enters the wrong Python code")
	public void user_enters_the_wrong_python_code() throws InterruptedException {
		logMessage("User enters the wrong Python code");
		ds.enterCode1();
	}

	@Then("The alert messege has to be displayed")
	public void the_alert_messege_has_to_be_displayed() {
		logMessage("The alert messege is displayed");
	    ds.displayAlertMsg();
	}

		
}
