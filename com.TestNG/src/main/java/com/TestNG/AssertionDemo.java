package com.TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AssertionDemo {
	@Test
	public void launchBrowser() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();

		// SoftAssert sa=new SoftAssert();

		String Expected = "Google1";
		String Actual = driver.getTitle();

		Assert.assertEquals(Actual, Expected);
		// Assert.assertEquals(false, false, "Validating The Title Of HomePage");

		// sa.assertEquals(Actual, Expected);
		driver.close();
	}

}
