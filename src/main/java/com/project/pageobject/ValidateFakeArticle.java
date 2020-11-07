package com.project.pageobject;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ValidateFakeArticle {
	public static WebDriver driver = null;
//	WebDriverWait wait=new WebDriverWait(driver, 20);
	static String news = "";

	public void loadURL(WebDriver driver, String sourceURL) {
		driver.get(sourceURL);

	}

	public void theGuardianNewsPage(WebDriver driver) throws Exception {
		Thread.sleep(100);
		try {
			driver.switchTo().frame("sp_message_iframe_379541");
			driver.findElement(By.xpath("//button[contains(text(),'Yes')]")).click();
			driver.switchTo().defaultContent();
			System.out.println("I accept cookie");
		} catch (Exception e) {
			System.out.println("No cookie pop-up");
		}
	}

	public void clickFirstLink(WebDriver driver) throws InterruptedException {
		try {
			List<WebElement> newslinks = driver
					.findElements(By.cssSelector("a.u-faux-block-link__overlay.js-headline-text"));
			newslinks.get(0).click();
			System.out.println("I click on first link on The Guardian news Page");
		} catch (Exception e) {
			throw new RuntimeException(e.getMessage());
		}
	}

	public void articleDetails(WebDriver driver) throws InterruptedException {
		try {
			news = driver.findElement(By.xpath("//h1[@itemprop='headline']")).getText();
			System.out.println(news);
		} catch (Exception e) {
			System.out.println("Unable to read the heading");
		}
	}

	public void openNewTab(WebDriver driver) {
		try {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.open()");
			ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
			driver.switchTo().window(tabs.get(1));
			System.out.println("I open a new tab in browser");
		} catch (Exception e) {
			throw new RuntimeException(e.getMessage());
		}
	}

	public void searchNewsOnGoogle(WebDriver driver, String source) throws InterruptedException {
		try {
			driver.findElement(By.xpath("//button[@title='Advanced search']")).click();
			System.out.println("I click on Advanced Search");
			Thread.sleep(100);
			driver.findElement(By.xpath("//input[@aria-label='Has words']")).click();
			driver.findElement(By.xpath("//input[@aria-label='Has words']")).sendKeys(news);
			System.out.println("I filter with Has words");
			Thread.sleep(100);
			driver.findElement(By.xpath("//input[@aria-label='Website']")).click();
			driver.findElement(By.xpath("//input[@aria-label='Website']")).sendKeys(source);
			System.out.println("I enter Website" + source);
			Thread.sleep(100);
			driver.findElement(By.xpath("//div[@role='combobox'][@aria-haspopup='listbox']")).click();
			Thread.sleep(100);
			List<WebElement> date = driver.findElements(By.xpath("//li[@role='option']"));
			date.get(2).click();
			System.out.println("I select Date as Past 24 hours");
			Thread.sleep(100);
			driver.findElement(By.xpath("//div[@role='button'][@aria-label='Search']")).click();
			System.out.println("I click Search");
			Thread.sleep(100);
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='yYfBdf']")));
		} catch (Exception e) {
			throw new RuntimeException(e.getMessage());
		}
	}

	public void validateTopNewsSource(WebDriver driver) throws InterruptedException {
		String[] newsArr = news.toLowerCase().replaceAll("[\\s@&.:\';?$+-]+", " ").split(" ");
		int newsArrLen = newsArr.length;
		int refValidatorCount = (newsArrLen * 70) / 100;
		Thread.sleep(1000);
		driver.navigate().refresh();
		Thread.sleep(1000);
		List<WebElement> links = driver.findElements(By.xpath("//a[@class='DY5T1d']"));
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		System.out.println("First hit link : " + links.get(0));
		executor.executeScript("arguments[0].click();", links.get(0));
		int bodyContentCounter = 0;
		int headCounter = 0;
		for (String s : newsArr) {
			try {
				System.out.println("//*[contains(text(),'" + s.trim() + "')]");
				if (driver.getPageSource().contains(s))
					bodyContentCounter++;
			} catch (Exception e) {
				System.out.println(s + "is not present on Page");
			}
		}
		System.out.println("============ RESULT ===============");
		if (headCounter < (refValidatorCount * 50) / 100 && bodyContentCounter < (refValidatorCount * 75) / 100) {
			System.out.println("This could be fake news.");
		} else {
			System.out.println("This is not fake news.");
		}
		System.out.println("===================================");
	}

	public void completeExecution(WebDriver driver) {
		driver.quit();
		System.out.println("Test case execution is completed");
	}

}
