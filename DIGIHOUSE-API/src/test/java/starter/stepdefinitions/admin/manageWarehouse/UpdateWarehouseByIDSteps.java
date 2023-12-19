package starter.stepdefinitions.admin.manageWarehouse;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.admin.manageWarehouse.UpdateWarehouseByID;

public class UpdateWarehouseByIDSteps {
    @Steps
    UpdateWarehouseByID updateWarehouseByID;

    @Given ( "I set API endpoint valid for update warehouse by ID" )
    public void setAPIEndpointValidUpdateWarehouseByID() {
        updateWarehouseByID.setAPIEndpointValidUpdateWarehouseByID();
    }

    @When ( "I update a valid warehouse by ID" )
    public void updateValidWarehouseByID() {
        updateWarehouseByID.updateValidWarehouseByID();
    }

    @And ( "I send request to update warehouse by ID" )
    public void sendRequestUpdateWarehouseByID() {
        updateWarehouseByID.sendRequestUpdateWarehouseByID();
    }

    @Then ( "I received status code 200 OK in request update warehouse by ID" )
    public void receivedStatusCode200OKRequestUpdateWarehouseByID() {
        updateWarehouseByID.receivedStatusCode200OKRequestUpdateWarehouseByID();
    }

    @And ( "I received message \"Success\" response in request update warehouse by ID" )
    public void receivedMessageSuccessResponseUpdateWarehouseByID() {
        updateWarehouseByID.receivedMessageSuccessResponseUpdateWarehouseByID();
    }

    @Given ( "I set API endpoint invalid for can't update warehouse by ID without the path" )
    public void setAPIEndpointInvalidUpdateWarehouseByIDWithoutPath() {
        updateWarehouseByID.setAPIEndpointInvalidUpdateWarehouseByIDWithoutPath();
    }

    @When ( "I send request to update warehouse by ID no path" )
    public void sendRequestUpdateWarehouseByIDNoPath() {
        updateWarehouseByID.sendRequestUpdateWarehouseByIDNoPath();
    }

    @Then ( "I received status code 500 Internal Server Error in request to update warehouse by ID" )
    public void receivedStatusCode500InternalServerErrorRequestUpdateWarehouseByID() {
        updateWarehouseByID.receivedStatusCode500InternalServerErrorRequestUpdateWarehouseByID();
    }

    @And ( "I received error message \"general error\" response in request update warehouse by ID" )
    public void receivedErrorMessageGeneralErrorResponseUpdateWarehouseByID() {
        updateWarehouseByID.receivedErrorMessageGeneralErrorResponseUpdateWarehouseByID();
    }

    @Given ( "I set API endpoint invalid for can't update warehouse by ID with invalid ID" )
    public void setAPIEndpointInvalidUpdateWarehouseByIDWithInvalidID() {
        updateWarehouseByID.setAPIEndpointInvalidUpdateWarehouseByIDWithInvalidID();
    }

    @When ( "I send request to update warehouse by ID with invalid ID" )
    public void sendRequestUpdateWarehouseByIDWithInvalidID() {
        updateWarehouseByID.sendRequestUpdateWarehouseByIDWithInvalidID();
    }

    @Then ( "I received status code 404 Not Found in request update warehouse by ID" )
    public void receivedStatusCode404NotFoundRequestUpdateWarehouseByID() {
        updateWarehouseByID.receivedStatusCode404NotFoundRequestUpdateWarehouseByID();
    }

    @And ( "I received message \"failed to get data warehouse\" response in request update warehouse by ID" )
    public void receivedErrorMessageFailedToGetDataWarehouseResponseUpdateWarehouseByID() {
        updateWarehouseByID.receivedErrorMessageFailedToGetDataWarehouseResponseUpdateWarehouseByID();
    }
}
