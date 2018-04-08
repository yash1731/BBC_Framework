package com.BBC_Framework.Utility;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;


public class BrowserFactory {
	
    protected static WebDriver driver ;
    
	
	public WebDriver getDriver(String browserName)
	{
	
	if(browserName.equalsIgnoreCase("safari"))
	{
		driver = new SafariDriver();
		
	}
	
	else if(browserName.equalsIgnoreCase("firefox"))
	{
		
	System.setProperty("webdriver.gecko.driver","//Users//yashpaldewangan//Downloads//geckodriver");
	driver = new FirefoxDriver();
	//driver.get("http://www.bbc.co.uk/blogs/test/entries/f5f3031a-1a29-44ee-b2f8-86e78bfd57b0");
	
	}
	else if(browserName.equalsIgnoreCase("chrome"))
	{	
	System.setProperty("webdriver.chrome.driver","//Users//yashpaldewangan//Downloads//chromedriver");
	driver = new ChromeDriver();
	}
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	return driver;

	}
	
	public void clearCookies() {
        Set<Cookie> cookies = driver.manage().getCookies();
        for (Cookie cookie : cookies) {
           driver.manage().deleteCookie(cookie);
        }
	}
	
	
	public void closeDeviceWebDriver() {
		
        if (driver != null) {
            driver.close();
            driver = null;
        }
	}  
      
	
	public void refresh() {
		//driver.navigate().refresh();
		driver.navigate().refresh();
		
    }

    public String getCurrentUrl() {
        return driver.getCurrentUrl();
    }
	
        
    }


	


