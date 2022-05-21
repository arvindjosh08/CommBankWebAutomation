package pages;

import net.thucydides.core.annotations.Step;

public class ChallengePage {

	ChallengeHomePage gamepage;

	@Step
	public void enterUsernameForChallenge(String user1) {

		gamepage.enterUsernameToPlay(user1);

	}

	@Step
	public void enterPasswordForChallenge(String pass1) {

		gamepage.enterPasswordToPlay(pass1);

	}

	@Step
	public void publicPlaceChallenge() {

		gamepage.publicPlace();

	}

	@Step
	public void clickToStartChallenge() {

		gamepage.clickOnStart();

	}

	@Step
	public void verifyCorrectAnswer() {

		gamepage.clickOnAnswer();

	}

}
