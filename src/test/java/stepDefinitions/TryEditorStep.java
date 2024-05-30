package stepDefinitions;
import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import PageObjects.ArrayPage;
import PageObjects.GetStartedPage;
import PageObjects.TryEditorPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utilities.ExcelReader;
import utilities.TextContextSetup;


public class TryEditorStep {
	public WebDriver driver;
	TextContextSetup textcontextsetup;
	GetStartedPage gsp;
	ArrayPage arraypage;
	ExcelReader reader;
	TryEditorPage tryEditorPage;
	public TryEditorStep(TextContextSetup textcontextsetup) {
		this.textcontextsetup=textcontextsetup;
		this.gsp=textcontextsetup.pageobjectmanager.get_started_page();
		this.arraypage=textcontextsetup.pageobjectmanager.getArrayPage();
		this.tryEditorPage = textcontextsetup.pageobjectmanager.getTryEditorPage();
		this.reader=new ExcelReader();
	}



	@Then("User enters the text in editor from sheetname {string} and rownumber {int}")
	public void user_enters_the_text_in_editor_from_sheetname_and_rownumber(String sheetName, Integer int1) throws InvalidFormatException, IOException, InterruptedException {
		tryEditorPage.cleartext();
		String Excelpath= System.getProperty("user.dir")+"\\src\\test\\resources\\Registration (1).xlsx";
		List<Map<String,String>> testData = reader.getData(Excelpath, sheetName);
				 
	  String pcode = testData.get(int1).get("pCode");
	  String  result= testData.get(int1).get("Result");
		
	  tryEditorPage.sendTextInEditor(pcode);
	  System.out.println("The valid code entered is:"+pcode);
	  
	}
	@When("click the run button")
	public void click_the_run_button() {
		tryEditorPage.runButton(); 
	}
	@Then("The user should be able to see output in the console {string}")
	public void the_user_should_be_able_to_see_output_in_the_console(String string) {
		tryEditorPage.consoleText();
		System.out.println(tryEditorPage.consoleText());
		
	}

	@Then("user clears the text")
	public void user_clears_the_text() {
		tryEditorPage.cleartext();
	}
	@When("The user write code in editor from sheetname {string} and rownumber {int}")
	public void the_user_write_code_in_editor_from_sheetname_and_rownumber(String sheetName, Integer int2) throws InvalidFormatException, IOException, InterruptedException {
		String Excelpath= System.getProperty("user.dir")+"\\src\\test\\resources\\Registration (1).xlsx";
		List<Map<String,String>> testData = reader.getData(Excelpath, sheetName);
		  
	  String pcode = testData.get(int2).get("pCode");
	  String  result= testData.get(int2).get("Result");
		System.out.println("The invalid code entered is :"+pcode);
		//Thread.sleep(3000);
		tryEditorPage.sendTextInEditor(pcode);
	}
	@Then("The user should be able to see error message in alert window,accept the alert")
	public void the_user_should_be_able_to_see_error_message_in_alert_window_accept_the_alert() {
		tryEditorPage.getAlert();
	}

	@Then("navigates to the previous page")
	public void navigates_to_arrays_page() {
		tryEditorPage.navigateBack();
		
	} 


	
}
