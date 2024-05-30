package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class QueuePage {
	public WebDriver driver;
	JavascriptExecutor jse = (JavascriptExecutor) driver;
	 
	public QueuePage(WebDriver driver) {
		this.driver=driver;
	}
    By queue=By.linkText("Queue");	
	By implementationOfQueueInPython=By.linkText("Implementation of Queue in Python");
	By implementationOfCollections=By.linkText("Implementation using collections.deque");
	By implementationusingArray=By.linkText("Implementation using array");
	By queueOperations=By.linkText("Queue Operations");
	By practiceQuestionsQueue=By.linkText("Practice Questions");
	
	//Actions
	public void queueClick() {
		driver.findElement(queue).click();
		
		}
	public void implementationOfQueueInPython() {
		driver.findElement(implementationOfQueueInPython).click();
				}
	public void implementationOfCollections() {
		driver.findElement(implementationOfCollections).click();
						}
	
	public void implementationusingArray() {
		driver.findElement(implementationusingArray).click();
						}
	public void queueOperations() {
		driver.findElement(queueOperations).click();
						}
	
	public void practiceQuestionsQueue() {
		driver.findElement(practiceQuestionsQueue).click();
						}
	
	
	
}
