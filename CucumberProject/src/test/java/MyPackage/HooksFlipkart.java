package MyPackage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class HooksFlipkart {
	
	@Given("the user launces the url {string}")
	public void the_user_launces_the_url(String string) {
		System.out.println("the user launces the url");
	 
	}

	@Given("the user performing the registration")
	public void the_user_performing_the_registration() {
		System.out.println("the user performing the registration");
	   
	}

	@Given("the user enter the login")
	public void the_user_enter_the_login() {
		System.out.println("the user enter the login");
	   
	}

	@Given("the user search the product")
	public void the_user_search_the_product() {
		System.out.println("the user search the product");
	  
	}
	@Then("Done")
	public void Done() {
		System.out.println("Done---");
	  
	}
	

	@Given("the user add to card for the selected product")
	public void the_user_add_to_card_for_the_selected_product() {
		System.out.println("the user add to card for the selected product");
	}

	@Given("the user checks the shipment address")
	public void the_user_checks_the_shipment_address() {
		System.out.println("the user checks the shipment address");
	}

	@Given("the user pay the payment")
	public void the_user_pay_the_payment() {
		System.out.println("the user pay the payment");
	}


}
