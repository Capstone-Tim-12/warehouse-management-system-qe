@GetInstallmentList
Feature: Get Installment List
  As a user
  I want to get installment list
  So that I can be get installment list

  @ScenarioPositive
  Scenario: As a user I can get installment list with a valid path
    Given I set API endpoint valid for get installment list
    When I send request to get installment list
    Then I received status code 200 OK in request get installment list
    And I received installment data and message "Success" response in request get installment list

  @ScenarioNegative
  Scenario: As a user I can't get installment list without path
    Given I set API endpoint invalid for get installment list without the path
    When I send request to get installment list no path
    Then I received status code 500 Internal Server Error in request to get installment list
    And I received error message "general error" response in request get installment list
