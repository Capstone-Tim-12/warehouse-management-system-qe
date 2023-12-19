package starter.stepdefinitions.user.dashboard;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.user.dashboard.GetWarehouseByID;

public class GetWarehouseByIDSteps {
    @Steps
    GetWarehouseByID getWarehouseByID;

    @Given ( "I set API endpoint valid for get warehouse by ID" )
    public void setAPIEndpointValidGetWarehouseByID() {
        getWarehouseByID.setAPIEndpointValidGetWarehouseByID();
    }

    @When ( "I send request to get warehouse by ID" )
    public void sendRequestGetWarehouseByID() {
        getWarehouseByID.sendRequestGetWarehouseByID();
    }

    @Then ( "I received status code 200 OK in request get warehouse by ID" )
    public void receivedStatusCode200OKRequestGetWarehouseByID() {
        getWarehouseByID.receivedStatusCode200OKRequestGetWarehouseByID();
    }

    @And ( "I received all warehouse data and message \"Success\" response in request get warehouse by ID" )
    public void receivedAllWarehouseDataAndMessageSuccessResponseGetWarehouseByID() {
        getWarehouseByID.receivedAllWarehouseDataAndMessageSuccessResponseGetWarehouseByID();
    }

    @Given ( "I set API endpoint invalid for get warehouse by ID" )
    public void setAPIEndpointInvalidGetWarehouseByID() {
        getWarehouseByID.setAPIEndpointInvalidGetWarehouseByID();
    }

    @When ( "I send request to get warehouse by ID no path" )
    public void sendRequestGetWarehouseByIDNoPath() {
        getWarehouseByID.sendRequestGetWarehouseByIDNoPath();
    }

    @Then ( "I received status code 500 Internal Server Error in request to get warehouse by ID" )
    public void receivedStatusCode500InternalServerErrorRequestGetWarehouseByID() {
        getWarehouseByID.receivedStatusCode500InternalServerErrorRequestGetWarehouseByID();
    }

    @And ( "I received error message \"general error\" response in request get warehouse by ID" )
    public void receivedErrorMessageGeneralErrorResponseGetWarehouseByID() {
        getWarehouseByID.receivedErrorMessageGeneralErrorResponseGetWarehouseByID();
    }

    @Given ( "I set API endpoint invalid for get a single warehouse data invalid ID" )
    public void setAPIEndpointInvalidGetSingleWarehouseDataInvalidID() {
        getWarehouseByID.setAPIEndpointInvalidGetSingleWarehouseDataInvalidID();
    }

    @When ( "I send request to get a single warehouse data invalid ID" )
    public void sendRequestGetSingleWarehouseDataInvalidID() {
        getWarehouseByID.sendRequestGetSingleWarehouseDataInvalidID();
    }

    @Then ( "I received status code 400 Bad Request in request to get warehouse by ID" )
    public void receivedStatusCode400BadRequestInRequestGetWarehouseByID() {
        getWarehouseByID.receivedStatusCode400BadRequestInRequestGetWarehouseByID();
    }

    @And ( "I received error message \"Bad Request\" response in request get warehouse by ID" )
    public void receivedErrorMessageBadRequestResponseGetWarehouseByID() {
        getWarehouseByID.receivedErrorMessageBadRequestResponseGetWarehouseByID();
    }

    @And ( "I received error message \"failed find warehouse\" response in request get warehouse by ID" )
    public void receivedErrorMessageFailedFindWarehouseResponseGetWarehouseByID() {
        getWarehouseByID.receivedErrorMessageFailedFindWarehouseResponseGetWarehouseByID();
    }

    @Given ( "I set API endpoint invalid for get a single warehouse data ID not exist in database" )
    public void setAPIEndpointInvalidGetSingleWarehouseDataIDNotExistInDatabase() {
        getWarehouseByID.setAPIEndpointInvalidGetSingleWarehouseDataIDNotExistInDatabase();
    }

    @When ( "I send request to get a single warehouse data ID not exist in database" )
    public void sendRequestGetSingleWarehouseDataIDNotExistInDatabase() {
        getWarehouseByID.sendRequestGetSingleWarehouseDataIDNotExistInDatabase();
    }
}
