package com.lamtech.luma.cucumber;


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/features",
        glue = {"com.lamtech.luma.stepDefinition"},
        format = {"pretty","html:target/site/cucumber-pretty"},
        tags = {"@OrderManagement"}



)



public class TestRunner {

}
