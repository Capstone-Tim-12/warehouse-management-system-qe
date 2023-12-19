@PaymentCheckout
Feature: Payment Checkout
  As a user
  I want to payment checkout
  So that I can be payment checkout

  Background:
    Given I set API endpoint valid for payment checkout

  @ScenarioPositive
  Scenario: As a user I can payment checkout with a valid path
    When I enter a valid payment method ID
    And I enter a valid installment ID and the installment status "has not been paid"
    And I enter a valid data payment bank code
    And I send request to payment checkout
    Then I received status code 200 OK in request payment checkout
    And I received message "Success" response in request payment checkout

  @ScenarioNegative
  Scenario: As a user I can't payment checkout without path
    Given I set API endpoint invalid for payment checkout without the path
    When I send request to payment checkout no path
    Then I received status code 500 Internal Server Error in request to payment checkout
    And I received error message "general error" response in request payment checkout

  @ScenarioNegative
  Scenario: As a user I can't payment checkout if I don't fill in the payment checkout request
    When I blank the payment checkout request
    And I send blank request to payment checkout
    Then I received status code 400 Bad Request in request to payment checkout
    And I received the error message "invalid request" response in payment checkout

  @ScenarioNegative
  Scenario: As a user I can't payment checkout if I don't fill in the payment method ID request
    When I blank the payment method ID request in payment checkout
    And I enter a valid installment ID and the installment status "has not been paid"
    And I enter a valid data payment bank code
    And I send blank payment method ID request to payment checkout
    Then I received status code 400 Bad Request in request to payment checkout
    And I received the error message "invalid request" response in payment checkout

  @ScenarioNegative
  Scenario: As a user I can't payment checkout if I don't fill in the installment ID request
    When I enter a valid payment method ID
    And I blank the installment ID request in payment checkout
    And I enter a valid data payment bank code
    And I send blank installment ID request to payment checkout
    Then I received status code 400 Bad Request in request to payment checkout
    And I received the error message "invalid request" response in payment checkout

  @ScenarioNegative
  Scenario: As a user I can't payment checkout if I don't fill in the data payment bank code request
    When I enter a valid payment method ID
    And I enter a valid installment ID and the installment status "has not been paid"
    And I blank the data payment bank code request in payment checkout
    And I send blank data payment bank code request to payment checkout
    Then I received status code 400 Bad Request in request to payment checkout
    And I received the error message "payment is due please contant admin" response in payment checkout

  @ScenarioNegative
  Scenario: As a user I can't payment checkout if the installment ID payment has previously been made
    When I enter a valid payment method ID
    And I enter a valid installment ID and the installment status "has been paid or wait for payment"
    And I enter a valid data payment bank code
    And I send request valid installment ID and installment status "has been paid or wait for payment" to payment checkout
    Then I received status code 400 Bad Request in request to payment checkout
    And I received the error message "Please make sure the previous payment has been completed" response in payment checkout
