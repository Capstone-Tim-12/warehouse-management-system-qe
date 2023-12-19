@GetReason
Feature: Get Reason
  As a user
  I want to get reason
  So that I can be get reason

  @ScenarioPositive
  Scenario: As an admin I can get reason with a valid path
    Given I set API endpoint valid for get reason
    When I send request to get reason
    Then I received status code 200 OK in request get reason
    And I received message "Success" response in request get reason

  @ScenarioNegative
  Scenario: As an admin I can't get reason without path
    Given I set API endpoint invalid for get reason without the path
    When I send request to get reason no path
    Then I received status code 500 Internal Server Error in request to get reason
    And I received error message "general error" response in request get reason