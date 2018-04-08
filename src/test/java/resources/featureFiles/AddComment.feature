@all
@postComment
Feature:  Post Comment in BBC
Description: As a User 
             I want to sign in or register in BBC 
             so that I can post comment in BBC news article
             
            
Background: Verify BBC comment page is opened in a browser

   Given BBC comment page is opened in a browser
   Then  Accept coopkies of BBC Comment Page
   Then  Verify the header of the BBC Comment Page
   And   Verify the URL of the Current Page
   When  User click on Comments button from the top
   Then  Verify User asked for Signin or register
   When  User click on signin button
   Then  BBC SignIn page appears
   And   Verify the header of the signIn Page
   And   Pass the valid signin credentials
       |  username         |       password       |
       |  yashpal17        |     physio17         |
   And   Click on signin button
   Then  Verify the URL of the Current Page
   And   Verify the sign out link
   
   @ADDComment
   Scenario: User should add comment after signin
   When User add comment in the box
   And  Click on post comment
   Then Thank you acknowledgement message appears
   And  Verify the comment added in the list
   
   @SignOut_FromBBCPage_AfterComment
   Scenario: User should Signout after Commenting in BBC
   When User add comment in the box
   And  Click on post comment
   Then Thank you acknowledgement message appears
   When User click on SignOut link
   Then Verify the signout page appears
   