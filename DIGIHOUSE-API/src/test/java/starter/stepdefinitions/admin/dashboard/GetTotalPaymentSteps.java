package starter.stepdefinitions.admin.dashboard;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.admin.dashboard.GetTotalPayment;

public class GetTotalPaymentSteps {
    @Steps
    GetTotalPayment getTotalPayment;

    @Given ( "I set API endpoint valid for get total payment" )
    public void setAPIEndpointValidGetTotalPayment() {
        getTotalPayment.setAPIEndpointValidGetTotalPayment();
    }

    @When ( "I send request to get total payment" )
    public void sendRequestGetTotalPayment() {
        getTotalPayment.sendRequestGetTotalPayment();
    }

    @Then ( "I received status code 200 OK in request get total payment" )
    public void receivedStatusCode200OKRequestGetTotalPayment() {
        getTotalPayment.receivedStatusCode200OKRequestGetTotalPayment();
    }

    @And ( "I received message \"Success\" response in request get total payment" )
    public void receivedMessageSuccessResponseGetTotalPayment() {
        getTotalPayment.receivedMessageSuccessResponseGetTotalPayment();
    }

    @Given ( "I set API endpoint invalid for get total payment without the path" )
    public void setAPIEndpointInvalidGetTotalPaymentWithoutPath() {
        getTotalPayment.setAPIEndpointInvalidGetTotalPaymentWithoutPath();
    }

    @When ( "I send request to get total payment no path" )
    public void sendRequestGetTotalPaymentNoPath() {
        getTotalPayment.sendRequestGetTotalPaymentNoPath();
    }

    @Then ( "I received status code 500 Internal Server Error in request to get total payment" )
    public void receivedStatuscode500InternalServerErrorRequestGetTotalPayment() {
        getTotalPayment.receivedStatuscode500InternalServerErrorRequestGetTotalPayment();
    }

    @And ( "I received error message \"general error\" response in request get total payment" )
    public void receivedErrorMessageGeneralErrorResponseGetTotalPayment() {
        getTotalPayment.receivedErrorMessageGeneralErrorResponseGetTotalPayment();
    }
}
