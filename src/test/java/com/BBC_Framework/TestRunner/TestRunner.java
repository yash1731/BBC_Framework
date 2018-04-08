package com.BBC_Framework.TestRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features ="src/test/java/resources/featureFiles",
        plugin = {"com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/report.html"},
        tags = {"@SignIn"},
        glue ="/BBC-Framework/src/test/java/com/BBC_Framework/StepDefs",
		dryRun = true,
        monochrome = true)

public class TestRunner {

}
