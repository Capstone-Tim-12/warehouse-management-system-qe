@GetTransactionDetail
Feature: Get Transaction Detail
  As a user
  I want to get transaction detail
  So that I can be get transaction detail

  @ScenarioPositive
  Scenario: As an admin I can get transaction detail with a valid path
    Given I set API endpoint valid for get transaction detail
    When I send request to get transaction detail
    Then I received status code 200 OK in request get transaction detail
    And I received message "Success" response in request get transaction detail

  @ScenarioNegative
  Scenario: As an admin I can't get transaction detail without path
    Given I set API endpoint invalid for can't get transaction detail without the path
    When I send request to get transaction detail no path
    Then I received status code 500 Internal Server Error in request to get transaction detail
    And I received error message "general error" response in request get transaction detail