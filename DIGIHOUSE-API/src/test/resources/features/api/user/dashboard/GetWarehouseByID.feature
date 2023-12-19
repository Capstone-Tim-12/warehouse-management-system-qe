@GetWarehouseByID
Feature: Get Warehouse By ID
  As a user
  I want to get warehouse by ID
  So that I can be get warehouse by ID

  @ScenarioPositive
  Scenario: As a user I can get warehouse by ID with a valid path
    Given I set API endpoint valid for get warehouse by ID
    When I send request to get warehouse by ID
    Then I received status code 200 OK in request get warehouse by ID
    And I received all warehouse data and message "Success" response in request get warehouse by ID

  @ScenarioNegative
  Scenario: As a user I can't get warehouse by ID without path
    Given I set API endpoint invalid for get warehouse by ID
    When I send request to get warehouse by ID no path
    Then I received status code 500 Internal Server Error in request to get warehouse by ID
    And I received error message "general error" response in request get warehouse by ID

  @ScenarioNegative
  Scenario: As a user I can't get warehouse data with an invalid ID (by entering the ID numbers, letters & symbols at the same time)
    Given I set API endpoint invalid for get a single warehouse data invalid ID
    When I send request to get a single warehouse data invalid ID
    Then I received status code 400 Bad Request in request to get warehouse by ID
    And I received error message "Bad Request" response in request get warehouse by ID

  @ScenarioNegative
  Scenario: As a user I can't get warehouse data with an invalid ID (by entering an ID number that does not yet exist in the database)
    Given I set API endpoint invalid for get a single warehouse data ID not exist in database
    When I send request to get a single warehouse data ID not exist in database
    Then I received status code 500 Internal Server Error in request to get warehouse by ID
    And I received error message "failed find warehouse" response in request get warehouse by ID


