package starter.stepdefinitions.admin.transaction;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.admin.transaction.TransactionRejected;

public class TransactionRejectedSteps {
    @Steps
    TransactionRejected transactionRejected;

    @Given ( "I set API endpoint valid for transaction rejected" )
    public void setAPIEndpointValidTransactionRejected() {
        transactionRejected.setAPIEndpointValidTransactionRejected();
    }

    @When ( "I send request to transaction rejected" )
    public void sendRequestTransactionRejected() {
        transactionRejected.sendRequestTransactionRejected();
    }

    @Then ( "I received status code 200 OK in request transaction rejected" )
    public void receivedStatusCode200OKRequestTransactionRejected() {
        transactionRejected.receivedStatusCode200OKRequestTransactionRejected();
    }

    @And ( "I received message \"Success\" response in request transaction rejected" )
    public void receivedMessageSuccessResponseTransactionRejected() {
        transactionRejected.receivedMessageSuccessResponseTransactionRejected();
    }

    @Given ( "I set API endpoint invalid for can't transaction rejected without the path" )
    public void setAPIEndpointInvalidTransactionRejectedWithoutPath() {
        transactionRejected.setAPIEndpointInvalidTransactionRejectedWithoutPath();
    }

    @When ( "I send request to transaction rejected no path" )
    public void sendRequestTransactionRejectedNoPath() {
        transactionRejected.sendRequestTransactionRejectedNoPath();
    }

    @Then ( "I received status code 500 Internal Server Error in request to transaction rejected" )
    public void receivedStatusCode500InternalServerErrorRequestTransactionRejected() {
        transactionRejected.receivedStatusCode500InternalServerErrorRequestTransactionRejected();
    }

    @And ( "I received error message \"general error\" response in request transaction rejected" )
    public void receivedErrorMessageGeneralErrorResponseTransactionRejected() {
        transactionRejected.receivedErrorMessageGeneralErrorResponseTransactionRejected();
    }
    @Given ( "I set API endpoint invalid for can't transaction rejected with invalid transaction ID" )
    public void setAPIEndpointInvalidTransactionRejectedWithInvalidTransactionID() {
        transactionRejected.setAPIEndpointInvalidTransactionRejectedWithInvalidTransactionID();
    }

    @When ( "I send request to transaction rejected with invalid transaction ID" )
    public void sendRequestTransactionRejectedWithInvalidTransactionID() {
        transactionRejected.sendRequestTransactionRejectedWithInvalidTransactionID();
    }

    @Then ( "I received status code 404 Not Found in request transaction rejected" )
    public void receivedStatusCode404NotFoundRequestTransactionRejected() {
        transactionRejected.receivedStatusCode404NotFoundRequestTransactionRejected();
    }

    @And ( "I received message \"Not Found\" response in request transaction rejected" )
    public void receivedErrorMessageNotFoundResponseTransactionRejected() {
        transactionRejected.receivedErrorMessageNotFoundResponseTransactionRejected();
    }
    @Given ( "I set API endpoint invalid for can't transaction rejected if the transaction ID has previously been made" )
    public void setAPIEndpointInvalidTransactionRejectedWithIDHasPreviouslyBeenMade() {
        transactionRejected.setAPIEndpointInvalidTransactionRejectedWithIDHasPreviouslyBeenMade();
    }

    @When ( "I send request to transaction rejected with transaction ID has previously been made" )
    public void sendRequestTransactionRejectedWithTransactionIDHasPreviouslyBeenMade() {
        transactionRejected.sendRequestTransactionRejectedWithTransactionIDHasPreviouslyBeenMade();
    }

    @Then ( "I received status code 400 Bad Request in request transaction rejected" )
    public void receivedStatusCode400BadRequestRequestTransactionRejected() {
        transactionRejected.receivedStatusCode400BadRequestRequestTransactionRejected();
    }

    @And ( "I received message \"status transaction not submission\" response in request transaction rejected" )
    public void receivedErrorMessageStatusTransactionNotSubmissionResponseTransactionRejected() {
        transactionRejected.receivedErrorMessageStatusTransactionNotSubmissionResponseTransactionRejected();
    }
}
