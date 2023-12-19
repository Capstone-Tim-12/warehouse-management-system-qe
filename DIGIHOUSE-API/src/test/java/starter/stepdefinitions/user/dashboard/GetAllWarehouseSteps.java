package starter.stepdefinitions.user.dashboard;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.user.dashboard.GetAllWarehouse;

public class GetAllWarehouseSteps {
    @Steps
    GetAllWarehouse getAllWarehouse;

    @Given ( "I set API endpoint valid for get all warehouse" )
    public void setAPIEndpointValidGetAllWarehouse() {
        getAllWarehouse.setAPIEndpointValidGetAllWarehouse();
    }

    @When ( "I send request to get all warehouse" )
    public void sendRequestGetAllWarehouse() {
        getAllWarehouse.sendRequestGetAllWarehouse();
    }

    @Then ( "I received status code 200 OK in request get all warehouse" )
    public void receivedStatusCode200OKRequestGetAllWarehouse() {
        getAllWarehouse.receivedStatusCode200OKRequestGetAllWarehouse();
    }

    @And ( "I received all warehouse data and message \"Success\" response in request get all warehouse" )
    public void receivedAllWarehouseDataAndMessageSuccessResponseGetAllWarehouse() {
        getAllWarehouse.receivedAllWarehouseDataAndMessageSuccessResponseGetAllWarehouse();
    }

    @Given ( "I set API endpoint invalid for get all warehouse" )
    public void setAPIEndpointInvalidGetAllWarehouse() {
        getAllWarehouse.setAPIEndpointInvalidGetAllWarehouse();
    }

    @When ( "I send request to get all warehouse no path" )
    public void sendRequestGetAllWarehouseNoPath() {
        getAllWarehouse.sendRequestGetAllWarehouseNoPath();
    }

    @Then ( "I received status code 500 Internal Server Error in request to get all warehouse" )
    public void receivedStatusCode500InternalServerErrorRequestGetAllWarehouse() {
        getAllWarehouse.receivedStatusCode500InternalServerErrorRequestGetAllWarehouse();
    }

    @And ( "I received error message \"general error\" response in request get all warehouse" )
    public void receivedErrorMessageGeneralErrorResponseGetAllWarehouse() {
        getAllWarehouse.receivedErrorMessageGeneralErrorResponseGetAllWarehouse();
    }
}
