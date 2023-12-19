@GetUserInfo
Feature: Get User Info
  As a user
  I want to get user info
  So that I can be get user info

  @ScenarioPositive
  Scenario: As a user I can get user profile data with a valid path
    Given I set API endpoint valid for get user profile
    When I send request to get user profile valid path
    Then I received status code 200 OK in request to get user profile
    And I received all data profile user

  @ScenarioNegative
  Scenario: As a user I can't get user profile data with an invalid path
    Given I set API endpoint invalid for get user profile
    When I send request to get user profile invalid path
    Then I received status code 500 Internal Server Error in request to get user profile
    And I received error message "general error" response in request get user profile
