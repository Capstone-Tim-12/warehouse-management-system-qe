package starter.stepdefinitions.user.setting;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.user.setting.UpdatePhotoProfile;

public class UpdatePhotoProfileSteps {
    @Steps
    UpdatePhotoProfile updatePhotoProfile;

    @Given ( "I set API endpoint valid for update photo profile" )
    public void setAPIEndpointValidUpdatePhotoProfile() {
        updatePhotoProfile.setAPIEndpointValidUpdatePhotoProfile();
    }

    @When ( "I enter a url image" )
    public void enterURLImage() {
        updatePhotoProfile.enterURLImage();
    }

    @And ( "I send request to update photo profile" )
    public void sendRequestUpdatePhotoProfile() {
        updatePhotoProfile.sendRequestUpdatePhotoProfile();
    }

    @Then ( "I received status code 200 OK in request update photo profile" )
    public void receivedStatusCode200OKRequestUpdatePhotoProfile() {
        updatePhotoProfile.receivedStatusCode200OKRequestUpdatePhotoProfile();
    }

    @And ( "I received message \"Success\" response in request update photo profile" )
    public void receivedMessageSuccessResponseUpdatePhotoProfile() {
        updatePhotoProfile.receivedMessageSuccessResponseUpdatePhotoProfile();
    }

    @Given ( "I set API endpoint invalid for update photo profile without the path" )
    public void setAPIEndpointInvalidUpdatePhotoProfileWithoutPath() {
        updatePhotoProfile.setAPIEndpointInvalidUpdatePhotoProfileWithoutPath();
    }

    @When ( "I send request to update photo profile no path" )
    public void sendRequestUpdatePhotoProfileNoPath() {
        updatePhotoProfile.sendRequestUpdatePhotoProfileNoPath();
    }

    @Then ( "I received status code 500 Internal Server Error in request to update photo profile" )
    public void receivedStatusCode500InternalServerErrorRequestUpdatePhotoProfile() {
        updatePhotoProfile.receivedStatusCode500InternalServerErrorRequestUpdatePhotoProfile();
    }

    @And ( "I received error message \"general error\" response in request update photo profile" )
    public void receivedErrorMessageGeneralErrorResponseUpdatePhotoProfile() {
        updatePhotoProfile.receivedErrorMessageGeneralErrorResponseUpdatePhotoProfile();
    }

    @When ( "I blank the update photo profile request" )
    public void blankUpdatePhotoProfileRequest() {
        updatePhotoProfile.blankUpdatePhotoProfileRequest();
    }

    @And ( "I send request to update photo profile with blank update photo profile" )
    public void sendRequestUpdatePhotoProfileWithBlankUpdatePhotoProfile() {
        updatePhotoProfile.sendRequestUpdatePhotoProfileWithBlankUpdatePhotoProfile();
    }

    @Then ( "I received status code 400 Bad Request in request to update photo profile" )
    public void receivedStatusCode400BadRequestUpdatePhotoProfile() {
        updatePhotoProfile.receivedStatusCode400BadRequestUpdatePhotoProfile();
    }

    @And ( "I received the error message \"input urlimage has on the url tag\" response in update photo profile" )
    public void receivedErrorMessageInputURLImageHasOnURLTagResponseUpdatePhotoProfile() {
        updatePhotoProfile.receivedErrorMessageInputURLImageHasOnURLTagResponseUpdatePhotoProfile();
    }
}
