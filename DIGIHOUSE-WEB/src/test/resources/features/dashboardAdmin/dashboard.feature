@Dashboard
Feature: Dashboard
  As an admin
  I want to see dashboard
  So that I can be access see dashboard

  @ScenarioPositive
  Scenario: As an admin I can view the dashboard page
    Given I set the endpoint on the login page
    When I enter a valid email
    And I enter a valid password
    And I tap the Login button
    And I tap the Dashboard button
    Then I see the analytics and reporting in the dashboard page