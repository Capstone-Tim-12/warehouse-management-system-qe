@Register
Feature: Register User
  As a user
  I want to register
  So that I can be login

  Background:
    Given I set API endpoint valid for register new user

  @ScenarioPositive
  Scenario: As a new user I can register by filling a valid data
    When I enter username
    And I enter a email valid format
    And I enter password
    And I send request to register user
    Then I received status code 201 Created register user
    And I received register user data response register user

  @ScenarioNegative
  Scenario: As a new user I can't register without path
    Given I set API endpoint invalid for register user without the path
    When I send request to register user no path
    Then I received status code 401 Unauthorized in request to register user
    And I received error message "invalid token" register response

  @ScenarioNegative
  Scenario: As a new user I can't register if I don't fill in the register request
    When I blank the register request in register
    And I send request to register user with blank register request
    Then I received status code 400 Bad Request in request to register user
    And I received the error message "input password has on the min tag" response

  @ScenarioNegative
  Scenario: As a new user I can't register if I don't fill in the username request
    When I blank the username request
    And I enter a email valid format
    And I enter password
    And I send request to register user with blank username request
    Then I received status code 400 Bad Request in request to register user
    And I received the error message "fullname is required" response

  @ScenarioNegative
  Scenario: As a new user I can't register if I don't fill in the email request
    When I enter username
    And I blank the email request
    And I enter password
    And I send request to register user with blank email request
    Then I received status code 400 Bad Request in request to register user
    And I received the error message "email is required" register response

  @ScenarioNegative
  Scenario: As a new user I can't register if I don't fill in the password request
    When I enter username
    And I enter a email valid format
    And I blank the password request
    And I send request to register user with blank password request
    Then I received status code 400 Bad Request in request to register user
    And I received the error message "password is required" response

  @ScenarioNegative
  Scenario: As a new user I can't register if I fill in email already regist in database
    When I enter username
    And I enter email already regist in database
    And I enter password
    And I send request to register user with email already regist in database request
    Then I received status code 409 Conflict in request to register user
    And I received the error message "email or username already exists" response

  @ScenarioNegative
  Scenario: As a new user I can't register if the email request format is not appropriate (e.g.: missing @)
    When I enter username
    And  I enter email invalid format
    And I enter password
    And I send request to register user with email invalid format request
    Then I received status code 400 Bad Request in request to register user
    And I received the error message "unkown email format" response