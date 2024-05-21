package stepDefinitions;

import java.io.IOException;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import PageObjects.DSIntroductionPage;
import PageObjects.LinkedListPage;
import PageObjects.PageObjectManager;
import PageObjects.RegistrationPage;
import PageObjects.TryEditorPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utilities.ExcelReader;
import utilities.TextContextSetup;

public class DSIntroductionStep {
	TextContextSetup textcontextsetup;
	PageObjectManager pageobjectmanager;
	public WebDriver driver;
	DSIntroductionPage dsIntroductionPage;
	TryEditorPage tryEditorPage;
	String pageTitle;

	public DSIntroductionStep(TextContextSetup textcontextsetup) {
		this.textcontextsetup = textcontextsetup;
		this.dsIntroductionPage = textcontextsetup.pageobjectmanager.getDsIntroductionPage();
		this.tryEditorPage = textcontextsetup.pageobjectmanager.getTryEditorPage();
		this.driver = textcontextsetup.pageobjectmanager.driver;
	}

	

	@Given("User is on the Data Structure Introduction page")
	public void user_is_on_the_data_structure_introduction_page() throws IOException {
		textcontextsetup.testbase.WebDriverManager();
	}

	@When("User clicks {string} link")
	public void user_clicks_link(String string) {
		dsIntroductionPage.timeComplexity();
		Assert.assertEquals(driver.getTitle(), "Time Complexity");
	}

	@Then("User should land on the {string} page")
	public void user_should_land_on_the_page(String string) {
		pageTitle = dsIntroductionPage.getTitle();
		Assert.assertEquals("Time Complexity", pageTitle);
		System.out.println("In Time Complexity Page: title = +"+pageTitle);
	}

}
