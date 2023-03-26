package stepdefinitions;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.factory.DriverFactory;
import com.pageobjects.ArrayPage;
import com.pageobjects.DataStructuresPage;
import com.pageobjects.LoginPage;
import io.cucumber.java.en.When;

public class ArrayStepDef {
	
	public LoginPage lp=new  LoginPage(DriverFactory.getDriver());
	public DataStructuresPage ds=new  DataStructuresPage(DriverFactory.getDriver());
	public ArrayPage ap =new ArrayPage(DriverFactory.getDriver());
	public Logger logger = LogManager.getLogger(this.getClass());
	private void logMessage(String strMsg)
	{
		logger.info(strMsg);
	}
	
	@When("User clicks on Getstarted button under Array")
	public void user_clicks_on_getstarted_button_under_array() {
		logMessage("User clicks on Getstarted button under Array");
		ap.clickOnGetStarted();
	}
	@When("User clicks on Arrays in Python")
	public void user_clicks_on_arrays_in_python() {
		logMessage("User clicks on Arrays in Python");
		ap.clickOnArraysInPythonLink();
	}

	@When("User clicks on Arrays Using List")
	public void user_clicks_on_arrays_using_list() {
		logMessage("User clicks on Arrays Using List");
		ap.clickOnArraysUsingListLink();
	}
	
	@When("User clicks on Basic Operations In Lists")
	public void user_clicks_on_basic_operations_in_lists() {
		logMessage("User clicks on Basic Operations In Lists");
		ap.clickOnBasicOperationsInListsLink();
	}
	
	@When("User clicks on Applications of Array")
	public void user_clicks_on_applications_of_array() {
		logMessage("User clicks on Applications of Array");
		ap.clickOnApplicationsOfArrayLink();
	}
	
	@When("User clicks on Practice Questions")
	public void user_clicks_on_practice_questions() {
		logMessage("User clicks on Practice Questions");
		ap.clickOnPracticeQuestionsLink();
	}
	
	@When("User clicks on Search the array")
	public void user_clicks_on_search_the_array() {
		logMessage("User clicks on Search the array");
		ap.clickOnSearchTheArrayLink();
	}
	
	@When("User clears the Text Editor")
	public void user_clears_the_text_editor() throws InterruptedException {
		logMessage("User clears the Text Editor");
		ap.clearTextEditor();
	}
	
	@When("User enters the Search Array Python code")
	public void user_enters_the_search_array_python_code() throws InterruptedException {
		logMessage("User enters the Search Array Python code");
		ap.practiceQuestionsCode();
	}
	
	@When("User clicks on Run")
	public void user_clicks_on_run()  {
		logMessage("User clicks on Run");
		ap.clickOnRunBtn();
	}
	
}
