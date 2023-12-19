@UpdatePhotoProfile
Feature: Update Photo Profile
  As a user
  I want to update photo profile
  So that I can be update photo profile

  Background:
    Given I set API endpoint valid for update photo profile

  @ScenarioPositive
  Scenario: As a user I can update photo profile with a valid path
    When I enter a url image
    And I send request to update photo profile
    Then I received status code 200 OK in request update photo profile
    And I received message "Success" response in request update photo profile

  @ScenarioNegative
  Scenario: As a user I can't update photo profile without path
    Given I set API endpoint invalid for update photo profile without the path
    When I send request to update photo profile no path
    Then I received status code 500 Internal Server Error in request to update photo profile
    And I received error message "general error" response in request update photo profile

  @ScenarioNegative
  Scenario: As a user I can't update photo profile if I don't fill in the update photo profile request
    When I blank the update photo profile request
    And I send request to update photo profile with blank update photo profile
    Then I received status code 400 Bad Request in request to update photo profile
    And I received the error message "input urlimage has on the url tag" response in update photo profile