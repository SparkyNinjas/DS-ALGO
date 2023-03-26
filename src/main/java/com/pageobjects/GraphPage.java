package com.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GraphPage 
{

	public WebDriver driver;
	// Using FindBy for locating elements
	@FindBy(xpath="//a[@href='graph']")
	WebElement getstarted;

	@FindBy(xpath="//a[@class='list-group-item']")
	WebElement graphlink;

	@FindBy(xpath="//a[@href='graph-representations']")
	WebElement graphrepresentationslink;


	@FindBy(xpath="//a[@href='Sign out']")
	WebElement signoutBtn;
	

	
	
	public GraphPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}

	public void clickOnGetStarted()
	{
		// TODO Auto-generated method stub
		getstarted.click();
	}
	
	public void clickOnGraphLink()
	{
		// TODO Auto-generated method stub
		graphlink.click();
	}
	
	public void clickOnGraphRepresentationsLink()
	{
		// TODO Auto-generated method stub
		graphrepresentationslink.click();
	}
	
	public void clickOnSignOutBtn()
	{
		// TODO Auto-generated method stub
		signoutBtn.click();
	}
}
