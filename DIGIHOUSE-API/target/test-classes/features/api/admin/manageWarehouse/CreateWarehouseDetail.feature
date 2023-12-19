@CreateWarehouseDetail
Feature: Create Warehouse Detail
  As a user
  I want to create warehouse detail
  So that I can be create warehouse detail

  Background:
    Given I set API endpoint valid for create warehouse detail

  @ScenarioPositive
  Scenario: As an admin I can create warehouse detail with a valid input
    When I enter a valid input create warehouse detail
    And I send request to create warehouse detail
    Then I received status code 201 Created in request create warehouse detail
    And I received message "Success" response in request create warehouse detail

  @ScenarioNegative
  Scenario: As an admin I can't create warehouse detail without path
    Given I set API endpoint invalid for create warehouse detail without the path
    When I send request to create warehouse detail no path
    Then I received status code 500 Internal Server Error in request to create warehouse detail
    And I received error message "general error" response in request create warehouse detail

  @ScenarioNegative
  Scenario: As an admin I can't create warehouse detail if I don't fill in the create warehouse detail request
    When I blank the create warehouse detail request
    And I send request to create warehouse detail with blank warehouse request
    Then I received status code 400 Bad Request in request to create warehouse detail
    And I received the error message "input price has on the required tag" response in request create warehouse detail
