import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.remote.server.handler.SendKeys; 
//import org.openqa.selenium.firefox.GeckoDriverInfo;

public class AmazonTest2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "D:\\Selinium Drivers\\Exe Files\\geckodriver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		
		driver.get("https://www.amazon.in");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"nav-link-accountList\"]")).click();
				
		Thread.sleep(3000);
		driver.findElement(By.id("ap_email")).sendKeys("9843080258");
		driver.findElement(By.id("continue")).click();
		Thread.sleep(3000);

		driver.findElement(By.id("ap_password")).sendKeys("Josephraj.k1");
		driver.findElement(By.id("signInSubmit")).submit();
		Thread.sleep(5000);

		driver.findElement(By.xpath("//*[@id=\"nav-link-accountList-nav-line-1\"]")).click();
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[2]/div[1]/a/div/div/div/div[2]/h2")).click();
		
		driver.navigate().back();
		Thread.sleep(2000);	
		driver.navigate().back();			
	    driver.findElement(By.xpath("/html/body/div/header/div/div[2]/div[2]/div[2]/div/a[3]")).click();
		System.out.println("Title--"+driver.getTitle());
		
		driver.navigate().back();
		Thread.sleep(2000);	
		
		driver.navigate().forward();
		Thread.sleep(2000);	
		
		driver.navigate().refresh();
		Thread.sleep(2000);	
		driver.findElement(By.xpath("//*[@id=\"nav-link-accountList\"]")).click();
		Thread.sleep(2000);	
		
		
		driver.close();
				
		//JavascriptExecutor jse = (JavascriptExecutor) driver;
		//jse.executeScript("scroll(0,2000)");
		
	}

}