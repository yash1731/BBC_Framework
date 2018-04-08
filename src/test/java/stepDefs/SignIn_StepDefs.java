package stepDefs;

import com.BBC_Framework.Pages.BBC_SignIn_Page;
import com.BBC_Framework.Utility.BasePage;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SignIn_StepDefs extends BasePage{
	
	BBC_SignIn_Page signInPage = new BBC_SignIn_Page();
	
	@Given("^BBC comment page is opened in a browser$")
	public void bbc_comment_page_is_opened_in_a_browser() throws Throwable {
		signInPage.clickOnSigninButton();
	}

	@Then("^Accept coopkies of BBC Comment Page$")
	public void accept_coopkies_of_BBC_Comment_Page() throws Throwable {
		signInPage.clearCookies();
	}

	@Then("^Verify the header of the BBC Comment Page$")
	public void verify_the_header_of_the_BBC_Comment_Page() throws Throwable {
		signInPage.verifyHeaderMessage();
	}

	@Then("^Verify the URL of the Current Page$")
	public void verify_the_URL_of_the_Current_Page() throws Throwable {
	    
	}

	@When("^User click on Comments button from the top$")
	public void user_click_on_Comments_button_from_the_top() throws Throwable {
	   
	}

	@Then("^Verify User asked for Signin or register$")
	public void verify_User_asked_for_Signin_or_register() throws Throwable {
	   
	}

	@When("^User click on signin button$")
	public void user_click_on_signin_button() throws Throwable {
	   
	}

	@Then("^BBC SignIn page appears$")
	public void bbc_SignIn_page_appears() throws Throwable {
	   
	}

	@Then("^Verify the header of the signIn Page$")
	public void verify_the_header_of_the_signIn_Page() throws Throwable {
	  
	}

	@Then("^Pass the valid signin credentials$")
	public void pass_the_valid_signin_credentials(DataTable arg1) throws Throwable {
	    
	}

	@Then("^Click on signin button$")
	public void click_on_signin_button() throws Throwable {
	   
	}

	@Then("^Verify the sign out link$")
	public void verify_the_sign_out_link() throws Throwable {
	   
	}



}
