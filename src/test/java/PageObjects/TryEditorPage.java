package PageObjects;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class TryEditorPage {
	public WebDriver driver;
	By texteditor = By.xpath("//*[@id='answer_form']/div/div/div[1]/textarea");
	By run = By.xpath("//*[@id='answer_form']/button");
	By console = By.xpath("//div//pre[@id='output']");

	public TryEditorPage(WebDriver driver) {
		this.driver = driver;
	}
//webelement

	By runBtn = By.xpath("//button[normalize-space()='Run']");

//Actions
	public void getRunBtn() {
		driver.findElement(runBtn).click();
	}

	public void sendTextInEditor(String pycode) throws InterruptedException {
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		// jse.executeScript("driver.findElement(texteditor).value=pycode;");
		// WebDriverWait w = new WebDriverWait(driver,30);
		// w.until(ExpectedConditions.visibilityOfElementLocated(texteditor));
		// jse.executeScript("arguments[0].click();",driver.findElement(texteditor) );
		// jse.executeScript("arguments[0].value=pycode;",driver.findElement(texteditor));
		driver.findElement(texteditor).sendKeys(pycode);
		Thread.sleep(1000);
	}

	public void runButton() {
		driver.findElement(run).click();
	}

	public String consoleText() {

		driver.findElement(console).getText();
		return driver.findElement(console).getText();
	}

	public void navigateBack() {
		driver.navigate().refresh();// to clear text in the editor
		driver.navigate().back();

	}

	public void getAlert() {
		Alert simplealert = driver.switchTo().alert();
		simplealert.accept();
	}

	public void cleartext() {
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(texteditor)).click().keyDown(Keys.CONTROL).sendKeys("a")
				.keyUp(Keys.CONTROL).sendKeys(Keys.BACK_SPACE).perform();
	}

	public void textEditor() {
		driver.findElement(texteditor).click();
	}

	public String getTitle() {
		String pagetitle = driver.getTitle();
		return pagetitle;
	}
}
