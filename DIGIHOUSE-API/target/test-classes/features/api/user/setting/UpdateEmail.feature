@UpdateEmail
Feature: Update Email
  As a user
  I want to update email
  So that I can be update email

  Background:
    Given I set API endpoint valid for update email

  @ScenarioNegative
  Scenario: As a user I can't update email without path
    Given I set API endpoint invalid for update email without the path
    When I send request to update email no path
    Then I received status code 500 Internal Server Error in request to update email
    And I received error message "general error" response in request update email

  @ScenarioNegative
  Scenario: As a user I can't update email if I don't fill in the update email request
    When I blank the update email request
    And I send blank request to update email
    Then I received status code 400 Bad Request in request to update email
    And I received the error message "input email has on the required tag" response in update email

  @ScenarioNegative
  Scenario: As a user I can't update email if I fill in email already regist in database
    When I enter email already regist in database for update email
    And I send request to update email with email already existing
    Then I received status code 500 Internal Server Error in request to update email
    And I received the error message "email is already existing" response in update email

  @ScenarioNegative
  Scenario: As a user I can't update email if the email request format is not appropriate (e.g.: missing @)
    When I enter a email invalid format for update email
    And I send request to update email with invalid format email
    Then I received status code 400 Bad Request in request to update email
    And I received the error message "input email has on the email tag" response in update email