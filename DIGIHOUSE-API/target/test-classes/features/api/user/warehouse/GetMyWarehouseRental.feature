@GetMyWarehouseRental
Feature: Get My Warehouse Rental
  As a user
  I want to get my warehouse rental
  So that I can be get my warehouse rental

  @ScenarioPositive
  Scenario: As a user I can get my warehouse rental with a valid path
    Given I set API endpoint valid for get my warehouse rental
    When I send request to get my warehouse rental
    Then I received status code 200 OK in request get my warehouse rental
    And I received data profile and message "Success" response in request get my warehouse rental

  @ScenarioNegative
  Scenario: As a user I can't get my warehouse rental without path
    Given I set API endpoint invalid for get my warehouse rental without the path
    When I send request to get my warehouse rental no path
    Then I received status code 500 Internal Server Error in request to get my warehouse rental
    And I received error message "general error" response in request get my warehouse rental
