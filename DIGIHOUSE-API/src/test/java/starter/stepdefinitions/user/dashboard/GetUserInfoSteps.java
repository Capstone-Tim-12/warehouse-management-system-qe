package starter.stepdefinitions.user.dashboard;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.user.dashboard.GetUserInfo;

public class GetUserInfoSteps {
    @Steps
    GetUserInfo getUserInfo;

    @Given ( "I set API endpoint valid for get user profile" )
    public void setAPIEndpointValidGetUserProfile() {
        getUserInfo.setAPIEndpointValidGetUserProfile();
    }

    @When ( "I send request to get user profile valid path" )
    public void sendRequestGetUserProfileValidPath() {
        getUserInfo.sendRequestGetUserProfileValidPath();
    }

    @Then ( "I received status code 200 OK in request to get user profile" )
    public void receivedStatusCode200OKRequestGetUserProfile() {
        getUserInfo.receivedStatusCode200OKRequestGetUserProfile();
    }

    @And ( "I received all data profile user" )
    public void receivedAllDataProfileUser() {
        getUserInfo.receivedAllDataProfileUser();
    }

    @Given ( "I set API endpoint invalid for get user profile" )
    public void setAPIEndpointInvalidGetUserProfile() {
        getUserInfo.setAPIEndpointInvalidGetUserProfile();
    }

    @When ( "I send request to get user profile invalid path" )
    public void sendRequestGetUserProfileInvalidPath() {
        getUserInfo.sendRequestGetUserProfileInvalidPath();
    }

    @Then ( "I received status code 500 Internal Server Error in request to get user profile" )
    public void receivedStatusCode500InternalServerErrorRequestGetUserProfile() {
        getUserInfo.receivedStatusCode500InternalServerErrorRequestGetUserProfile();
    }

    @And ( "I received error message \"general error\" response in request get user profile" )
    public void receivedErrorMessageGeneralErrorResponseGetUserProfile() {
        getUserInfo.receivedErrorMessageGeneralErrorResponseGetUserProfile();
    }
}
