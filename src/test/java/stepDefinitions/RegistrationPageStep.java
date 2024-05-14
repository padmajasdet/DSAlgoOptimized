package stepDefinitions;

//import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
//import net.bytebuddy.agent.builder.AgentBuilder.CircularityLock.Global;
import utilities.ExcelReader;
//import utilities.TestBase;
import utilities.TextContextSetup;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import PageObjects.PageObjectManager;
import PageObjects.RegistrationPage;


public class RegistrationPageStep<user_enters_sheetname_and_rownumber> {
	TextContextSetup textcontextsetup;
	PageObjectManager pageobjectmanager ;
	public WebDriver driver;
	RegistrationPage rp;
	ExcelReader reader;
	//String Message;
	public RegistrationPageStep(TextContextSetup textcontextsetup){
		this.textcontextsetup=textcontextsetup;
		this.rp=textcontextsetup.pageobjectmanager.getRegistrationPage();
			this.reader=new ExcelReader();
	}

@Given("user is in Registration page")
public void user_is_in_Registration_page() throws IOException {
	textcontextsetup.testbase.WebDriverManager();
}


@When("user enters sheetname  {string}   and rownumber  {int}")
public void user_enters_sheetname_and_rownumber(String sheetName, Integer rowNumber) throws InvalidFormatException, IOException {
   // ExcelReader reader=new ExcelReader();
	
	String Excelpath= System.getProperty("user.dir")+"\\src\\test\\resources\\Registration (1).xlsx";
	List<Map<String,String>> testData = reader.getData(Excelpath, sheetName);
	  
  String Username = testData.get(rowNumber).get("username");
  String Password = testData.get(rowNumber).get("password");
  String Confirmpassword = testData.get(rowNumber).get("confirmpassword");
   String Message = testData.get(rowNumber).get("message");
	
  rp.register();
  rp.username(Username);
  rp.password(Password);
  rp.password2(Confirmpassword);
  System.out.println("user entered with  ***"+Username+"***"+Password+"***"+Confirmpassword );
    
}

	
@Then("user checks  the staus message")
public void user_checks_the_staus_message() throws IOException {
	
	rp.registerbutton(); 
//	if (Message == "New Account Created. You are logged in as asdfgh")
//    {
//   		String successMessage = rp.getAlertMessage();
//     Assert.assertEquals(successMessage, "New Account Created. You are logged in as asdfgh");
//     System.out.println(successMessage);
//     
//         }
//   	else if(Message=="password_mismatch:The two password fields didn’t match." ) {
//   		String errMessage=   rp.getAlertMessage();
//   		Assert.assertEquals(errMessage, "password_mismatch:The two password fields didn’t match.");
//        System.out.println(errMessage);
//        //return;
//   		   	}
//	else if(Message=="Please fill out this field" ) {
//		String emptyuser=  rp.errforUser();
//		Assert.assertEquals(emptyuser, "Please fill out this field");
//        System.out.println(emptyuser);
//        //return;
//				
//	}	
//	else {
//		
//		 System.out.println("Enter valid details");
//		
//	}
//   	
//	
//}
	String Title=textcontextsetup.testbase.WebDriverManager().getTitle();
	if(Title=="NumpyNinja") {
       	Assert.assertTrue(false);
    	//assertTrue(): This Assertion verifies the Boolean value returned by the condition. If the Boolean value is true, then the assertion passes the test case.
    	
    }
    else {
    	Assert.assertEquals("Registration",textcontextsetup.testbase.WebDriverManager().getTitle());
	        System.out.println("currently we are in "+textcontextsetup.testbase.WebDriverManager().getTitle())	;
}
}
}
