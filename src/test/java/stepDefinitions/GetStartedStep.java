package stepDefinitions;
import java.io.IOException;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import PageObjects.GetStartedPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utilities.TextContextSetup;


public class GetStartedStep {
	public WebDriver driver;
	TextContextSetup textcontextsetup;
	GetStartedPage gsp;
	public GetStartedStep(TextContextSetup textcontextsetup) {
		this.textcontextsetup=textcontextsetup;
		this.gsp=textcontextsetup.pageobjectmanager.get_started_page();
	}
	@Given("The user should open the DS Algo Portal URL in any supported browser")
	public void the_user_should_open_the_ds_algo_portal_url_in_any_supported_browser() throws IOException {
		textcontextsetup.testbase.WebDriverManagerhome();
	    }

	@When("The user clicks the {string} button")
	public void the_user_clicks_the_button(String string) {
		gsp.get_started_click();
	   
	}
	@Then("The user should land in Data Structure Introduction Page with Title {string}")
	public void the_user_should_land_in_data_structure_introduction_page_with_title(String string) {
		gsp.get_Title();
	     Assert.assertEquals(gsp.get_Title(),string);
	    System.out.println("currently we are in "+gsp.get_Title())	;
	}

	
	
}
