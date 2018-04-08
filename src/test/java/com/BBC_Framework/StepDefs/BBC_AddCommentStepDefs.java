package com.BBC_Framework.StepDefs;

import com.BBC_Framework.Pages.BBC_AddComment_Page;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class BBC_AddCommentStepDefs {
	
	BBC_AddComment_Page addComment = new BBC_AddComment_Page();
	
	@When("^User add comment in the box$")
	public void user_add_comment_in_the_box() throws Throwable {
		addComment.enterComment();
	}

	@When("^Click on post comment$")
	public void click_on_post_comment() throws Throwable {
		addComment.clickPostComment();
	}

	@Then("^Thank you acknowledgement message appears$")
	public void thank_you_acknowledgement_message_appears() throws Throwable {
		addComment.verifyAcknowledgementMessage();
	}

	@Then("^Verify the comment added in the list$")
	public void verify_the_comment_added_in_the_list() throws Throwable {
		addComment.verifyCommentAddedInList();
	}



}
