package com.project.test.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
	@CucumberOptions(
		features = {"/Users/NEHAVERMA/ValidateFakeArticleBDD/ValidateFakeArticleBDD/src/main/java/features/ValidateFakeArticle.feature"},
		glue = {"com/project/test/stepdefinition"},
		plugin = {"pretty", "html:test-output"},
		tags = //{"@TC_01_Validate_TheGuardianNewsArticle_from_TheTimesOfIndia"}
				{"@TC_02_Validate_TheGuardianNewsArticle_from_WashingtonPost"}
			//	{"@TC_03_Validate_TheGuardianNewsArticle_from_TheNewYorkTimes"}

		)

public class TestRunner {

}
