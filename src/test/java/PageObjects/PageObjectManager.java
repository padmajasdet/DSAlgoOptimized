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
 LinkedListPage linkedListPage;
 TryEditorPage tryEditorPage;
 DSIntroductionPage dsIntroductionPage;
 HomePage homePage;
 
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
	public LinkedListPage getLinkedListPage() {
		linkedListPage = new LinkedListPage(driver);
		return linkedListPage;
	}
	public HomePage getHomePage() {
		homePage = new HomePage(driver);
		return homePage;
	}
	public TryEditorPage getTryEditorPage() {
		tryEditorPage = new TryEditorPage(driver);
		return tryEditorPage;
	}
	public DSIntroductionPage getDsIntroductionPage() {
		dsIntroductionPage = new DSIntroductionPage(driver);
		return dsIntroductionPage;
	}
}
