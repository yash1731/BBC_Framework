package com.BBC_Framework.StepDefs;

import java.util.Map;

import com.BBC_Framework.Pages.BBC_SignIn_Page;
import com.BBC_Framework.Utility.BasePage;

import cucumber.api.DataTable;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class BBC_SignIn_PageStepDefs {
	
	BBC_SignIn_Page signInPage = new BBC_SignIn_Page();
	
	
	@When("^User click on signin button$")
	public void user_click_on_signin_button() throws Throwable {
		signInPage.UserClickOnSigninButton();
	}

	@Then("^BBC SignIn page appears$")
	public void bbc_SignIn_page_appears() throws Throwable {
		signInPage.verifyURL();
	}

	@Then("^Verify the header of the signIn Page$")
	public void verify_the_header_of_the_signIn_Page() throws Throwable {
		signInPage.verifyHeaderMessage();
	}

	@Then("^Pass the valid signin credentials$")
	public void pass_the_valid_signin_credentials(DataTable dataTable) throws Throwable {
		Map<String,String> backgroundMap = dataTable.asMaps(String.class, String.class).get(0);
		signInPage.validSigninCredentials(backgroundMap.get("username"),backgroundMap.get("password"));
	   
	}

	@Then("^Click on signin button$")
	public void click_on_signin_button() throws Throwable {
		signInPage.clickOnSigninButton();
	}

	@Then("^Verify the sign out link$")
	public void verify_the_sign_out_link() throws Throwable {
		signInPage.verifySignOutLink();
	}

	

}
