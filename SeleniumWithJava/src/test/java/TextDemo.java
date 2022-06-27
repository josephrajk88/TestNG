import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TextDemo {
	public static void main(String[] args) throws Exception {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.google.com/");

		driver.manage().window().maximize();

		WebElement ele1 = driver.findElement(By.name("q"));
		ele1.sendKeys("Flip Kart");
		String passedValue1 = ele1.getAttribute("value");
		System.out.println(passedValue1);

		WebElement ele2 = driver.findElement(By.partialLinkText("Gma"));
		String passedValue2 = ele2.getAttribute("innerText");
		System.out.println(passedValue2);
		
		String att_Value = ele1.getAttribute("class");
		System.out.println(att_Value);
	}
}
