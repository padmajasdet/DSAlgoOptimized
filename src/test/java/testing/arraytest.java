package testing;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Properties;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;


public class arraytest {
	public WebDriver driver1;
	public arraytest(WebDriver driver) {
		this.driver1=driver;
	}
	
	
	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriver driver=new ChromeDriver();
		arraytest ast=new arraytest(driver);
		
		FileInputStream fis= new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\resources\\global.properties");
		Properties prop=new Properties();
		prop.load(fis);
		String username1 =prop.getProperty("username");
		String password1 =prop.getProperty("password");
		String url=prop.getProperty("url");
		driver.get(url);
		//home page or background
		By signin  = By.linkText("Sign in");
		By password  = By.name("password");
		By username  = By.name("username");
		By login  = By.xpath("//input[@value='Login']");
		By dataStructures=By.linkText("Data Structures");
	//By dataStructureslist=By.xpath("//div[@class='dropdown-menu show']");
	//By arraylist=By.xpath("//*[@id='content']");
		
		
		
		
		By array=By.linkText("Arrays");
		By arrayinPython=By.linkText("Arrays in Python");
		By tryhere=By.linkText("Try here>>>");
		By applicationstryhere=By.xpath("//a[text()='Try here>>>']");
		By texteditor=By.xpath("//div[contains(@class,'CodeMirror')]//textarea");
		By run=By.xpath("//*[@id='answer_form']/button");
		By console=By.xpath("//div//pre[@id='output']");
		By arraysUsingList= By.linkText("Arrays Using List");
		By basicOperationsinLists=By.linkText("Basic Operations in Lists");
		By applicationsOfArray=By.linkText("Applications of Array");
		
		
		driver.findElement(signin).click();
		driver.findElement(username).sendKeys(username1);
		driver.findElement(password).sendKeys(password1);
		driver.findElement(login).click();
		Assert.assertEquals("NumpyNinja", driver.getTitle());
		
		 
		driver.findElement(dataStructures).click();
		
		System.out.println(driver.getTitle());
		driver.findElement(array).click();
		//Arrays in python
	driver.findElement(arrayinPython).click();
	driver.findElement(tryhere).click();
	driver.findElement(texteditor).sendKeys("print 'hello'");
	Thread.sleep(3000);
	driver.findElement(run).click();
	driver.findElement(console).getText();
		
	driver.navigate().refresh();// to clear text in the editor
	driver.navigate().back();
	//Arrays using list
	driver.findElement(arraysUsingList).click();
	driver.findElement(tryhere).click();
	driver.findElement(texteditor).sendKeys("print 'hello'");
	Thread.sleep(3000);
	driver.findElement(run).click();
	driver.findElement(console).getText();
	driver.navigate().refresh();// to clear text in the editor
	driver.navigate().back();
	
	//Basic operations
	driver.findElement(basicOperationsinLists).click();
	driver.findElement(tryhere).click();
	driver.findElement(texteditor).sendKeys("print 'hello'");
	Thread.sleep(3000);
	driver.findElement(run).click();
	driver.findElement(console).getText();
	driver.navigate().refresh();// to clear text in the editor
	driver.navigate().back();
	
	//applicationsofarray
	
driver.findElement(applicationsOfArray).click();
JavascriptExecutor jse = (JavascriptExecutor) driver;
jse.executeScript("arguments[0].click();",driver.findElement(applicationstryhere) );
Thread.sleep(5000);

driver.findElement(texteditor).sendKeys("print 'hello'");
	Thread.sleep(3000);
driver.findElement(run).click();
	driver.findElement(console).getText();
	Actions action=new Actions(driver);
	action.moveToElement(driver.findElement(texteditor))
	.click()
	.keyDown(Keys.CONTROL)
	.sendKeys("a")
	.keyUp(Keys.CONTROL)
	.sendKeys(Keys.BACK_SPACE)
	.perform();
//driver.navigate().refresh();
//	
	

	
	//driver.navigate().refresh();// to clear text in the editor
	//driver.navigate().back();
	
	//invalid data
	
//		Alert simplealert=driver.switchTo().alert();
//		simplealert.accept();
	driver.navigate().refresh();
	
	driver.navigate().back();
		
		
	}
}
