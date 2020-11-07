package com.project.test.stepdefinition;

import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.project.pageobject.ValidateFakeArticle;
import com.project.util.ReadPropertyFile;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ValidateFakeArticleStepDefinition {
	ValidateFakeArticle validateFakeArticle = new ValidateFakeArticle();
	public static WebDriver driver = null;
	ReadPropertyFile readPropertyFile = new ReadPropertyFile();
	String PropertiesFilePath = "src/test/resource/ValidateFakeArticle.properties";

	@Given("^I launch browser$")
	public void I_launch_browser() {
		System.setProperty("webdriver.chrome.driver", "lib/chromedriver");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.manage().window().maximize();

	}

	@When("^I load the URL$")
	public void I_load_the_URL(Map<String, String> tableData) throws InterruptedException {
		Thread.sleep(500);
		String URL = tableData.get("URL");
		String SourceURL = readPropertyFile.getValueFromPropertyFile(PropertiesFilePath, URL);
		validateFakeArticle.loadURL(driver, SourceURL);
	}

	@Then("^I am on the news page$")
	public void I_am_on_the_news_page() throws Exception {
		validateFakeArticle.theGuardianNewsPage(driver);
	}

	@Then("^I click the first news article$")
	public void I_click_the_first_news_article() throws InterruptedException {
		validateFakeArticle.clickFirstLink(driver);
	}

	@Then("^I take details from the news article$")
	public void I_take_details_from_the_news_article() throws InterruptedException {
		validateFakeArticle.articleDetails(driver);
	}

	@Then("^I open a new tab in browser$")
	public void I_open_a_new_tab_in_browser() {
		validateFakeArticle.openNewTab(driver);
	}

	@And("^I search past 24 hours news on google$")
	public void I_search_past_24_hours_news_on_google(Map<String, String> tableData) throws InterruptedException {
		String source = tableData.get("source");
		String sourceSite = readPropertyFile.getValueFromPropertyFile(PropertiesFilePath, source);
		validateFakeArticle.searchNewsOnGoogle(driver, sourceSite);
	}

	@And("^I validate the top news article$")
	public void I_validate_the_top_news_article() throws InterruptedException {
		validateFakeArticle.validateTopNewsSource(driver);
	}

	@Then("^Test case execution is completed$")
	public void Test_case_execution_is_completed() throws InterruptedException {
		validateFakeArticle.completeExecution(driver);
	}

}