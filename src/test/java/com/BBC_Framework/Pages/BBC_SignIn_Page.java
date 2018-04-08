package com.BBC_Framework.Pages;

import org.junit.Assert;
import org.openqa.selenium.By;

import com.BBC_Framework.Utility.BasePage;

public class BBC_SignIn_Page extends BasePage{

	public void UserClickOnSigninButton() {
		click(driver.findElement(By.linkText("Sign in")));
		
	}

	public void verifyURL() {
		String ActualURL = "https://account.bbc.com/signin#comments";
		String expectedURL = driver.getCurrentUrl();
		Assert.assertEquals(ActualURL, expectedURL);
		
	}

	public void verifyHeaderMessage() {
		verifyDisplayedMessage(driver.findElement(By.cssSelector(".heading.u-padding-bottom-quad.u-padding-top-hex--tablet>span")), "Sign in");
			
	}

	public void validSigninCredentials(String username, String password) {
		enterDetails(driver.findElement(By.name("username")),username);
		enterDetails(driver.findElement(By.name("password")),password);
	}

	public void clickOnSigninButton() {
		click(driver.findElement(By.id("submit-button")));
		
	}

	public void verifySignOutLink() {
		verifyDisplayedMessage(driver.findElement(By.cssSelector(".id4-cta-signout")), "Sign out");
		
	}

}
