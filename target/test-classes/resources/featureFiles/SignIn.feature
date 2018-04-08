@all
@SignIn
Feature: Signin into BBC web page
  Description: As a User 
             I want to sign in or register in bbc 
             so that I can do actions in BBC

  Background: Verify BBC comment page is opened in a browser
    Given BBC comment page is opened in a browser
    Then Accept coopkies of BBC Comment Page
    Then Verify the header of the BBC Comment Page
    And Verify the URL of the Current Page
    When User click on Comments button from the top
    Then Verify User asked for Signin or register

  Scenario: User must SignIn Before Commenting in BBC
    When User click on signin button
    Then BBC SignIn page appears
    And Verify the header of the signIn Page
    And Pass the valid signin credentials
      | username                  | password |
      | yash.dewangan82@gmail.com | Dadu0107 |
    And Click on signin button
    Then Verify the URL of the Current Page
    And Verify the sign out link
