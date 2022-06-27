package com.TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Invocation {

	WebDriver driver = null;

	@Test
	public void launchBrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}

	@Test(invocationCount = 3)
	public void launchGoogle() {
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
	}

	@Test
	public void verifyhomePage() {

		String ExpectedResult = "Google";
		String ActualResult = driver.getTitle();
		Assert.assertEquals(ExpectedResult, ActualResult);
	}

	@Test
	public void verifyURL() {

		String ExpectedResult = "https://www.google.com/";
		String ActualResult = driver.getCurrentUrl();
		System.out.println("ActualResult--" + ActualResult);
		Assert.assertEquals(ExpectedResult, ActualResult);
	}

	@Test
	public void closeBrowser() {
		driver.close();
	}
}
