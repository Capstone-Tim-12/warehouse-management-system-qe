@LandingPage
Feature: Landing Page
  As a user
  I want to landing page
  So that I can be access landing page

  Background:
    Given I set the endpoint valid on the landing page

  @ScenarioPositiveAbout
  Scenario: As a user I can see the Tentang on the landing page of DigiHouse
    When I tap the Tentang button
    Then I redirected to the Tentang section

  @ScenarioPositiveFAQ
  Scenario: As a user I can see the FAQ on the landing page of DigiHouse
    When I tap the FAQ button
    Then I redirected to the FAQ section

  @ScenarioPositiveContact
  Scenario: As a user I can see the Kontak on the landing page of DigiHouse
    When I tap the Kontak button
    Then I redirected to the Kontak section

  @ScenarioPositiveHome
  Scenario: As a user I can see the Beranda on the landing page of DigiHouse
    When I tap the Beranda button
    Then I redirected to the Beranda section

  @ScenarioChatbotBahasa
  Scenario: As a user I can used feature chatbot with bahasa language
    When I tap the Chatbot button
    And I enter a message with bahasa language
    And I tap the Send button for message request in chatbot
    Then I received message respond bot with bahasa language in chatbot

  @ScenarioChatbotEnglish
  Scenario: As a user I can used feature chatbot with english language
    When I tap the Chatbot button
    And I enter a message with english language
    And I tap the Send button for message request in chatbot
    Then I received message respond bot with english language in chatbot
