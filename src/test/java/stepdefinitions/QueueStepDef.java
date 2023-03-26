package stepdefinitions;
import com.factory.DriverFactory;
import com.pageobjects.DataStructuresPage;
import com.pageobjects.LoginPage;
import com.pageobjects.QueuePage;

import io.cucumber.java.en.When;
public class QueueStepDef
{
	public LoginPage lp=new  LoginPage(DriverFactory.getDriver());
	public DataStructuresPage ds=new  DataStructuresPage(DriverFactory.getDriver());
	public QueuePage qp =new QueuePage(DriverFactory.getDriver());
	
	@When("User clicks on Getstarted button under Queue")
	public void user_clicks_on_getstarted_button_under_queue() {
		qp.clickOnGetStarted();
	}
	@When("User clicks on Implementation of Queue in Python")
	public void user_clicks_on_implementation_of_queue_in_python() {
		qp.clickOnImplementationofQueueinPythonLink();
	}
	
	@When("User clicks on Implementation using collections")
	public void user_clicks_on_implementation_using_collections() {
		qp.clickOnImplementationUsingCollectionsLink();
	}
	@When("User clicks on Implementation using Array")
	public void user_clicks_on_implementation_using_array() {
		qp.clickOnImplementationUsingArrayLink();
	}
	
	@When("User clicks on Queue Operations")
	public void user_clicks_on_queue_operations() {
		qp.clickOnQueueOperationsLink();
	}
}
