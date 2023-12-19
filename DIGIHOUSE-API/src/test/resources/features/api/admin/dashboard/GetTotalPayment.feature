@GetTotalPayment
Feature: Get Total Payment
  As a user
  I want to get total payment
  So that I can be get total payment

  @ScenarioPositive
  Scenario: As an admin I can get total payment with a valid path
    Given I set API endpoint valid for get total payment
    When I send request to get total payment
    Then I received status code 200 OK in request get total payment
    And I received message "Success" response in request get total payment

  @ScenarioNegative
  Scenario: As an admin I can't get total payment without path
    Given I set API endpoint invalid for get total payment without the path
    When I send request to get total payment no path
    Then I received status code 500 Internal Server Error in request to get total payment
    And I received error message "general error" response in request get total payment
