package com.pageobjects;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class QueuePage 
{
	public WebDriver driver;
	// Using FindBy for locating elements
	@FindBy(xpath="//a[@href='queue']")
	WebElement getstarted;

	@FindBy(linkText="Implementation of Queue in Python")
	WebElement implementationOfQueueinPythonlink;

	@FindBy(linkText="Implementation using collections.deque")
	WebElement impementationUsingCollectionslink;
	
	@FindBy(linkText="Implementation using array")
	WebElement implementationUsingArraylink;

	@FindBy(xpath="//a[@href='QueueOp']")
	WebElement queueOperationslink;

	@FindBy(xpath="//a[@href='Sign out']")
	WebElement signoutBtn;
	

	
	
	public QueuePage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}

	public void clickOnGetStarted()
	{
		// TODO Auto-generated method stub
		getstarted.click();
	}
	
	public void clickOnImplementationofQueueinPythonLink()
	{
		// TODO Auto-generated method stub
		implementationOfQueueinPythonlink.click();
	}
	
	public void clickOnImplementationUsingCollectionsLink()
	{
		// TODO Auto-generated method stub
		impementationUsingCollectionslink.click();
	}
	public void clickOnImplementationUsingArrayLink()
	{
		// TODO Auto-generated method stub
		implementationUsingArraylink.click();
	}
	
	public void clickOnQueueOperationsLink()
	{
		// TODO Auto-generated method stub
		queueOperationslink.click();
	}

}
