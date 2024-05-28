package stepDefinitions;

import java.io.IOException;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import PageObjects.LinkedListPage;
import PageObjects.PageObjectManager;
import PageObjects.RegistrationPage;
import PageObjects.TreePage;
import PageObjects.TryEditorPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utilities.ExcelReader;
import utilities.TextContextSetup;

public class TreeStep {
	TextContextSetup textcontextsetup;
	PageObjectManager pageobjectmanager;
	public WebDriver driver;
	LinkedListPage linkedListPage;
	TreePage treePage;
	TryEditorPage tryEditorPage;
	String pageTitle;

	public TreeStep(TextContextSetup textcontextsetup) {
		this.textcontextsetup = textcontextsetup;
		this.linkedListPage = textcontextsetup.pageobjectmanager.getLinkedListPage();
		this.treePage = textcontextsetup.pageobjectmanager.getTreePage();
		this.tryEditorPage = textcontextsetup.pageobjectmanager.getTryEditorPage();
		this.driver = textcontextsetup.pageobjectmanager.driver;
	}

	@Given("User is on the Tree landing page")
	public void user_is_on_the_linked_list_landing_page() throws IOException {
		textcontextsetup.testbase.WebDriverManager();
	}

	@When("User clicks any of the {string} link of the Tree landing page")
	public void user_clicks_TopicCovered_link(String TopicCovered) {
		// System.out.println("user_clicks_TopicCovered_link");
		switch (TopicCovered) {
		case "Overview of Trees": {
			treePage.overviewOfTrees();
			Assert.assertEquals(driver.getTitle(), "Overview of Trees");
			System.out.println("On Page : " + driver.getTitle());
			break;
		}
		case "Terminologies": {
			treePage.terminologies();
			Assert.assertEquals(driver.getTitle(), "Terminologies");
			System.out.println("On Page : " + driver.getTitle());
			break;
		}
		case "Types of Trees": {
			treePage.typesOfTrees();
			Assert.assertEquals(driver.getTitle(), "Types of Trees");
			System.out.println("On Page : " + driver.getTitle());
			break;
		}
		case "Tree Traversals": {
			treePage.treeTraversals();
			Assert.assertEquals(driver.getTitle(), "Tree Traversals");
			System.out.println("On Page : " + driver.getTitle());
			break;
		}
		case "Traversals-Illustration": {
			treePage.traversalsIllustration();
			Assert.assertEquals(driver.getTitle(), "Traversals-Illustration");
			System.out.println("On Page : " + driver.getTitle());
			break;
		}
		case "Binary Trees": {
			treePage.binaryTrees();
			Assert.assertEquals(driver.getTitle(), "Binary Trees");
			System.out.println("On Page : " + driver.getTitle());
			break;
		}
		case "Types of Binary Trees": {
			treePage.typesOfBinaryTrees();
			Assert.assertEquals(driver.getTitle(), "Types of Binary Trees");
			System.out.println("On Page : " + driver.getTitle());
			break;
		}
		case "Implementation in Python": {
			treePage.implementationInPython();
			Assert.assertEquals(driver.getTitle(), "Implementation in Python");
			System.out.println("On Page : " + driver.getTitle());
			break;
		}
		case "Binary Tree Traversals": {
			treePage.binaryTreeTraversals();
			Assert.assertEquals(driver.getTitle(), "Binary Tree Traversals");
			System.out.println("On Page : " + driver.getTitle());
			break;
		}
		case "Implementation of Binary Trees": {
			treePage.implementationOfBinaryTrees();
			Assert.assertEquals(driver.getTitle(), "Implementation of Binary Trees");
			System.out.println("On Page : " + driver.getTitle());
			break;
		}
		case "Applications of Binary trees": {
			treePage.applicationsOfBinaryTrees();
			Assert.assertEquals(driver.getTitle(), "Applications of Binary trees");
			System.out.println("On Page : " + driver.getTitle());
			break;
		}
		case "Binary Search Trees": {
			treePage.binarySearchTrees();
			Assert.assertEquals(driver.getTitle(), "Binary Search Trees");
			System.out.println("On Page : " + driver.getTitle());
			break;
		}
		case "Implementation Of BST": {
			treePage.implementationOfBST();
			Assert.assertEquals(driver.getTitle(), "Implementation Of BST");
			System.out.println("On Page : " + driver.getTitle());
			break;
		}

		}

		// Assert.assertEquals(driver.getTitle(),"Introduction");
	}

