@ManageUser
Feature: Manage User
  As an admin
  I want to manage user
  So that I can be access manage user

  Background:
    Given I set the endpoint on the login page

  @ScenarioPositive
  Scenario: As an admin I can search for user data with a valid keyword
    When I enter a valid email
    And I enter a valid password
    And I tap the Login button
    And I tap the Manage User button
    And I enter a valid keyword in the user data
    And I tap the icon search in a field search
    Then I see the user data was looking for on the manage user page

  @ScenarioNegative
  Scenario: As an admin I can't search for user with invalid keywords (e.g.: using unique characters)
    When I enter a valid email
    And I enter a valid password
    And I tap the Login button
    And I tap the Manage User button
    And I enter a invalid keyword in the user data
    And I tap the icon search in a field search
    Then I see the message appears "no data is displayed"

  @ScenarioPositive
  Scenario: As an admin I can see detail for user data if tap the Lihat button
    When I enter a valid email
    And I enter a valid password
    And I tap the Login button
    And I tap the Manage User button
    And I tap the Lihat button
    Then I redirected to the detail user page


  @ScenarioPositive
  Scenario: As an admin I can delete user data via the user details page
    When I enter a valid email
    And I enter a valid password
    And I tap the Login button
    And I tap the Manage User button
    And I tap the Lihat button
    And I tap the Hapus button in detail user page
    And I tap the Hapus button confirmation in detail user page
    Then I redirected to the detail user page
    And I successfully delete user data

  @ScenarioNegative
  Scenario: As an admin I can't delete user data via the user details page if I tap Cancel button
    When I enter a valid email
    And I enter a valid password
    And I tap the Login button
    And I tap the Manage User button
    And I tap the Lihat button
    And I tap the Hapus button in detail user page
    And I tap the Cancel button confirmation in detail user page
    Then I redirected to the detail user page
    And I still on the user details page

  @ScenarioPositive
  Scenario: As an admin I can delete user data if tap the Hapus button
    When I enter a valid email
    And I enter a valid password
    And I tap the Login button
    And I tap the Manage User button
    And I tap the Hapus button
    And I tap the Hapus button in the popup confirmation
    Then I successfully delete user data

  @ScenarioNegative
  Scenario: As an admin I can't delete user data if I Cancel the delete user data confirmation popup
    When I enter a valid email
    And I enter a valid password
    And I tap the Login button
    And I tap the Manage User button
    And I tap the Hapus button
    And I tap the Cancel icon in the popup confirmation
    Then I back to the user list page
