package starter.stepdefinitions.admin.manageUser;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.admin.manageUser.GetListTransactionUser;

public class GetListTransactionUserSteps {
    @Steps
    GetListTransactionUser getListTransactionUser;

    @Given ( "I set API endpoint valid for get list transaction user" )
    public void setAPIEndpointValidGetListTransactionUser() {
        getListTransactionUser.setAPIEndpointValidGetListTransactionUser();
    }

    @When ( "I send request to get list transaction user" )
    public void sendRequestGetListTransactionUser() {
        getListTransactionUser.sendRequestGetListTransactionUser();
    }

    @Then ( "I received status code 200 OK in request get list transaction user" )
    public void receivedStatusCode200OKRequestGetListTransactionUser() {
        getListTransactionUser.receivedStatusCode200OKRequestGetListTransactionUser();
    }

    @And ( "I received message \"Success\" response in request get list transaction user" )
    public void receivedMessageSuccessResponseGetlistTransactionUser() {
        getListTransactionUser.receivedMessageSuccessResponseGetlistTransactionUser();
    }

    @Given ( "I set API endpoint invalid for can't get list transaction user without the path" )
    public void setAPIEndpointInvalidGetListTransactionUserWithoutPath() {
        getListTransactionUser.setAPIEndpointInvalidGetListTransactionUserWithoutPath();
    }

    @When ( "I send request to get list transaction user no path" )
    public void sendRequestGetListTransactionUserNoPath() {
        getListTransactionUser.sendRequestGetListTransactionUserNoPath();
    }

    @Then ( "I received status code 500 Internal Server Error in request to get list transaction user" )
    public void receivedStatusCode500InternalServerErrorRequestGetListTransactionUser() {
        getListTransactionUser.receivedStatusCode500InternalServerErrorRequestGetListTransactionUser();
    }

    @And ( "I received error message \"general error\" response in request get list transaction user" )
    public void receivedErrorMessageGeneralErrorResponseGetListTransactionUser() {
        getListTransactionUser.receivedErrorMessageGeneralErrorResponseGetListTransactionUser();
    }
}
