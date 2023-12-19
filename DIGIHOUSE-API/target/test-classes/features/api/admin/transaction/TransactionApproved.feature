@TransactionApproved
Feature: Transaction Approved
  As a user
  I want to transaction approved
  So that I can be transaction approved

  @ScenarioPositive
  Scenario: As an admin I can transaction approved with a valid path
    Given I set API endpoint valid for transaction approved
    When I send request to transaction approved
    Then I received status code 200 OK in request transaction approved
    And I received message "Success" response in request transaction approved

  @ScenarioNegative
  Scenario: As an admin I can't transaction approved without path
    Given I set API endpoint invalid for can't transaction approved without the path
    When I send request to transaction approved no path
    Then I received status code 500 Internal Server Error in request to transaction approved
    And I received error message "general error" response in request transaction approved

  @ScenarioNegative
  Scenario: As an admin I can't transaction approved with invalid transaction ID
    Given I set API endpoint invalid for can't transaction approved with invalid transaction ID
    When I send request to transaction approved with invalid transaction ID
    Then I received status code 404 Not Found in request transaction approved
    And I received message "Not Found" response in request transaction approved

  @ScenarioNegative
  Scenario: As an admin I can't transaction approved if the transaction ID has previously been made
    Given I set API endpoint invalid for can't transaction approved if the transaction ID has previously been made
    When I send request to transaction approved with transaction ID has previously been made
    Then I received status code 400 Bad Request in request transaction approved
    And I received message "status transaction not submission" response in request transaction approved