package starter.stepdefinitions.admin.transaction;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.admin.transaction.GetHistoryTransactionData;

public class GetHistoryTransactionDataSteps {
    @Steps
    GetHistoryTransactionData getHistoryTransactionData;

    @Given ( "I set API endpoint valid for get history transaction data" )
    public void setAPIEndpointValidGetHistoryTransactionData() {
        getHistoryTransactionData.setAPIEndpointValidGetHistoryTransactionData();
    }

    @When ( "I send request to get history transaction data" )
    public void sendRequestGetHistoryTransactionData() {
        getHistoryTransactionData.sendRequestGetHistoryTransactionData();
    }

    @Then ( "I received status code 200 OK in request get history transaction data" )
    public void receivedStatusCode200OKRequestGetHistoryTransactionData() {
        getHistoryTransactionData.receivedStatusCode200OKRequestGetHistoryTransactionData();
    }

    @And ( "I received message \"Success\" response in request get history transaction data" )
    public void receivedMessageSuccessResponseGetHistoryTransactionData() {
        getHistoryTransactionData.receivedMessageSuccessResponseGetHistoryTransactionData();
    }

    @Given ( "I set API endpoint invalid for can't get history transaction data without the path" )
    public void setAPIEndpointInvalidGetHistoryTransactionDataWithoutPath() {
        getHistoryTransactionData.setAPIEndpointInvalidGetHistoryTransactionDataWithoutPath();
    }

    @When ( "I send request to get history transaction data no path" )
    public void sendRequestGetHistoryTransactionDataNoPath() {
        getHistoryTransactionData.sendRequestGetHistoryTransactionDataNoPath();
    }

    @Then ( "I received status code 500 Internal Server Error in request to get history transaction data" )
    public void receivedStatusCode500InternalServerErrorRequestGetHistoryTransactionData() {
        getHistoryTransactionData.receivedStatusCode500InternalServerErrorRequestGetHistoryTransactionData();
    }

    @And ( "I received error message \"general error\" response in request get history transaction data" )
    public void receivedErrorMessageGeneralErrorResponseGetHistoryTransactionData() {
        getHistoryTransactionData.receivedErrorMessageGeneralErrorResponseGetHistoryTransactionData();
    }
}
