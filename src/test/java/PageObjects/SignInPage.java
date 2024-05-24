package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;

public class SignInPage {
public WebDriver driver;
 
 
	public SignInPage(WebDriver driver) {
		this.driver=driver;
	}
	
	//*****Elements*****//
	
	By signin  = By.linkText("Sign in");
	By password  = By.name("password");
	By username  = By.name("username");
	By login  = By.xpath("//input[@value='Login']");
	By statusmessage  = By.xpath("//div[@class='alert alert-primary']");
	
	
		
	//*******Actions*****//
	
	public void signin() {
		driver.findElement(signin).click();
			
		}
	public void username(String username1) {
		driver.findElement(username).sendKeys(username1);
					
	}
	public String getusertext() {
		return driver.findElement(username).getText();
	}
	public String errforUser() {
		WebElement activeElement = driver.switchTo().activeElement();
		String messageStr = activeElement.getAttribute("validationMessage");
		System.out.println("Actual message appeared on screen: " + messageStr);
		return messageStr;
		
				}
			
		
	
	public void Login() {
		driver.findElement(login).click();
									
	}
	public void Password(String password1) {
		driver.findElement(password).sendKeys(password1);
			}
	public void errpasswordName() {
		
		if(driver.findElement(password).getText().length()==0){
			System.out.println("Please fill password ");
		}
	}
	
	
public String displayAlert() {
	
return (driver.findElement(statusmessage).getText());
	
		
		
		
		
}




}