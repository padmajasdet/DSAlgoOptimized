package stepDefinitions;

import java.io.IOException;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import PageObjects.PageObjectManager;
import PageObjects.SignInPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utilities.TextContextSetup;

public class SignInStep {
public WebDriver driver;
TextContextSetup textcontextsetup;
PageObjectManager pageobjectmanager ;
SignInPage sip;


	public SignInStep(TextContextSetup textcontextsetup) {
	this.textcontextsetup=textcontextsetup;
	this.sip=textcontextsetup.pageobjectmanager.getSigninpage();//object is created inside constructor and called across all methods
	}
	
	

@Given("The user is on the DS Algo Sign in Page")
public void the_user_is_on_the_ds_algo_sign_in_page() throws IOException {
	textcontextsetup.testbase.WebDriverManager();
}

@When("The user clicks signin text")
public void the_user_clicks_signin_text() {
   sip.signin();
}

@Then("user enters  {string}  and {string}")
public void user_enters_and(String username1, String password1) {
	sip.username( username1);
	sip.Password(password1);
    
}

@Then("user clicks on Login button with expected status as {string}")
public void user_clicks_on_login_button_with_expected_status_as(String status) {
   	sip.Login();
   	 	
   	if (status == "You are logged in")
    {
   		String successMessage = sip.displayAlert();
     Assert.assertEquals(successMessage, "You are logged in");
     System.out.println("Login Passed");
     
         }
   	else if(status=="Invalid Username and Password" ) {
   		String errMessage=   sip.displayAlert();
   		Assert.assertEquals(errMessage, "Invalid Username and Password");
        System.out.println("Enter valid username and password");
        //return;
   		   	}
	else if(status=="Please fill it out" ) {
		String emptyuser=  sip.errforUser();
		Assert.assertEquals(emptyuser, "Please fill it out");
        System.out.println("Please fill  username and password");
        //return;
				
	}	
	else {
		
		 System.out.println("Enter valid details");
		
	}
   	
	
}

}

