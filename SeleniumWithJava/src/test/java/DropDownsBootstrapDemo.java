import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownsBootstrapDemo {

	public static void main(String[] args) throws Exception {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.get("http://seleniumpractise.blogspot.com/2016/08/bootstrap-dropdown-example-for-selenium.html");

		driver.manage().window().maximize();
		
		WebElement ele1 = driver.findElement(By.id("menu1"));
		ele1.click();

		List <WebElement> ele2 = driver.findElements(By.xpath("//ul[@class='dropdown-menu']//li/a"));

		for (WebElement w:ele2) {
			String Text=w.getText();
			//System.out.println(Text);
			if (w.getText().equals("JavaScript"))
			{
				w.click();
			}
		}
		Thread.sleep(3000);	
		driver.close();			
	}
}
