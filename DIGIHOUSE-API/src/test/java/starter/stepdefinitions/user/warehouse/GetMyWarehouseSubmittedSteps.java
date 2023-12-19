package starter.stepdefinitions.user.warehouse;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.user.warehouse.GetMyWarehouseSubmitted;

public class GetMyWarehouseSubmittedSteps {
    @Steps
    GetMyWarehouseSubmitted getMyWarehouseSubmitted;

    @Given ( "I set API endpoint valid for get my warehouse submitted" )
    public void setAPIEndpointValidGetMyWarehouseSubmitted() {
        getMyWarehouseSubmitted.setAPIEndpointValidGetMyWarehouseSubmitted();
    }

    @When ( "I send request to get my warehouse submitted" )
    public void sendRequestGetMyWarehouseSubmitted() {
        getMyWarehouseSubmitted.sendRequestGetMyWarehouseSubmitted();
    }

    @Then ( "I received status code 200 OK in request get my warehouse submitted" )
    public void receivedStatusCode200OKRequestGetMyWarehouseSubmitted() {
        getMyWarehouseSubmitted.receivedStatusCode200OKRequestGetMyWarehouseSubmitted();
    }

    @And ( "I received data warehouse and message \"Success\" response in request get my warehouse submitted" )
    public void receivedDataWarehouseAndMessageSuccessResponseGetMyWarehouseSubmitted() {
        getMyWarehouseSubmitted.receivedDataWarehouseAndMessageSuccessResponseGetMyWarehouseSubmitted();
    }

    @Given ( "I set API endpoint invalid for get my warehouse submitted without the path" )
    public void setAPIEndpointInvalidGetMyWarehouseSubmittedWithoutPath() {
        getMyWarehouseSubmitted.setAPIEndpointInvalidGetMyWarehouseSubmittedWithoutPath();
    }

    @When ( "I send request to get my warehouse submitted no path" )
    public void sendRequestGetMyWarehouseSubmittedNoPath() {
        getMyWarehouseSubmitted.sendRequestGetMyWarehouseSubmittedNoPath();
    }

    @Then ( "I received status code 500 Internal Server Error in request to get my warehouse submitted" )
    public void receivedStatuscode500InternalServerErrorRequestGetMyWarehouseSubmitted() {
        getMyWarehouseSubmitted.receivedStatuscode500InternalServerErrorRequestGetMyWarehouseSubmitted();
    }

    @And ( "I received error message \"general error\" response in request get my warehouse submitted" )
    public void receivedErrorMessageGeneralErrorResponseGetMyWarehouseSubmitted() {
        getMyWarehouseSubmitted.receivedErrorMessageGeneralErrorResponseGetMyWarehouseSubmitted();
    }
}
