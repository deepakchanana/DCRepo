package com.testing.Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="./Feature",glue="deepak",
format = {"pretty", "html:Reports/cucumber-html-report/Report.html"})
public class TestRunner {
	
	public static void main(String[] args) {
		System.out.println("Sdfghjmsdafg");
	}

}
