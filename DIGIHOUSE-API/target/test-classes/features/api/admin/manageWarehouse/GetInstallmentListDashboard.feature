@GetInstallmentListDashboard
Feature: Get Installment List Dashboard
  As a user
  I want to get installment list dashboard
  So that I can be get installment list dashboard

  @ScenarioPositive
  Scenario: As an admin I can get installment list dashboard  with a valid path
    Given I set API endpoint valid for get installment list dashboard
    When I send request to get installment list dashboard
    Then I received status code 200 OK in request get installment list dashboard
    And I received message "Success" response in request get installment list dashboard

  @ScenarioNegative
  Scenario: As an admin I can't get installment list dashboard without path
    Given I set API endpoint invalid for get installment list dashboard without the path
    When I send request to get installment list dashboard no path
    Then I received status code 500 Internal Server Error in request to get installment list dashboard
    And I received error message "general error" response in request get installment list dashboard