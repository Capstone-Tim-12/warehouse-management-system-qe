@GetUserByID
Feature: Get User By ID
  As a user
  I want to get user by ID
  So that I can be get user by ID

  @ScenarioPositive
  Scenario: As an admin I can get user by ID with a valid path
    Given I set API endpoint valid for get user by ID
    When I send request to get user by ID
    Then I received status code 200 OK in request get user by ID
    And I received message "Success" response in request get user by ID

  @ScenarioNegative
  Scenario: As an admin I can't get user by ID without path
    Given I set API endpoint invalid for can't get user by ID without the path
    When I send request to get user by ID no path
    Then I received status code 500 Internal Server Error in request to get user by ID
    And I received error message "general error" response in request get user by ID

  @ScenarioNegative
  Scenario: As an admin I can't get user by ID with invalid ID
    Given I set API endpoint invalid for can't get user by ID with invalid ID
    When I send request to get user by ID with invalid ID
    Then I received status code 404 Not Found in request get user by ID
    And I received message "Not Found" response in request get user by ID
