@GetListTransactionWarehouse
Feature: Get List Transaction Warehouse
  As a user
  I want to get list transaction warehouse
  So that I can be get list transaction warehouse

  @ScenarioPositive
  Scenario: As an admin I can get list transaction warehouse with a valid path
    Given I set API endpoint valid for get list transaction warehouse
    When I send request to get list transaction warehouse
    Then I received status code 200 OK in request get list transaction warehouse
    And I received message "Success" response in request get list transaction warehouse

  @ScenarioNegative
  Scenario: As an admin I can't get list transaction warehouse without path
    Given I set API endpoint invalid for get list transaction warehouse without the path
    When I send request to get list transaction warehouse no path
    Then I received status code 500 Internal Server Error in request to get list transaction warehouse
    And I received error message "general error" response in request get list transaction warehouse