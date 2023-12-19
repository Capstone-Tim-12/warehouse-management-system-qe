@RegisterDataUser
Feature: Register Data User
  As a user
  I want to regist user data
  So that I can be a transaction in app warehouse

  Background:
    Given I set API endpoint valid for register data user

  @ScenarioPositive
  Scenario: As a user I can register data user with a valid input
    When I enter a valid input register data user
    And I send request to register data user
    Then I received status code 201 Created in request register data user
    And I received register data user and message "Success" response in request register data user

  @ScenarioNegative
  Scenario: As a user I can't register data user without path
    Given I set API endpoint invalid for register data user without the path
    When I send request to verification OTP no path
    Then I received status code 401 Unauthorized in request to register data user
    And I received error message "invalid token" response in request to register data user

  @ScenarioNegative
  Scenario: As a user I can't register data user if I don't fill in the register data user request
    When I blank the register data user request
    And I send request to register data user with blank register request
    Then I received status code 400 Bad Request in request to register data user
    And I received the error message "invalid request" response in request register data user

  @ScenarioNegative
  Scenario: As a user I can't register data user with an invalid email
    When I enter an invalid email for register data user
    And I send request to register data user with invalid email request
    Then I received status code 404 Bad Request in request register data user
    And I received an error message "email not found" response in request register data user
