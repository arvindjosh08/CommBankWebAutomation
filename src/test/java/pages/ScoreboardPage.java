package pages;

import net.thucydides.core.annotations.Step;

public class ScoreboardPage {
	
	
ScoreboardMainPage scoring;
	
	@Step
	public void scoreOnPage() {
		
		scoring.scorevalue();
		
	}

}
