@RecentCustomer
Feature: Recent Customer
  As a user
  I want to recent customer
  So that I can be recent customer

  @ScenarioPositive
  Scenario: As an admin I can recent customer with a valid path
    Given I set API endpoint valid for recent customer
    When I send request to recent customer
    Then I received status code 200 OK in request recent customer
    And I received message "Success" response in request recent customer

  @ScenarioNegative
  Scenario: As an admin I can't recent customer without path
    Given I set API endpoint invalid for recent customer without the path
    When I send request to recent customer no path
    Then I received status code 500 Internal Server Error in request to recent customer
    And I received error message "general error" response in request recent customer
