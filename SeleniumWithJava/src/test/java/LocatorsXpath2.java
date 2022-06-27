import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LocatorsXpath2 {

	public static void main(String[] args) throws Exception {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.google.com/");

		driver.manage().window().maximize();
		
		WebElement ele1	 = driver.findElement(By.name("q"));

		ele1.sendKeys("Vellore Fort" + Keys.ENTER);

		List<WebElement> ele = driver.findElements(By.xpath("//h3[@class='LC20lb MBeuO DKV0Md']"));

		for (WebElement w : ele) {
			//System.out.println(w.getText());
			if (w.getText().contains ("TripAdviso"))
			{
				w.click();
			}
					
		}

	}
}
