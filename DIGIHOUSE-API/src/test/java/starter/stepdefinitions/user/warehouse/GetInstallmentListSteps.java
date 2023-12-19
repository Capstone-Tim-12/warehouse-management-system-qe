package starter.stepdefinitions.user.warehouse;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.user.warehouse.GetInstallmentList;

public class GetInstallmentListSteps {
    @Steps
    GetInstallmentList getInstallmentList;

    @Given ( "I set API endpoint valid for get installment list" )
    public void setAPIEndpointValidGetInstallmentList() {
        getInstallmentList.setAPIEndpointValidGetInstallmentList();
    }

    @When ( "I send request to get installment list" )
    public void sendRequestGetInstallmentList() {
        getInstallmentList.sendRequestGetInstallmentList();
    }

    @Then ( "I received status code 200 OK in request get installment list" )
    public void receivedStatusCode200OKRequestGetInstallmentList() {
        getInstallmentList.receivedStatusCode200OKRequestGetInstallmentList();
    }

    @And ( "I received installment data and message \"Success\" response in request get installment list" )
    public void receivedInstallmentDataAndMessageSuccessResponseGetInstallmentList() {
        getInstallmentList.receivedInstallmentDataAndMessageSuccessResponseGetInstallmentList();
    }

    @Given ( "I set API endpoint invalid for get installment list without the path" )
    public void setAPIEndpointInvalidGetInstallmentListWithoutPath() {
        getInstallmentList.setAPIEndpointInvalidGetInstallmentListWithoutPath();
    }

    @When ( "I send request to get installment list no path" )
    public void sendRequestGetInstallmentListNoPath() {
        getInstallmentList.sendRequestGetInstallmentListNoPath();
    }

    @Then ( "I received status code 500 Internal Server Error in request to get installment list" )
    public void receivedStatuscode500InternalServerErrorRequestGetInstallmentList() {
        getInstallmentList.receivedStatuscode500InternalServerErrorRequestGetInstallmentList();
    }

    @And ( "I received error message \"general error\" response in request get installment list" )
    public void receivedErrorMessageGeneralErrorResponseGetInstallmentList() {
        getInstallmentList.receivedErrorMessageGeneralErrorResponseGetInstallmentList();
    }
}
