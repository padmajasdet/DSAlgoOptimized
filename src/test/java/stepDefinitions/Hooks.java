package stepDefinitions;

import java.io.IOException;

import io.cucumber.java.After;
//import utilities.TestBase;
import utilities.TextContextSetup;

public class Hooks {
	TextContextSetup textcontextsetup;
	public Hooks(TextContextSetup textcontextsetup) {
		
		this.textcontextsetup=textcontextsetup;
	}
	@After
	public void Afterscenario() throws IOException {
		//close browser
		textcontextsetup.testbase.WebDriverManager().quit();
	}

}
