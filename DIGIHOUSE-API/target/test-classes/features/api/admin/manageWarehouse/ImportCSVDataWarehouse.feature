@ImportCSVDataWarehouse
Feature: Import CSV Data Warehouse
  As a user
  I want to import CSV data warehouse
  So that I can be import CSV data warehouse

  Background:
    Given I set API endpoint valid for import CSV data warehouse

  @ScenarioPositive
  Scenario: As an admin I can import CSV data warehouse with a valid path
    When I enter a valid format file CSV
    And I send request to import CSV data warehouse a valid path
    Then I received status code 200 OK in request import CSV data warehouse
    And I received message "Success" response in request import CSV data warehouse

  @ScenarioNegative
  Scenario: As an admin I can't import CSV data warehouse without path
    Given I set API endpoint invalid for import CSV data warehouse without the path
    When I send request to import CSV data warehouse no path
    Then I received status code 500 Internal Server Error in request to import CSV data warehouse
    And I received error message "general error" response in request import CSV data warehouse

  @ScenarioNegative
  Scenario: As an admin I can't import CSV data warehouse if I don't fill in the import CSV data warehouse request
    When I blank the import CSV data warehouse request
    And I send request to import CSV data warehouse with blank request
    Then I received status code 400 Bad Request in request to import CSV data warehouse
    And I received the error message "request Content Type is not multipart or form data" response in import CSV data warehouse

  @ScenarioNegative
  Scenario: As an admin I can't import CSV data warehouse if the CSV request format is not appropriate (e.g. other than: format file CSV)
    When I enter an invalid format file CSV
    And I send request to import CSV data warehouse with invalid format
    Then I received status code 400 Bad Request in request to import CSV data warehouse
    And I received the error message "invalid CSV file" response in import CSV data warehouse