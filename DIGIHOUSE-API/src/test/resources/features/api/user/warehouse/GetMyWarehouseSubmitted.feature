@GetMyWarehouseSubmitted
Feature: Get My Warehouse Submitted
  As a user
  I want to get my warehouse submitted
  So that I can be get my warehouse submitted

  @ScenarioPositive
  Scenario: As a user I can get my warehouse submitted with a valid path
    Given I set API endpoint valid for get my warehouse submitted
    When I send request to get my warehouse submitted
    Then I received status code 200 OK in request get my warehouse submitted
    And I received data warehouse and message "Success" response in request get my warehouse submitted

  @ScenarioNegative
  Scenario: As a user I can't get my warehouse submitted without path
    Given I set API endpoint invalid for get my warehouse submitted without the path
    When I send request to get my warehouse submitted no path
    Then I received status code 500 Internal Server Error in request to get my warehouse submitted
    And I received error message "general error" response in request get my warehouse submitted
