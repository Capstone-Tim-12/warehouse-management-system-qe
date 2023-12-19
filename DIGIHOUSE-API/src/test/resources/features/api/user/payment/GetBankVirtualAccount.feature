@GetBankVirtualAccount
Feature: Get Bank Virtual Account
  As a user
  I want to get bank virtual account
  So that I can be get bank virtual account

  @ScenarioPositive
  Scenario: As a user I can get bank virtual account with a valid path
    Given I set API endpoint valid for get bank virtual account
    When I send request to get bank virtual account
    Then I received status code 200 OK in request get bank virtual account
    And I received message "Success" response in request get bank virtual account

  @ScenarioNegative
  Scenario: As a user I can't get bank virtual account without path
    Given I set API endpoint invalid for get bank virtual account without the path
    When I send request to get bank virtual account no path
    Then I received status code 500 Internal Server Error in request to get bank virtual account
    And I received error message "general error" response in request get bank virtual account
