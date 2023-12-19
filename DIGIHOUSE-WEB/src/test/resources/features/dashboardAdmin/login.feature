@Login
Feature: Login
  As an admin
  I want to login
  So that I can be access dashboard

  Background:
    Given I set the endpoint on the login page

  @ScenarioPositive
  Scenario: As an admin I can login with valid credentials
    When I enter a valid email
    And I enter a valid password
    And I tap the Login button
    Then I redirect to dashboard page

  @ScenarioNegative
  Scenario: As an admin I can't login if I don't fill in the login form
    When I enter a valid email
    And I enter a valid password
    And I tap the Login button
    Then I see error message appear "Email or password is required" on login page

  @ScenarioNegative
  Scenario: As an admin I can't login if I don't fill in the email field
    When I enter a valid email
    And I enter a valid password
    And I tap the Login button
    Then I see error message appear "Masukkan Email !" in login page

  @ScenarioNegative
  Scenario: As an admin I can't login if I don't fill in the password field
    When I enter a valid email
    And I blank the password
    And I tap the Login button
    Then I see error message appear "Masukkan Password !" in login page

  @ScenarioNegative
  Scenario: As an admin I can't login with an invalid email
    When I enter an invalid email
    And I enter a valid password
    And I tap the Login button
    Then I see error message appear "Email atau Password tidak valid !" in login page

  @ScenarioNegative
  Scenario: As an admin I can't login with an invalid password
    When I enter a valid email
    And I enter an invalid password
    And I tap the Login button
    Then I see error message appear "Email atau Password tidak valid !" in login page

  @ScenarioNegative
  Scenario: As an admin I can't login with an account that is not register in the database
    When I enter an unregistered email
    And I enter a valid password
    And I tap the Login button
    Then I see error message appear "Email atau Password tidak valid !" in login page

  @ScenarioNegative
  Scenario: As an admin I can't login with an account that is not an admin role
    When I enter an email that is not an admin role
    And I enter a valid password
    And I tap the Login button
    Then I see error message appear "Anda tidak memiliki izin untuk masuk sebagai admin" in login page

  @ScenarioPositive
  Scenario: As an admin I can reset the login form
    When I enter a valid email
    And I enter a valid password
    And I tap the Reset button
    Then I see that the input in each column was deleted on the login page