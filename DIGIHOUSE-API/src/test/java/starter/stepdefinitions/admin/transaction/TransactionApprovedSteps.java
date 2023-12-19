package starter.stepdefinitions.admin.transaction;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.admin.transaction.TransactionApproved;

public class TransactionApprovedSteps {
    @Steps
    TransactionApproved transactionApproved;

    @Given ( "I set API endpoint valid for transaction approved" )
    public void setAPIEndpointValidTransactionApproved() {
        transactionApproved.setAPIEndpointValidTransactionApproved();
    }

    @When ( "I send request to transaction approved" )
    public void sendRequestTransactionApproved() {
        transactionApproved.sendRequestTransactionApproved();
    }

    @Then ( "I received status code 200 OK in request transaction approved" )
    public void receivedStatusCode200OKRequestTransactionApproved() {
        transactionApproved.receivedStatusCode200OKRequestTransactionApproved();
    }

    @And ( "I received message \"Success\" response in request transaction approved" )
    public void receivedMessageSuccessResponseTransactionApproved() {
        transactionApproved.receivedMessageSuccessResponseTransactionApproved();
    }

    @Given ( "I set API endpoint invalid for can't transaction approved without the path" )
    public void setAPIEndpointInvalidTransactionApprovedWithoutPath() {
        transactionApproved.setAPIEndpointInvalidTransactionApprovedWithoutPath();
    }

    @When ( "I send request to transaction approved no path" )
    public void sendRequestTransactionApprovedNoPath() {
        transactionApproved.sendRequestTransactionApprovedNoPath();
    }

    @Then ( "I received status code 500 Internal Server Error in request to transaction approved" )
    public void receivedStatusCode500InternalServerErrorRequestTransactionApproved() {
        transactionApproved.receivedStatusCode500InternalServerErrorRequestTransactionApproved();
    }

    @And ( "I received error message \"general error\" response in request transaction approved" )
    public void receivedErrorMessageGeneralErrorResponseTransactionApproved() {
        transactionApproved.receivedErrorMessageGeneralErrorResponseTransactionApproved();
    }
    @Given ( "I set API endpoint invalid for can't transaction approved with invalid transaction ID" )
    public void setAPIEndpointInvalidTransactionApprovedWithInvalidTransactionID() {
        transactionApproved.setAPIEndpointInvalidTransactionApprovedWithInvalidTransactionID();
    }

    @When ( "I send request to transaction approved with invalid transaction ID" )
    public void sendRequestTransactionApprovedWithInvalidTransactionID() {
        transactionApproved.sendRequestTransactionApprovedWithInvalidTransactionID();
    }

    @Then ( "I received status code 404 Not Found in request transaction approved" )
    public void receivedStatusCode404NotFoundRequestTransactionApproved() {
        transactionApproved.receivedStatusCode404NotFoundRequestTransactionApproved();
    }

    @And ( "I received message \"Not Found\" response in request transaction approved" )
    public void receivedErrorMessageNotFoundResponseTransactionApproved() {
        transactionApproved.receivedErrorMessageNotFoundResponseTransactionApproved();
    }
    @Given ( "I set API endpoint invalid for can't transaction approved if the transaction ID has previously been made" )
    public void setAPIEndpointInvalidTransactionApprovedWithIDHasPreviouslyBeenMade() {
        transactionApproved.setAPIEndpointInvalidTransactionApprovedWithIDHasPreviouslyBeenMade();
    }

    @When ( "I send request to transaction approved with transaction ID has previously been made" )
    public void sendRequestTransactionApprovedWithTransactionIDHasPreviouslyBeenMade() {
        transactionApproved.sendRequestTransactionApprovedWithTransactionIDHasPreviouslyBeenMade();
    }

    @Then ( "I received status code 400 Bad Request in request transaction approved" )
    public void receivedStatusCode400BadRequestRequestTransactionApproved() {
        transactionApproved.receivedStatusCode400BadRequestRequestTransactionApproved();
    }

    @And ( "I received message \"status transaction not submission\" response in request transaction approved" )
    public void receivedErrorMessageStatusTransactionNotSubmissionResponseTransactionApproved() {
        transactionApproved.receivedErrorMessageStatusTransactionNotSubmissionResponseTransactionApproved();
    }
}
