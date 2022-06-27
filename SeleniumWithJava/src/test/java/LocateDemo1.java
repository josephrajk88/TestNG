
//Example -- findElement() + name locator:
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LocateDemo1 {

	public static void main(String[] args) throws Exception {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.google.com/");

		driver.manage().window().maximize();

//Name
		WebElement ele = driver.findElement(By.name("q"));

		ele.sendKeys("Vellore Fort" + Keys.ENTER);

//Link Text
		WebElement ele1 = driver.findElement(By.linkText("Gmail"));

		ele1.click();

//partial link text:
		WebElement ele3 = driver.findElement(By.partialLinkText("ma"));

		ele3.click();

		Thread.sleep(5000);

		driver.close();

	}

}
