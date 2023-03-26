package com.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	public WebDriver driver;
	
	// 1. By Locators: 
	@FindBy(id="id_username")
    WebElement uname;
	
	@FindBy(id="id_password")
    WebElement pwd;
	
	@FindBy(xpath="//input[@value='Login']")
    WebElement loginButton;
	
	@FindBy(xpath="//a[@href='/register']")
    WebElement registerLink;
	
	@FindBy(xpath="//a[text()='Sign out']")
    WebElement logoutButton;

	@FindBy(xpath="//div[contains(text(),'You are logged in')]")
    WebElement loginMsg;
	
	@FindBy(xpath="//div[contains(text(),'Invalid Username and Password')]")
    WebElement invalidMsg;
	
 
	// 2. Constructor of the page class:
		public LoginPage(WebDriver driver) {
			PageFactory.initElements(driver, this);
			this.driver = driver;
		}
		
		// 3. page actions: features(behavior) of the page the form of methods:


		public void clickOnRegisterLink() {
			 registerLink.click();
		}

		public void enterUserName(String username) {
			uname.sendKeys(username);
		}

		public void enterPassword(String password) {
			pwd.sendKeys(password);
		}
		

		public void clickOnLogin() {
			loginButton.click();
		}
		
		public void clickOnLogout() {
			logoutButton.click();
		}
		public String successLoginMsg() {
			return loginMsg.getText();
		}
		
		public boolean logoutLinkExist() {
			return logoutButton.isDisplayed();
		}

		public String emptyfieldsMsg(String validationMessge) {
			String errormsg =  uname.getAttribute("validationMessage");
			System.out.println("message");
			return errormsg;
		}
		
		public String invalidCredentialsMsg() {
			return invalidMsg.getText();
}
		public String validateUsernamefield(String validationMessge) {
			String message = uname.getAttribute("validationMessage");
			System.out.println("message");
			return message;

		}

		public String validatePasswordfield(String validationMessge) {
			String message = pwd.getAttribute("validationMessage");
			System.out.println("message");
			return message;

		}

		public void dologin(String username, String password) {
			uname.sendKeys(username);
			pwd.sendKeys(password);
			loginButton.click();
			
		}
}
