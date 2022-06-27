
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AmazonInfosys {

	public static void main(String[] args) {

		//System.setProperty("webdriver.chrome.driver","C:\\Users\\Joseph\\eclipse-workspace\\SeleniumWithJava\\Drivers\\chromedriver.exe"); // Correct
		WebDriverManager.chromedriver().setup();    // Correct
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");  // Correct

		//System.setProperty("webdriver.gecko.driver", "D:\\Selinium Drivers\\Exe Files\\geckodriver.exe");
				
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Mobiles " + Keys.ENTER);

		List<WebElement> elements = driver
				.findElements(By.xpath("//h2[@class='a-size-mini a-spacing-none a-color-base s-line-clamp-2']/a"));
		for (int i = 0; i < 2; i++) {

			elements.get(i).click();
		}

		Set<String> windowHandles = driver.getWindowHandles();

		String windowHandle = driver.getWindowHandle();

		for (String id : windowHandles) {

			if (!id.equals(windowHandle)) {

				driver.switchTo().window(id);

				driver.findElement(By.id("add-to-cart-button")).click();

			}
		}

	}

}
