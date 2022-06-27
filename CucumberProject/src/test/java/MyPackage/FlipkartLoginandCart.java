package MyPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FlipkartLoginandCart {
	WebDriver driver = null;

	@Given("the user launch the browser & enter the url {string} {string}")
	public void the_user_launch_the_browser_enter_the_url(String browser, String url) {
		System.out.println("browser name:" + browser + "--url:" + url);
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();

	}

	@When("the user click login button")
	public void the_user_click_login_button() {
		System.out.println("click login button");

	}

	@And("the user enter the email or mobile number {string}")
	public void the_user_enter_the_email_or_mobile_number(String mobileNo) {
		System.out.println("mobileNo:" + mobileNo);

	}

	@And("the user enter the password  {string}")
	public void the_user_enter_the_password(String Password) {
		System.out.println("Password:" + Password);

	}

	@And("the user verifies the title in the home page {string}")
	public void the_user_verifies_the_title_in_the_home_page(String Title) {
		System.out.println("Title:" + Title);

	}

	@When("the user enter the product as {string} and click enter")
	public void the_user_enter_the_product_as_and_click_enter(String Product) {
		System.out.println("Product:" + Product);

	}

	@And("the user select any one mobile from the listed products  {string}")
	public void the_user_select_any_one_mobile_from_the_listed_products(String ProductModel) {
		System.out.println("ProductModel:" + ProductModel);

	}

	@And("the user enter the pincode {int} and clicks verify button")
	public void the_user_enter_the_pincode_and_clicks_verify_button(Integer PINcode) {
		System.out.println("PINcode:" + PINcode);

	}

	@Then("the user verifies the product added into the crd or not")
	public void the_user_verifies_the_product_added_into_the_crd_or_not() {
		System.out.println("Cart Check");

	}

}
