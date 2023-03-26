package com.pageobjects;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ArrayPage {
	
	public WebDriver driver;
	// Using FindBy for locating elements
	@FindBy(xpath="//a[@href='array']")
	WebElement getstarted;

	@FindBy(xpath="//a[@href='arrays-in-python']")
	WebElement arraysInPythonlink;

	@FindBy(xpath="//a[@href='arrays-using-list']")
	WebElement arraysUsingListlink;

	@FindBy(xpath="//a[@href='basic-operations-in-lists']")
	WebElement boplink;
	
	@FindBy(xpath="//a[@href='applications-of-array']")
	WebElement appOfArraylink;
	
	@FindBy(xpath="//a[text()='Practice Questions']")
	WebElement practiceQuestionslink;
	
	@FindBy(xpath="//a[@href='/question/1']")
	WebElement searchTheArraylink;

	@FindBy(xpath="//a[@href='Sign out']")
	WebElement signoutBtn;

	@FindBy(xpath ="//a[text()='Try here>>>']")
	WebElement tryhereBtn;


	@FindBy(xpath = "//*[@class=' CodeMirror-line ']")
	WebElement editorBtn; 
	
	@FindBy(xpath="//textarea[@tabindex='0']")
	WebElement editorBtn1; 
	

	@FindBy(xpath ="//button[text()='Run']")
	WebElement runBtn;
	
	public ArrayPage(WebDriver driver)
	{
		
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}
	
	public void clickOnGetStarted()
	{
		// TODO Auto-generated method stub
		getstarted.click();
	}
	
	public void clickOnArraysInPythonLink()
	{
		// TODO Auto-generated method stub
		arraysInPythonlink.click();
	}
	
	public void clickOnArraysUsingListLink()
	{
		// TODO Auto-generated method stub
		arraysUsingListlink.click();
	}
	
	public void clickOnBasicOperationsInListsLink()
	{
		// TODO Auto-generated method stub
		boplink.click();
	}
	
	public void clickOnApplicationsOfArrayLink()
	{
		// TODO Auto-generated method stub
		appOfArraylink.click();
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
	
	public void clickOnRunBtn()
	{
		// TODO Auto-generated method stub
		runBtn.click();
	}
	
	public void clickOnPracticeQuestionsLink()
	{
		// TODO Auto-generated method stub
		practiceQuestionslink.click();
	}
	public void clickOnSearchTheArrayLink()
	{
		// TODO Auto-generated method stub
		searchTheArraylink.click();
	}
	
	public void clearTextEditor() throws InterruptedException
	{
		// TODO Auto-generated method stub
		
		editorBtn1.sendKeys(Keys.CONTROL,"a");
		editorBtn1.sendKeys(Keys.DELETE);
		//editorBtn1.clear();
		Thread.sleep(1000);
		
	}
	public void practiceQuestionsCode() throws InterruptedException
	{
		// TODO Auto-generated method stub
		editorBtn1.sendKeys("Search Array Practice Question");
		Thread.sleep(2000);
	}

}
