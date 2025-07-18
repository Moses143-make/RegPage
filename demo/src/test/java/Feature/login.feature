Feature: User Registration

  Scenario: Register a new user with valid details
    Given user in adactin hotel website
    When the user is on the registration page
    When the user enters username "testuser"
    And enters password "Test@123"
    And enters confirm password "Test@123"
    And enters full name "Test User"
    And enters email address "testuser@example.com"
  