@UploadPhotoWarehouse
Feature: Upload Photo Warehouse
  As a user
  I want to upload photo warehouse
  So that I can be upload photo warehouse

  Background:
    Given I set API endpoint valid for upload photo warehouse

  @ScenarioPositive
  Scenario: As an admin I can upload photo warehouse with a valid path
    When I enter a valid format photo warehouse
    And I send request to upload photo warehouse with a valid path
    Then I received status code 200 OK in request upload photo warehouse
    And I received message "Success" response in request upload photo warehouse

  @ScenarioNegative
  Scenario: As an admin I can't upload photo warehouse without path
    Given I set API endpoint invalid for upload photo warehouse without the path
    When I send request to upload photo warehouse no path
    Then I received status code 500 Internal Server Error in request to upload photo warehouse
    And I received error message "general error" response in request upload photo warehouse

  @ScenarioNegative
  Scenario: As an admin I can't upload photo warehouse if I don't fill in the upload photo request
    When I blank the upload photo warehouse request
    And I send request to upload photo warehouse with blank request
    Then I received status code 500 Internal Server Error in request to upload photo warehouse
    And I received error message "Internal Server Error" response in request upload photo warehouse

  @ScenarioNegative
  Scenario: As an admin I can't upload photo warehouse if the photo request format is not appropriate (e.g. other than: PNG, JPEG, JPG)
    When I enter a photo warehouse invalid format
    And I send request to upload photo warehouse with invalid format
    Then I received status code 400 Bad Request in request to upload photo warehouse
    And I received the error message "only supported file formats are jpg, jpeg and png" response in upload photo warehouse

  @ScenarioNegative
  Scenario: As an admin I can't upload photo warehouse if size more than 5 MB
    When I enter a photo warehouse with size more than 5 MB
    And I send request to upload photo warehouse with size more than 5 MB
    Then I received status code 400 Bad Request in request to upload photo warehouse
    And I received the error message "image size cannot be more than 5 MB" response in upload photo warehouse

  @ScenarioNegative
  Scenario: As an admin I can't upload photo warehouse if size more than 5 MB
    When I enter a photo warehouse with more than 6 photo
    And I send request to upload photo warehouse with more than 6 photo
    Then I received status code 400 Bad Request in request to upload photo warehouse
    And I received the error message "maximum of 6 images permitted" response in upload photo warehouse
