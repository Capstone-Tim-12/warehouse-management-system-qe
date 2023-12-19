@UpdateUsername
Feature: Update Username
  As a user
  I want to update username
  So that I can be update username

  Background:
    Given I set API endpoint valid for update username

  @ScenarioPositive
  Scenario: As a user I can update username with a valid path
    When I enter a username
    And I send request to update username
    Then I received status code 200 OK in request update username
    And I received message "Success" response in request update username

  @ScenarioNegative
  Scenario: As a user I can't update username without path
    Given I set API endpoint invalid for update username without the path
    When I send request to update username no path
    Then I received status code 500 Internal Server Error in request to update username
    And I received error message "general error" response in request update username

  @ScenarioNegative
  Scenario: As a user I can't update username if I don't fill in the update username request
    When I blank the update username request
    And I send blank request to update username
    Then I received status code 400 Bad Request in request to update username
    And I received the error message "username is empty" response in update username