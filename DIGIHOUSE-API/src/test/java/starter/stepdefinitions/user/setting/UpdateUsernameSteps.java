package starter.stepdefinitions.user.setting;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.user.setting.UpdateUsername;

public class UpdateUsernameSteps {
    @Steps
    UpdateUsername updateUsername;

    @Given ( "I set API endpoint valid for update username" )
    public void setAPIEndpointValidUpdateUsername() {
        updateUsername.setAPIEndpointValidUpdateUsername();
    }

    @When ( "I enter a username" )
    public void enterUsername() {
        updateUsername.enterUsername();
    }

    @And ( "I send request to update username" )
    public void sendRequestUpdateUsername() {
        updateUsername.sendRequestUpdateUsername();
    }

    @Then ( "I received status code 200 OK in request update username" )
    public void receivedStatusCode200OKRequestUpdateUsername() {
        updateUsername.receivedStatusCode200OKRequestUpdateUsername();
    }

    @And ( "I received message \"Success\" response in request update username" )
    public void receivedMessageSuccessResponseUpdateUsername() {
        updateUsername.receivedMessageSuccessResponseUpdateUsername();
    }

    @Given ( "I set API endpoint invalid for update username without the path" )
    public void setAPIEndpointInvalidUpdateUsernameWithoutPath() {
        updateUsername.setAPIEndpointInvalidUpdateUsernameWithoutPath();
    }

    @When ( "I send request to update username no path" )
    public void sendRequestUpdateUsernameNoPath() {
        updateUsername.sendRequestUpdateUsernameNoPath();
    }

    @Then ( "I received status code 500 Internal Server Error in request to update username" )
    public void receivedStatusCode500InternalServerErrorRequestUpdateUsername() {
        updateUsername.receivedStatusCode500InternalServerErrorRequestUpdateUsername();
    }

    @And ( "I received error message \"general error\" response in request update username" )
    public void receivedErrorMessageGeneralErrorResponseUpdateUsername() {
        updateUsername.receivedErrorMessageGeneralErrorResponseUpdateUsername();
    }

    @When ( "I blank the update username request" )
    public void blankUpdateUsernameRequest() {
        updateUsername.blankUpdateUsernameRequest();
    }

    @And ( "I send blank request to update username" )
    public void sendBlankRequestUpdateUsername() {
        updateUsername.sendBlankRequestUpdateUsername();
    }

    @Then ( "I received status code 400 Bad Request in request to update username" )
    public void receivedStatusCode400BadRequestUpdateUsername() {
        updateUsername.receivedStatusCode400BadRequestUpdateUsername();
    }

    @And ( "I received the error message \"username is empty\" response in update username" )
    public void receivedErrorMessageUsernameIsEmptyResponseUpdateUsername() {
        updateUsername.receivedErrorMessageUsernameIsEmptyResponseUpdateUsername();
    }
}
