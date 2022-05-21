package pages;

import net.thucydides.core.annotations.Step;

public class HomePage {
	
	
	CovidHomePage homepage;
	
	@Step
	public void openApplication() {
		
		homepage.open();
		
	}
	@Step
	public void clickRegister() {
		
		homepage.clickReg();
		
	}
	@Step
	public void enterUsername() {
		
		homepage.enterUname();
		
	}

	@Step
	public void enterPassword() {
	
	homepage.enterPass();
	
}
	
	@Step
	public void repeatPassword() {
	
	homepage.RepeatPass();
	
}
	
	@Step
	public void signUp() {
	
	homepage.ClickSignUp();
	
}
	
	@Step
	public void enterUsernameToLogin() {
	
	homepage.enterUserToLogin();
	
}
	
	@Step
	public void enterPasswordToLogin() {
	
	homepage.enterPassToLogin();
	
}
	
	@Step
	public void clickLoginButton() {
	
	homepage.clickLoginWarriorButton();
	
}
	
	@Step
	public void ClickStartJourneyButton() {
	
	homepage.clickStartJourney();
	
}
	
	@Step
	public void verifySuccessfullLogin() {
	
	homepage.VerifyLoginSuccess();
	
}
	
	@Step
	public void clickLogin() {
	
	homepage.clickLoginButtonToLogin();
	
}




}
