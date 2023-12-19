@GetHistoryTransactionData
Feature: Get History Transaction Data
  As a user
  I want to get history transaction data
  So that I can be get history transaction data

  @ScenarioPositive
  Scenario: As an admin I can get history transaction data with a valid path
    Given I set API endpoint valid for get history transaction data
    When I send request to get history transaction data
    Then I received status code 200 OK in request get history transaction data
    And I received message "Success" response in request get history transaction data

  @ScenarioNegative
  Scenario: As an admin I can't get history transaction data without path
    Given I set API endpoint invalid for can't get history transaction data without the path
    When I send request to get history transaction data no path
    Then I received status code 500 Internal Server Error in request to get history transaction data
    And I received error message "general error" response in request get history transaction data