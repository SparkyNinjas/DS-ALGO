package stepdefinitions;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.factory.DriverFactory;
import com.pageobjects.DataStructuresPage;
import com.pageobjects.LoginPage;
import com.pageobjects.GraphPage;

import io.cucumber.java.en.When;
public class GraphStepDef 
{
	public LoginPage lp=new  LoginPage(DriverFactory.getDriver());
	public DataStructuresPage ds=new  DataStructuresPage(DriverFactory.getDriver());
	public GraphPage gp =new GraphPage(DriverFactory.getDriver());
	public Logger logger = LogManager.getLogger(this.getClass());
	private void logMessage(String strMsg)
	{
		logger.info(strMsg);
	}
	
	@When("User clicks on Getstarted button under Graph")
	public void user_clicks_on_getstarted_button_under_graph() {
		logMessage("User clicks on Getstarted button under Graph");
		gp.clickOnGetStarted();
	}
	@When("User clicks on Graph")
	public void user_clicks_on_graph() {
		logMessage("User clicks on Graph");
		gp.clickOnGraphLink();
	}
	
	@When("User clicks on Graph Representations")
	public void user_clicks_on_graph_representations() {
		logMessage("User clicks on Graph Representations");
		gp.clickOnGraphRepresentationsLink();
	}
	
}
