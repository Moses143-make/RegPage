package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageObjects {

	 WebDriver driver;

	    public  PageObjects(WebDriver driver) {
	        this.driver = driver;
	        PageFactory.initElements(driver, this);
	    }

	    @FindBy(xpath = "//a[normalize-space()='New User Register Here']")
	    private WebElement linkRegisterHere;

	    @FindBy(xpath = "//input[@id='username']")
	    private WebElement txtUsername;

	    @FindBy(xpath = "//input[@name='password']")
	    private WebElement txtPassword;

	    @FindBy(xpath = "//input[@name='re_password']")
	    private WebElement txtConfirmPassword;

	    @FindBy(xpath = "//input[@name='full_name']")
	    private WebElement txtFullName;

	    @FindBy(xpath = "//input[@id='email_add']")
	    private WebElement txtEmail;

	    
	    public void clickRegisterLink() {
	        linkRegisterHere.click();
	    }

	    public void enterUsername(String username) {
	        txtUsername.sendKeys(username);
	    }

	    public void enterPassword(String password) {
	        txtPassword.sendKeys(password);
	    }

	    public void enterConfirmPassword(String confirmPassword) {
	        txtConfirmPassword.sendKeys(confirmPassword);
	    }

	    public void enterFullName(String fullName) {
	        txtFullName.sendKeys(fullName);
	    }

	    public void enterEmail(String email) {
	        txtEmail.sendKeys(email);
	    }
	}
	
	
	
	
	