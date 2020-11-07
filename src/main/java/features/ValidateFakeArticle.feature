Feature: Validate Fake Article feature 

Background: 
	Given I launch browser 
	
@TC_01_Validate_TheGuardianNewsArticle_from_TheTimesOfIndia	
Scenario: TC_01_Validate_TheGuardianNewsArticle_from_TheTimesOfIndia
	When I load the URL 
		|URL|TheGuardian|
	Then I am on the news page 
	Then I click the first news article
	Then I take details from the news article
	Then I open a new tab in browser			
	And I load the URL
		|URL|GoogleNews|		
	And I search past 24 hours news on google
		|source|TheTimesOfIndia|
	And I validate the top news article
	Then Test case execution is completed	
	
@TC_02_Validate_TheGuardianNewsArticle_from_WashingtonPost
Scenario: TC_02_Validate_TheGuardianNewsArticle_from_WashingtonPost
	When I load the URL 
		|URL|TheGuardian|
	Then I am on the news page 
	Then I click the first news article
	Then I take details from the news article
	Then I open a new tab in browser			
	And I load the URL
		|URL|GoogleNews|		
	And I search past 24 hours news on google
		|source|WahshingtonPost|
	And I validate the top news article
	Then Test case execution is completed
	
@TC_03_Validate_TheGuardianNewsArticle_from_TheNewYorkTimes
Scenario: TC_03_Validate_TheGuardianNewsArticle_from_TheNewYorkTimes
	When I load the URL 
		|URL|TheGuardian|
	Then I am on the news page 
	Then I click the first news article
	Then I take details from the news article
	Then I open a new tab in browser			
	And I load the URL
		|URL|GoogleNews|		
	And I search past 24 hours news on google
		|source|TheNewYorkTimes|
	And I validate the top news article
	Then Test case execution is completed