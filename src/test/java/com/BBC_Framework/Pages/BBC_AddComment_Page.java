package com.BBC_Framework.Pages;

import org.junit.Assert;
import org.openqa.selenium.By;

import com.BBC_Framework.Utility.BasePage;

public class BBC_AddComment_Page extends BasePage{

	public void enterComment() {
		enterDetails(driver.findElement(By.cssSelector(".cmts-post-box")),"I Love BBC Channel");
	}

	public void clickPostComment() {
		click(driver.findElement(By.cssSelector(".cmts-submit.cmts-button")));
	}

	public void verifyAcknowledgementMessage() {
		driver.findElement(By.cssSelector(".cmts-message.cmts-message-success")).isDisplayed();
		verifyDisplayedMessage(driver.findElement(By.cssSelector(".cmts-message.cmts-message-success>p")),"Thanks, your comment has been posted.");
	}

	public void verifyCommentAddedInList() {
		boolean expectedText = driver.findElement(By.cssSelector(".cmt-text")).getText().contains("I Love BBC Channel");
		Assert.assertEquals(expectedText, "I Love BBC Channel");
	}

}
