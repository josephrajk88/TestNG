import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownsDemo {

	public static void main(String[] args) throws Exception {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.get("https://chercher.tech/practice/practice-dropdowns-selenium-webdriver");

		driver.manage().window().maximize();

		WebElement ele1 = driver.findElement(By.xpath("//select[@id='first']"));

		ele1.click();

		Select s = new Select(ele1);

		/*
		 * //Select All
		 * https://www.tutorialspoint.com/selenium/selenium_automation_practice.htm List
		 * <WebElement> ele5=s.getOptions(); for (WebElement e:ele5) { String
		 * text=e.getText(); s.selectByVisibleText(text);
		 * 
		 * 
		 * List <WebElement> all=s.getAllSelectedOptions() for (WebElement e:all) {
		 * String text=e.getText(); System.out.println(text);; }
		 * 
		 * WebElement ele3=s.getFirstSelectedOption();
		 * System.out.println(ele3.getText()); }
		 */

		/*
		 * Methods s.selectByIndex(0); s.selectByValue(0); s.selectByVisibleText(null);
		 * s.deselectAll(); s.deselectByIndex(0); s.deselectByValue(null);
		 * s.deselectByVisibleText(null); s.getAllSelectedOptions(); s.equals(s);
		 * s.getClass(); s.getOptions(); s.getFirstSelectedOption(); s.isMultiple();
		 * s.notify(); s.wait();
		 */

	}
}
