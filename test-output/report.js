$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/main/java/features/ValidateFakeArticle.feature");
formatter.feature({
  "name": "Validate Fake Article feature",
  "description": "",
  "keyword": "Feature"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "I launch browser",
  "keyword": "Given "
});
formatter.match({
  "location": "com.project.test.stepdefinition.ValidateFakeArticleStepDefinition.I_launch_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "TC_02_Validate_TheGuardianNewsArticle_from_WashingtonPost",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@TC_02_Validate_TheGuardianNewsArticle_from_WashingtonPost"
    }
  ]
});
formatter.step({
  "name": "I load the URL",
  "rows": [
    {}
  ],
  "keyword": "When "
});
formatter.match({
  "location": "com.project.test.stepdefinition.ValidateFakeArticleStepDefinition.I_load_the_URL(java.util.Map\u003cjava.lang.String, java.lang.String\u003e)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I am on the news page",
  "keyword": "Then "
});
formatter.match({
  "location": "com.project.test.stepdefinition.ValidateFakeArticleStepDefinition.I_am_on_the_news_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click the first news article",
  "keyword": "Then "
});
formatter.match({
  "location": "com.project.test.stepdefinition.ValidateFakeArticleStepDefinition.I_click_the_first_news_article()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I take details from the news article",
  "keyword": "Then "
});
formatter.match({
  "location": "com.project.test.stepdefinition.ValidateFakeArticleStepDefinition.I_take_details_from_the_news_article()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I open a new tab in browser",
  "keyword": "Then "
});
formatter.match({
  "location": "com.project.test.stepdefinition.ValidateFakeArticleStepDefinition.I_open_a_new_tab_in_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I load the URL",
  "rows": [
    {}
  ],
  "keyword": "And "
});
formatter.match({
  "location": "com.project.test.stepdefinition.ValidateFakeArticleStepDefinition.I_load_the_URL(java.util.Map\u003cjava.lang.String, java.lang.String\u003e)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I search past 24 hours news on google",
  "rows": [
    {}
  ],
  "keyword": "And "
});
formatter.match({
  "location": "com.project.test.stepdefinition.ValidateFakeArticleStepDefinition.I_search_past_24_hours_news_on_google(java.util.Map\u003cjava.lang.String, java.lang.String\u003e)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I validate the top news article",
  "keyword": "And "
});
formatter.match({
  "location": "com.project.test.stepdefinition.ValidateFakeArticleStepDefinition.I_validate_the_top_news_article()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Test case execution is completed",
  "keyword": "Then "
});
formatter.match({
  "location": "com.project.test.stepdefinition.ValidateFakeArticleStepDefinition.Test_case_execution_is_completed()"
});
formatter.result({
  "status": "passed"
});
});