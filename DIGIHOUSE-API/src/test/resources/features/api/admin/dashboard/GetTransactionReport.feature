@GetTransactionReport
Feature: Get Transaction Report
  As a user
  I want to get transaction report
  So that I can be get transaction report

  @ScenarioPositive
  Scenario: As an admin I can get transaction report with a valid path
    Given I set API endpoint valid for get transaction report
    When I send request to get transaction report
    Then I received status code 200 OK in request get transaction report
    And I received message "Success" response in request get transaction report

  @ScenarioNegative
  Scenario: As an admin I can't get transaction report without path
    Given I set API endpoint invalid for get transaction report without the path
    When I send request to get transaction report no path
    Then I received status code 500 Internal Server Error in request to get transaction report
    And I received error message "general error" response in request get transaction report
