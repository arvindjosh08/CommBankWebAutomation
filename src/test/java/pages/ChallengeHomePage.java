package pages;

import org.junit.Assert;

import net.serenitybdd.core.Serenity;
import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;

public class ChallengeHomePage extends PageObject {

	public void enterUsernameToPlay(String user) {

		$(By.id("worrior_username")).type(user);

	}

	public void enterPasswordToPlay(String pass) {

		$(By.id("worrior_pwd")).type(pass);

	}

	public void publicPlace() {

		$(By.id("restaurant")).click();

		// *[@id="restaurant_timer_start"]
	}

	public void clickOnStart() {

		$(By.id("restaurant_timer_start")).click();

	}

	public void clickOnAnswer() {

		$(By.id("restaurant_answer_1")).click();

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		if (find(By.id("leaderboard_link")).isPresent()) {

			$(By.id("leaderboard_link")).click();

			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		} else {

			$(By.id("close_incorrect_modal_btn")).click();
			$(By.id("restaurant_answer_2")).click();
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			$(By.id("leaderboard_link")).click();

		}

	}

}
