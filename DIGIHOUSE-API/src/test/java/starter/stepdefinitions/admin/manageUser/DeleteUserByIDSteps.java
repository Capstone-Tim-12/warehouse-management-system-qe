package starter.stepdefinitions.admin.manageUser;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.admin.manageUser.DeleteUserByID;

public class DeleteUserByIDSteps {
    @Steps
    DeleteUserByID deleteUserByID;

    @Given ( "I set API endpoint valid for delete user by ID" )
    public void setAPIEndpointValidDeleteUserByID() {
        deleteUserByID.setAPIEndpointValidDeleteUserByID();
    }

    @When ( "I send request to delete user by ID" )
    public void sendRequestDeleteUserByID() {
        deleteUserByID.sendRequestDeleteUserByID();
    }

    @Then ( "I received status code 200 OK in request delete user by ID" )
    public void receivedStatusCode200OKRequestDeleteUserByID() {
        deleteUserByID.receivedStatusCode200OKRequestDeleteUserByID();
    }

    @And ( "I received message \"Success\" response in request delete user by ID" )
    public void receivedMessageSuccessResponseDeleteUserByID() {
        deleteUserByID.receivedMessageSuccessResponseDeleteUserByID();
    }

    @Given ( "I set API endpoint invalid for can't delete user by ID without the path" )
    public void setAPIEndpointInvalidDeleteUserByIDWithoutPath() {
        deleteUserByID.setAPIEndpointInvalidDeleteUserByIDWithoutPath();
    }

    @When ( "I send request to delete user by ID no path" )
    public void sendRequestDeleteUserByIDNoPath() {
        deleteUserByID.sendRequestDeleteUserByIDNoPath();
    }

    @Then ( "I received status code 500 Internal Server Error in request to delete user by ID" )
    public void receivedStatusCode500InternalServerErrorRequestDeleteUserByID() {
        deleteUserByID.receivedStatusCode500InternalServerErrorRequestDeleteUserByID();
    }

    @And ( "I received error message \"general error\" response in request delete user by ID" )
    public void receivedErrorMessageGeneralErrorResponseDeleteUserByID() {
        deleteUserByID.receivedErrorMessageGeneralErrorResponseDeleteUserByID();
    }

    @Given ( "I set API endpoint invalid for can't delete user by ID with invalid ID" )
    public void setAPIEndpointDeleteUserByIDWitInvalidID() {
        deleteUserByID.setAPIEndpointDeleteUserByIDWitInvalidID();
    }

    @When ( "I send request to delete user by ID with invalid ID" )
    public void sendRequestDeleteUserByIDWithInvalidID() {
        deleteUserByID.sendRequestDeleteUserByIDWithInvalidID();
    }

    @Then ( "I received status code 404 Not Found in request delete user by ID" )
    public void receivedStatusCode404NotFoundRequestDeleteUserByID() {
        deleteUserByID.receivedStatusCode404NotFoundRequestDeleteUserByID();
    }

    @And ( "I received message \"user not found\" response in request delete user by ID" )
    public void receivedMessageUserNotFoundResponseDeleteUserByID() {
        deleteUserByID.receivedMessageUserNotFoundResponseDeleteUserByID();
    }
}
