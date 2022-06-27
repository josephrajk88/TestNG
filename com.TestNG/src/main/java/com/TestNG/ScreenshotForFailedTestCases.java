package com.TestNG;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScreenshotForFailedTestCases {

	static WebDriver driver;

	@Test
	public static void captureScreen() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		// driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox123']"));

	}

	@AfterMethod
	public void screenshot(ITestResult Result) {
		// System.out.println("Result.getStatus--"+Result.getStatus());

		if (ITestResult.FAILURE == Result.getStatus()) {

			try {
				TakesScreenshot tks = (TakesScreenshot) driver;
				File src = tks.getScreenshotAs(OutputType.FILE); // File perm = new File("./ScreenShots"+
																	// Result.getName() + ".png"); // File perm = new //
				// File("C:\\Users\\Joseph\\eclipse-workspace\\com.TestNG\\ScreenShot" +
				// Result.getName() + ".png");
				FileUtils.copyFile(src, new File(
						"C:\\Users\\Joseph\\eclipse-workspace\\com.TestNG\\ScreenShot" + Result.getName() + ".png"));
				System.out.println("Successfully Captured the Screenshot");
			} catch (Exception e) {
				System.out.println("Exception is " + e.getMessage());
			}

		}
	}
}
