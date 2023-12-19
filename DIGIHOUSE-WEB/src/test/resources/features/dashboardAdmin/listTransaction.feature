@ListTransaction
Feature: List Transaction
  As an admin
  I want to list transaction
  So that I can list transaction

  Background:
    Given I set the endpoint on the login page

  @ScenarioPositive
  Scenario: As an admin I can search for transaction data based on locations
    When I enter a valid email
    And I enter a valid password
    And I tap the Login button
    And I tap the Transaction button
    And I tap the List Transaction button
    And I tap the select location
    And I choose the location
    Then I see the transaction data was looking for based on location on the list transaction page

  @ScenarioPositive
  Scenario: As an admin I can search for transaction data based on status transactions "Need Approval"
    When I enter a valid email
    And I enter a valid password
    And I tap the Login button
    And I tap the Transaction button
    And I tap the List Transaction button
    And I tap the select status transaction
    And I choose the status transaction "Need Approval"
    Then I see the transaction data was looking for based on status transaction need approval on the list transaction page

  @ScenarioPositive
  Scenario: As an admin I can search for transaction data based on status transactions "Approved"
    When I enter a valid email
    And I enter a valid password
    And I tap the Login button
    And I tap the Transaction button
    And I tap the List Transaction button
    And I choose the status transaction "Approved"
    Then I see the transaction data was looking for based on status transaction approved on the list transaction page

  @ScenarioPositive
  Scenario: As an admin I can search for transaction data based on status transactions "Rejected"
    When I enter a valid email
    And I enter a valid password
    And I tap the Login button
    And I tap the Transaction button
    And I tap the List Transaction button
    And I choose the status transaction "Rejected"
    Then I see the transaction data was looking for based on status transaction rejected on the list transaction page

  @ScenarioPositive
  Scenario: As an admin I can approve transaction data if I tap the Status button
    When I enter a valid email
    And I enter a valid password
    And I tap the Login button
    And I tap the Transaction button
    And I tap the List Transaction button
    And I tap the Status button
    And I tap the Terima button
    Then I successfully approved the transaction data


  @ScenarioNegative
  Scenario: As an admin I can reject transaction data if I tap the Status button
    When I enter a valid email
    And I enter a valid password
    And I tap the Login button
    And I tap the Transaction button
    And I tap the List Transaction button
    And I tap the Status button
    And I tap the Tolak button
    And I tap the select reason
    And I choose the reason
    And I tap the Kirim button
    Then I successfully rejected the transaction data


