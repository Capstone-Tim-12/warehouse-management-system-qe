@GetListTransactionUser
Feature: Get List Transaction User
  As a user
  I want to get list transaction user
  So that I can be get list transaction user

  @ScenarioPositive
  Scenario: As an admin I can get list transaction user with a valid path
    Given I set API endpoint valid for get list transaction user
    When I send request to get list transaction user
    Then I received status code 200 OK in request get list transaction user
    And I received message "Success" response in request get list transaction user

  @ScenarioNegative
  Scenario: As an admin I can't get list transaction user without path
    Given I set API endpoint invalid for can't get list transaction user without the path
    When I send request to get list transaction user no path
    Then I received status code 500 Internal Server Error in request to get list transaction user
    And I received error message "general error" response in request get list transaction user
