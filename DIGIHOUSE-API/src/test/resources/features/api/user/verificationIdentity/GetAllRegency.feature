@GetAllRegency
Feature: Get All Regency
  As a user
  I want to get all regency
  So that I can read all regency

  @ScenarioPositive
  Scenario: As a user I can get all regency data with a valid path
    Given I set API endpoint valid for get all regency
    When I send request to get all regency valid path
    Then I received status code 200 OK in request to get all regency
    And I received all data regency

  @ScenarioNegative
  Scenario: As a user I can't get all regency data with an invalid path
    Given I set API endpoint invalid for get all regency
    When I send request to get all regency invalid path
    Then I received status code 404 Not Found in request to get all regency
    And I received error message "Not Found" response in request get all regency