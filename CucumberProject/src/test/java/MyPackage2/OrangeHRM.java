package MyPackage2;

import java.io.File;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class OrangeHRM {

	WebDriver driver = null;

	@Given("I launch the browser & url {string} {string}")
	public void i_launch_the_browser_url(String browser, String url) {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();

	}

	@When("I enter the username {string} and Password {string}")
	public void i_enter_the_username_and_password(String username, String password) {
		WebElement ele1 = driver.findElement(By.id("txtUsername"));
		ele1.sendKeys(username);
		WebElement ele2 = driver.findElement(By.id("txtPassword"));
		ele2.sendKeys(password);
	}

	@And("I click the Login button")
	public void i_click_the_login_button() {
		WebElement ele3 = driver.findElement(By.id("btnLogin"));
		ele3.click();

	}

	@Then("I verify the Title of home page {string}")
	public void i_verify_the_title_of_home_page(String Expected) {
		String Actual = driver.getTitle();

		Assert.assertEquals(Actual, Expected);
		// driver.close();

	}

	@When("I enter the username and Password")
	public void i_enter_the_username_and_password(DataTable cred) {

		// first method
		List<List<String>> list = cred.asLists();
		WebElement ele1 = driver.findElement(By.id("txtUsername"));
		ele1.sendKeys(list.get(4).get(0));
		WebElement ele2 = driver.findElement(By.id("txtPassword"));
		ele2.sendKeys(list.get(1).get(1));

		/*// second method
		List<String> list = cred.row();
		WebElement ele1 = driver.findElement(By.id("txtUsername"));
		ele1.sendKeys(list.get(0));
		WebElement ele2 = driver.findElement(By.id("txtPassword"));
		ele2.sendKeys(list.get(1));
		*/

		/*
		 * List<String> list = cred.values(); WebElement ele1 =
		 * driver.findElement(By.id("txtUsername")); ele1.sendKeys(list.get(0));
		 * WebElement ele2 = driver.findElement(By.id("txtPassword"));
		 * ele2.sendKeys(list.get(1));
		 */
	}

	@Then("I should verify the sections")
	public void i_should_verify_the_sections(DataTable sections) {
		// List<String> l1 = sections.values(); // This method will comes from 7
		// versions
		List<String> l1 = sections.asList(); // This method comes from 4 versions
		String Expected = l1.get(2);
		WebElement ele3 = driver.findElement(By.xpath("//span[text()='Timesheets']"));
		Assert.assertEquals(Expected, ele3.getText());

//		TakesScreenshot tks = (TakesScreenshot)driver;
//		File temp = tks.getScreenshotAs(OutputType.FILE);
//		File perm = new File("./ScreenShots/loginproof.png");
//		FileUtils.copyFile(temp, perm);

		driver.close();

	}

}
