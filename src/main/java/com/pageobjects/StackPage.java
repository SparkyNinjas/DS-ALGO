package com.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class StackPage {

	public WebDriver driver;
	// Using FindBy for locating elements
	@FindBy(xpath="//a[@href='stack']")
	WebElement getstarted;

	@FindBy(xpath="//a[@href='operations-in-stack']")
	WebElement operationsInStacklink;

	@FindBy(xpath="//a[@href='implementation']")
	WebElement implementationlink;

	@FindBy(xpath="//a[@href='stack-applications']")
	WebElement applicationslink;

	@FindBy(xpath="//a[@href='Sign out']")
	WebElement signoutBtn;

	@FindBy(xpath ="//a[text()='Try here>>>']")
	WebElement tryhereBtn;


	@FindBy(xpath = "//*[@class=' CodeMirror-line ']")
	WebElement editorBtn; 

	@FindBy(xpath ="//button[text()='Run']")
	WebElement runBtn;
	
	public StackPage(WebDriver driver)
	{
		
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}
	
	public void clickOnGetStarted()
	{
		// TODO Auto-generated method stub
		getstarted.click();
	}
	
	public void clickOnOperationsInStackLink()
	{
		// TODO Auto-generated method stub
		operationsInStacklink.click();
	}
	
	public void clickOnImplementationLink()
	{
		// TODO Auto-generated method stub
		implementationlink.click();
	}
	
	public void clickOnApplicationsLink()
	{
		// TODO Auto-generated method stub
		applicationslink.click();
	}
	public void clickOnSignOutBtn()
	{
		// TODO Auto-generated method stub
		signoutBtn.click();
	}
	
	public void clickOntryhereBtn()
	{
		// TODO Auto-generated method stub
		tryhereBtn.click();
	}
	
	public void entercode()
	{
		// TODO Auto-generated method stub
		editorBtn.sendKeys("wrong python code");
	}
	
	public void clickOnrunBtn()
	{
		// TODO Auto-generated method stub
		runBtn.click();
	}


}
