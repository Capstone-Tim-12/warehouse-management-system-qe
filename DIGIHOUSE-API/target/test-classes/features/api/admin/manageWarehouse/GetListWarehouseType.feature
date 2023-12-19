@GetListWarehouseType
Feature: Get List Warehouse Type
  As a user
  I want to get list warehouse type
  So that I can be get list warehouse type

  @ScenarioPositive
  Scenario: As an admin I can get list warehouse type with a valid path
    Given I set API endpoint valid for get list warehouse type
    When I send request to get list warehouse type
    Then I received status code 200 OK in request get list warehouse type
    And I received message "Success" response in request get list warehouse type

  @ScenarioNegative
  Scenario: As an admin I can't get list warehouse type without path
    Given I set API endpoint invalid for get list warehouse type without the path
    When I send request to get list warehouse type no path
    Then I received status code 500 Internal Server Error in request to get list warehouse type
    And I received error message "general error" response in request get list warehouse type