@Logout
Feature: Logout
  As an admin
  I want to logout
  So that I can logout

  Background:
    Given I set the endpoint on the login page

  @ScenarioPositive
  Scenario: As an admin I can logout the dashboard admin if tap the OK button confirmation
    When I enter a valid email
    And I enter a valid password
    And I tap the Login button
    And I tap the Logout button
    And I tap the Ya button
    Then I redirected to the login page

  @ScenarioNegative
  Scenario: As an admin I can't logout the dashboard admin if tap the Cancel button confirmation
    When I enter a valid email
    And I enter a valid password
    And I tap the Login button
    And I tap the Logout button
    And I tap the Batal button
    Then I still on the dashboard admin page
