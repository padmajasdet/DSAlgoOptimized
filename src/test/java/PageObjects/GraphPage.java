package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GraphPage {
	public WebDriver driver;
	 
	 
	public GraphPage(WebDriver driver) {
		this.driver=driver;
	}
	//Elements
	By graph=By.linkText("Graph");
	
	By graphRepresentation=By.linkText("Graph Representations");
	
	//Actions
	public void graphClick() {
		driver.findElement(graph).click();
		}
	public void graphRepresentation() {
		driver.findElement(graph).click();
		}

}
