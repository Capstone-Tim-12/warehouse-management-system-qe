package starter.stepdefinitions.admin.manageUser;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.admin.manageUser.GetUserByID;

public class GetUserByIDSteps {
    @Steps
    GetUserByID getUserByID;

    @Given ( "I set API endpoint valid for get user by ID" )
    public void setAPIEndpointValidGetUserByID() {
        getUserByID.setAPIEndpointValidGetUserByID();
    }

    @When ( "I send request to get user by ID" )
    public void sendRequestGetUserByID() {
        getUserByID.sendRequestGetUserByID();
    }

    @Then ( "I received status code 200 OK in request get user by ID" )
    public void receivedStatusCode200OKRequestGetUserByID() {
        getUserByID.receivedStatusCode200OKRequestGetUserByID();
    }

    @And ( "I received message \"Success\" response in request get user by ID" )
    public void receivedMessageSuccessResponseGetUserByID() {
        getUserByID.receivedMessageSuccessResponseGetUserByID();
    }

    @Given ( "I set API endpoint invalid for can't get user by ID without the path" )
    public void setAPIEndpointInvalidGetUserByIDWithoutPath() {
        getUserByID.setAPIEndpointInvalidGetUserByIDWithoutPath();
    }

    @When ( "I send request to get user by ID no path" )
    public void sendRequestGetUserByIDNoPath() {
        getUserByID.sendRequestGetUserByIDNoPath();
    }

    @Then ( "I received status code 500 Internal Server Error in request to get user by ID" )
    public void receivedStatusCode500InternalServerErrorRequestGetUserByID() {
        getUserByID.receivedStatusCode500InternalServerErrorRequestGetUserByID();
    }

    @And ( "I received error message \"general error\" response in request get user by ID" )
    public void receivedErrorMessageGeneralErrorResponseGetUserByID() {
        getUserByID.receivedErrorMessageGeneralErrorResponseGetUserByID();
    }

    @Given ( "I set API endpoint invalid for can't get user by ID with invalid ID" )
    public void setAPIEndpointGetUserByIDWitInvalidID() {
        getUserByID.setAPIEndpointGetUserByIDWitInvalidID();
    }

    @When ( "I send request to get user by ID with invalid ID" )
    public void sendRequestGetUserByIDWithInvalidID() {
        getUserByID.sendRequestGetUserByIDWithInvalidID();
    }

    @Then ( "I received status code 404 Not Found in request get user by ID" )
    public void receivedStatusCode404NotFoundRequestGetUserByID() {
        getUserByID.receivedStatusCode404NotFoundRequestGetUserByID();
    }

    @And ( "I received message \"Not Found\" response in request get user by ID" )
    public void receivedMessageNotFoundResponseGetUserByID() {
        getUserByID.receivedMessageNotFoundResponseGetUserByID();
    }
}
