package com.pageobjects;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	public WebDriver driver;
	//Using FindBy for locating elements
    @FindBy(linkText="Get Started")
    WebElement getstarted;
   
    @FindBy(linkText=" Register ")
    WebElement register;
    
    @FindBy(linkText="Sign in")
    WebElement signin;
    
    @FindBy(xpath="//a[@class='nav-link dropdown-toggle']")
    WebElement dropdownlink;
    
    @FindBy(xpath="//div[@class='dropdown-menu show']")
    WebElement dropdownarray;
  //*[@id="navbarCollapse"]/div[1]/div/div/a[1]
    
    @FindBy(xpath="//a[text()='Linked List']")
    WebElement dropdownlinkedlist;
    
    @FindBy(xpath="//div[@class='dropdown-menu show']/a[3]")
    WebElement dropdownstack;
    
    @FindBy(xpath="//div[@class='dropdown-menu show']/a[4]")
    WebElement dropdownqueue;
   
    @FindBy(xpath="//div[@class='dropdown-menu show']/a[5]")
    WebElement dropdowntree;
    
    @FindBy(xpath="//div[@class='dropdown-menu show']/a[6]")
    WebElement dropdowngraph;
    
    
    @FindBy(xpath = "//div[contains(text(),'You are not logged in')]")
    WebElement startPageErrorMsg;
    
    @FindBy(xpath = "//a[@href ='data-structures-introduction']")
    WebElement getstart_datastructures;
    
	@FindBy(xpath = "//a[@href ='array']")
	WebElement getstart_array;
	
	@FindBy(xpath = "//a[@href ='linked-list']")
	WebElement getstart_linkedlist;
	
	@FindBy(xpath = "//a[@href ='stack']")
	WebElement getstart_stack;
	
	@FindBy(xpath = "//a[@href ='queue']")
	WebElement getstart_queue;
	
	@FindBy(xpath = "//a[@href ='tree']")
	WebElement getstart_tree;
	
	@FindBy(xpath = "//a[@href ='graph']")
	WebElement getstart_graph;
	
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}
	
	
    public void clickOnGetStarted()
	{
		// TODO Auto-generated method stub
		getstarted.click();
	}

    
    public void dropDownClick() throws InterruptedException
    {
		 
		 dropdownlink.click();
    }
   
    public void dropdown(String value) throws InterruptedException {

    	//dropdownlink.click();
    	//Thread.sleep(1000);
		switch (value) {
		case "Arrays":
			dropdownarray.click();
			break;
		case "Linked List":
			dropdownlinkedlist.click();
			break;
		case "Stack":
			dropdownstack.click();
			break;
		case "Queue":
			dropdownqueue.click();
			break;
		case "Tree":
			dropdowntree.click();
			break;
		case "Graph":
			dropdowngraph.click();
			break;
		}

	}

    public void getStartedhome(String value) {

		switch (value) {
		case "Data Structures-Introduction":
			getstart_datastructures.click();
			break;
		case "Arrays":
			getstart_array.click();
			break;
		case "Linked List":
			getstart_linkedlist.click();
			break;
		case "Stack":
			
			getstart_stack.click();
			break;
		case "Queue":
			
			getstart_queue.click();
			break;
		case "Tree":
			
			getstart_tree.click();
			break;
		case "Graph":
			
			getstart_graph.click();
			break;
		}
	}
    
    public void displayErrorMsg() throws InterruptedException
    {
    	startPageErrorMsg.getText();
    }
   


	public void clickOnSignIn() {
		
		signin.click();
	}
public void clickOnRegister() {
	register.click();
}

	

}



