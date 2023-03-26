package stepdefinitions;

import com.factory.DriverFactory;
import com.pageobjects.DataStructuresPage;
import com.pageobjects.LoginPage;
import com.pageobjects.StackPage;

import io.cucumber.java.en.When;

public class StackStepDef 
{
	public LoginPage lp=new  LoginPage(DriverFactory.getDriver());
	public DataStructuresPage ds=new  DataStructuresPage(DriverFactory.getDriver());
	public StackPage sp =new StackPage(DriverFactory.getDriver());
	
	@When("User clicks on Getstarted button under Stack")
	public void user_clicks_on_getstarted_button_under_stack() {
		sp.clickOnGetStarted();
	}
	@When("User clicks on Operations in Stack")
	public void user_clicks_on_introduction() {
		sp.clickOnOperationsInStackLink();
	}
	
	@When("User clicks on Implementation")
	public void user_clicks_on_implementation() {
		sp.clickOnImplementationLink();
	}
	
	@When("User clicks on Applications")
	public void user_clicks_on_applications() {
		sp.clickOnApplicationsLink();
	}
}
