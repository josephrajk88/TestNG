package com.TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Grouping {
	WebDriver driver = null;

	@Test(groups = { "Session1" })
	public void launchBrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();

	}

	@Test(groups = { "Session2" })
	public void getTitle() {

		String getTitle = driver.getTitle();
		System.out.println("getTitle--" + getTitle);
	}

	@Test(groups = { "Session1", "Session3" })
	public void getURL() {

		String getURL = driver.getCurrentUrl();
		System.out.println("getURL--" + getURL);
		driver.close();
	}

}
