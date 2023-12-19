@ReportTransaction
Feature: Report Transaction
  As an admin
  I want to report transaction
  So that I can report transaction

  Background:
    Given I set the endpoint on the login page

  @ScenarioPositive
  Scenario: As an admin I can search for report transaction data based on transactions type "Weekly"
    When I enter a valid email
    And I enter a valid password
    And I tap the Login button
    And I tap the Transaction button
    And I tap the Report Transaction button
    And I choose the transaction type
    And I choose the transaction type "Weekly"
    Then I see the report transaction data was looking for based on transaction type weekly on the report transaction page

  @ScenarioPositive
  Scenario: As an admin I can search for report transaction data based on transactions type "Monthly"
    When I enter a valid email
    And I enter a valid password
    And I tap the Login button
    And I tap the Transaction button
    And I tap the Report Transaction button
    And I choose the transaction type
    And I choose the transaction type "Monthly"
    Then I see the report transaction data was looking for based on transaction type monthly on the report transaction page

  @ScenarioPositive
  Scenario: As an admin I can search for report transaction data based on transactions type "Annual"
    When I enter a valid email
    And I enter a valid password
    And I tap the Login button
    And I tap the Transaction button
    And I tap the Report Transaction button
    And I choose the transaction type
    And I choose the transaction type "Annual"
    Then I see the report transaction data was looking for based on transaction type annual on the report transaction page

  @ScenarioPositive
  Scenario: As an admin I can search for transaction data with a valid keyword
    When I enter a valid email
    And I enter a valid password
    And I tap the Login button
    And I tap the Transaction button
    And I tap the Report Transaction button
    And I enter a valid keyword in the transaction data
    And I tap the icon search in a field search the report transaction
    Then I see the transaction data was looking for on the report transaction page

  @ScenarioNegative
  Scenario: As an admin I can't search for transaction with invalid keywords (e.g.: using unique characters)
    When I enter a valid email
    And I enter a valid password
    And I tap the Login button
    And I tap the Transaction button
    And I tap the Report Transaction button
    And I enter an invalid keyword in the transaction data
    And I tap the icon search in a field search the report transaction
    Then I see the message appears "no data is displayed" on the report transaction page
