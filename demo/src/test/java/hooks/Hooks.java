package hooks;

import base.BaseClass;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import utils.UtilityClass;

public class Hooks {
	
	   @Before
	    public void setUp() {
	        BaseClass.initializeBrowser("chrome");
	        BaseClass.driver.get("https://example.com/login");
	    }

	    @After
	    public void tearDown(Scenario scenario) {
	        if (scenario.isFailed()) {
	            UtilityClass.takeScreenshot(null, "Failure_" + scenario.getName());
	        }
	        BaseClass.tearDown();
	    }
	}
