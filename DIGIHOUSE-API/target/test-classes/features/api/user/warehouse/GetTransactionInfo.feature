@GetTransactionInfo
Feature: Get Transaction Info
  As a user
  I want to get transaction info
  So that I can be get transaction info

  @ScenarioPositive
  Scenario: As a user I can get transaction info with a valid path
    Given I set API endpoint valid for get transaction info
    When I send request to get transaction info
    Then I received status code 200 OK in request get transaction info
    And I received transaction data and message "Success" response in request get transaction info

  @ScenarioNegative
  Scenario: As a user I can't get transaction info without path
    Given I set API endpoint invalid for get transaction info without the path
    When I send request to get transaction info no path
    Then I received status code 500 Internal Server Error in request to get transaction info
    And I received error message "general error" response in request get transaction info
