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
 QueuePage queuePage;
 //LinkedListPage linkedListPage;
 //TryEditorPage tryEditorPage;
 //DSIntroductionPage dsIntroductionPage;
 //HomePage homePage;
 //TreePage treePage;
 //StackPage stackPage;
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
	public QueuePage getQueuePage() {
		queuePage =new QueuePage(driver);
		return queuePage;
			
	}
//	public LinkedListPage getLinkedListPage() {
//		linkedListPage = new LinkedListPage(driver);
//		return linkedListPage;
//	}
//	public HomePage getHomePage() {
//		homePage = new HomePage(driver);
//		return homePage;
//	}
//	public TryEditorPage getTryEditorPage() {
//		tryEditorPage = new TryEditorPage(driver);
//		return tryEditorPage;
//	}
//	public DSIntroductionPage getDsIntroductionPage() {
//		dsIntroductionPage = new DSIntroductionPage(driver);
//		return dsIntroductionPage;
//	}
//	
//	public TreePage getTreePage() {
//		treePage =new TreePage(driver);
//		return treePage;
//			
	}
//	public StackPage getStackPage() {
//		stackPage = new StackPage(driver);
//		return stackPage;
//	}

