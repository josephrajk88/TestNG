package MyPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginTestForAmazon1 {
	@Given("the user launcehs the URL {string}")
	public void the_user_launcehs_the_url(String url) {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		System.out.println("Title is : "+driver.getTitle());
		System.out.println("URLis : "+driver.getCurrentUrl());
	}

	@When("the user enter the username and password {string} {string}")
	public void the_user_enter_the_username_and_password(String uname, String pwd) {
		System.out.println("uname is:" + uname + ". pwd is :" + pwd);

	}

	@When("the user cick the login button")
	public void the_user_cick_the_login_button() {
		System.out.println("login button");
	}

	@Then("the user verifies the title {string}")
	public void the_user_verifies_the_title(String expectedTitle) {
		String actualTitle = "Amazon";
		if (actualTitle == expectedTitle) {
			System.out.println("Pass");

		} else {
			System.out.println("Fail");
		}
	}
}
