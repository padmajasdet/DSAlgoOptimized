package testing;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import utilities.ExcelReader;

public class Practicequestions {
	public WebDriver driver1;
	public Practicequestions(WebDriver driver) {
		this.driver1=driver;
	}
	
		public static void main(String[] args) throws InterruptedException, IOException, InvalidFormatException {
		WebDriver driver=new ChromeDriver();
		Practicequestions pt=new Practicequestions(driver);
		
		//Elements
		 By parcticequestions=By.linkText("Practice Questions");
		 By searchthearray=By.linkText("Search the array");
		 By texteditor1=By.xpath("//div[contains(@class,'CodeMirror')]//textarea");
		 By run1=By.xpath("//*[@id='answer_form']/button");
		 By console=By.xpath("//div//pre[@id='output']");
		 
driver.get("https://dsportalapp.herokuapp.com/array/arrays-in-python/");
driver.findElement(parcticequestions).click();
driver.findElement(searchthearray).click();


Actions action=new Actions(driver);
action.moveToElement(driver.findElement(texteditor1))
.click()
.keyDown(Keys.CONTROL)
.sendKeys("a")
.keyUp(Keys.CONTROL)
.sendKeys(Keys.BACK_SPACE)
.perform();

ExcelReader reader=new ExcelReader();
String Excelpath= System.getProperty("user.dir")+"\\src\\test\\resources\\Registration (1).xlsx";
List<Map<String,String>> testData = reader.getData(Excelpath, "pythonCode");
		 
String pcode = testData.get(2).get("pCode");
String  result= testData.get(2).get("Result");
driver.findElement(texteditor1).sendKeys(pcode);
System.out.println(pcode);
driver.findElement(run1).click();
Alert simplealert=driver.switchTo().alert();
simplealert.accept();
//driver.navigate().refresh();

driver.navigate().back();






}
}
