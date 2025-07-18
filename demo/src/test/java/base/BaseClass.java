package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	 public static WebDriver driver;

	    public static void initializeBrowser(String browserName) {
	        if (browserName.equalsIgnoreCase("chrome")) {
	            WebDriverManager.chromedriver().setup();
	            driver = new ChromeDriver();

	        } else if (browserName.equalsIgnoreCase("firefox")) {
	            WebDriverManager.firefoxdriver().setup();
	            driver = new FirefoxDriver();

	        } else {
	            throw new IllegalArgumentException("Unsupported browser: " + browserName);
	        }

	        driver.manage().window().maximize();
	    }

	    public static void tearDown() {
	        if (driver != null) {
	            driver.quit();
	            driver = null;
	        }
	    }
	}
