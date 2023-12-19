@DeleteWarehouseByID
Feature: Delete Warehouse By ID
  As a user
  I want to delete warehouse by ID
  So that I can be delete warehouse by ID

  @ScenarioPositive
  Scenario: As an admin I can delete warehouse by ID with a valid path
    Given I set API endpoint valid for delete warehouse by ID
    When I send request to delete warehouse by ID
    Then I received status code 200 OK in request delete warehouse by ID
    And I received message "Success" response in request delete warehouse by ID

  @ScenarioNegative
  Scenario: As an admin I can't delete warehouse by ID without path
    Given I set API endpoint invalid for can't delete warehouse by ID without the path
    When I send request to delete warehouse by ID no path
    Then I received status code 500 Internal Server Error in request to delete warehouse by ID
    And I received error message "general error" response in request delete warehouse by ID

  @ScenarioNegative
  Scenario: As an admin I can't delete warehouse by ID with invalid ID
    Given I set API endpoint invalid for can't delete warehouse by ID with invalid ID
    When I send request to delete warehouse by ID with invalid ID
    Then I received status code 404 Not Found in request delete warehouse by ID
    And I received message "warehouse not found" response in request delete warehouse by ID
