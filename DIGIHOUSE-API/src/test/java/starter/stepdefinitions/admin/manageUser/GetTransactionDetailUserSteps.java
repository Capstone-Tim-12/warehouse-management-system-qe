package starter.stepdefinitions.admin.manageUser;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.admin.manageUser.GetTransactionDetailUser;

public class GetTransactionDetailUserSteps {
    @Steps
    GetTransactionDetailUser getTransactionDetailUser;

    @Given ( "I set API endpoint valid for get transaction detail user" )
    public void setAPIEndpointValidGetTransactionDetailUser() {
        getTransactionDetailUser.setAPIEndpointValidGetTransactionDetailUser();
    }

    @When ( "I send request to get transaction detail user" )
    public void sendRequestGetTransactionDetailUser() {
        getTransactionDetailUser.sendRequestGetTransactionDetailUser();
    }

    @Then ( "I received status code 200 OK in request get transaction detail user" )
    public void receivedStatusCode200OKRequestGetTransactionDetailUser() {
        getTransactionDetailUser.receivedStatusCode200OKRequestGetTransactionDetailUser();
    }

    @And ( "I received message \"Success\" response in request get transaction detail user" )
    public void receivedMessageSuccessResponseGetTransactionDetailUser() {
        getTransactionDetailUser.receivedMessageSuccessResponseGetTransactionDetailUser();
    }

    @Given ( "I set API endpoint invalid for can't get transaction detail user without the path" )
    public void setAPIEndpointInvalidGetTransactionDetailUserWithoutPath() {
        getTransactionDetailUser.setAPIEndpointInvalidGetTransactionDetailUserWithoutPath();
    }

    @When ( "I send request to get transaction detail user no path" )
    public void sendRequestGetTransactionDetailUserNoPath() {
        getTransactionDetailUser.sendRequestGetTransactionDetailUserNoPath();
    }

    @Then ( "I received status code 500 Internal Server Error in request to get transaction detail user" )
    public void receivedStatusCode500InternalServerErrorRequestGetTransactionDetailUser() {
        getTransactionDetailUser.receivedStatusCode500InternalServerErrorRequestGetTransactionDetailUser();
    }

    @And ( "I received error message \"general error\" response in request get transaction detail user" )
    public void receivedErrorMessageGeneralErrorResponseGetTransactionDetailUser() {
        getTransactionDetailUser.receivedErrorMessageGeneralErrorResponseGetTransactionDetailUser();
    }
}
