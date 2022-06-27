
import java.util.concurrent.TimeUnit;

import javax.swing.text.Position.Bias;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.server.handler.SendKeys;
//import org.openqa.selenium.firefox.GeckoDriverInfo;

public class FlipkartDemo {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "D:\\Selinium Drivers\\Exe Files\\geckodriver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);

		driver.get("https://www.flipkart.com/account/login");
		driver.findElement(By.xpath("/html/body/div/div/div[3]/div/div[2]/div/form/div[1]/input"))
				.sendKeys("9843080258");
		driver.findElement(By.xpath("/html/body/div/div/div[3]/div/div[2]/div/form/div[2]/input"))
				.sendKeys("Josephraj.k1");
		driver.findElement(By.xpath("/html/body/div/div/div[3]/div/div[2]/div/form/div[4]/button")).submit();
		// driver.findElement(By.linkText("Fashion")).click();
		Thread.sleep(5000);
		// driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div/div[4]/a/div[2]/div/div")).click();
		// driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div/div[4]/a/div[2]")).click();Thread.sleep(3000);
		// driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div/span[3]")).click();Thread.sleep(3000);
		// driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div")).click();
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("scroll(0,200)");
		driver.findElement(
				By.xpath("/html/body/div/div/div[3]/div[4]/div/div[2]/div/div/div[1]/div/div[3]/div/a/div[2]")).click();
		driver.navigate().back();
		jse.executeScript("scroll(0,1800)");
		driver.findElement(
				By.xpath("/html/body/div/div/div[3]/div[7]/div/div[2]/div/div/div[1]/div/div[3]/div/a/div[2]")).click();
		driver.navigate().back();
		driver.findElement(By.xpath("/html/body/div/div/div[1]/div[1]/div[2]/div[3]/div/div/div/div")).click();
		driver.findElement(By.xpath("/html/body/div/div/div[1]/div[1]/div[2]/div[3]/div/div")).click();
		driver.quit();
// driver.findElement(By.className("logout outclick")).submit();

	}

}