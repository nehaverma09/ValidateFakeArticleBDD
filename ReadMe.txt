==============================================
Automation script for Fake News Detection v1.0
==============================================

- Problem statement:
	News Validation site to prevent fake news. 
	Confirm the news from news website is valid by comparing the news at other news websites/agencies.
	
- Assumptions : 
	- News content verification is done based on string comparison from TEST news headline and Reference news headline and body.
	- It is assumed that 70% of the TEST NEWS headline string is sufficient to calculate the fake news possibility.
	- If the headline matched at least 50% and more OR, body content has 75% match, it is possibly not a fake news.
	- Calculations are done with above assumptions and accordingly the result is calculated. 
	
- Solution
	- Launch the news TEST website under observation for fake news.
	- Read the heading of first news that appears after clicking the web-site url.
	- Copy the header string to google news , add filters e.g. Duration(date), has words (string match) & REFERENCE website(s).
	- Launch the first news link from the listed news on google news.
	- Compare the string contents of TEST and REFERENCE header. Save the matched word count to headerMatchCount.
	- Compare the string contents from TEST header in REFERENCE news paragraphs. Save the matched word count to bodyMatchCount.
	- Calculate the fake news as per above assumption.
	
	Assumptions are indicative and can be modified based on further analysis.
	Also the auxiliary verbs can be avoided.
	
- Future improvement:
	- Data set can be created by extracting the source, publisher, time-frame, quotes, person's name, place names etc. 
	- Based on standard parameters the comparison needs to be conducted over the news content.

- Technology used: 
	- Java
	- Selenium webdriver
	- Cucumber
	- JUnit