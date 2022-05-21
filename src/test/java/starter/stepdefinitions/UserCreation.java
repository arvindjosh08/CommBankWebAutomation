package starter.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import pages.HomePage;

public class UserCreation {

	@Steps
	HomePage home;

	@Given("User is on home page of COVID application")
	public void user_is_on_home_page_of_covid_application() {

		home.openApplication();
	}

	@When("he clicks on Register button, Sign Up page is displayed")
	public void he_clicks_on_register_button_sign_up_page_is_displayed() {

		home.clickRegister();

	}

	@When("he enters username password and repeat password and clicks on Sign Up button to register")
	public void he_enters_username_as_password_as_and_repeat_password_as_and_clicks_on_sign_up_button() {

		home.enterUsername();
		home.enterPassword();
		home.repeatPassword();
		home.signUp();

	}

	@Then("User should be registered and should be able to login into application")
	public void user_should_be_registered_on_the_application() {
		home.enterUsernameToLogin();
		home.enterPasswordToLogin();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		home.clickLoginButton();
		home.ClickStartJourneyButton();
		home.verifySuccessfullLogin();

	}

}
