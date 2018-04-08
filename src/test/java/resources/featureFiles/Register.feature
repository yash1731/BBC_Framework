@all
@Register
Feature: Register into BBC web page
  Description: As a User 
             I want to  register in bbc 
             so that I can do actions in BBC

  Background: Verify BBC comment page is opened in a browser
    Given BBC comment page is opened in a browser
    Then Accept coopkies of BBC Comment Page
    Then Verify the header of the BBC Comment Page
    And Verify the URL of the Current Page
    When User click on Comments button from the top
    Then Verify User asked for Signin or register
     When  User Click on Register Link 
    Then Registeration page is opened in a browser
    
    @Under13
    Scenario: Verify user should able to reister in BBC with under 13 age
    And  User select the Under 13 age
    Then Verify the header message of registeration page for Under 13
    
    
    @Above13
    Scenario: Verify user should able to reister in BBC with above 13 age
    And  User select the above 13 age
    Then Verify the header message of registeration page for above 13
