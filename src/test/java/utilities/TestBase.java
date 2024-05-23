package utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

//driver should not be initialized in stepdefinition so testbase class
//is created
public class TestBase {
public WebDriver driver;
public  WebDriver WebDriverManager() throws IOException {
	FileInputStream fis= new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\resources\\global.properties");
	Properties prop=new Properties();
	prop.load(fis);
	String url=prop.getProperty("url");
	
	
	if(driver==null) {
		if(prop.getProperty("browser").equalsIgnoreCase("chrome")) {
			driver=new ChromeDriver();
					}
		else if(prop.getProperty("browser").equalsIgnoreCase("Edge")){
			driver = new EdgeDriver();
		}
		else if(prop.getProperty("browser").equalsIgnoreCase("firefox")){
			driver = new FirefoxDriver();
		}
		else {
			System.out.println("Enter a Valid Browser");
		}
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(url);
		
	}
	return driver;
}
public  WebDriver WebDriverManagerhome() throws IOException {
	FileInputStream fis= new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\resources\\global.properties");
	Properties prop=new Properties();
	prop.load(fis);
		String home=prop.getProperty("urlh");
	
	if(driver==null) {
		if(prop.getProperty("browser").equalsIgnoreCase("chrome")) {
			driver=new ChromeDriver();
					}
		else if(prop.getProperty("browser").equalsIgnoreCase("Edge")){
			driver = new EdgeDriver();
		}
		else if(prop.getProperty("browser").equalsIgnoreCase("firefox")){
			driver = new FirefoxDriver();
		}
		else {
			System.out.println("Enter a Valid Browser");
		}
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get(home);
		
	}
	return driver;
}



}

