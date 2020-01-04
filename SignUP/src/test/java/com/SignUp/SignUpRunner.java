package com.SignUp;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)

@CucumberOptions(features= {"src/test/resources/com/SignUp/Features/SignUP.feature"}, plugin = {"pretty","json:target/cucumber.json","html:target/cucumber-html-report"},
tags = {"@Test"},
dryRun=false)

public class SignUpRunner
{

}
