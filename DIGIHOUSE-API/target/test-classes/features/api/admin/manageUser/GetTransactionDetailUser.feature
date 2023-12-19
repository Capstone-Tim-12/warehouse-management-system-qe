@GettransactionDetailUser
Feature: Get Transaction Detail User
  As a user
  I want to get transaction detail user
  So that I can be get transaction detail user

  @ScenarioPositive
  Scenario: As an admin I can get transaction detail user with a valid path
    Given I set API endpoint valid for get transaction detail user
    When I send request to get transaction detail user
    Then I received status code 200 OK in request get transaction detail user
    And I received message "Success" response in request get transaction detail user

  @ScenarioNegative
  Scenario: As an admin I can't get transaction detail user without path
    Given I set API endpoint invalid for can't get transaction detail user without the path
    When I send request to get transaction detail user no path
    Then I received status code 500 Internal Server Error in request to get transaction detail user
    And I received error message "general error" response in request get transaction detail user
