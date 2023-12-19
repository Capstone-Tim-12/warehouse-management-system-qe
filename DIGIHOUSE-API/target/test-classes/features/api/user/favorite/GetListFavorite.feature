@GetListFavorite
Feature: Get List Favorite
  As a user
  I want to get list favorite
  So that I can be get list favorite

  @ScenarioPositive
  Scenario: As a user I can get list favorite with a valid path
    Given I set API endpoint valid for get list favorite
    When I send request to get list favorite
    Then I received status code 200 OK in request get list favorite
    And I received detail favorite warehouse and message "Success" response in request get list favorite

  @ScenarioNegative
  Scenario: As a user I can't get list favorite without path
    Given I set API endpoint invalid for can't get list favorite without the path
    When I send request to get list favorite no path
    Then I received status code 500 Internal Server Error in request to get list favorite
    And I received error message "general error" response in request get list favorite