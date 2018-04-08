package com.BBC_Framework.StepDefs;

import com.BBC_Framework.Pages.BBC_SignOut_Page;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class BBC_SignOutStepDefs {
	
	BBC_SignOut_Page signOut = new BBC_SignOut_Page();
	
	@When("^User click on SignOut link$")
	public void user_click_on_SignOut_link() throws Throwable {
		signOut.clickSignOutLink();
	}

	@Then("^Verify the signout page appears$")
	public void verify_the_signout_page_appears() throws Throwable {
		signOut.verifySignOutPage();
	}

}
