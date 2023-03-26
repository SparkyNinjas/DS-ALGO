package stepdefinitions;

import com.factory.DriverFactory;
import com.pageobjects.DataStructuresPage;
import com.pageobjects.LinkedListPage;
import com.pageobjects.LoginPage;

import io.cucumber.java.en.When;

public class LinkedListStepDef {

	public LoginPage lp=new  LoginPage(DriverFactory.getDriver());
	public DataStructuresPage ds=new  DataStructuresPage(DriverFactory.getDriver());
	public LinkedListPage ll =new LinkedListPage(DriverFactory.getDriver());
	
	@When("User clicks on Getstarted button under Linked List")
	public void user_clicks_on_getstarted_button_under_linked_list() {
		ll.clickOnGetStarted();
	}
	
	@When("User clicks on Introduction")
	public void user_clicks_on_introduction() {
		ll.clickOnIntroduction();
	}
	
	@When("User clicks on Creating Linked List")
	public void user_clicks_on_creating_linked_list() {
		ll.clickOncreatinglinkedlistlink();
	}
	
	@When("User clicks on Types of Linked List")
	public void user_clicks_on_types_of_linked_list() {
		ll.clickOntypesoflinkedlistlink();
	}
	
	@When("User clicks on Implement Linked List in Python")
	public void user_clicks_on_implement_linked_list_in_python() {
		ll.clickOnimplementlinkedlistlink();
	}
	
	@When("User clicks on Traversal")
	public void user_clicks_on_traversal() {
		ll.clickOntraversallink();
	}
	
	@When("User clicks on Insertion")
	public void user_clicks_on_insertion() {
		ll.clickOninsertionlink();
	}
	
	@When("User clicks on Deletion")
	public void user_clicks_on_deletion() {
		ll.clickOndeletionlink();
	}
}
