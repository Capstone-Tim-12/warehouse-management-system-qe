@GetPaymentSchema
Feature: Get Payment Schema
  As a user
  I want to get payment schema
  So that I can be get payment schema

  @ScenarioPositive
  Scenario: As a user I can get payment schema with a valid path
    Given I set API endpoint valid for get payment schema
    When I send request to get payment schema
    Then I received status code 200 OK in request get payment schema
    And I received payment schema data and message "Success" response in request get payment schema

  @ScenarioNegative
  Scenario: As a user I can't get payment schema without path
    Given I set API endpoint invalid for get payment schema without the path
    When I send request to get payment schema no path
    Then I received status code 500 Internal Server Error in request to get payment schema
    And I received error message "general error" response in request get payment schema
