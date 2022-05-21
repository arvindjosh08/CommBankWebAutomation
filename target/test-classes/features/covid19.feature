Feature: User Creation, complete some challenges and check the leaderboard
	@RegressionTest
  Scenario: Create a user so that he can login into COVID THE GAME application
    Given User is on home page of COVID application
    When he clicks on Register button, Sign Up page is displayed
    And he enters username password and repeat password and clicks on Sign Up button to register
    Then User should be registered and should be able to login into application


	@RegressionTest
  Scenario: Login into application to complete some challenges and verify score in leaderboard
    Given User is on home page of COVID GAME application
    When he clicks on Login button
    And he enters username as "crypto" and password as "crypto" to login into application
    And completes public place challenge
    Then verify that score in leaderboard is correct
