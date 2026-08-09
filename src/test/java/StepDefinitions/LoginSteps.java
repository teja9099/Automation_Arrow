package StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {

	@Given("User Is on login page")
	public void user_is_on_login_page() {
		System.out.println("Inside step - User is on login page");
	}

	@When("User enters username and password")
	public void user_enters_username_and_password() {
		System.out.println("Inside step - User username and password");
	}

	@And("Click on login button")
	public void click_on_login_button() {
		System.out.println("Inside step - User is click on login button");
	}

	@Then("User Navigate to the home page")
	public void user_navigate_to_the_home_page() {
		System.out.println("Inside step - User is navigated to home page");
	}


}
