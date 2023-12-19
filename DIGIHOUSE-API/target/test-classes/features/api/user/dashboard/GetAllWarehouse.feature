@GetAllWarehouse
Feature: Get All Warehouse
  As a user
  I want to get all warehouse
  So that I can be get all warehouse

  @ScenarioPositive
  Scenario: As a user I can get all warehouse with a valid path
    Given I set API endpoint valid for get all warehouse
    When I send request to get all warehouse
    Then I received status code 200 OK in request get all warehouse
    And I received all warehouse data and message "Success" response in request get all warehouse

  @ScenarioNegative
  Scenario: As a user I can't get all warehouse without path
    Given I set API endpoint invalid for get all warehouse
    When I send request to get all warehouse no path
    Then I received status code 500 Internal Server Error in request to get all warehouse
    And I received error message "general error" response in request get all warehouse
