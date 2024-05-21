package PageObjects;

import org.openqa.selenium.By;
//import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.FindBy;
//import org.openqa.selenium.support.PageFactory;

public class LinkedListPage {
	public WebDriver driver;

	public LinkedListPage(WebDriver driver) {
		this.driver = driver;
	}

	// page object model

	By alertmessage = By.xpath("//div[@class='alert alert-primary']");
	By introduction = By.linkText("Introduction");
	By creatingLinkedList = By.linkText("Creating Linked LIst");
	By typesOfLinkedLists = By.linkText("Types of Linked List");
	By implementListInPython = By.linkText("Implement Linked List in Python");

	By linkedListTraversal = By.linkText("Traversal");
	By linkedListInsertion = By.linkText("Insertion");
	By linkedListDeletion = By.linkText("Deletion");
	By practiceQtns = By.linkText("Practice Questions");
	By tryHereBtn = By.xpath("//a[contains(@href,'/tryEditor')]");

	public void introduction() {
		driver.findElement(introduction).click();
		System.out.println("intro");
	}

	public void creatingLinkedList() {
		driver.findElement(creatingLinkedList).click();
	}

	public void typesOfLinkedLists() {
		driver.findElement(typesOfLinkedLists).click();
	}

	public void implementListInPython() {
		driver.findElement(implementListInPython).click();
	}

	public void linkedListTraversal() {
		driver.findElement(linkedListTraversal).click();
	}

	public void linkedListInsertion() {
		driver.findElement(linkedListInsertion).click();
	}

	public void linkedListDeletion() {
		driver.findElement(linkedListDeletion).click();
	}

	public void practiceQtns() {
		driver.findElement(practiceQtns).click();
	}

	public void tryHereBtn() {
		driver.findElement(tryHereBtn).click();
	}

	public String getAlertMessage() {
		return driver.findElement(alertmessage).getText();// password_mismatch:The two password fields didn’t match.
		// New Account Created. You are logged in as asxcvb
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