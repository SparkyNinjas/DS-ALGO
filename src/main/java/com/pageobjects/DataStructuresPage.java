package com.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DataStructuresPage {

public WebDriver driver;
	
	// 1. By Locators: 
@FindBy(xpath="//a[@href='data-structures-introduction']")
WebElement getStartedDS;

@FindBy(xpath="//a[@href='time-complexity']")
WebElement timecomplink;

@FindBy(linkText="Try here>>>")
WebElement tryEditor;
	
	@FindBy(xpath="//form/div/div/div/textarea")
    WebElement textEditor;
   
	@FindBy(xpath="//button[text()='Run']")
    WebElement runButton;
	@FindBy(id="output")
    WebElement output;
	
	 
	public DataStructuresPage(WebDriver driver)
	{
		
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}
	
	public void clickOnGetStartedButton() {
		getStartedDS.click();
				
	}
	public String getPageTitle() {
		String title = driver.getTitle();
		return title;
	}

	public void clickOnTimeComplexitylink(){
		timecomplink.click();
	}
	
	
	public void clickTryHereBtn() {
		tryEditor.click();
	}
	
	
	public void enterCode(String pythonCode) throws InterruptedException {
		textEditor.sendKeys(pythonCode);
	} 
	
	public void clickRunBtn() throws InterruptedException {
		Thread.sleep(1000);
		runButton.click();
	}
	
	public void displayoutput() {
		output.getText();
	}
	
	public void enterCode1() {
		textEditor.sendKeys("wrong python code");
	}
	
	public void displayAlertMsg()
	{
	String alertMessage = driver.switchTo().alert().getText();
	System.out.print(alertMessage);
	}
}
