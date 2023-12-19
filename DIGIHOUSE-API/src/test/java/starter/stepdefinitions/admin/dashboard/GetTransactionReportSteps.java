package starter.stepdefinitions.admin.dashboard;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.admin.dashboard.GetTransactionReport;

public class GetTransactionReportSteps {
    @Steps
    GetTransactionReport getTransactionReport;

    @Given ( "I set API endpoint valid for get transaction report" )
    public void setAPIEndpointValidGetTransactionReport() {
        getTransactionReport.setAPIEndpointValidGetTransactionReport();
    }

    @When ( "I send request to get transaction report" )
    public void sendRequestGetTransactionReport() {
        getTransactionReport.sendRequestGetTransactionReport();
    }

    @Then ( "I received status code 200 OK in request get transaction report" )
    public void receivedStatusCode200OKRequestGetTransactionReport() {
        getTransactionReport.receivedStatusCode200OKRequestGetTransactionReport();
    }

    @And ( "I received message \"Success\" response in request get transaction report" )
    public void receivedMessageSuccessResponseGetTransactionReport() {
        getTransactionReport.receivedMessageSuccessResponseGetTransactionReport();
    }

    @Given ( "I set API endpoint invalid for get transaction report without the path" )
    public void setAPIEndpointInvalidGetTransactionReportWithoutPath() {
        getTransactionReport.setAPIEndpointInvalidGetTransactionReportWithoutPath();
    }

    @When ( "I send request to get transaction report no path" )
    public void sendRequestGetTransactionReportNoPath() {
        getTransactionReport.sendRequestGetTransactionReportNoPath();
    }

    @Then ( "I received status code 500 Internal Server Error in request to get transaction report" )
    public void receivedStatuscode500InternalServerErrorRequestGetTransactionReport() {
        getTransactionReport.receivedStatuscode500InternalServerErrorRequestGetTransactionReport();
    }

    @And ( "I received error message \"general error\" response in request get transaction report" )
    public void receivedErrorMessageGeneralErrorResponseGetTransactionReport() {
        getTransactionReport.receivedErrorMessageGeneralErrorResponseGetTransactionReport();
    }
}
