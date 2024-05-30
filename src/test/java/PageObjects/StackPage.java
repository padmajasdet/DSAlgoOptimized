package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class StackPage {
	public WebDriver driver;
	
	public StackPage(WebDriver driver) {
		this.driver = driver;
	}
	
	// page object model

		By alertmessage = By.xpath("//div[@class='alert alert-primary']");
		By operationsInStack = By.linkText("Operations in Stack");
		By implementation = By.linkText("Implementation");
		By applications = By.linkText("Applications");
		By practiceQtns = By.linkText("Practice Questions");
		By tryHereBtn = By.xpath("//a[contains(@href,'/tryEditor')]");
		
		public void getOperationsInStack() {
			driver.findElement(operationsInStack).click();
			System.out.println("operationsInStack");
		}
		public void getImplementation() {
			driver.findElement(implementation).click();
		}
		public void getApplications() {
			driver.findElement(applications).click();
		}
		public void getPracticeQtns() {
			driver.findElement(practiceQtns).click();
		}
		public void getTryHereBtn() {
			driver.findElement(tryHereBtn).click();
		}
		
		public String getAlertMessage() {
			return driver.findElement(alertmessage).getText();
		}
		public String errforUser() {
			WebElement activeElement = driver.switchTo().activeElement();
			String messageStr = activeElement.getAttribute("validationMessage");
			System.out.println("Actual message appeared on screen: " + messageStr);
			return messageStr;

		}
		public String getTitle() {
			String pagetitle = driver.getTitle();
			return pagetitle;
		}
		public void  navigationToPreviousPage() {
			driver.navigate().refresh();// to clear text in the editor
			driver.navigate().back();
			
		}

}
