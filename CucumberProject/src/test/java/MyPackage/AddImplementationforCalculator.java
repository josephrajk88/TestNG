package MyPackage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AddImplementationforCalculator {
	int x,y;
	int actualSum;

	@Given("user has 2 inputs {int} and {int}")
	public void user_has_inputs_and(int x, int y) {
		this.x = x;
		this.y = y;
	}

	@When("user add this {int} inputs")
	public void user_add_this_inputs(Integer int1) {
		actualSum = x + y;
	}

	@Then("user verifies the outcome against {int}")
	public void user_verifies_the_outcome_against(Integer expectedSum) {
		if (actualSum==expectedSum)
		{
			System.out.println("Test case pass");
		} else {
			System.out.println("Test case fail");
		}
		}
		

	}

