@CreateNewFavorite
Feature: Create New Favorite
  As a user
  I want to create new favorite
  So that I can be create new favorite

  Background:
    Given I set API endpoint valid for create new favorite

  @ScenarioPositive
  Scenario: As a user I can create new favorite with a valid path
    When I enter a warehouse ID in create new favorite
    And I send request to create new favorite
    Then I received status code 201 Created in request create new favorite
    And I received message "Success" response in request create new favorite

  @ScenarioNegative
  Scenario: As a user I can't create new favorite without path
    Given I set API endpoint invalid for create new favorite without the path
    When I send request to create new favorite no path
    Then I received status code 500 Internal Server Error in request to create new favorite
    And I received error message "general error" response in request create new favorite

  @ScenarioNegative
  Scenario: As a user I can't create new favorite if I don't fill in the create new favorite request
    When I blank the warehouse ID request
    And I send blank request to create new favorite
    Then I received status code 400 Bad Request in request to create new favorite
    And I received the error message "invalid request" response in create new favorite
