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
import PageObjects.PageObjectManager;
import PageObjects.SignInPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utilities.ExcelReader;
import utilities.TextContextSetup;

public class Array1Step {
	public WebDriver driver;
	TextContextSetup textcontextsetup;
	PageObjectManager pageobjectmanager;
	SignInPage signInPage;
	ArrayPage arraypage;
	ExcelReader reader;
	public Array1Step (TextContextSetup textcontextsetup) {
		this.textcontextsetup=textcontextsetup;
		this.signInPage=textcontextsetup.pageobjectmanager.getSigninpage();
		//object is created inside constructor and called across all methods
		this.arraypage=textcontextsetup.pageobjectmanager.getArrayPage();
		this.reader=new ExcelReader();
		}
	@Given("User has already Logged in  using username and password form global properties file")
	public void user_has_already_logged_in_using_username_and_password_form_global_properties_file() throws IOException {
		FileInputStream fis= new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\resources\\global.properties");
		Properties prop=new Properties();
		prop.load(fis);
		String username1 =prop.getProperty("username");
		String password1 =prop.getProperty("password");
		textcontextsetup.testbase.WebDriverManager();
		signInPage.signin();
		signInPage.username(username1);
		signInPage.Password(password1);
		signInPage.Login();
		Assert.assertEquals(textcontextsetup.testbase.WebDriverManager().getTitle(),"NumpyNinja");
		System.out.println(textcontextsetup.testbase.WebDriverManager().getTitle());
			}
	
	@When("User clicks on Data Structures dropdown arrow")
	public void user_clicks_on_data_structures_dropdown_arrow() {
		arraypage.getDataStructures();
			}
		
	@Then("user clicks on the arrays")
	public void user_clicks_on_the_arrays()  {
		arraypage.arrayClick();
		
	}

	@Given("user is on the {string} page")
	public void user_is_on_the_page(String array)throws IOException {
		System.out.println("The Title of Page After clicking Array from Dropdown is:"+textcontextsetup.testbase.WebDriverManager().getTitle());
		Assert.assertEquals(textcontextsetup.testbase.WebDriverManager().getTitle(),"Array");
	}

	@When("user clicks on {string} link")
	public void user_clicks_on_link(String ArraysinPython) throws IOException, InterruptedException {
		arraypage.testArrayInPython();
		Assert.assertEquals(textcontextsetup.testbase.WebDriverManager().getTitle(),"Arrays in Python");
	}

	@Then("user navigates to the Arrays in Python page and clicks on tryHere button")
	public void user_navigates_to_the_arrays_in_python_page_and_clicks_on_try_here_button() {
		System.out.println(arraypage.getTitleOfPage());
		arraypage.trHere();
	}

/*	@Then("User enters the text in editor from sheetname {string} and rownumber {int}")
	public void user_enters_the_text_in_editor_from_sheetname_and_rownumber(String sheetName, Integer int1) throws InvalidFormatException, IOException, InterruptedException {
		arraypage.cleartext();
		String Excelpath= System.getProperty("user.dir")+"\\src\\test\\resources\\Registration (1).xlsx";
		List<Map<String,String>> testData = reader.getData(Excelpath, sheetName);
				 
	  String pcode = testData.get(int1).get("pCode");
	  String  result= testData.get(int1).get("Result");
		
	  arraypage.sendTextInEditor(pcode);
	  System.out.println("The valid code entered is:"+pcode);
	  
	}
	@When("click the run button")
	public void click_the_run_button() {
		arraypage.runButton(); 
	}
	@Then("The user should be able to see output in the console {string}")
	public void the_user_should_be_able_to_see_output_in_the_console(String string) {
		arraypage.consoleText();
		System.out.println(arraypage.consoleText());
		
	}

	@Then("user clears the text")
	public void user_clears_the_text() {
			arraypage.cleartext();
	}
	@When("The user write code in editor from sheetname {string} and rownumber {int}")
	public void the_user_write_code_in_editor_from_sheetname_and_rownumber(String sheetName, Integer int2) throws InvalidFormatException, IOException, InterruptedException {
		String Excelpath= System.getProperty("user.dir")+"\\src\\test\\resources\\Registration (1).xlsx";
		List<Map<String,String>> testData = reader.getData(Excelpath, sheetName);
		  
	  String pcode = testData.get(int2).get("pCode");
	  String  result= testData.get(int2).get("Result");
		System.out.println("The invalid code entered is :"+pcode);
		//Thread.sleep(3000);
	  arraypage.sendTextInEditor(pcode);
	}
	@Then("The user should be able to see error message in alert window,accept the alert")
	public void the_user_should_be_able_to_see_error_message_in_alert_window_accept_the_alert() {
		arraypage.getAlert();
	} */

