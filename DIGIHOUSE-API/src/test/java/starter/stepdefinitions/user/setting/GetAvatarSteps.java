package starter.stepdefinitions.user.setting;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.user.setting.GetAvatar;

public class GetAvatarSteps {
    @Steps
    GetAvatar getAvatar;

    @Given ( "I set API endpoint valid for get avatar" )
    public void setAPIEndpointValidGetAvatar() {
        getAvatar.setAPIEndpointValidGetAvatar();
    }

    @When ( "I send request to get avatar valid path" )
    public void sendRequestGetAvatarValidPath() {
        getAvatar.sendRequestGetAvatarValidPath();
    }

    @Then ( "I received status code 200 OK in request to get avatar" )
    public void receivedStatusCode200OKRequestGetAvatar() {
        getAvatar.receivedStatusCode200OKRequestGetAvatar();
    }

    @And ( "I received all avatar data" )
    public void receivedAllAvatarData() {
        getAvatar.receivedAllAvatarData();
    }

    @Given ( "I set API endpoint invalid for get avatar" )
    public void setAPIEndpointInvalidGetAvatar() {
        getAvatar.setAPIEndpointInvalidGetAvatar();
    }

    @When ( "I send request to get avatar invalid path" )
    public void sendRequestGetAvatarInvalidPath() {
        getAvatar.sendRequestGetAvatarInvalidPath();
    }

    @Then ( "I received status code 500 Internal Server Error in request to get avatar" )
    public void receivedStatusCode500InternalServerErrorRequestGetAvatar() {
        getAvatar.receivedStatusCode500InternalServerErrorRequestGetAvatar();
    }

    @And ( "I received error message \"general error\" response in request get avatar" )
    public void receivedErrorMessageGeneralErrorResponseGetAvatar() {
        getAvatar.receivedErrorMessageGeneralErrorResponseGetAvatar();
    }
}
