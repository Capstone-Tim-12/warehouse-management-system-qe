@UpdateSetting
Feature: Update Setting
  As a user
  I want to update setting
  So that I can be update setting

  Background:
    Given I set API endpoint valid for update setting

  @ScenarioPositive
  Scenario: As an admin I can update setting with a valid path
    When I enter a valid update setting request
    And I send request to update setting
    Then I received status code 200 OK in request update setting
    And I received message "Success" response in request update setting

  @ScenarioNegative
  Scenario: As an admin I can't update setting without path
    Given I set API endpoint invalid for update setting without the path
    When I send request to update setting no path
    Then I received status code 500 Internal Server Error in request to update setting
    And I received error message "general error" response in request update setting

  @ScenarioNegative
  Scenario: As an admin I can't update setting if I don't fill in the update setting request
    When I blank the update setting request
    And I send blank request to update setting
    Then I received status code 400 Bad Request in request to update setting
    And I received the error message "input password has on the required tag" response in update setting

  @ScenarioNegative
  Scenario: As an admin I can't update setting if I don't fill in the username request
    When I blank the username request for update setting
    And I enter a email valid format
    And I enter password for update setting
    And I send request to update setting user with blank username request
    Then I received status code 400 Bad Request in request to update setting
    And I received the error message "input username has on the required tag" response in update setting

  @ScenarioNegative
  Scenario: As an admin I can't update setting if I don't fill in the email request
    When I enter a username for update setting
    And I blank the email request for update setting
    And I enter password for update setting
    And I send request to update setting user with blank email request
    Then I received status code 400 Bad Request in request to update setting
    And I received the error message "input email has on the required tag" response in update setting

  @ScenarioNegative
  Scenario: As an admin I can't update setting if I don't fill in the password request
    When I enter a username for update setting
    And I enter a email valid format for update setting
    And I blank the password for update setting
    And I send request to update setting user with blank password request
    Then I received status code 400 Bad Request in request to update setting
    And I received the error message "input password has on the required tag" response in update setting