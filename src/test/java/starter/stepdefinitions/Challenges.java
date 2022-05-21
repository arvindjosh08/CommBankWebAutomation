package starter.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import pages.ChallengePage;
import pages.HomePage;
import pages.ScoreboardPage;

public class Challenges {

	@Steps
	HomePage home;

	@Steps
	ChallengePage challenge;

	@Steps
	ScoreboardPage score;

	@Given("User is on home page of COVID GAME application")
	public void user_is_on_home_page_of_covid_game_application() {

		home.openApplication();
	}

	@When("he clicks on Login button")
	public void he_clicks_on_login_button() {
		home.clickLogin();

	}

	@When("he enters username as {string} and password as {string} to login into application")
	public void he_enters_username_as_and_password_as_to_login_into_application(String str1, String str2) {

		challenge.enterUsernameForChallenge(str2);
		challenge.enterPasswordForChallenge(str2);
		home.clickLoginButton();
		home.ClickStartJourneyButton();

	}

	@When("completes public place challenge")
	public void plays_go_to_a_public_place_challenge() {

		challenge.publicPlaceChallenge();
		challenge.clickToStartChallenge();
		challenge.verifyCorrectAnswer();

	}

	@Then("verify that score in leaderboard is correct")
	public void verify_that_score_in_leaderboard_is_correct() {

		score.scoreOnPage();

	}

}