	@Then("User should land on the corresponding {string} page of the Tree landing page")
	public void user_should_land_on_the_corresponding_page(String correspondingTopic) {
		pageTitle = treePage.getTitle();
		switch (correspondingTopic) {
		case "Overview of Trees": {
			Assert.assertEquals("Overview of Trees", pageTitle);
			System.out.println("currently we are in " + treePage.getTitle());
			break;
		}
		case "Terminologies": {
			Assert.assertEquals("Terminologies", pageTitle);
			System.out.println("currently we are in " + treePage.getTitle());
			break;
		}
		case "Types of Trees": {
			Assert.assertEquals("Types of Trees", pageTitle);
			System.out.println("currently we are in " + treePage.getTitle());
			break;
		}
		case "Tree Traversals": {
			Assert.assertEquals("Tree Traversals", pageTitle);
			System.out.println("currently we are in " + treePage.getTitle());
			break;
		}
		case "Traversals-Illustration": {
			Assert.assertEquals("Traversals-Illustration", pageTitle);
			System.out.println("currently we are in " + treePage.getTitle());
			break;
		}
		case "Binary Trees": {
			Assert.assertEquals("Binary Trees", pageTitle);
			System.out.println("currently we are in " + treePage.getTitle());
			break;
		}
		case "Types of Binary Trees": {
			Assert.assertEquals("Types of Binary Trees", pageTitle);
			System.out.println("currently we are in " + treePage.getTitle());
			break;
		}
		case "Implementation in Python": {
			Assert.assertEquals("Implementation in Python", pageTitle);
			System.out.println("currently we are in " + treePage.getTitle());
			break;
		}
		case "Binary Tree Traversals": {
			Assert.assertEquals("Binary Tree Traversals", pageTitle);
			System.out.println("currently we are in " + treePage.getTitle());
			break;
		}
		case "Implementation of Binary Trees": {
			Assert.assertEquals("Implementation of Binary Trees", pageTitle);
			System.out.println("currently we are in " + treePage.getTitle());
			break;
		}
		case "Applications of Binary trees": {
			Assert.assertEquals("Applications of Binary trees", pageTitle);
			System.out.println("currently we are in " + treePage.getTitle());
			break;
		}
		case "Binary Search Trees": {
			Assert.assertEquals("Binary Search Trees", pageTitle);
			System.out.println("currently we are in " + treePage.getTitle());
			break;
		}
		case "Implementation Of BST": {
			Assert.assertEquals("Implementation Of BST", pageTitle);
			System.out.println("currently we are in " + treePage.getTitle());
			break;
		}

		}

	}

	@When("User should click on the Practice Here link of the Tree landing page")
	public void user_should_click_on_the_practice_here_link() {
		treePage.practiceQtns();

	}

	@Then("User should land on Practice button of the Tree landing page")
	public void user_should_land_on_practice_button() {
		pageTitle = treePage.getTitle();
		Assert.assertEquals(pageTitle, "Practice Questions");
	}

	@Then("Navigate back to the corresponding topic page of the Tree landing page")
	public void navigate_back_to_the_corresponding_topic_page() {
		driver.navigate().back();
	}

	@Then("User clicks Try here button of the Tree landing page")
	public void user_clicks_try_here_button() {

		treePage.tryHereBtn();
	}
	@Then("Try Editor Is displayed on the {string} page of the Tree landing page")
	public void launch_try_editor_page(String pageTitle) {

		Assert.assertEquals(tryEditorPage.getTitle(), pageTitle);
		

	}
	

}
