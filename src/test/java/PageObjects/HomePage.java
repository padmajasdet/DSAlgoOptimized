package PageObjects;

import org.openqa.selenium.By;
//import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.FindBy;
//import org.openqa.selenium.support.PageFactory;

public class HomePage {
	public WebDriver driver;

	public HomePage(WebDriver driver) {
		this.driver = driver;
	}

	// page object model

	By alertmessage = By.xpath("//div[@class='alert alert-primary']");
	By siginStaus = By.xpath("//div[@class='bs-example']//div[2]/ul/a[3]");
	By dataStructureIntroduction = By.xpath("//a[@href ='data-structures-introduction']");
	By array = By.xpath("//a[@href ='array']");

	By linkedList = By.xpath("//a[@href='linked-list']");
	By stack = By.xpath("//a[@href ='stack']");
	By queue = By.xpath("//a[@href ='queue']");
	By tree = By.xpath("//a[@href ='tree']");

	By graph = By.xpath("//a[@href ='graph']");

	public void getDataStructureIntroduction() {
		driver.findElement(dataStructureIntroduction).click();

	}

	public void getArray() {
		driver.findElement(array).click();

	}

	public void getLinkedList() {
		driver.findElement(linkedList).click();

	}

	public void getStack() {
		driver.findElement(stack).click();

	}

	public void getQueue() {
		driver.findElement(queue).click();

	}

	public void getTree() {
		driver.findElement(tree).click();

	}

	public void getGraph() {
		driver.findElement(graph).click();

	}

	public String getAlertMessage() {

		return driver.findElement(alertmessage).getText();// password_mismatch:The two password fields didn’t match.
		// New Account Created. You are logged in as asxcvb
	}

	public String signInStatus() {
		// System.out.println("You are here in Homepage: "+ driver.getTitle());
		// System.out.println("sign in status: "+
		// driver.findElement(siginStaus).getText());
		return driver.findElement(siginStaus).getText();// password_mismatch:The two password fields didn’t match.
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