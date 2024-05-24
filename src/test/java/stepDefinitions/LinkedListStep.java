package stepDefinitions;

import java.io.IOException;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import PageObjects.LinkedListPage;
import PageObjects.PageObjectManager;
import PageObjects.RegistrationPage;
import PageObjects.TryEditorPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utilities.ExcelReader;
import utilities.TextContextSetup;

public class LinkedListStep {
	TextContextSetup textcontextsetup;
	PageObjectManager pageobjectmanager;
	public WebDriver driver;
	LinkedListPage linkedListPage;
	TryEditorPage tryEditorPage;
	String pageTitle;

	public LinkedListStep(TextContextSetup textcontextsetup) {
		this.textcontextsetup = textcontextsetup;
		this.linkedListPage = textcontextsetup.pageobjectmanager.getLinkedListPage();
		this.tryEditorPage = textcontextsetup.pageobjectmanager.getTryEditorPage();
		this.driver = textcontextsetup.pageobjectmanager.driver;
	}

	@Given("User is on the Linked List landing page")
	public void user_is_on_the_linked_list_landing_page() throws IOException {
		textcontextsetup.testbase.WebDriverManager();
	}

	@When("User clicks any of the {string} link of the Linked List landing page")
	public void user_clicks_TopicCovered_link(String TopicCovered) {
		// System.out.println("user_clicks_TopicCovered_link");
		switch (TopicCovered) {
		case "Introduction": {
			linkedListPage.introduction();
			Assert.assertEquals(driver.getTitle(), "Introduction");
			System.out.println("On Page : " + driver.getTitle());
			break;
		}
		case "Creating Linked LIst": {
			linkedListPage.creatingLinkedList();
			Assert.assertEquals(driver.getTitle(), "Creating Linked LIst");
			System.out.println("On Page : " + driver.getTitle());
			break;
		}
		case "Types of Linked List": {
			linkedListPage.typesOfLinkedLists();
			Assert.assertEquals(driver.getTitle(), "Types of Linked List");
			System.out.println("On Page : " + driver.getTitle());
			break;
		}
		case "Implement Linked List in Python": {
			linkedListPage.implementListInPython();
			Assert.assertEquals(driver.getTitle(), "Implement Linked List in Python");
			System.out.println("On Page : " + driver.getTitle());
			break;
		}
		case "Traversal": {
			linkedListPage.linkedListTraversal();
			Assert.assertEquals(driver.getTitle(), "Traversal");
			System.out.println("On Page : " + driver.getTitle());
			break;
		}
		case "Insertion": {
			linkedListPage.linkedListInsertion();
			Assert.assertEquals(driver.getTitle(), "Insertion");
			System.out.println("On Page : " + driver.getTitle());
			break;
		}
		case "Deletion": {
			linkedListPage.linkedListDeletion();
			Assert.assertEquals(driver.getTitle(), "Deletion");
			System.out.println("On Page : " + driver.getTitle());
			break;
		}

		}

		// Assert.assertEquals(driver.getTitle(),"Introduction");
	}

	@Then("User should land on the corresponding {string} page of the Linked List landing page")
	public void user_should_land_on_the_corresponding_page(String correspondingTopic) {
		pageTitle = linkedListPage.getTitle();
		switch (correspondingTopic) {
		case "Introduction": {
			Assert.assertEquals("Introduction", pageTitle);
			System.out.println("currently we are in " + linkedListPage.getTitle());
			break;
		}
		case "Creating Linked LIst": {
			Assert.assertEquals("Creating Linked LIst", pageTitle);
			System.out.println("currently we are in " + linkedListPage.getTitle());
			break;
		}
		case "Types of Linked List": {
			Assert.assertEquals("Types of Linked List", pageTitle);
			System.out.println("currently we are in " + linkedListPage.getTitle());
			break;
		}
		case "Implement Linked List in Python": {
			Assert.assertEquals("Implement Linked List in Python", pageTitle);
			System.out.println("currently we are in " + linkedListPage.getTitle());
			break;
		}
		case "Traversal": {
			Assert.assertEquals("Traversal", pageTitle);
			System.out.println("currently we are in " + linkedListPage.getTitle());
			break;
		}
		case "Insertion": {
			Assert.assertEquals("Insertion", pageTitle);
			System.out.println("currently we are in " + linkedListPage.getTitle());
			break;
		}
		case "Deletion": {
			Assert.assertEquals("Deletion", pageTitle);
			System.out.println("currently we are in " + linkedListPage.getTitle());
			break;
		}

		}

	}

	@When("User should click on the Practice Here link of the Linked List landing page")
	public void user_should_click_on_the_practice_here_link() {
		linkedListPage.practiceQtns();

	}

	@Then("User should land on Practice button of the Linked List landing page")
	public void user_should_land_on_practice_button() {
		pageTitle = linkedListPage.getTitle();
		Assert.assertEquals(pageTitle, "Practice Questions");
	}

	@Then("Navigate back to the corresponding topic page of the Linked List landing page")
	public void navigate_back_to_the_corresponding_topic_page() {
		//Thread.sleep(2000);
		driver.navigate().back();
	}

	@Then("User clicks Try here button of the Linked List landing page")
	public void user_clicks_try_here_button() {

		linkedListPage.tryHereBtn();
	}
	@Then("Try Editor Is displayed on the {string} page of the Linked List landing page")
	public void launch_try_editor_page(String pageTitle) {

		Assert.assertEquals(tryEditorPage.getTitle(), pageTitle);
		

	}
	

}
