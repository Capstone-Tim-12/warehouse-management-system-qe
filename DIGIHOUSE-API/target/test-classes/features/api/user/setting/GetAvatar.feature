@GetAvatar
Feature: Get Avatar
  As a user
  I want to get avatar
  So that I can be get avatar

  @ScenarioPositive
  Scenario: As a user I can get avatar data with a valid path
    Given I set API endpoint valid for get avatar
    When I send request to get avatar valid path
    Then I received status code 200 OK in request to get avatar
    And I received all avatar data

  @ScenarioNegative
  Scenario: As a user I can't get avatar data with an invalid path
    Given I set API endpoint invalid for get avatar
    When I send request to get avatar invalid path
    Then I received status code 500 Internal Server Error in request to get avatar
    And I received error message "general error" response in request get avatar