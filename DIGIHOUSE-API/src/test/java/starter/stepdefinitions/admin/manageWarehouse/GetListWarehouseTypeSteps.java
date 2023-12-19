package starter.stepdefinitions.admin.manageWarehouse;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.admin.manageWarehouse.GetListWarehouseType;

public class GetListWarehouseTypeSteps {
    @Steps
    GetListWarehouseType getListWarehouseType;

    @Given ( "I set API endpoint valid for get list warehouse type" )
    public void setAPIEndpointValidGetListWarehouseType() {
        getListWarehouseType.setAPIEndpointValidGetListWarehouseType();
    }

    @When ( "I send request to get list warehouse type" )
    public void sendRequestGetListWarehouseType() {
        getListWarehouseType.sendRequestGetListWarehouseType();
    }

    @Then ( "I received status code 200 OK in request get list warehouse type" )
    public void receivedStatusCode200OKRequestGetListWarehouseType() {
        getListWarehouseType.receivedStatusCode200OKRequestGetListWarehouseType();
    }

    @And ( "I received message \"Success\" response in request get list warehouse type" )
    public void receivedMessageSuccessResponseGetListWarehouseType() {
        getListWarehouseType.receivedMessageSuccessResponseGetListWarehouseType();
    }

    @Given ( "I set API endpoint invalid for get list warehouse type without the path" )
    public void setAPIEndpointInvalidGetListWarehouseTypeWithoutPath() {
        getListWarehouseType.setAPIEndpointInvalidGetListWarehouseTypeWithoutPath();
    }

    @When ( "I send request to get list warehouse type no path" )
    public void sendRequestGetListWarehouseTypeNoPath() {
        getListWarehouseType.sendRequestGetListWarehouseTypeNoPath();
    }

    @Then ( "I received status code 500 Internal Server Error in request to get list warehouse type" )
    public void receivedStatusCode500InternalServerErrorRequestGetListWarehouseType() {
        getListWarehouseType.receivedStatusCode500InternalServerErrorRequestGetListWarehouseType();
    }

    @And ( "I received error message \"general error\" response in request get list warehouse type" )
    public void receivedErrorMessageGeneralErrorResponseGetListWarehouseType() {
        getListWarehouseType.receivedErrorMessageGeneralErrorResponseGetListWarehouseType();
    }
}
