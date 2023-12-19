@GetAllDistrict
Feature: Get All District
  As a user
  I want to get all district
  So that I can read all district

  @ScenarioPositive
  Scenario: As a user I can get all district data with a valid path
    Given I set API endpoint valid for get all district
    When I send request to get all district valid path
    Then I received status code 200 OK in request to get all district
    And I received all data district

  @ScenarioNegative
  Scenario: As a user I can't get all district data with an invalid path
    Given I set API endpoint invalid for get all district
    When I send request to get all district invalid path
    Then I received status code 404 Not Found in request to get all district
    And I received error message "Not Found" response in request get all district