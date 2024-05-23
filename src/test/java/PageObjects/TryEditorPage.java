package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TryEditorPage {
	public WebDriver driver;
	public TryEditorPage(WebDriver driver) {
	this.driver=driver;
	}
//webelement

	By runBtn = By.xpath("//button[normalize-space()='Run']");

//Actions
	public void getRunBtn() {
	driver.findElement(runBtn).click();
	}
	public String getTitle() {
	String pagetitle=driver.getTitle();
	return pagetitle  ; 
	}
}
