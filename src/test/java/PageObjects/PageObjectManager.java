package PageObjects;

import org.openqa.selenium.WebDriver;

import utilities.ExcelReader;
import utilities.TestBase;
//Not to create objects in stepdefinition so page object manager is created

public class PageObjectManager {
 public WebDriver driver;
 public SignInPage signinpage;
 TestBase testbase;
 GetStartedPage getstartedpage;
 ExcelReader excelreader;
 RegistrationPage registrationpage;
 ArrayPage arrayPage;
 GraphPage graphPage;
 
	public PageObjectManager(WebDriver driver) {
		this.driver=driver;
	}
	public SignInPage  getSigninpage() {
		signinpage=new SignInPage(driver);
		return signinpage;
	}
	public TestBase gettestbasepage() {
		testbase=new TestBase();
		return testbase;
	}
	public GetStartedPage get_started_page() {
		getstartedpage=new GetStartedPage(driver);
		return getstartedpage ;
	}
	public ExcelReader getexcelreaderpage() {
		excelreader=new ExcelReader();
		return excelreader;
		
			}
	public RegistrationPage getRegistrationPage() {
		registrationpage=new RegistrationPage(driver);
		return registrationpage ;
			}
	public ArrayPage getArrayPage() {
		arrayPage =new ArrayPage(driver);
		return arrayPage;
	}
	public GraphPage getGraphPage() {
		graphPage =new GraphPage(driver);
		return graphPage;
			
	}
	
}
