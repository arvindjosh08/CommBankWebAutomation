package pages;

import java.util.Random;

import org.junit.Assert;

import net.serenitybdd.core.Serenity;
import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;

public class CovidHomePage extends PageObject {

	String s;

	public void clickReg() {

		$(By.id("rego")).click();

	}

	public void enterUname() {

		Random random = new Random();
		int y = random.nextInt(100000000);
		s = String.valueOf(y);
		$(By.id("uname")).type(s);

	}

	public void enterPass() {

		$(By.id("pwd")).type(s);

	}

	public void RepeatPass() {

		$(By.id("psw-repeat")).type(s);

	}

	public void ClickSignUp() {

		$(By.id("signupbtn")).click();

	}

	public void enterUserToLogin() {

		$(By.id("worrior_username")).type(s);

	}

	public void enterPassToLogin() {

		$(By.id("worrior_pwd")).type(s);

	}

	public void clickLoginWarriorButton() {

		$(By.id("warrior")).click();

	}

	public void clickStartJourney() {

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		$(By.id("start")).click();

	}

	public void clickLoginButtonToLogin() {

		$(By.id("login")).click();

	}

	@SuppressWarnings("deprecation")
	public void VerifyLoginSuccess() {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Assert.assertEquals(Serenity.getDriver().getCurrentUrl(), "https://responsivefight.herokuapp.com/covid");

	}

}
