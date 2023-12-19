package starter.stepdefinitions.admin.manageWarehouse;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.admin.manageWarehouse.GetReason;

public class GetReasonSteps {
    @Steps
    GetReason getReason;

    @Given ( "I set API endpoint valid for get reason" )
    public void setAPIEndpointValidGetReason() {
        getReason.setAPIEndpointValidGetReason();
    }

    @When ( "I send request to get reason" )
    public void sendRequestGetReason() {
        getReason.sendRequestGetReason();
    }

    @Then ( "I received status code 200 OK in request get reason" )
    public void receivedStatusCode200OKRequestGetReason() {
        getReason.receivedStatusCode200OKRequestGetReason();
    }

    @And ( "I received message \"Success\" response in request get reason" )
    public void receivedMessageSuccessResponseGetReason() {
        getReason.receivedMessageSuccessResponseGetReason();
    }

    @Given ( "I set API endpoint invalid for get reason without the path" )
    public void setAPIEndpointInvalidGetReasonWithoutPath() {
        getReason.setAPIEndpointInvalidGetReasonWithoutPath();
    }

    @When ( "I send request to get reason no path" )
    public void sendRequestGetLReasonNoPath() {
        getReason.sendRequestGetLReasonNoPath();
    }

    @Then ( "I received status code 500 Internal Server Error in request to get reason" )
    public void receivedStatusCode500InternalServerErrorRequestGetReason() {
        getReason.receivedStatusCode500InternalServerErrorRequestGetReason();
    }

    @And ( "I received error message \"general error\" response in request get reason" )
    public void receivedErrorMessageGeneralErrorResponseGetReason() {
        getReason.receivedErrorMessageGeneralErrorResponseGetReason();
    }
}
