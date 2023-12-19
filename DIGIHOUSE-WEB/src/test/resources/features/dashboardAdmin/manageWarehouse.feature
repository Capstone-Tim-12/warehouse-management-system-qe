@ManageWarehouse
Feature: Manage Warehouse
  As an admin
  I want to manage warehouse
  So that I can be access manage warehouse

  Background:
    Given I set the endpoint on the login page

  @ScenarioPositive
  Scenario: As an admin I can search for warehouse data with a valid keyword
    When I enter a valid email
    And I enter a valid password
    And I tap the Login button
    And I tap the Manage Warehouse button
    And I enter a valid keyword in the warehouse data
    And I tap the icon search in manage warehouse
    Then I see the warehouse data was looking for on the manage warehouse page

  @ScenarioNegative
  Scenario: As an admin I can't search for warehouse with invalid keywords (e.g.: using unique characters)
    When I enter a valid email
    And I enter a valid password
    And I tap the Login button
    And I tap the Manage Warehouse button
    And I enter a invalid keyword in the warehouse data
    And I tap the icon search in manage warehouse
    Then I see the message appears "no data is displayed" on the manage warehouse

  @ScenarioPositive
  Scenario: As an admin I can create new warehouse with a valid input
    When I enter a valid email
    And I enter a valid password
    And I tap the Login button
    And I tap the Manage Warehouse button
    And I tap the Add Warehouse button
    And I enter name warehouse
    And I enter description warehouse
    And I enter province
    And I enter regency
    And I enter district
    And I enter address
    And I enter surface area
    And I enter building area
    And I enter size
    And I enter price
    And I enter name owner
    And I enter number phone
    And I enter longitute
    And I enter latitude
    And I enter picture
    And I tap the Submit button
    Then I successfully created a new warehouse
    And I received message appear Data warehouse berhasil ditambahkan

  @ScenarioNegative
  Scenario: As an admin I can't create new warehouse with a blank input
    When I enter a valid email
    And I enter a valid password
    And I tap the Login button
    And I tap the Manage Warehouse button
    And I tap the Add Warehouse button
    And I blank name warehouse
    And I blank description warehouse
    And I blank province
    And I blank regency
    And I blank district
    And I blank address
    And I blank surface area
    And I blank building area
    And I blank size
    And I blank price
    And I blank name owner
    And I blank number phone
    And I blank longitute
    And I blank latitude
    And I blank picture
    And I tap the Submit button
    Then I received message appear "Nama Gudang Tidak boleh kosong"

  @ScenarioPositive
  Scenario: As an admin I can update warehouse with a valid input
    When I enter a valid email
    And I enter a valid password
    And I tap the Login button
    And I tap the Manage Warehouse button
    And I tap the Option Edit button
    And I tap the Edit button
    And I update name warehouse
    And I update description warehouse
    And I update province
    And I update regency
    And I update district
    And I update address
    And I update surface area
    And I update building area
    And I update size
    And I update price
    And I update name owner
    And I update number phone
    And I update longitute
    And I update latitude
    And I update picture
    And I tap the Submit button
    Then I successfully update warehouse
    And I received message appear "Data warehouse berhasil diedit"

  @ScenarioNegative
  Scenario: As an admin I can't edit warehouse with a blank update input
    When I enter a valid email
    And I enter a valid password
    And I tap the Login button
    And I tap the Manage Warehouse button
    And I tap the Option Edit button
    And I tap the Edit button
    And I blank update name warehouse
    And I blank update description warehouse
    And I blank update province
    And I blank update regency
    And I blank update district
    And I blank update address
    And I blank update surface area
    And I blank update building area
    And I blank update size
    And I blank update price
    And I blank update name owner
    And I blank update number phone
    And I blank update longitute
    And I blank update latitude
    And I blank update picture
    And I tap the Submit button
    Then I received message appear "Nama Gudang Tidak boleh kosong"

  @ScenarioPositive
  Scenario: As an admin I can delete warehouse if tap the OK button confirmation
    When I enter a valid email
    And I enter a valid password
    And I tap the Login button
    And I tap the Manage Warehouse button
    And I tap the Option Edit button
    And I tap the Delete warehouse button
    And I tap the OK button
    Then I successfully delete warehouse data
    And I received message appear "Gudang Berhasil dihapus"

  @ScenarioNegative
  Scenario: As an admin I can't delete warehouse if tap the Cancel button confirmation
    When I enter a valid email
    And I enter a valid password
    And I tap the Login button
    And I tap the Manage Warehouse button
    And I tap the Option Edit button
    And I tap the Delete warehouse button
    And I tap the Cancel button
    Then I still on the manage warehouse page

