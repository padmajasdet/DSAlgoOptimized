package stepDefinitions;
import java.io.IOException;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import PageObjects.GetStartedPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utilities.TextContextSetup;


public class TryEditorStep {
	public WebDriver driver;
	TextContextSetup textcontextsetup;
	GetStartedPage gsp;
	public TryEditorStep(TextContextSetup textcontextsetup) {
		this.textcontextsetup=textcontextsetup;
		this.gsp=textcontextsetup.pageobjectmanager.get_started_page();
	}


	@Given("User is on the Editor")
	public void user_is_on_the_editor() {
		
	}
	@When("user enters valid code fome the sheet {string} {int} and cliks the Run button")
	public void user_enters_valid_code_fome_the_sheet_and_cliks_the_run_button(String string, Integer int1) {
		
	}
	@Then("Output is displayed in the console")
	public void output_is_displayed_in_the_console() {
		
	}
	@When("user enters invalid code fome the sheet {string} {int} and cliks the Run button")
	public void user_enters_invalid_code_fome_the_sheet_and_cliks_the_run_button(String string, Integer int1) {
	    
	}
	@Then("Error message is displayed in the console")
	public void error_message_is_displayed_in_the_console() {
	   
	}

	
}
