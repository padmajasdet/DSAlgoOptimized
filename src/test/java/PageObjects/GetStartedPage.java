package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GetStartedPage {
public WebDriver driver;
public GetStartedPage(WebDriver driver) {
this.driver=driver;
}
//webelement

By getstarted= By.className("btn");

//Actions
public void get_started_click() {
driver.findElement(getstarted).click();
}
public String get_Title() {
	 String pagetitle=driver.getTitle();
	return pagetitle  ; 
}
}
