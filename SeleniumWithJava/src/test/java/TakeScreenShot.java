import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TakeScreenShot {
	
	public static void main(String[] args) throws Exception {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		WebElement ele1 = driver.findElement(By.name("email"));
		
		ele1.sendKeys("sara1006554@gmail.com");
		
		
		WebElement ele2 = driver.findElement(By.id("pass"));
		
		ele2.sendKeys("Oranium@1234#$!");
		
		
		WebElement ele3 = driver.findElement(By.className("_6lth"));
		
		ele3.click();
		
		Thread.sleep(10000);
		
		TakesScreenshot tks = (TakesScreenshot)driver;
		
		File temp = tks.getScreenshotAs(OutputType.FILE);
		
		
		File perm = new File("./ScreenShots/loginproof.png");
		
		FileUtils.copyFile(temp, perm);
		
	}

}
