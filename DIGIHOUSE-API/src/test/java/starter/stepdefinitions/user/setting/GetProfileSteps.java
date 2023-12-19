package starter.stepdefinitions.user.setting;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.user.setting.GetProfile;

public class GetProfileSteps {
    @Steps
    GetProfile getProfile;

    @Given ( "I set API endpoint valid for get profile" )
    public void setAPIEndpointValidGetProfile() {
        getProfile.setAPIEndpointValidGetProfile();
    }

    @When ( "I enter a email valid format for get profile" )
    public void enterEmailValidFormatGetProfile() {
        getProfile.enterEmailValidFormatGetProfile();
    }

    @And ( "I send request to get profile" )
    public void sendRequestGetProfile() {
        getProfile.sendRequestGetProfile();
    }

    @Then ( "I received status code 200 OK in request get profile" )
    public void receivedStatusCode200OKRequestGetProfile() {
        getProfile.receivedStatusCode200OKRequestGetProfile();
    }

    @And ( "I received data profile and message \"Success\" response in request get profile" )
    public void receivedDataProfileAndMessageSuccessResponseGetProfile() {
        getProfile.receivedDataProfileAndMessageSuccessResponseGetProfile();
    }

    @Given ( "I set API endpoint invalid for get profile without the path" )
    public void setAPIEndpointInvalidGetProfileWithoutPath() {
        getProfile.setAPIEndpointInvalidGetProfileWithoutPath();
    }

    @When ( "I send request to get profile no path" )
    public void sendRequestGetProfileNoPath() {
        getProfile.sendRequestGetProfileNoPath();
    }

    @Then ( "I received status code 500 Internal Server Error in request to get profile" )
    public void receivedStatusCode500InternalServerErrorRequestGetProfile() {
        getProfile.receivedStatusCode500InternalServerErrorRequestGetProfile();
    }

    @And ( "I received error message \"general error\" response in request get profile" )
    public void receivedErrorMessageGeneralErrorResponseGetProfile() {
        getProfile.receivedErrorMessageGeneralErrorResponseGetProfile();
    }
}
