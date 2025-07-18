package testRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = {"src/test/java/Feature/login.feature"},
		dryRun = false,
		glue={"steps","hooks"},
		plugin={"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
		monochrome= true
		)

public class Runner extends AbstractTestNGCucumberTests {

}
