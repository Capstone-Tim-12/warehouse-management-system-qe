package starter.stepdefinitions.user.warehouse;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.user.warehouse.GetTransactionInfo;

public class GetTransactionInfoSteps {
    @Steps
    GetTransactionInfo getTransactionInfo;

    @Given ( "I set API endpoint valid for get transaction info" )
    public void setAPIEndpointValidGetTransactionInfo() {
        getTransactionInfo.setAPIEndpointValidGetTransactionInfo();
    }

    @When ( "I send request to get transaction info" )
    public void sendRequestGetTransactionInfo() {
        getTransactionInfo.sendRequestGetTransactionInfo();
    }

    @Then ( "I received status code 200 OK in request get transaction info" )
    public void receivedStatusCode200OKRequestGetTransactionInfo() {
        getTransactionInfo.receivedStatusCode200OKRequestGetTransactionInfo();
    }

    @And ( "I received transaction data and message \"Success\" response in request get transaction info" )
    public void receivedTransactionDataAndMessageSuccessResponseGetTransactionInfo() {
        getTransactionInfo.receivedTransactionDataAndMessageSuccessResponseGetTransactionInfo();
    }

    @Given ( "I set API endpoint invalid for get transaction info without the path" )
    public void setAPIEndpointInvalidGetTransactionInfoWithoutPath() {
        getTransactionInfo.setAPIEndpointInvalidGetTransactionInfoWithoutPath();
    }

    @When ( "I send request to get transaction info no path" )
    public void sendRequestGetTransactionInfoNoPath() {
        getTransactionInfo.sendRequestGetTransactionInfoNoPath();
    }

    @Then ( "I received status code 500 Internal Server Error in request to get transaction info" )
    public void receivedStatuscode500InternalServerErrorRequestGetTransactionInfo() {
        getTransactionInfo.receivedStatuscode500InternalServerErrorRequestGetTransactionInfo();
    }

    @And ( "I received error message \"general error\" response in request get transaction info" )
    public void receivedErrorMessageGeneralErrorResponseGetTransactionInfo() {
        getTransactionInfo.receivedErrorMessageGeneralErrorResponseGetTransactionInfo();
    }
}
