package starter.stepdefinitions.admin.manageWarehouse;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.admin.manageWarehouse.UploadPhotoWarehouse;

public class UploadPhotoWarehouseSteps {
    @Steps
    UploadPhotoWarehouse uploadPhotoWarehouse;

    @Given ( "I set API endpoint valid for upload photo warehouse" )
    public void setAPIEndpointValidUploadPhotoWarehouse() {
        uploadPhotoWarehouse.setAPIEndpointValidUploadPhotoWarehouse();
    }

    @When ( "I enter a valid format photo warehouse" )
    public void enterValidFormatPhotoWarehouse() {
        uploadPhotoWarehouse.enterValidFormatPhotoWarehouse();
    }

    @And ( "I send request to upload photo warehouse with a valid path" )
    public void sendRequestUploadPhotoWarehouseWithValidPath() {
        uploadPhotoWarehouse.sendRequestUploadPhotoWarehouseWithValidPath();
    }

    @Then ( "I received status code 200 OK in request upload photo warehouse" )
    public void receivedStatusCode200OKRequestUploadPhotoWarehouse() {
        uploadPhotoWarehouse.receivedStatusCode200OKRequestUploadPhotoWarehouse();
    }

    @And ( "I received message \"Success\" response in request upload photo warehouse" )
    public void receivedMessageSuccessResponseUploadPhotoWarehouse() {
        uploadPhotoWarehouse.receivedMessageSuccessResponseUploadPhotoWarehouse();
    }

    @Given ( "I set API endpoint invalid for upload photo warehouse without the path" )
    public void setAPIEndpointInvalidUploadPhotoWarehouseWithoutPath() {
        uploadPhotoWarehouse.setAPIEndpointInvalidUploadPhotoWarehouseWithoutPath();
    }

    @When ( "I send request to upload photo warehouse no path" )
    public void sendRequestUploadPhotoWarehouseNoPath() {
        uploadPhotoWarehouse.sendRequestUploadPhotoWarehouseNoPath();
    }

    @Then ( "I received status code 500 Internal Server Error in request to upload photo warehouse" )
    public void receivedStatuscode500InternalServerErrorRequestUploadPhotoWarehouse() {
        uploadPhotoWarehouse.receivedStatuscode500InternalServerErrorRequestUploadPhotoWarehouse();
    }

    @And ( "I received error message \"general error\" response in request upload photo warehouse" )
    public void receivedErrorMessageGeneralErrorResponseUploadPhotoWarehouse() {
        uploadPhotoWarehouse.receivedErrorMessageGeneralErrorResponseUploadPhotoWarehouse();
    }

    @When ( "I blank the upload photo warehouse request" )
    public void blankUploadPhotoWarehouseRequest() {
        uploadPhotoWarehouse.blankUploadPhotoWarehouseRequest();
    }

    @And ( "I send request to upload photo warehouse with blank request" )
    public void sendRequestUploadPhotoWarehouseWithBlankRequest() {
        uploadPhotoWarehouse.sendRequestUploadPhotoWarehouseWithBlankRequest();
    }

    @And ( "I received error message \"Internal Server Error\" response in request upload photo warehouse" )
    public void receivedErrorMessageInternalServerErrorResponseUploadPhotoWarehouse() {
        uploadPhotoWarehouse.receivedErrorMessageInternalServerErrorResponseUploadPhotoWarehouse();
    }

    @When ( "I enter a photo warehouse invalid format" )
    public void enterPhotoWarehouseInvalidFormat() {
        uploadPhotoWarehouse.enterPhotoWarehouseInvalidFormat();
    }

    @And ( "I send request to upload photo warehouse with invalid format" )
    public void sendRequestUploadPhotoWarehouseWithInvalidFormat() {
        uploadPhotoWarehouse.sendRequestUploadPhotoWarehouseWithInvalidFormat();
    }

    @Then ( "I received status code 400 Bad Request in request to upload photo warehouse" )
    public void receivedStatusCode400BadRequestInRequestUploadPhotoWarehouse() {
        uploadPhotoWarehouse.receivedStatusCode400BadRequestInRequestUploadPhotoWarehouse();
    }

    @And ( "I received the error message \"only supported file formats are jpg, jpeg and png\" response in upload photo warehouse" )
    public void receivedErrormessageOnlySupportedFileFormatsResponseUploadPhotoWarehouse() {
        uploadPhotoWarehouse.receivedErrormessageOnlySupportedFileFormatsResponseUploadPhotoWarehouse();
    }

    @When ( "I enter a photo warehouse with size more than 5 MB" )
    public void enterPhotoWarehouseWithSizeMoreThan5MB() {
        uploadPhotoWarehouse.enterPhotoWarehouseWithSizeMoreThan5MB();
    }

    @And ( "I send request to upload photo warehouse with size more than 5 MB" )
    public void sendRequestUploadPhotoWarehouseWithSizeMoreThan5MB() {
        uploadPhotoWarehouse.sendRequestUploadPhotoWarehouseWithSizeMoreThan5MB();
    }

    @And ( "I received the error message \"image size cannot be more than 5 MB\" response in upload photo warehouse" )
    public void receivedErrormessageImageSizeCannotBeMoreThan5MBResponseUploadPhotoWarehouse() {
        uploadPhotoWarehouse.receivedErrormessageImageSizeCannotBeMoreThan5MBResponseUploadPhotoWarehouse();
    }

    @When ( "I enter a photo warehouse with more than 6 photo" )
    public void enterPhotoWarehouseWithMoreThan6Photo() {
        uploadPhotoWarehouse.enterPhotoWarehouseWithMoreThan6Photo();
    }

    @And ( "I send request to upload photo warehouse with more than 6 photo" )
    public void sendRequestUploadPhotoWarehouseWithMoreThan6Photo() {
        uploadPhotoWarehouse.sendRequestUploadPhotoWarehouseWithMoreThan6Photo();
    }

    @And ( "I received the error message \"maximum of 6 images permitted\" response in upload photo warehouse" )
    public void receivedErrormessageMaximumOf6ImagesPermittedResponseUploadPhotoWarehouse() {
        uploadPhotoWarehouse.receivedErrormessageMaximumOf6ImagesPermittedResponseUploadPhotoWarehouse();
    }
}
