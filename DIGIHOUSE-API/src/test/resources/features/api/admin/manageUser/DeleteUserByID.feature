@DeleteUserByID
Feature: Delete User By ID
  As a user
  I want to delete user by ID
  So that I can be delete user by ID

  @ScenarioPositive
  Scenario: As an admin I can delete user by ID with a valid path
    Given I set API endpoint valid for delete user by ID
    When I send request to delete user by ID
    Then I received status code 200 OK in request delete user by ID
    And I received message "Success" response in request delete user by ID

  @ScenarioNegative
  Scenario: As an admin I can't delete user by ID without path
    Given I set API endpoint invalid for can't delete user by ID without the path
    When I send request to delete user by ID no path
    Then I received status code 500 Internal Server Error in request to delete user by ID
    And I received error message "general error" response in request delete user by ID

  @ScenarioNegative
  Scenario: As an admin I can't delete user by ID with invalid ID
    Given I set API endpoint invalid for can't delete user by ID with invalid ID
    When I send request to delete user by ID with invalid ID
    Then I received status code 404 Not Found in request delete user by ID
    And I received message "user not found" response in request delete user by ID
