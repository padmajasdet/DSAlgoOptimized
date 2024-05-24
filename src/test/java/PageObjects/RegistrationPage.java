package PageObjects;

import org.openqa.selenium.By;
//import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.FindBy;
//import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.chrome.ChromeDriver;



public class RegistrationPage {
	public WebDriver driver;
	public RegistrationPage ( WebDriver driver) {
		this.driver=driver;
	}
	
	//page object model
	By Register= By.linkText("Register");
	By username= By.xpath("//*[@id='id_username']");
	By password  = By.name("password1");
	By confirmpassword  = By.name("password2");
	By Registerbutton= By.xpath("//*[@value='Register']");
	By alertmessage=By.xpath("//div[@class='alert alert-primary']");
		
	//Actions
	
	public void register() {
		//jse.executeScript("arguments[0].click();", Register);
		driver.findElement(Register).click();
	}
	public void username(String username1) {
		driver.findElement(username).sendKeys(username1);
	}
	public void password(String password1) {
		driver.findElement(password).sendKeys(password1);
	}
	public void password2(String password2) {
		driver.findElement(confirmpassword).sendKeys(password2);
	}
	public void registerbutton()  {
		driver.findElement(Registerbutton).click();
				}
public String getAlertMessage1() {
	WebElement statusmessage=driver.findElement(alertmessage);
	if(statusmessage.isDisplayed()) {
		System.out.println(statusmessage.getText());
				}
	return statusmessage.getText();//password_mismatch:The two password fields didn’t match.
	                                                  //New Account Created. You are logged in as asxcvb
}
public String errforUser1() {
	WebElement activeElement = driver.switchTo().activeElement();
	String messageStr = activeElement.getAttribute("validationMessage");
	//System.out.println("Actual message appeared on screen: " + messageStr);//please fill out this field
	return messageStr;

}


}