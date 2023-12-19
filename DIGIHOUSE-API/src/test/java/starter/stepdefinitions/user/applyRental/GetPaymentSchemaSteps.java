package starter.stepdefinitions.user.applyRental;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.user.applyRental.GetPaymentSchema;

public class GetPaymentSchemaSteps {
    @Steps
    GetPaymentSchema getPaymentSchema;

    @Given ( "I set API endpoint valid for get payment schema" )
    public void setAPIEndpointValidGetPaymentSchema() {
        getPaymentSchema.setAPIEndpointValidGetPaymentSchema();
    }

    @When ( "I send request to get payment schema" )
    public void sendRequestGetPaymentSchema() {
        getPaymentSchema.sendRequestGetPaymentSchema();
    }

    @Then ( "I received status code 200 OK in request get payment schema" )
    public void receivedStatusCode200OKRequestGetPaymentSchema() {
        getPaymentSchema.receivedStatusCode200OKRequestGetPaymentSchema();
    }

    @And ( "I received payment schema data and message \"Success\" response in request get payment schema" )
    public void receivedPaymentSchemaDataAndMessageSuccessResponseGetPaymentSchema() {
        getPaymentSchema.receivedPaymentSchemaDataAndMessageSuccessResponseGetPaymentSchema();
    }

    @Given ( "I set API endpoint invalid for get payment schema without the path" )
    public void setAPIEndpointInvalidGetPaymentSchemaWithoutPath() {
        getPaymentSchema.setAPIEndpointInvalidGetPaymentSchemaWithoutPath();
    }

    @When ( "I send request to get payment schema no path" )
    public void sendRequestGetPaymentSchemaNoPath() {
        getPaymentSchema.sendRequestGetPaymentSchemaNoPath();
    }

    @Then ( "I received status code 500 Internal Server Error in request to get payment schema" )
    public void receivedStatuscode500InternalServerErrorRequestGetPaymentSchema() {
        getPaymentSchema.receivedStatuscode500InternalServerErrorRequestGetPaymentSchema();
    }

    @And ( "I received error message \"general error\" response in request get payment schema" )
    public void receivedErrorMessageGeneralErrorResponseGetPaymentSchema() {
        getPaymentSchema.receivedErrorMessageGeneralErrorResponseGetPaymentSchema();
    }
}