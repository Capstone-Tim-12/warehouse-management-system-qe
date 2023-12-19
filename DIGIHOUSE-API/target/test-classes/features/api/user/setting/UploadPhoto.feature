@UploadPhoto
Feature: Upload Photo
  As a user
  I want to upload photo
  So that I can be upload photo

  Background:
    Given I set API endpoint valid for upload photo

  @ScenarioPositive
  Scenario: As a user I can upload photo with a valid path
    When I enter a photo
    And I send request to upload photo with a valid path
    Then I received status code 200 OK in request upload photo
    And I received message "Success" response in request upload photo

  @ScenarioNegative
  Scenario: As a user I can't upload photo without path
    Given I set API endpoint invalid for upload photo without the path
    When I send request to upload photo no path
    Then I received status code 500 Internal Server Error in request to upload photo
    And I received error message "general error" response in request upload photo

  @ScenarioNegative
  Scenario: As a user I can't upload photo if I don't fill in the upload photo request
    When I blank the upload photo request
    And I send request to upload photo with blank request
    Then I received status code 400 Bad Request in request to upload photo
    And I received the error message "http: no such file" response in upload photo

  @ScenarioNegative
  Scenario: As a user I can't upload photo if the photo request format is not appropriate (e.g. other than: PNG, JPEG, JPG)
    When I enter a photo invalid format
    And I send request to upload photo with invalid format
    Then I received status code 400 Bad Request in request to upload photo
    And I received the error message "only supported file formats are jpg, jpeg and png" response in upload photo

  @ScenarioNegative
  Scenario: As a user I can't upload photo if size more than 5 MB
    When I enter a photo with size more than 5 MB
    And I send request to upload photo with size more than 5 MB
    Then I received status code 400 Bad Request in request to upload photo
    And I received the error message "image size cannot be more than 5 MB" response in upload photo