	@Then("navigates to  Arrays page")
	public void navigates_to_arrays_page() {
		arraypage.navigationToTopics();
		
	}

	@When("user clicks on {string} link1")
	public void user_clicks_on_link1(String  ArraysUsingList) throws IOException, InterruptedException {
		arraypage.arraysUsingList();
		Assert.assertEquals(textcontextsetup.testbase.WebDriverManager().getTitle(),"Arrays Using List");
		System.out.println("The Title of Page After clicking Arrays Using Listis:"+textcontextsetup.testbase.WebDriverManager().getTitle());
	}
	@When("user clicks on {string} link2")
	public void user_clicks_on_link2(String  BasicOperationsinLists) throws IOException, InterruptedException {
		//Thread.sleep(3000);
		arraypage.basicOperationsinLists();
		Assert.assertEquals(textcontextsetup.testbase.WebDriverManager().getTitle(),"Basic Operations in Lists");
		System.out.println("The Title of Page After clicking Basic Operations in Lists is:"+textcontextsetup.testbase.WebDriverManager().getTitle());
	}
	@When("user clicks on {string} link3")
	public void user_clicks_on_link3(String  applicationsOfArray) throws IOException, InterruptedException {
		//Thread.sleep(3000);
		arraypage.applicationsOfArray();
		Assert.assertEquals(textcontextsetup.testbase.WebDriverManager().getTitle(),"Applications of Array");
		System.out.println("The Title of Page After clicking Applications of Array is:"+textcontextsetup.testbase.WebDriverManager().getTitle());
	}
	@Then("user clicks on {string} link4")
	public void user_clicks_on_link4(String string) {
		arraypage.parcticequestions();
	}

	@Then("user navigates to the practice page and clicks on {string}")
	public void user_navigates_to_the_practice_page_and_clicks_on(String topic) {
	    	    	arraypage.searchthearray();
//	    		    }
//	    else if(topic=="Max Consecutive Ones") {
//	    	
//	    }
//	
//	    else if(topic=="Find Numbers with Even Number of Digits") {
//	    	arraypage.evenNumberofDigits();
//	    }
//	    else {
//	    	arraypage.sortedarray();
	    }
@Then("user navigates to the practice page and clicks on {string} link2")
public void user_navigates_to_the_practice_page_and_clicks_on_link2(String maxconsecutive){
	    	    		arraypage.maxConsecutiveOnes();
   	}
@Then("user navigates to the practice page and clicks on {string} link3")
public void user_navigates_to_the_practice_page_and_clicks_on_link3(String numberseven){
	arraypage.evenNumberofDigits();
   	}
@Then("user navigates to the practice page and clicks on {string} link4")
public void user_navigates_to_the_practice_page_and_clicks_on_link4(String sortedarrays){
	arraypage.sortedarray();
   	}

	@When("user clears the text  and enters the data from sheetname {string} and rownumber {int}")
	public void user_clears_the_text_and_enters_the_data_from_sheetname_and_rownumber(String sheetName, Integer int3) throws InterruptedException, InvalidFormatException, IOException {
		arraypage.cleartext();
	    String Excelpath= System.getProperty("user.dir")+"\\src\\test\\resources\\Registration (1).xlsx";
		List<Map<String,String>> testData = reader.getData(Excelpath, sheetName);
		  
	  String pcode = testData.get(int3).get("pCode");
	  String  result= testData.get(int3).get("Result");
	  arraypage.sendTextInEditor(pcode);
	  System.out.println(pcode);
	    
	}	

	@Then("The user should be able to see the alert and accept")
	public void the_user_should_be_able_to_see_the_alert_and_accept() {
		arraypage.getAlert();
	}

	@Then("user navigates back")
	public void user_navigates_back() {
	    arraypage.navigationToTopics();
	}

	@Then("log out from site")
	public void log_out_from_site() {
		arraypage.logOut();
		System.out.println("logged out");
	}

	
	
}
