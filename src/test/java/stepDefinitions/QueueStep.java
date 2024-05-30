package stepDefinitions;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import PageObjects.ArrayPage;
import PageObjects.PageObjectManager;
import PageObjects.QueuePage;
import PageObjects.SignInPage;
import utilities.ExcelReader;
import utilities.TextContextSetup;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utilities.ExcelReader;
import utilities.TextContextSetup;

public class QueueStep {
	public WebDriver driver;
	TextContextSetup textcontextsetup;
	PageObjectManager pageobjectmanager;
	SignInPage signInPage;
	ArrayPage arraypage;
	ExcelReader reader;
	QueuePage queuePage;
	public QueueStep (TextContextSetup textcontextsetup) {
		this.textcontextsetup=textcontextsetup;
		this.signInPage=textcontextsetup.pageobjectmanager.getSigninpage();
		//object is created inside constructor and called across all methods
		this.arraypage=textcontextsetup.pageobjectmanager.getArrayPage();
		this.reader=new ExcelReader();
		this.queuePage=textcontextsetup.pageobjectmanager.getQueuePage();
		}
	
	
	
	@Then("user clicks on the Queue")
	public void user_clicks_on_the_queue() throws InterruptedException {
		Thread.sleep(3000);
		queuePage.queueClick();
	}
	@Given("user is on the Queue page")
	public void user_is_on_the_queue_page() throws IOException {
		
		Assert.assertEquals(textcontextsetup.testbase.WebDriverManager().getTitle(),"Queue");
	}
	@When("user clicks on Queue Operations link")
	public void user_clicks_on_queue_operations_link() throws InterruptedException {
		Thread.sleep(3000);
		queuePage.queueOperations();
	}
	@Then("user clicks on tryHere button in queue page")
	public void user_clicks_on_try_here_button_in_queue_page() throws IOException {
		arraypage.trHere();
		//System.out.println("****"+textcontextsetup.testbase.WebDriverManager().getTitle());
		Assert.assertEquals(textcontextsetup.testbase.WebDriverManager().getTitle(),"Assessment");
	}
	@Then("User enters the text in editor in queue page from sheetname {string} and rownumber {int}")
	public void user_enters_the_text_in_editor_in_queue_page_from_sheetname_and_rownumber(String sheetName, Integer int1) throws InvalidFormatException, IOException, InterruptedException {
		arraypage.cleartext();
		String Excelpath= System.getProperty("user.dir")+"\\src\\test\\resources\\Registration (1).xlsx";
		List<Map<String,String>> testData = reader.getData(Excelpath, sheetName);
				 
	  String pcode = testData.get(int1).get("pCode");
	  String  result= testData.get(int1).get("Result");
		
	  arraypage.sendTextInEditor(pcode);
	  System.out.println("The valid code entered is:"+pcode);
	}
	@Then("The user should be able to see output of in the console {string} in assessment page")
	public void the_user_should_be_able_to_see_output_of_in_the_console_in_assessment_page(String string) {
		arraypage.consoleText();
		System.out.println(arraypage.consoleText());
	}
	@Then("user clears the text in editor of queue page")
	public void user_clears_the_text_in_editor_of_queue_page() {
		arraypage.cleartext();
	}
	@When("The user write code in editor in queue page from sheetname {string} and rownumber {int}")
	public void the_user_write_code_in_editor_in_queue_page_from_sheetname_and_rownumber(String sheetName, Integer int2) throws InterruptedException, InvalidFormatException, IOException {
		arraypage.cleartext();
		String Excelpath= System.getProperty("user.dir")+"\\src\\test\\resources\\Registration (1).xlsx";
		List<Map<String,String>> testData = reader.getData(Excelpath, sheetName);
				 
	  String pcode = testData.get(int2).get("pCode");
	  String  result= testData.get(int2).get("Result");
		
	  arraypage.sendTextInEditor(pcode);
	  System.out.println("The invalid code entered is:"+pcode);
	}
	@When("click the run button for queue")
	public void click_the_run_button_for_queue() {
		arraypage.runButton(); 
	}
	@Then("The user should be able to see error message in alert window of queue ,accept the alert")
	public void the_user_should_be_able_to_see_error_message_in_alert_window_of_queue_accept_the_alert() {
		arraypage.getAlert();
	}
	@Then("navigates to  queue page")
	public void navigates_to_queue_page() {
		 arraypage.navigationToTopics();
}
	@When("user clicks on Implementation of Queue  link")
	public void user_clicks_on_implementation_of_queue_link() {
		queuePage.implementationOfQueueInPython();
	}
	@When("user clicks on Practice Question link in queue page")
	public void user_clicks_on_practice_question_link_in_queue_page() {
		queuePage.practiceQuestionsQueue();
	}
	@When("user clicks on Implementation using collections.deque link")
	public void user_clicks_on_implementation_using_collections_deque_link() {
		queuePage.implementationOfCollections();
	}
	@When("user clicks on Implementation using array link")
	public void user_clicks_on_implementation_using_array_link() {
		queuePage.implementationusingArray();
	}
}
