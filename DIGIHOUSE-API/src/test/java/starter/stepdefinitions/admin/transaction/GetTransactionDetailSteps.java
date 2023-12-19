package starter.stepdefinitions.admin.transaction;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.admin.transaction.GetTransactionDetail;

public class GetTransactionDetailSteps {
    @Steps
    GetTransactionDetail getTransactionDetail;

    @Given ( "I set API endpoint valid for get transaction detail" )
    public void setAPIEndpointValidGetTransactionDetail() {
        getTransactionDetail.setAPIEndpointValidGetTransactionDetail();
    }

    @When ( "I send request to get transaction detail" )
    public void sendRequestGetTransactionDetail() {
        getTransactionDetail.sendRequestGetTransactionDetail();
    }

    @Then ( "I received status code 200 OK in request get transaction detail" )
    public void receivedStatusCode200OKRequestGetTransactionDetail() {
        getTransactionDetail.receivedStatusCode200OKRequestGetTransactionDetail();
    }

    @And ( "I received message \"Success\" response in request get transaction detail" )
    public void receivedMessageSuccessResponseGetTransactionDetail() {
        getTransactionDetail.receivedMessageSuccessResponseGetTransactionDetail();
    }

    @Given ( "I set API endpoint invalid for can't get transaction detail without the path" )
    public void setAPIEndpointInvalidGetTransactionDetailWithoutPath() {
        getTransactionDetail.setAPIEndpointInvalidGetTransactionDetailWithoutPath();
    }

    @When ( "I send request to get transaction detail no path" )
    public void sendRequestGetTransactionDetailNoPath() {
        getTransactionDetail.sendRequestGetTransactionDetailNoPath();
    }

    @Then ( "I received status code 500 Internal Server Error in request to get transaction detail" )
    public void receivedStatusCode500InternalServerErrorRequestGetTransactionDetail() {
        getTransactionDetail.receivedStatusCode500InternalServerErrorRequestGetTransactionDetail();
    }

    @And ( "I received error message \"general error\" response in request get transaction detail" )
    public void receivedErrorMessageGeneralErrorResponseGetTransactionDetail() {
        getTransactionDetail.receivedErrorMessageGeneralErrorResponseGetTransactionDetail();
    }
}
