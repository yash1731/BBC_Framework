package com.BBC_Framework.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.BBC_Framework.Utility.BasePage;

import org.junit.Assert;

public class BBC_Background_Page extends BasePage{
	
	public static void getURL() throws InterruptedException {
		String url = "http://www.bbc.co.uk/blogs/test/entries/f5f3031a-1a29-44ee-b2f8-86e78bfd57b0";
		driver.get(url);
		
		
	}
	
	

	public void acceptCookies() {
		
		click(driver.findElement(By.id("bbccookies-continue-button")));
	}

	
	public void verifyBBCPageHeader() {
		
		verifyDisplayedMessage(driver.findElement(By.cssSelector(".br-masthead__pagetitle")),"About the BBC Blog");
		System.out.println(driver.findElement(By.cssSelector(".br-masthead__pagetitle")).getText());
		
	}

	public void verifyURLofCurrentPage() 
	{
		String expectedURL = driver.getCurrentUrl();
		String url = "http://www.bbc.co.uk/blogs/test/entries/f5f3031a-1a29-44ee-b2f8-86e78bfd57b0";
		Assert.assertEquals(expectedURL, url);
		
	}

	public void clickOnCommentsbutton() throws InterruptedException {	
	   
	    click(driver.findElement(By.linkText("COMMENTS")));
	}

	public void VerifySigninAndRegisterLink() throws InterruptedException {
		
		verifyDisplayedMessage(driver.findElement(By.cssSelector(".cmt-title")),"Comments");
		System.out.println(driver.findElement(By.cssSelector(".cmt-title")).getText());
		
	    boolean Signin = driver.findElement(By.linkText("Sign in")).isEnabled();	
	    System.out.println(Signin);
	
	    boolean Register = driver.findElement(By.cssSelector(".id4-cta-register")).isEnabled();
	    System.out.println(Register);
		
	}

	

	

}
