@DeleteFavoriteByID
Feature: Delete Favorite By ID
  As a user
  I want to delete favorite by ID
  So that I can be delete favorite by ID

  @ScenarioPositive
  Scenario: As a user I can delete favorite by ID with a valid path
    Given I set API endpoint valid for delete favorite by ID
    When I send request to delete favorite by ID
    Then I received status code 200 OK in request delete favorite by ID
    And I received message "Success" response in request delete favorite by ID

  @ScenarioNegative
  Scenario: As a user I can't delete favorite by ID without path
    Given I set API endpoint invalid for can't delete favorite by ID without the path
    When I send request to delete favorite by ID no path
    Then I received status code 500 Internal Server Error in request to delete favorite by ID
    And I received error message "general error" response in request delete favorite by ID

  @ScenarioNegative
  Scenario: As a user I can't delete favorite by ID with invalid ID
    Given I set API endpoint invalid for can't delete favorite by ID with invalid ID
    When I send request to delete favorite by ID with invalid ID
    Then I received status code 404 Not Found in request delete favorite by ID
    And I received message "Not Found" response in request delete favorite by ID