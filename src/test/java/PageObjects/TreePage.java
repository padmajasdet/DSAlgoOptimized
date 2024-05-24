package PageObjects;

import org.openqa.selenium.By;
//import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.FindBy;
//import org.openqa.selenium.support.PageFactory;

public class TreePage {
	public WebDriver driver;

	public TreePage(WebDriver driver) {
		this.driver = driver;
	}

	// page object model

	By alertmessage = By.xpath("//div[@class='alert alert-primary']");
	By overviewOfTrees = By.linkText("Overview of Trees");
	By terminologies = By.linkText("Terminologies");
	By typesOfTrees = By.linkText("Types of Trees");
	By treeTraversals = By.linkText("Tree Traversals");
	
	By traversalsIllustration = By.linkText("Traversals-Illustration");
	By binaryTrees = By.linkText("Binary Trees");
	By typesOfBinaryTrees = By.linkText("Types of Binary Trees");
	By implementationInPython = By.linkText("Implementation in Python");
	By binaryTreeTraversals = By.linkText("Binary Tree Traversals");
	
	By implementationOfBinaryTrees = By.linkText("Implementation of Binary Trees");
	By applicationsOfBinaryTrees = By.linkText("Applications of Binary trees");
	By binarySearchTrees = By.linkText("Binary Search Trees");
	By implementationOfBST = By.linkText("Implementation Of BST");
	
	By practiceQtns = By.linkText("Practice Questions");
	By tryHereBtn = By.xpath("//a[contains(@href,'/tryEditor')]");

	public void overviewOfTrees() {
		driver.findElement(overviewOfTrees).click();
		System.out.println("intro");
	}

	public void terminologies() {
		driver.findElement(terminologies).click();
	}

	public void typesOfTrees() {
		driver.findElement(typesOfTrees).click();
	}

	public void treeTraversals() {
		driver.findElement(treeTraversals).click();
	}

	public void traversalsIllustration() {
		driver.findElement(traversalsIllustration).click();
	}

	public void binaryTrees() {
		driver.findElement(binaryTrees).click();
	}

	public void typesOfBinaryTrees() {
		driver.findElement(typesOfBinaryTrees).click();
	}
	public void implementationInPython() {
		driver.findElement(implementationInPython).click();
	}
	public void binaryTreeTraversals() {
		driver.findElement(binaryTreeTraversals).click();
	}
	public void implementationOfBinaryTrees() {
		driver.findElement(implementationOfBinaryTrees).click();
	}
	public void applicationsOfBinaryTrees() {
		driver.findElement(applicationsOfBinaryTrees).click();
	}
	public void binarySearchTrees() {
		driver.findElement(binarySearchTrees).click();
	}
	public void implementationOfBST() {
		driver.findElement(implementationOfBST).click();
	}

	public void practiceQtns() {
		driver.findElement(practiceQtns).click();
	}

	public void tryHereBtn() {
		driver.findElement(tryHereBtn).click();
	}

	public String getAlertMessage() {
		return driver.findElement(alertmessage).getText();
	}

	public String errforUser() {
		WebElement activeElement = driver.switchTo().activeElement();
		String messageStr = activeElement.getAttribute("validationMessage");
		System.out.println("Actual message appeared on screen: " + messageStr);// please fill out this field
		return messageStr;

	}

	public String getTitle() {
		String pagetitle = driver.getTitle();
		return pagetitle;
	}
}