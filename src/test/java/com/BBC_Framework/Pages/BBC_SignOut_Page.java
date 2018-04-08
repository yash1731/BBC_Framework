package com.BBC_Framework.Pages;

import org.openqa.selenium.By;

import com.BBC_Framework.Utility.BasePage;

public class BBC_SignOut_Page extends BasePage {

	public void clickSignOutLink() {
		click(driver.findElement(By.cssSelector(".id4-cta-signout")));
		
	}

	public void verifySignOutPage() {
		driver.findElement(By.cssSelector(".heading.u-padding-bottom-quad")).isDisplayed();
		verifyDisplayedMessage(driver.findElement(By.cssSelector(".heading.u-padding-bottom-quad")),"You've signed out, sorry to see you go.");
	}

}
