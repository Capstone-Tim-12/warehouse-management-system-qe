package starter.stepdefinitions.user.warehouse;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.user.warehouse.GetMyWarehouseRental;

public class GetMyWarehouseRentalSteps {
    @Steps
    GetMyWarehouseRental getMyWarehouseRental;

    @Given ( "I set API endpoint valid for get my warehouse rental" )
    public void setAPIEndpointValidGetMyWarehouseRental() {
        getMyWarehouseRental.setAPIEndpointValidGetMyWarehouseRental();
    }

    @When ( "I send request to get my warehouse rental" )
    public void sendRequestGetMyWarehouseRental() {
        getMyWarehouseRental.sendRequestGetMyWarehouseRental();
    }

    @Then ( "I received status code 200 OK in request get my warehouse rental" )
    public void receivedStatusCode200OKRequestGetMyWarehouseRental() {
        getMyWarehouseRental.receivedStatusCode200OKRequestGetMyWarehouseRental();
    }

    @And ( "I received data profile and message \"Success\" response in request get my warehouse rental" )
    public void receivedDataWarehouseAndMessageSuccessResponseGetMyWarehouseRental() {
        getMyWarehouseRental.receivedDataWarehouseAndMessageSuccessResponseGetMyWarehouseRental();
    }

    @Given ( "I set API endpoint invalid for get my warehouse rental without the path" )
    public void setAPIEndpointInvalidGetMyWarehouseRentalWithoutPath() {
        getMyWarehouseRental.setAPIEndpointInvalidGetMyWarehouseRentalWithoutPath();
    }

    @When ( "I send request to get my warehouse rental no path" )
    public void sendRequestGetMyWarehouseRentalNoPath() {
        getMyWarehouseRental.sendRequestGetMyWarehouseRentalNoPath();
    }

    @Then ( "I received status code 500 Internal Server Error in request to get my warehouse rental" )
    public void receivedStatuscode500InternalServerErrorRequestGetMyWarehouseRental() {
        getMyWarehouseRental.receivedStatuscode500InternalServerErrorRequestGetMyWarehouseRental();
    }

    @And ( "I received error message \"general error\" response in request get my warehouse rental" )
    public void receivedErrorMessageGeneralErrorResponseGetMyWarehouseRental() {
        getMyWarehouseRental.receivedErrorMessageGeneralErrorResponseGetMyWarehouseRental();
    }
}
