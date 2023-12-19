@GetStatistic
Feature: Get Statistic
  As a user
  I want to get statistic
  So that I can be get statistic

  @ScenarioPositive
  Scenario: As an admin I can get statistic with a valid path
    Given I set API endpoint valid for get statistic
    When I send request to get statistic
    Then I received status code 200 OK in request get statistic
    And I received message "Success" response in request get statistic

  @ScenarioNegative
  Scenario: As an admin I can't get statistic without path
    Given I set API endpoint invalid for get statistic without the path
    When I send request to get statistic no path
    Then I received status code 500 Internal Server Error in request to get statistic
    And I received error message "general error" response in request get statistic
