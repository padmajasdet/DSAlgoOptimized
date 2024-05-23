package CucumberOptions;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features=".//features/",glue ="stepDefinitions"
,monochrome=true, dryRun=false,
//tags= "@retest",
plugin= {"html:target/cucumber.html", "json:target/cucumber.json",
		//"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
		//"rerun:target/failed_scenarios.txt","io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm"
})
//html,json, xml ,junit,extent reports

public class TestRunner extends AbstractTestNGCucumberTests {
	
	@Override
	@DataProvider(parallel=true)//scenarios run parallel
	public Object[][] scenarios()
	{
		return super.scenarios();//return the methods present in Abstract TestNGCucumberTests
	}
	
}

