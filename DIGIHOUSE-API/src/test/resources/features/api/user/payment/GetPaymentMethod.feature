@GetPaymentMethod
Feature: Get Payment Method
  As a user
  I want to get payment method
  So that I can be get payment method

  @ScenarioPositive
  Scenario: As a user I can get payment method with a valid path
    Given I set API endpoint valid for get payment method
    When I send request to get payment method
    Then I received status code 200 OK in request get payment method
    And I received message "Success" response in request get payment method

  @ScenarioNegative
  Scenario: As a user I can't get payment method without path
    Given I set API endpoint invalid for get payment method without the path
    When I send request to get payment method no path
    Then I received status code 500 Internal Server Error in request to get payment method
    And I received error message "general error" response in request get payment method
