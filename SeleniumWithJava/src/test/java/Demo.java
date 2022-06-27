
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Demo {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.gecko.driver", "D:\\Selinium Drivers\\Exe Files\\geckodriver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://apps.srmschools.org");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("852546");
		driver.findElement(By.id("password")).sendKeys("852546");
		driver.findElement(By.id("login")).submit();
		//driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/div[2]/div[2]/a/img")).click();
	
		driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/div[2]/div[2]/a/img")).click();
		Thread.sleep(300);
		//driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/div[2]/div[2]/ul/li[1]/a")).click();
		driver.findElement(By.linkText("My Profile")).click();	
		driver.findElement(By.linkText("LOG OUT")).click();	
		driver.close();
		
		WebElement selectElement = driver.findElement(By.id("selectElementID"));
		Select selectObject = new Select(selectElement);
		  
		
		// Select an <option> based upon the <select> element's internal index
		selectObject.selectByIndex(1);

		// Select an <option> based upon its value attribute
		selectObject.selectByValue("value1");

		// Select an <option> based upon its text
		selectObject.selectByVisibleText("Bread");
		  
	//
		// Return a List<WebElement> of options that have been selected
		List <WebElement> allSelectedOptions = selectObject.getAllSelectedOptions();

		// Return a WebElement referencing the first selection option found by walking down the DOM
		WebElement firstSelectedOption = selectObject.getFirstSelectedOption();
		  
		// Return a List<WebElement> of options that the <select> element contains
		List <WebElement> allAvailableOptions = selectObject.getOptions();
		  
		//some <select> elements allow you to select more than one option. You can find out if your <select> element is one of these by using:
		Boolean doesThisAllowMultipleSelections = selectObject.isMultiple();
		  
		// Deselect an <option> based upon the <select> element's internal index
		selectObject.deselectByIndex(1);

		// Deselect an <option> based upon its value attribute
		selectObject.deselectByValue("value1");

		// Deselect an <option> based upon its text
		selectObject.deselectByVisibleText("Bread");

		// Deselect all selected <option> elements
		selectObject.deselectAll();
		  
		
}

}