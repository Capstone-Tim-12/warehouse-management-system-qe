@RentalApplication
Feature: Rental Application
  As a user
  I want to rental application
  So that I can be rental application

  Background:
    Given I set API endpoint valid for rental application

  @ScenarioPositive
  Scenario: As a user I can rental application with a valid path
    When I send request to rental application
    Then I received status code 200 OK in request rental application
    And I received message "Success" response in request rental application

  @ScenarioNegative
  Scenario: As a user I can't rental application without path
    Given I set API endpoint invalid for rental application without the path
    When I send request to rental application no path
    Then I received status code 500 Internal Server Error in request to rental application
    And I received error message "general error" response in request rental application

  @ScenarioNegative
  Scenario: As a user I can't rental application if I don't fill in the rental application request
    When I blank the rental application request
    And I send blank request to rental application
    Then I received status code 400 Bad Request in request to rental application
    And I received the error message "invalid request" response in rental application

  @ScenarioNegative
  Scenario: As a user I can't rental application if the submission date is less than the current date
    When I enter a warehouse ID in rental application
    And I enter a payment schema ID
    And I enter a duration
    And I enter an invalid data entry
    And I send invalid data entry request to rental application
    Then I received status code 400 Bad Request in request to rental application
    And I received the error message "date cannot be less than the current date" response in rental application

