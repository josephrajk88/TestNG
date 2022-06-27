package com.TestNG;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Parametarization {

	/*
	@DataProvider(name = "Test Data")
	public Object[] getInfo() {
		return new Object[] { "abc@gmail.com", "123@gmail.com" };

	}

	@Test(dataProvider = "Test Data")
	public void getData(Object data) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("email")).sendKeys(data.toString());
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.close();
	}
	
	*/
	
	@Test(dataProvider = "dataprovider", dataProviderClass = DataPro.class)
	public void getData(String uname, String Passsword) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("email")).sendKeys(uname);
		driver.findElement(By.id("pass")).sendKeys(Passsword);
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//button[@name='login']")).click();
		driver.close();
	}
}
