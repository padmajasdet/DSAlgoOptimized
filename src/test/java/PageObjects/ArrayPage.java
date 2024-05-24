package PageObjects;

import org.openqa.selenium.Alert;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ArrayPage {
	public WebDriver driver;
	JavascriptExecutor jse = (JavascriptExecutor) driver;
	 
	public ArrayPage(WebDriver driver) {
		this.driver=driver;
	}
	//elements
	By dataStructures=By.linkText("Data Structures");
	By array=By.linkText("Arrays");
	By arrayinPython=By.linkText("Arrays in Python");
	By tryhere=By.linkText("Try here>>>");
	By applicationstryhere=By.xpath("//a[text()='Try here>>>']");
	//By texteditor=By.xpath("//div[contains(@class,'CodeMirror')]//textarea");
	By texteditor=By.xpath("//*[@id='answer_form']/div/div/div[1]/textarea");
	By run=By.xpath("//*[@id='answer_form']/button");
	By console=By.xpath("//div//pre[@id='output']");
	By arraysUsingList= By.linkText("Arrays Using List");
	By basicOperationsinLists=By.linkText("Basic Operations in Lists");
	By applicationsOfArray=By.linkText("Applications of Array");
	By parcticequestions=By.linkText("Practice Questions");
	By searchthearray=By.linkText("Search the array");
	By maxConsecutiveOnes=By.linkText("Max Consecutive Ones");
	By evenNumberofDigits=By.linkText("Find Numbers with Even Number of Digits");
	By sortedarray=By.xpath("//*[text()='Squares of  a Sorted Array']");
	By signOut=By.linkText("Sign out");
	
	//actions
	public void logOut() {
		driver.findElement(signOut).click();
	}
	public void parcticequestions() {
		driver.findElement(parcticequestions).click();
				}
	public void searchthearray() {
		driver.findElement(searchthearray).click();
				}
	public void maxConsecutiveOnes() {
		driver.findElement(maxConsecutiveOnes).click();
				}
	public void evenNumberofDigits() {
		driver.findElement(evenNumberofDigits).click();
				}
	public void sortedarray() {
		driver.findElement(sortedarray).click();
				}
	
	
	public void getDataStructures() {
       driver.findElement(dataStructures).click();
       System.out.println(driver.getTitle());
			}
	public void arrayClick() {
	driver.findElement(array).click();
	}
	
	public String getTitleOfPage() {
		System.out.println(driver.getTitle());
		return driver.getTitle(); 
		}
	
	public void testArrayInPython() throws InterruptedException {
		//Thread.sleep(1000);
	driver.findElement(arrayinPython).click();
			}
	public void arraysUsingList() throws InterruptedException {
		//Thread.sleep(2000);
		driver.findElement(arraysUsingList).click();
				}
	public void basicOperationsinLists() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(basicOperationsinLists).click();
				}
	public void applicationsOfArray() throws InterruptedException {
		//Thread.sleep(3000);
		driver.findElement(applicationsOfArray).click();
				}
	
	
	public void trHere() {
		driver.findElement(tryhere).click();
			}
	public void applicationTryHereClick() {
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("arguments[0].click();",driver.findElement(applicationstryhere) );
	}
	public  void sendTextInEditor(String pycode) throws InterruptedException {
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		//jse.executeScript("driver.findElement(texteditor).value=pycode;");
		//WebDriverWait w = new WebDriverWait(driver,30);		
		//w.until(ExpectedConditions.visibilityOfElementLocated(texteditor));
		//jse.executeScript("arguments[0].click();",driver.findElement(texteditor) );
		//jse.executeScript("arguments[0].value=pycode;",driver.findElement(texteditor));
		driver.findElement(texteditor).sendKeys(pycode);
		Thread.sleep(1000);
	}
	public void runButton() {
		driver.findElement(run).click();
	}
	public String consoleText() {

		driver.findElement(console).getText();
		return driver.findElement(console).getText();
	}
	
	public void getAlert() {
		Alert simplealert=driver.switchTo().alert();
    	simplealert.accept();
			}
	public void  navigationToTopics() {
		driver.navigate().refresh();// to clear text in the editor
		driver.navigate().back();
		
	}
	public void cleartext() {
		Actions action=new Actions(driver);
		action.moveToElement(driver.findElement(texteditor))
		.click()
		.keyDown(Keys.CONTROL)
		.sendKeys("a")
		.keyUp(Keys.CONTROL)
		.sendKeys(Keys.BACK_SPACE)
		.perform();
	}
		
	public void textEditor() {
		driver.findElement(texteditor).click();
	}
	

}
