package PageObjects;

import org.openqa.selenium.By;
//import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.FindBy;
//import org.openqa.selenium.support.PageFactory;

public class DSIntroductionPage {
	public WebDriver driver;

	public DSIntroductionPage(WebDriver driver) {
		this.driver = driver;
	}

	// page object model

	By alertmessage = By.xpath("//div[@class='alert alert-primary']");
	By introduction = By.linkText("Introduction");
	By timeComplexity = By.linkText("Time Complexity");
	By practiceQtns = By.linkText("Practice Questions");
	By tryHereBtn = By.xpath("//a[contains(@href,'/tryEditor')]");

	public void timeComplexity() {
		driver.findElement(timeComplexity).click();
		System.out.println("timeComplexity");
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