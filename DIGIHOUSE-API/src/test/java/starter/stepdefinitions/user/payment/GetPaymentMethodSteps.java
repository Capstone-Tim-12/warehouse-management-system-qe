package starter.stepdefinitions.user.payment;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.user.payment.GetPaymentMethod;

public class GetPaymentMethodSteps {
    @Steps
    GetPaymentMethod getPaymentMethod;

    @Given ( "I set API endpoint valid for get payment method" )
    public void setAPIEndpointValidGetPaymentMethod() {
        getPaymentMethod.setAPIEndpointValidGetPaymentMethod();
    }

    @When ( "I send request to get payment method" )
    public void sendRequestGetPaymentMethod() {
        getPaymentMethod.sendRequestGetPaymentMethod();
    }

    @Then ( "I received status code 200 OK in request get payment method" )
    public void receivedStatusCode200OKRequestGetPaymentMethod() {
        getPaymentMethod.receivedStatusCode200OKRequestGetPaymentMethod();
    }

    @And ( "I received message \"Success\" response in request get payment method" )
    public void receivedMessageSuccessResponseGetPaymentMethod() {
        getPaymentMethod.receivedMessageSuccessResponseGetPaymentMethod();
    }

    @Given ( "I set API endpoint invalid for get payment method without the path" )
    public void setAPIEndpointInvalidGetPaymentMethodWithoutPath() {
        getPaymentMethod.setAPIEndpointInvalidGetPaymentMethodWithoutPath();
    }

    @When ( "I send request to get payment method no path" )
    public void sendRequestGetPaymentMethodNoPath() {
        getPaymentMethod.sendRequestGetPaymentMethodNoPath();
    }

    @Then ( "I received status code 500 Internal Server Error in request to get payment method" )
    public void receivedStatuscode500InternalServerErrorRequestGetPaymentMethod() {
        getPaymentMethod.receivedStatuscode500InternalServerErrorRequestGetPaymentMethod();
    }

    @And ( "I received error message \"general error\" response in request get payment method" )
    public void receivedErrorMessageGeneralErrorResponseGetPaymentMethod() {
        getPaymentMethod.receivedErrorMessageGeneralErrorResponseGetPaymentMethod();
    }
}
