package com.pageobjects;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class TreePage
{
	public WebDriver driver;
	// Using FindBy for locating elements
	@FindBy(xpath="//a[@href='tree']")
	WebElement getstarted;

	@FindBy(linkText="Overview of Trees")
	WebElement overviewOfTreeslink;

	@FindBy(linkText="Terminologies")
	WebElement terminologieslink;
	
	@FindBy(linkText="Types of Trees")
	WebElement typesOfTreeslink;

	@FindBy(xpath="//a[@href='tree-traversals']")
	WebElement treeTraversalslink;
	
	@FindBy(linkText="Traversals-Illustration")
	WebElement traversalsIllustrationlink;

	@FindBy(linkText="Binary Trees")
	WebElement binaryTreeslink;
	
	@FindBy(linkText="Types of Binary Trees")
	WebElement typesOfBinaryTreeslink;

	@FindBy(xpath="//a[@href='implementation-in-python']")
	WebElement implementationInPythonlink;
	
	@FindBy(linkText="Binary Tree Traversals")
	WebElement binaryTreeTraversalslink;

	@FindBy(linkText="Implementation of Binary Trees")
	WebElement impementationOfBinaryTreeslink;
	
	@FindBy(linkText="Applications of Binary trees")
	WebElement applicationsOfBinaryTreeslink;

	@FindBy(xpath="//a[@href='binary-search-trees']")
	WebElement binarySearchTreeslink;
	
	@FindBy(xpath="//a[@href='implementation-of-bst']")
	WebElement implementationOfBSTlink;
	
	public TreePage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}

	public void clickOnGetStarted()
	{
		// TODO Auto-generated method stub
		getstarted.click();
	}
	
	public void clickOnOverviewOfTreesLink()
	{
		// TODO Auto-generated method stub
		overviewOfTreeslink.click();
	}
	
	public void clickOnTerminologiesLink()
	{
		// TODO Auto-generated method stub
		terminologieslink.click();
	}
	public void clickOnTypesOfTreesLink()
	{
		// TODO Auto-generated method stub
		typesOfTreeslink.click();
	}
	
	public void clickOnTreeTraversalsLink()
	{
		// TODO Auto-generated method stub
		treeTraversalslink.click();
	}
	public void clickOnTraversalsIllustrationLink()
	{
		// TODO Auto-generated method stub
		traversalsIllustrationlink.click();
	}
	
	public void clickOnBinaryTreesLink()
	{
		// TODO Auto-generated method stub
		binaryTreeslink.click();
	}
	public void clickOnTypesOfBinaryTreesLink()
	{
		// TODO Auto-generated method stub
		typesOfBinaryTreeslink.click();
	}
	
	public void clickOnImplementationInPythonLink()
	{
		// TODO Auto-generated method stub
		implementationInPythonlink.click();
	}
	public void clickOnBinaryTreeTraversalsLink()
	{
		// TODO Auto-generated method stub
		binaryTreeTraversalslink.click();
	}
	
	public void clickOnImpementationOfBinaryTreesLink()
	{
		// TODO Auto-generated method stub
		impementationOfBinaryTreeslink.click();
	}
	public void clickOnApplicationsOfBinaryTreesLink()
	{
		// TODO Auto-generated method stub
		applicationsOfBinaryTreeslink.click();
	}
	
	public void clickOnBinarySearchTreesLink()
	{
		// TODO Auto-generated method stub
		binarySearchTreeslink.click();
	}
	public void clickOnImplementationOfBSTLink()
	{
		// TODO Auto-generated method stub
		implementationOfBSTlink.click();
	}




}
