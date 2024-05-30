package utilities;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import PageObjects.PageObjectManager;
//It is the heart of the frame work.
//Variables that we are going to share between stepdefinition files will be stored here and
//driver information is passed from here
//to get driver information from one class to another we use context class
public class TextContextSetup {
//public WebDriver driver;
public PageObjectManager pageobjectmanager;
public TestBase testbase;
public ExcelReader excelreader;
public TextContextSetup() throws IOException {
	testbase=new TestBase();
	pageobjectmanager=new PageObjectManager(testbase.WebDriverManager());
	excelreader=new ExcelReader();
	
}

}
