@GetProfile
Feature: Get Profile
  As a user
  I want to get profile
  So that I can be get profile

  @ScenarioPositive
  Scenario: As a user I can get profile with a valid path
    Given I set API endpoint valid for get profile
    When I enter a email valid format for get profile
    And I send request to get profile
    Then I received status code 200 OK in request get profile
    And I received data profile and message "Success" response in request get profile

  @ScenarioNegative
  Scenario: As a user I can't get profile without path
    Given I set API endpoint invalid for get profile without the path
    When I send request to get profile no path
    Then I received status code 500 Internal Server Error in request to get profile
    And I received error message "general error" response in request get profile