package starter.stepdefinitions.admin.manageWarehouse;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.admin.manageWarehouse.GetInstallmentListDashboard;

public class GetInstallmentListDashboardSteps {
    @Steps
    GetInstallmentListDashboard getInstallmentListDashboard;

    @Given ( "I set API endpoint valid for get installment list dashboard" )
    public void setAPIEndpointValidGetInstallmentListDashboard() {
        getInstallmentListDashboard.setAPIEndpointValidGetInstallmentListDashboard();
    }

    @When ( "I send request to get installment list dashboard" )
    public void sendRequestGetInstallmentListDashboard() {
        getInstallmentListDashboard.sendRequestGetInstallmentListDashboard();
    }

    @Then ( "I received status code 200 OK in request get installment list dashboard" )
    public void receivedStatusCode200OKRequestGetInstallmentListDashboard() {
        getInstallmentListDashboard.receivedStatusCode200OKRequestGetInstallmentListDashboard();
    }

    @And ( "I received message \"Success\" response in request get installment list dashboard" )
    public void receivedMessageSuccessResponseGetInstallmentListDashboard() {
        getInstallmentListDashboard.receivedMessageSuccessResponseGetInstallmentListDashboard();
    }

    @Given ( "I set API endpoint invalid for get installment list dashboard without the path" )
    public void setAPIEndpointInvalidGetInstallmentListDashboardWithoutPath() {
        getInstallmentListDashboard.setAPIEndpointInvalidGetInstallmentListDashboardWithoutPath();
    }

    @When ( "I send request to get installment list dashboard no path" )
    public void sendRequestGetInstallmentListDashboardNoPath() {
        getInstallmentListDashboard.sendRequestGetInstallmentListDashboardNoPath();
    }

    @Then ( "I received status code 500 Internal Server Error in request to get installment list dashboard" )
    public void receivedStatusCode500InternalServerErrorRequestGetInstallementListDashboard() {
        getInstallmentListDashboard.receivedStatusCode500InternalServerErrorRequestGetInstallementListDashboard();
    }

    @And ( "I received error message \"general error\" response in request get installment list dashboard" )
    public void receivedErrorMessageGeneralErrorResponseGetInstallmentListDashboard() {
        getInstallmentListDashboard.receivedErrorMessageGeneralErrorResponseGetInstallmentListDashboard();
    }
}
