package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import base.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import page.PageObjects;

public class LoginSteps {
	
	PageObjects pageobjects;

    @Given("user in adactin hotel website")
    public void user_in_adactin_hotel_website() {
        BaseClass.initializeBrowser("chrome");
        BaseClass.driver.get("https://adactinhotelapp.com/");
        pageobjects = new PageObjects(BaseClass.driver);
    }

    @When("the user is on the registration page")
    public void the_user_is_on_the_registration_page() {
    	pageobjects.clickRegisterLink();
    }

    @When("the user enters username {string}")
    public void the_user_enters_username(String username) {
    	pageobjects.enterUsername(username);
    }

    @When("enters password {string}")
    public void enters_password(String password) {
    	pageobjects.enterPassword(password);
    }

    @When("enters confirm password {string}")
    public void enters_confirm_password(String confirmPassword) {
    	pageobjects.enterConfirmPassword(confirmPassword);
    }

    @When("enters full name {string}")
    public void enters_full_name(String fullName) {
    	pageobjects.enterFullName(fullName);
    }

    @When("enters email address {string}")
    public void enters_email_address(String email) {
    	pageobjects.enterEmail(email);
        BaseClass.tearDown(); // close browser after registration
    }
}


