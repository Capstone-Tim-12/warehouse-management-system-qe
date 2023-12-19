@SettingAccount
Feature: Setting Account
  As an admin
  I want to setting account
  So that I can setting account

  Background:
    Given I set the endpoint on the login page

  @ScenarioPositive
  Scenario: As an admin I can setting account update with a valid input
    When I enter a valid email
    And I enter a valid password
    And I tap the Login button
    And I tap the Setting button
    And I enter a name update
    And I enter a email update
    And I enter a password update
    And I tap the Simpan button
    Then I received message appear "SUCCESS UPDATE USER" in setting account update page

  @ScenarioNegative
  Scenario: As an admin I can't setting account update if I blank in the setting account update form
    When I enter a valid email
    And I enter a valid password
    And I tap the Login button
    And I tap the Setting button
    And I blank the name update
    And I blank the email update
    And I blank the password update
    And I tap the Simpan button
    Then I received error message appear "Masukkan Password!" in setting account update page

  @ScenarioNegative
  Scenario: As an admin I can't setting account update if I don't fill in the name field
    When I enter a valid email
    And I enter a valid password
    And I tap the Login button
    And I tap the Setting button
    And I blank the name update
    And I enter a email update
    And I enter a password update
    And I tap the Simpan button
    Then I received error message appear "FAILED UPDATE USER" in setting account update page

  @ScenarioNegative
  Scenario: As an admin I can't setting account update if I don't fill in the email field
    When I enter a valid email
    And I enter a valid password
    And I tap the Login button
    And I tap the Setting button
    And I enter a name update
    And I blank the email update
    And I enter a password update
    And I tap the Simpan button
    Then I received error message appear "FAILED UPDATE USER" in setting account update page

  @ScenarioNegative
  Scenario: As an admin I can't setting account update if I don't fill in the password field
    When I enter a valid email
    And I enter a valid password
    And I tap the Login button
    And I tap the Setting button
    And I enter a name update
    And I enter a email update
    And I blank the password update
    And I tap the Simpan button
    Then I received error message appear "Masukkan Password!" in setting account update page
