package stepDefinitions;

import java.io.IOException;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import PageObjects.HomePage;
import PageObjects.PageObjectManager;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utilities.TextContextSetup;

public class HomeStep {
	TextContextSetup textcontextsetup;
	PageObjectManager pageobjectmanager;
	public WebDriver driver;
	HomePage homePage;
	String statusMessage;

	public HomeStep(TextContextSetup textcontextsetup) {
		this.textcontextsetup = textcontextsetup;
		this.homePage = textcontextsetup.pageobjectmanager.getHomePage();
		this.driver = textcontextsetup.pageobjectmanager.driver;
		statusMessage = homePage.signInStatus();
	}

	@Given("User is on the Home landing page after successful login")
	public void user_is_on_the_home_landing_page() throws IOException {
		textcontextsetup.testbase.WebDriverManager();

		if (statusMessage.equalsIgnoreCase("Sign out")) {
			Assert.assertEquals(statusMessage, "Sign out");

		}

	}
	

	@Then("User should land on {string} home page")
	public void user_should_land_on_home_page(String string) {
		System.out.println("background page title = "+ homePage.getTitle());
		user_should_land_on_the_corresponding_home_page(string);
	}
	@When("User clicks {string} Get Started button")
	public void user_clicks_get_started_button(String dataStructure) {
		switch (dataStructure) {
		case "Data Structures-Introduction": {
			homePage.getDataStructureIntroduction();
			break;
		}
		case "Array": {
			homePage.getArray();
			break;
		}
		case "Linked List": {
			homePage.getLinkedList();
			break;
		}
		case "Stack": {
			homePage.getStack();
			break;
		}
		case "Queue": {
			homePage.getQueue();
			break;
		}
		case "Tree": {
			homePage.getTree();
			break;
		}
		case "Graph": {
			homePage.getGraph();
			break;
		}
		}

	}

	@Then("User should land on the corresponding {string} home page")
	public void user_should_land_on_the_corresponding_home_page(String dataStructure) {
		switch (dataStructure) {
		case "Data Structures-Introduction": {
			Assert.assertEquals(driver.getTitle(), "Data Structures-Introduction");
			break;
		}
		case "Array": {
			Assert.assertEquals(driver.getTitle(), "Array");
			break;
		}
		case "Linked List": {
			Assert.assertEquals(driver.getTitle(), "Linked List");
			break;
		}
		case "Stack": {
			Assert.assertEquals(driver.getTitle(), "Stack");
			break;
		}
		case "Queue": {
			Assert.assertEquals(driver.getTitle(), "Queue");
			break;
		}
		case "Tree": {
			Assert.assertEquals(driver.getTitle(), "Tree");
			break;
		}
		case "Graph": {
			Assert.assertEquals(driver.getTitle(), "Graph");
			break;
		}
		}
	}
	/*
	 * @When("User clicks Linked List Get Started button") public void
	 * user_clicks_get_started_button() { homePage.getLinkedList();
	 * 
	 * }
	 * 
	 * @Then("User should land on {string} home page") public void
	 * user_should_land_on_linked_list_home_page(String string) {
	 * 
	 * Assert.assertEquals(driver.getTitle(), "Linked List"); }
	 */

	@Given("User is on the Home landing page without logging in")
	public void user_is_on_the_home_landing_page_without_logging_in() {

		if (statusMessage.equalsIgnoreCase("Sign in")) {

			Assert.assertEquals(statusMessage, "Sign in");

		}

	}

}
