
Feature: Test mso smoke scenario

    Scenario: Test login with valid credentials
    Given Open Chrome and start application
    And i enter a valid username and valid password 
    And i click on the login button the should belogged in successfully 
    And i should be on the MSO home Screen 
    When  I click on the User name and the log off link
    Then  I should be logged out of the application  