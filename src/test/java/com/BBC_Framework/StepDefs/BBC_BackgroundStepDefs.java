package com.BBC_Framework.StepDefs;

import com.BBC_Framework.Pages.BBC_Background_Page;
import com.BBC_Framework.Utility.BasePage;
import com.BBC_Framework.Utility.BrowserFactory;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;



public class BBC_BackgroundStepDefs {
	
	BBC_Background_Page  commentPage = new BBC_Background_Page();
	BasePage basePage = new BasePage();
   
	@Given("^BBC comment page is opened in a browser$")
	public void bbc_comment_page_is_opened_in_a_browser() throws Throwable {
		commentPage.getURL();
		
	}
	
	@Then("^Accept coopkies of BBC Comment Page$")
	public void accept_coopkies_of_BBC_Comment_Page() throws Throwable {
	    commentPage.acceptCookies();
	}

	@Then("^Verify the header of the BBC Comment Page$")
	public void verify_the_header_of_the_BBC_Comment_Page() throws Throwable {
		commentPage.verifyBBCPageHeader();
	}

	@Then("^Verify the URL of the Current Page$")
	public void verify_the_URL_of_the_Current_Page() throws Throwable {
		commentPage.verifyURLofCurrentPage();
	}
	
	@When("^User click on Comments button from the top$")
	public void user_click_on_Comments_button_from_the_top() throws Throwable {
		commentPage.clickOnCommentsbutton();
	}

	@Then("^Verify User asked for Signin or register$")
	public void verify_User_asked_for_Signin_or_register() throws Throwable {
	    commentPage.VerifySigninAndRegisterLink();
	}

}
