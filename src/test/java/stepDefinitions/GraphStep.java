package stepDefinitions;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.Properties;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import PageObjects.ArrayPage;
import PageObjects.GraphPage;
import PageObjects.PageObjectManager;
import PageObjects.SignInPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utilities.ExcelReader;
import utilities.TextContextSetup;

public class GraphStep {
	public WebDriver driver;
	TextContextSetup textcontextsetup;
	PageObjectManager pageobjectmanager;
	SignInPage signInPage;
	ArrayPage arraypage;
	ExcelReader reader;
	GraphPage graphPage;
	public GraphStep  (TextContextSetup textcontextsetup) {
		this.textcontextsetup=textcontextsetup;
		this.signInPage=textcontextsetup.pageobjectmanager.getSigninpage();
		//object is created inside constructor and called across all methods
		this.arraypage=textcontextsetup.pageobjectmanager.getArrayPage();
		this.reader=new ExcelReader();
		this.graphPage=textcontextsetup.pageobjectmanager.getGraphPage();
		}
	@Then("user clicks on the Graph")
	public void user_clicks_on_the_graph() throws IOException, InterruptedException {
		Thread.sleep(3000);
		graphPage.graphClick();
		//Graph
	//System.out.println("****"+textcontextsetup.testbase.WebDriverManager().getTitle());
		Assert.assertEquals(textcontextsetup.testbase.WebDriverManager().getTitle(),"Graph");
	}

	@Then("user clicks on tryHere button in graph page")
	public void user_clicks_on_try_here_button_in_graph_page() throws IOException {
		arraypage.trHere();
		//System.out.println("****"+textcontextsetup.testbase.WebDriverManager().getTitle());
		Assert.assertEquals(textcontextsetup.testbase.WebDriverManager().getTitle(),"Assessment");
	}

	@Then("User enters the text in editor in graph page from sheetname {string} and rownumber {int}")
	public void user_enters_the_text_in_editor_in_graph_page_from_sheetname_and_rownumber(String sheetName, Integer int1) throws InvalidFormatException, IOException, InterruptedException {
		arraypage.cleartext();
		String Excelpath= System.getProperty("user.dir")+"\\src\\test\\resources\\Registration (1).xlsx";
		List<Map<String,String>> testData = reader.getData(Excelpath, sheetName);
				 
	  String pcode = testData.get(int1).get("pCode");
	  String  result= testData.get(int1).get("Result");
		
	  arraypage.sendTextInEditor(pcode);
	  System.out.println("The valid code entered is:"+pcode);
	}

	@Then("The user should be able to see output of in the console {string} in graph page")
	public void the_user_should_be_able_to_see_output_of_in_the_console_in_graph_page(String string) {
		arraypage.consoleText();
		System.out.println(arraypage.consoleText());
	}

	@Then("user clears the text in editor of graph page")
	public void user_clears_the_text_in_editor_of_graph_page() {
		arraypage.cleartext();
	}

	@When("The user write code in editor in graph page from sheetname {string} and rownumber {int}")
	public void the_user_write_code_in_editor_in_graph_page_from_sheetname_and_rownumber(String sheetName, Integer int2) throws InvalidFormatException, IOException, InterruptedException {
		arraypage.cleartext();
		String Excelpath= System.getProperty("user.dir")+"\\src\\test\\resources\\Registration (1).xlsx";
		List<Map<String,String>> testData = reader.getData(Excelpath, sheetName);
				 
	  String pcode = testData.get(int2).get("pCode");
	  String  result= testData.get(int2).get("Result");
		
	  arraypage.sendTextInEditor(pcode);
	  System.out.println("The valid code entered is:"+pcode);
	}

	@When("click the run button for graph")
	public void click_the_run_button_for_graph() {
		arraypage.runButton(); 
	    
	}

	@Then("The user should be able to see error message in alert window of graph ,accept the alert")
	public void the_user_should_be_able_to_see_error_message_in_alert_window_of_graph_accept_the_alert() {
		arraypage.getAlert();
	}

	@Then("navigates to  Graph page")
	public void navigates_to_graph_page() {
		 arraypage.navigationToTopics();
	}

	@Then("user navigates to the  page validates the title")
	public void user_navigates_to_the_page_validates_the_title() throws IOException {
		//System.out.println(textcontextsetup.testbase.WebDriverManager().getTitle()+"***");
		Assert.assertEquals(textcontextsetup.testbase.WebDriverManager().getTitle(),"Practice Questions");
	}

	@Then("user  navigates back and logout")
	public void user_navigates_back_and_logout() {
		 arraypage.navigationToTopics();
		 arraypage.logOut();
	}
	@When("user clicks on Graph Representations link")
	public void user_clicks_on_graph_representations_link() throws InterruptedException {
		Thread.sleep(3000);
		graphPage.graphRepresentation(); 
	}

	@When("user clicks on Practice Question link in graph page")
	public void user_clicks_on_practice_question_link_in_graph_page() throws InterruptedException {
		Thread.sleep(3000);
		arraypage.parcticequestions();
	    
	}

	@Given("user is on the Graph page")
	public void user_is_on_the_graph_page() throws IOException {
		//System.out.println("The Title of Page After clicking graph from Dropdown is:"+textcontextsetup.testbase.WebDriverManager().getTitle());
		Assert.assertEquals(textcontextsetup.testbase.WebDriverManager().getTitle(),"Graph");//Practice Questions
	}

	@When("user clicks on Graph link")
	public void user_clicks_on_graph_link() {
		graphPage.graphClick();
	}

	



}