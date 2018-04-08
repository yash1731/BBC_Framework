package com.BBC_Framework.Utility;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {
	
	BrowserFactory browser = new BrowserFactory();
	
	@Before
	public void beforeScenario(){
		
		browser.getDriver("firefox");
		
	}
	
	//@After
    public void afterScenario()
	{	
	//browser.clearCookies();
	browser.closeDeviceWebDriver();
		
	}
}
