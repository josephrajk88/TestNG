package com.TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class launchBrowser {

	WebDriver driver = null;

	@BeforeMethod
	public void launchBrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		// driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
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
		System.out.println("ActualResult--"+ActualResult);
		Assert.assertEquals(ExpectedResult, ActualResult);
	}

	@AfterMethod
	public void closeBrowser() {
		driver.close();
	}
}
