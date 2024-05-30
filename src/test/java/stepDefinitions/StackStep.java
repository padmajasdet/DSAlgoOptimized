package stepDefinitions;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import PageObjects.StackPage;
import PageObjects.TryEditorPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utilities.ExcelReader;
import utilities.TextContextSetup;

public class StackStep {
	public WebDriver driver;
	TextContextSetup textcontextsetup;
	StackPage stackPage;
	TryEditorPage tryEditorPage;
	String pageTitle;
	ExcelReader reader;
	
	public StackStep(TextContextSetup textcontextsetup) {
		this.textcontextsetup = textcontextsetup;
		this.stackPage = textcontextsetup.pageobjectmanager.getStackPage();
		this.tryEditorPage = textcontextsetup.pageobjectmanager.getTryEditorPage();
		this.driver = textcontextsetup.pageobjectmanager.driver;
		this.reader=new ExcelReader();
	}
	
	@Given("User has already Logged in using username and password")
	public void user_has_already_logged_in_using_username_and_password() throws IOException {
		textcontextsetup.testbase.WebDriverManager();
	}
	@Given("User is on the Stack landing page")
	public void user_is_on_the_stack_landing_page() throws IOException {
		textcontextsetup.testbase.WebDriverManager();
	}
	@When("User clicks any of the {string} link of the Stack landing page")
	public void user_clicks_any_of_the_link_of_the_stack_landing_page(String TopicCovered) {
		System.out.println("user_clicks_TopicCovered_link_Stack");
		switch (TopicCovered) {
		case "Operations in Stack": {
			stackPage.getOperationsInStack();
			Assert.assertEquals(driver.getTitle(), "Operations in Stack");
			System.out.println("On Page : " + driver.getTitle());
			break;
		}case "Implementation": {
			stackPage.getImplementation();
			Assert.assertEquals(driver.getTitle(), "Implementation");
			System.out.println("On Page : " + driver.getTitle());
			break;
		}
		case "Applications": {
			stackPage.getApplications();
			Assert.assertEquals(driver.getTitle(), "Applications");
			System.out.println("On Page : " + driver.getTitle());
			break;
		}
	}
}
	@Then("User should land on the corresponding {string} page of the Stack landing page")
	public void user_should_land_on_the_corresponding_page_of_the_stack_landing_page(String correspondingTopic) {
		pageTitle = stackPage.getTitle();
		switch (correspondingTopic) {
		case "Operations in Stack": {
			Assert.assertEquals("Operations in Stack", pageTitle);
			System.out.println("currently we are in " + stackPage.getTitle());
			break;
		}
		case "Implementation": {
			Assert.assertEquals("Implementation", pageTitle);
			System.out.println("currently we are in " + stackPage.getTitle());
			break;
		}
		case "Applications": {
			Assert.assertEquals("Applications", pageTitle);
			System.out.println("currently we are in " + stackPage.getTitle());
			break;
		}

	}

}
	@When("User should click on the Practice Questions link of the Stack Data Structure Page")
	public void user_should_click_on_the_practice_questions_link_of_the_stack_data_structure_page() {
		stackPage.getPracticeQtns();
	}
	@Then("User should land on Practice button of the Stack Data Structure Page")
	public void user_should_land_on_practice_button_of_the_stack_data_structure_page() {
		pageTitle = stackPage.getTitle();
		Assert.assertEquals(pageTitle, "Practice Questions");
	}
	@Then("Navigate back to the corresponding topic page of the Stack Data Structure Page")
	public void navigate_back_to_the_corresponding_topic_page_of_the_stack_data_structure_page() {
		//Thread.sleep(2000);
		driver.navigate().back();
	}
	@Then("User clicks Try here button of the Stack Data Structure Page")
	public void user_clicks_try_here_button_of_the_stack_data_structure_page() {
		stackPage.getTryHereBtn();
	}
	@Then("Try Editor Is displayed on the {string} page of the Stack Data Structure Page")
	public void try_editor_is_displayed_on_the_page_of_the_stack_data_structure_page(String pageTitle) {
		Assert.assertEquals(tryEditorPage.getTitle(), pageTitle);
		
	}
	@Then("User enters the text from sheetname {string} and rownumber {int}")
	public void user_enters_the_text_from_sheetname_and_rownumber(String sheetName, Integer int1) throws InvalidFormatException, IOException, InterruptedException {
		tryEditorPage.cleartext();
		String Excelpath= System.getProperty("user.dir")+"\\src\\test\\resources\\Registration (1).xlsx";
		List<Map<String,String>> testData = reader.getData(Excelpath, sheetName);
				 
	  String pcode = testData.get(int1).get("pCode");
	  String  result= testData.get(int1).get("Result");
		
	  tryEditorPage.sendTextInEditor(pcode);
	  System.out.println("The valid code entered is:"+pcode);
	  
	}
	@When("Click run button")
	public void click_run_button() {
		tryEditorPage.runButton();
	}
	
	@Then("The user can see output in the console {string}")
	public void the_user_should_be_able_to_see_output_in_the_console(String string){
		tryEditorPage.consoleText();
		//Thread.sleep(2000);
		System.out.println(tryEditorPage.consoleText());
		
	}
	@Then("User clears the text field")
	public void user_clears_the_text_field(){
		tryEditorPage.cleartext();
	}
	@When("The user write code in editor page from sheetname {string} and rownumber {int}")
	public void the_user_write_code_in_editor_page_from_sheetname_and_rownumber(String sheetName, Integer int2) throws InvalidFormatException, IOException, InterruptedException {
		String Excelpath= System.getProperty("user.dir")+"\\src\\test\\resources\\Registration (1).xlsx";
		List<Map<String,String>> testData = reader.getData(Excelpath, sheetName);
		  
	  String pcode = testData.get(int2).get("pCode");
	  String  result= testData.get(int2).get("Result");
		System.out.println("The invalid code entered is :"+pcode);
		tryEditorPage.sendTextInEditor(pcode);
	}
	@Then("The user should be able to see error message in alert window")
	public void the_user_should_be_able_to_see_error_message_in_alert_window(){
		//Thread.sleep(3000);
	    tryEditorPage.getAlert();
	}
	@Then("Navigates to the previous page")
	public void navigates_to_the_previous_page() {
		stackPage.navigationToPreviousPage();
	}
	

}
