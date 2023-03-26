package com.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LinkedListPage {

	public WebDriver driver;
	// Using FindBy for locating elements
	@FindBy(xpath="//a[@href='linked-list']")
	WebElement getstarted;

	@FindBy(xpath="//a[@href='introduction']")
	WebElement introductionlink;

	@FindBy(linkText="Creating Linked LIst")
	WebElement creatinglinkedlistlink;

	@FindBy(xpath="//a[@href='types-of-linked-list']")
	WebElement typesoflinkedlistlink;

	@FindBy(xpath="//a[@href='implement-linked-list-in-python']")
	WebElement implementlinkedlistlink;

	@FindBy(xpath="//a[@href='traversal']")
	WebElement traversallink;
	
	@FindBy(xpath="//a[@href='insertion-in-linked-list']")
	WebElement insertionlink;

	@FindBy(xpath="//a[@href='deletion-in-linked-list']")
	WebElement deletionlink;

	@FindBy(xpath="//a[@href='Sign out']")
	WebElement signoutBtn;

	@FindBy(xpath ="//a[text()='Try here>>>']")
	WebElement tryhereBtn;


	@FindBy(xpath = "//*[@class=' CodeMirror-line ']")
	WebElement editorBtn; 

	@FindBy(xpath ="//button[text()='Run']")
	WebElement runBtn;
	
	public LinkedListPage(WebDriver driver)
	{
		
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}

	//Methods to click on LinkedList

		public void clickOnGetStarted()
		{
			// TODO Auto-generated method stub
			getstarted.click();
		}
		
		public void clickOnIntroduction()
		{
			// TODO Auto-generated method stub
			introductionlink.click();
		}
		
		public void clickOncreatinglinkedlistlink()
		{
			// TODO Auto-generated method stub
			creatinglinkedlistlink.click();
		}

		public void clickOntypesoflinkedlistlink()
		{
			// TODO Auto-generated method stub
			typesoflinkedlistlink.click();
		}
			
		public void clickOnimplementlinkedlistlink()
		{
			// TODO Auto-generated method stub
			implementlinkedlistlink.click();
		}
		
		public void clickOntraversallink()
		{
			// TODO Auto-generated method stub
			traversallink.click();
		}
		
		public void clickOninsertionlink()
		{
			// TODO Auto-generated method stub
			insertionlink.click();
		}
		public void clickOndeletionlink()
		{
			// TODO Auto-generated method stub
			deletionlink.click();
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

