package com.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="src/test/resources",
		glue = {"com.stepDef"},
		tags = {"@Smoke"},
		plugin = { "pretty",
				"html:target/site/cucumber-pretty",
				 "json:target/cucumber.json"},
		monochrome = true, // inside  consol  thir question mark or not
		dryRun = false, // if we have stapdef then dryRun is false and there is no stepdef then true and dryRun mean
		                    //stepdef is written successfully or  curretly not
		strict = true //
		)

public class RunnerFileHRM {
	
	//helllllooooeee

}
