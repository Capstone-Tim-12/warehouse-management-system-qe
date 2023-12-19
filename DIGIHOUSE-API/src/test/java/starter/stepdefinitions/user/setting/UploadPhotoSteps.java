package starter.stepdefinitions.user.setting;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.user.setting.UploadPhoto;

public class UploadPhotoSteps {
    @Steps
    UploadPhoto uploadPhoto;

    @Given ( "I set API endpoint valid for upload photo" )
    public void setAPIEndpointValidUploadPhoto() {
        uploadPhoto.setAPIEndpointValidUploadPhoto();
    }

    @When ( "I enter a photo" )
    public void enterPhoto() {
        uploadPhoto.enterPhoto();
    }

    @And ( "I send request to upload photo with a valid path" )
    public void sendRequestUploadPhotoWithValidPath() {
        uploadPhoto.sendRequestUploadPhotoWithValidPath();
    }

    @Then ( "I received status code 200 OK in request upload photo" )
    public void receivedStatusCode200OKRequestUploadPhoto() {
        uploadPhoto.receivedStatusCode200OKRequestUploadPhoto();
    }

    @And ( "I received message \"Success\" response in request upload photo" )
    public void receivedMessageSuccessResponseUploadPhoto() {
        uploadPhoto.receivedMessageSuccessResponseUploadPhoto();
    }

    @Given ( "I set API endpoint invalid for upload photo without the path" )
    public void setAPIEndpointInvalidUploadPhotoWithoutPath() {
        uploadPhoto.setAPIEndpointInvalidUploadPhotoWithoutPath();
    }

    @When ( "I send request to upload photo no path" )
    public void sendRequestUploadPhotoNoPath() {
        uploadPhoto.sendRequestUploadPhotoNoPath();
    }

    @Then ( "I received status code 500 Internal Server Error in request to upload photo" )
    public void receivedStatusCode500InternalServerErrorRequestUploadPhoto() {
        uploadPhoto.receivedStatusCode500InternalServerErrorRequestUploadPhoto();
    }

    @And ( "I received error message \"general error\" response in request upload photo" )
    public void receivedErrorMessageGeneralErrorResponseUploadPhoto() {
        uploadPhoto.receivedErrorMessageGeneralErrorResponseUploadPhoto();
    }

    @When ( "I blank the upload photo request" )
    public void blankUploadPhotoRequest() {
        uploadPhoto.blankUploadPhotoRequest();
    }

    @And ( "I send request to upload photo with blank request" )
    public void sendRequestUploadPhotoWithBlankRequest() {
        uploadPhoto.sendRequestUploadPhotoWithBlankRequest();
    }

    @Then ( "I received status code 400 Bad Request in request to upload photo" )
    public void receivedStatusCode400BadRequestUploadPhoto() {
        uploadPhoto.receivedStatusCode400BadRequestUploadPhoto();
    }

    @And ( "I received the error message \"http: no such file\" response in upload photo" )
    public void receivedErrorMessageNoSuchFileResponseUploadPhoto() {
        uploadPhoto.receivedErrorMessageNoSuchFileResponseUploadPhoto();
    }

    @When ( "I enter a photo invalid format" )
    public void enterPhotoInvalidFormat() {
        uploadPhoto.enterPhotoInvalidFormat();
    }

    @And ( "I send request to upload photo with invalid format" )
    public void sendRequestUploadPhotoWithInvalidFormat() {
        uploadPhoto.sendRequestUploadPhotoWithInvalidFormat();
    }

    @And ( "I received the error message \"only supported file formats are jpg, jpeg and png\" response in upload photo" )
    public void receivedErrorMessageOnlySupportedFileFormatsAreJPGResponseUploadPhoto() {
        uploadPhoto.receivedErrorMessageOnlySupportedFileFormatsAreJPGResponseUploadPhoto();
    }

    @When ( "I enter a photo with size more than 5 MB" )
    public void enterPhotoWithSizeMoreThan5MB() {
        uploadPhoto.enterPhotoWithSizeMoreThan5MB();
    }

    @And ( "I send request to upload photo with size more than 5 MB" )
    public void sendRequestUploadPhotoWithSizeMoreThan5MB() {
        uploadPhoto.sendRequestUploadPhotoWithSizeMoreThan5MB();
    }

    @And ( "I received the error message \"image size cannot be more than 5 MB\" response in upload photo" )
    public void receivedErrorMessageImageSizeCannotBeMoreThan5MBResponseUploadPhoto() {
        uploadPhoto.receivedErrorMessageImageSizeCannotBeMoreThan5MBResponseUploadPhoto();
    }
}
