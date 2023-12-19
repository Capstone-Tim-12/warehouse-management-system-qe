@TransactionRejected
Feature: Transaction Rejected
  As a user
  I want to transaction rejected
  So that I can be transaction rejected

  @ScenarioPositive
  Scenario: As an admin I can transaction rejected with a valid path
    Given I set API endpoint valid for transaction rejected
    When I send request to transaction rejected
    Then I received status code 200 OK in request transaction rejected
    And I received message "Success" response in request transaction rejected

  @ScenarioNegative
  Scenario: As an admin I can't transaction rejected without path
    Given I set API endpoint invalid for can't transaction rejected without the path
    When I send request to transaction rejected no path
    Then I received status code 500 Internal Server Error in request to transaction rejected
    And I received error message "general error" response in request transaction rejected

  @ScenarioNegative
  Scenario: As an admin I can't transaction rejected with invalid transaction ID
    Given I set API endpoint invalid for can't transaction rejected with invalid transaction ID
    When I send request to transaction rejected with invalid transaction ID
    Then I received status code 404 Not Found in request transaction rejected
    And I received message "Not Found" response in request transaction rejected

  @ScenarioNegative
  Scenario: As an admin I can't transaction rejected if the transaction ID has previously been made
    Given I set API endpoint invalid for can't transaction rejected if the transaction ID has previously been made
    When I send request to transaction rejected with transaction ID has previously been made
    Then I received status code 400 Bad Request in request transaction rejected
    And I received message "status transaction not submission" response in request transaction rejected