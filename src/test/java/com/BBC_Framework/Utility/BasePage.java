package com.BBC_Framework.Utility;

//import static org.junit.Assert.assertEquals;



import static org.junit.Assert.assertEquals;

import java.util.Set;
import java.util.UUID;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage extends BrowserFactory {
	
//public static WebDriver driver;
	
	

    // click method
	public static void click(WebElement element){
		element.click();
	}
	
	
   //verify text 
    public static void verifyDisplayedMessage(WebElement string, String message){
      try{
          assertEquals(message,string.getText());
      }catch (Exception e){
          System.out.println("Cannot find the Message");
      }
      }
    
    //enter details
    public void enterDetails(WebElement element, String value){
        element.clear();
        element.sendKeys(value);
    }
   
//generate random email id
	public static String getEmailId(){
        String email = ( UUID.randomUUID().toString()).replaceAll("-", "");
        System.out.println("Random email generated is " + email);
        return email;
        //.substring(0, length);
    }

	
	
}
