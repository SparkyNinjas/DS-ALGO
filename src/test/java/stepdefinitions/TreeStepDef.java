package stepdefinitions;
import com.factory.DriverFactory;
import com.pageobjects.DataStructuresPage;
import com.pageobjects.LoginPage;
import com.pageobjects.QueuePage;
import com.pageobjects.TreePage;

import io.cucumber.java.en.When;

public class TreeStepDef 
{
	public LoginPage lp=new  LoginPage(DriverFactory.getDriver());
	public DataStructuresPage ds=new  DataStructuresPage(DriverFactory.getDriver());
	public TreePage tp =new TreePage(DriverFactory.getDriver());
	
	@When("User clicks on Getstarted button under Tree")
	public void user_clicks_on_getstarted_button_under_tree() {
		tp.clickOnGetStarted();
	}
	@When("User clicks on Overview of Trees")
	public void user_clicks_on_overview_of_trees() {
		tp.clickOnOverviewOfTreesLink();
	}
	
	@When("User clicks on Terminologies")
	public void user_clicks_on_terminologies() {
		tp.clickOnTerminologiesLink();
	}
	@When("User clicks on Types of Trees")
	public void user_clicks_on_types_of_trees() {
		tp.clickOnTypesOfTreesLink();
	}
	
	@When("User clicks on Tree Traversals")
	public void user_clicks_on_tree_traversals() {
		tp.clickOnTreeTraversalsLink();
	}
	
	@When("User clicks on Traversals Illustration")
	public void user_clicks_on_traversals_illustration() {
		tp.clickOnTraversalsIllustrationLink();
	}
	
	@When("User clicks on Binary Trees")
	public void user_clicks_on_binary_trees() {
		tp.clickOnBinaryTreesLink();
	}
	
	@When("User clicks on Types of Binary Trees")
	public void user_clicks_on_types_of_binary_trees() {
		tp.clickOnTypesOfBinaryTreesLink();
	}
	
	@When("User clicks on Implementation in Python")
	public void user_clicks_on_implementation_in_python() {
		tp.clickOnImplementationInPythonLink();
	}
	
	@When("User clicks on Binary Tree Traversals")
	public void user_clicks_on_binary_tree_traversals() {
		tp.clickOnBinaryTreeTraversalsLink();
	}
	
	@When("User clicks on Implementation of Binary Trees")
	public void user_clicks_on_implementation_of_binary_trees() {
		tp.clickOnImpementationOfBinaryTreesLink();
	}
	
	@When("User clicks on Applications of Binary Trees")
	public void user_clicks_on_applications_of_binary_trees() {
		tp.clickOnApplicationsOfBinaryTreesLink();
	}
	
	@When("User clicks on Binary Search Trees")
	public void user_clicks_on_binary_search_trees() {
		tp.clickOnBinarySearchTreesLink();
	}
	
	@When("User clicks on Implementation of BST")
	public void user_clicks_on_implementation_of_bst() {
		tp.clickOnImplementationOfBSTLink();
	}
}
