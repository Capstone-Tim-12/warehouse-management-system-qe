@GetAllProvince
Feature: Get All Province
  As a user
  I want to get all province
  So that I can read all province

  @ScenarioPositive
  Scenario: As a user I can get all province data with a valid path
    Given I set API endpoint valid for get all province
    When I send request to get all province valid path
    Then I received status code 200 OK in request to get all province
    And I received all data province

  @ScenarioNegative
  Scenario: As a user I can't get all province data with an invalid path
    Given I set API endpoint invalid for get all province
    When I send request to get all province invalid path
    Then I received status code 404 Not Found in request to get all province
    And I received error message "Not Found" response in request get all province