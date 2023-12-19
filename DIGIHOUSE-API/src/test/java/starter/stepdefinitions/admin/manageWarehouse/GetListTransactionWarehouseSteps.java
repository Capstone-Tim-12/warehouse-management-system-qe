package starter.stepdefinitions.admin.manageWarehouse;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.admin.manageWarehouse.GetListTransactionWarehouse;

public class GetListTransactionWarehouseSteps {
    @Steps
    GetListTransactionWarehouse getListTransactionWarehouse;

    @Given ( "I set API endpoint valid for get list transaction warehouse" )
    public void setAPIEndpointValidGetListTransactionWarehouse() {
        getListTransactionWarehouse.setAPIEndpointValidGetListTransactionWarehouse();
    }

    @When ( "I send request to get list transaction warehouse" )
    public void sendRequestGetListTransactionWarehouse() {
        getListTransactionWarehouse.sendRequestGetListTransactionWarehouse();
    }

    @Then ( "I received status code 200 OK in request get list transaction warehouse" )
    public void receivedStatusCode200OKRequestGetListTransactionWarehouse() {
        getListTransactionWarehouse.receivedStatusCode200OKRequestGetListTransactionWarehouse();
    }

    @And ( "I received message \"Success\" response in request get list transaction warehouse" )
    public void receivedMessageSuccessResponseGetListTransactionWarehouse() {
        getListTransactionWarehouse.receivedMessageSuccessResponseGetListTransactionWarehouse();
    }

    @Given ( "I set API endpoint invalid for get list transaction warehouse without the path" )
    public void setAPIEndpointInvalidGetListTransactionWarehouseWithoutPath() {
        getListTransactionWarehouse.setAPIEndpointInvalidGetListTransactionWarehouseWithoutPath();
    }

    @When ( "I send request to get list transaction warehouse no path" )
    public void sendRequestGetListTransactionWarehouseNoPath() {
        getListTransactionWarehouse.sendRequestGetListTransactionWarehouseNoPath();
    }

    @Then ( "I received status code 500 Internal Server Error in request to get list transaction warehouse" )
    public void receivedStatusCode500InternalServerErrorRequestGetListTransactionWarehouse() {
        getListTransactionWarehouse.receivedStatusCode500InternalServerErrorRequestGetListTransactionWarehouse();
    }

    @And ( "I received error message \"general error\" response in request get list transaction warehouse" )
    public void receivedErrorMessageGeneralErrorResponseGetListTransactionWarehouse() {
        getListTransactionWarehouse.receivedErrorMessageGeneralErrorResponseGetListTransactionWarehouse();
    }
}
