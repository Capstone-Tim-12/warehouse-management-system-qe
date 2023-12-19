@UpdateWarehouseByID
Feature: Update Warehouse By ID
  As a user
  I want to update warehouse by ID
  So that I can be update warehouse by ID

  @ScenarioPositive
  Scenario: As an admin I can update warehouse by ID with a valid path
    Given I set API endpoint valid for update warehouse by ID
    When I update a valid warehouse by ID
    And I send request to update warehouse by ID
    Then I received status code 200 OK in request update warehouse by ID
    And I received message "Success" response in request update warehouse by ID

  @ScenarioNegative
  Scenario: As an admin I can't update warehouse by ID without path
    Given I set API endpoint invalid for can't update warehouse by ID without the path
    When I send request to update warehouse by ID no path
    Then I received status code 500 Internal Server Error in request to update warehouse by ID
    And I received error message "general error" response in request update warehouse by ID

  @ScenarioNegative
  Scenario: As an admin I can't update warehouse by ID with invalid ID
    Given I set API endpoint invalid for can't update warehouse by ID with invalid ID
    When I send request to update warehouse by ID with invalid ID
    Then I received status code 404 Not Found in request update warehouse by ID
    And I received message "failed to get data warehouse" response in request update warehouse by ID
