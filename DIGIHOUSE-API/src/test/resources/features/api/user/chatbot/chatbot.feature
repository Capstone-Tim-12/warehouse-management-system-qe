@Chatbot
Feature: Chatbot
  As a user
  I want to use chatbot
  So that I can be use chatbot

  Background:
    Given I set API endpoint valid for chatbot

  @ScenarioPositive
  Scenario: As a user I can chatbot with a valid path
    When I send request to chatbot
    Then I received status code 200 OK in request chatbot
    And I received message "Success" response in request chatbot

  @ScenarioNegative
  Scenario: As a user I can't chatbot without path
    Given I set API endpoint invalid for chatbot without the path
    When I send request to chatbot no path
    Then I received status code 500 Internal Server Error in request to chatbot
    And I received error message "general error" response in request chatbot

  @ScenarioNegative
  Scenario: As a user I can't use chatbot if I don't fill in the chatbot request
    When I blank the chatbot request
    And I send blank request to chatbot
    Then I received status code 400 Bad Request in request to chatbot
    And I received the error message "input text has on the required tag" response in chatbot
