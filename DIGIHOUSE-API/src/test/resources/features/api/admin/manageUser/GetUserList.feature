@GetUserList
Feature: Get User List
  As a user
  I want to get user list
  So that I can be get user list

  @ScenarioPositive
  Scenario: As an admin I can get user list with a valid path
    Given I set API endpoint valid for get user list
    When I send request to get user list
    Then I received status code 200 OK in request get user list
    And I received message "Success" response in request get user list

  @ScenarioNegative
  Scenario: As an admin I can't get user list without path
    Given I set API endpoint invalid for get user list without the path
    When I send request to get user list no path
    Then I received status code 500 Internal Server Error in request to get user list
    And I received error message "general error" response in request get user list
