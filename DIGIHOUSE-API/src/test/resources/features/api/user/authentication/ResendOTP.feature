@ResendOTP
Feature: Resend OTP
  As a user
  I want to resend OTP
  So that I can be receive code OTP

  Background:
    Given I set API endpoint valid for resend OTP

  @ScenarioPositive
  Scenario: As a user I can resend OTP with a valid email
    When I enter a valid email for resend OTP
    And I send request to resend OTP with valid email
    Then I received status code 200 OK in request resend OTP
    And I received message "Success" response resend OTP
    And I received email message code OTP in resend OTP

  @ScenarioNegative
  Scenario: As a user I can't resend OTP without path
    Given I set API endpoint invalid for resend OTP without the path
    When I send request to resend OTP no path
    Then I received status code 401 Unauthorized in request to resend OTP
    And I received error message "invalid token" response in request resend OTP

  @ScenarioNegative
  Scenario: As a user I can't resend OTP if I don't fill in the resend OTP request
    When I blank the resend OTP request
    And I send request to resend OTP with blank resend OTP
    Then I received status code 400 Bad Request in request to resend OTP
    And I received the error message "email is empty" response in resend OTP

  @ScenarioNegative
  Scenario: As a user I can't resend OTP with an invalid email
    When I enter an invalid email for resend OTP
    And I send request to resend OTP with invalid email
    Then I received status code 404 Bad Request in request resend OTP
    And I received an error message "email not found" response in request resend OTP