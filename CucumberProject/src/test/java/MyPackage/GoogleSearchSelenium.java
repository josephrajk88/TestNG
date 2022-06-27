package MyPackage;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.it.Date;


public class GoogleSearchSelenium {

	WebDriver driver = null;
	List<WebElement> list;

	@Given("The user launches the url {string}")
	public void the_user_launches_the_url(String url) {

		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();

	}

	@When("The user search the {string}")
	public void the_user_search_the(String text) {
		driver.findElement(By.name("q")).sendKeys(text + Keys.ENTER);

	}

	@When("The user check the numbers of links")
	public void the_user_check_the_numbers_of_links() {
		 list = driver.findElements(
				By.xpath("//div[@id='search']/div/div/div[@class='hlcw0c' or @class='g tF2Cxc']//div[@class='yuRUbf']"));

		for (int i = 0; i < list.size(); i++) {
			System.out.println("--Links--"+list.get(i).getText());
		}
	}

	@When("The user click the last link")
	public void the_user_click_the_last_link() throws InterruptedException {
		Thread.sleep(2000);
	list.get(list.size()-1).click();
		
	}

	@Then("The user verifies the homepage title {string}")
	public void the_user_verifies_the_homepage_title(String expectedTitle) {

		Assert.assertEquals(expectedTitle, driver.getTitle());
		driver.close();
	

	}
	
	@Given("Print the date and time")
	public void print_the_date_and_time() {
	    //Date d=new Date ();
	    System.out.println("date and time--->"+System.currentTimeMillis());
	}

}
