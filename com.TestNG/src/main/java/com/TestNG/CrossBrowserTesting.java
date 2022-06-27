package com.TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CrossBrowserTesting {
	WebDriver driver = null;

	@BeforeTest
	@Parameters("browser")
	public void setUp(String browser) throws Exception {
		if (browser.equalsIgnoreCase("FireBox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		} else if (browser.equalsIgnoreCase("Chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}  else if (browser.equalsIgnoreCase("Edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}else

		{
			throw new Exception("Browser is not matching");
		}

	}

	@Test
	public void testParams() throws InterruptedException {

		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("email")).sendKeys("abc@gmail.com");
	    Thread.sleep(3000);
		driver.findElement(By.id("pass")).sendKeys("12345");
		// Thread.sleep(5000);

		// driver.findElement(By.xpath("//button[@name='login']")).click();
		driver.close();
	}
}
