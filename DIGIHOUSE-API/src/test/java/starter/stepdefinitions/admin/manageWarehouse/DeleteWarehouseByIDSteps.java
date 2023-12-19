package starter.stepdefinitions.admin.manageWarehouse;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.admin.manageWarehouse.DeleteWarehouseByID;

public class DeleteWarehouseByIDSteps {
    @Steps
    DeleteWarehouseByID deleteWarehouseByID;

    @Given ( "I set API endpoint valid for delete warehouse by ID" )
    public void setAPIEndpointValidDeleteWarehouseByID() {
        deleteWarehouseByID.setAPIEndpointValidDeleteWarehouseByID();
    }

    @When ( "I send request to delete warehouse by ID" )
    public void sendRequestDeleteWarehouseByID() {
        deleteWarehouseByID.sendRequestDeleteWarehouseByID();
    }

    @Then ( "I received status code 200 OK in request delete warehouse by ID" )
    public void receivedStatusCode200OKRequestDeleteWarehouseByID() {
        deleteWarehouseByID.receivedStatusCode200OKRequestDeleteWarehouseByID();
    }

    @And ( "I received message \"Success\" response in request delete warehouse by ID" )
    public void receivedMessageSuccessResponseDeleteWarehouseByID() {
        deleteWarehouseByID.receivedMessageSuccessResponseDeleteWarehouseByID();
    }

    @Given ( "I set API endpoint invalid for can't delete warehouse by ID without the path" )
    public void setAPIEndpointInvalidDeleteWarehouseByIDWithoutPath() {
        deleteWarehouseByID.setAPIEndpointInvalidDeleteWarehouseByIDWithoutPath();
    }

    @When ( "I send request to delete warehouse by ID no path" )
    public void sendRequestDeleteWarehouseByIDNoPath() {
        deleteWarehouseByID.sendRequestDeleteWarehouseByIDNoPath();
    }

    @Then ( "I received status code 500 Internal Server Error in request to delete warehouse by ID" )
    public void receivedStatusCode500InternalServerErrorRequestDeleteWarehouseByID() {
        deleteWarehouseByID.receivedStatusCode500InternalServerErrorRequestDeleteWarehouseByID();
    }

    @And ( "I received error message \"general error\" response in request delete warehouse by ID" )
    public void receivedErrorMessageGeneralErrorResponseDeleteWarehouseByID() {
        deleteWarehouseByID.receivedErrorMessageGeneralErrorResponseDeleteWarehouseByID();
    }

    @Given ( "I set API endpoint invalid for can't delete warehouse by ID with invalid ID" )
    public void setAPIEndpointDeleteWarehouseByIDWitInvalidID() {
        deleteWarehouseByID.setAPIEndpointDeleteWarehouseByIDWitInvalidID();
    }

    @When ( "I send request to delete warehouse by ID with invalid ID" )
    public void sendRequestDeleteWarehouseByIDWithInvalidID() {
        deleteWarehouseByID.sendRequestDeleteWarehouseByIDWithInvalidID();
    }

    @Then ( "I received status code 404 Not Found in request delete warehouse by ID" )
    public void receivedStatusCode404NotFoundRequestDeleteWarehouseByID() {
        deleteWarehouseByID.receivedStatusCode404NotFoundRequestDeleteWarehouseByID();
    }

    @And ( "I received message \"warehouse not found\" response in request delete warehouse by ID" )
    public void receivedMessageWarehouseNotFoundResponseDeleteWarehouseByID() {
        deleteWarehouseByID.receivedMessageWarehouseNotFoundResponseDeleteWarehouseByID();
    }
}
