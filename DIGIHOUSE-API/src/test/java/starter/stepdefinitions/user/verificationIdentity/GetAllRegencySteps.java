package starter.stepdefinitions.user.verificationIdentity;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.user.verificationIdentity.GetAllRegency;

public class GetAllRegencySteps {
    @Steps
    GetAllRegency getAllRegency;

    @Given ( "I set API endpoint valid for get all regency" )
    public void setAPIEndpointValidGetAllRegency() {
        getAllRegency.setAPIEndpointValidGetAllRegency();
    }

    @When ( "I send request to get all regency valid path" )
    public void sendRequestGetAllRegencyValidPath() {
        getAllRegency.sendRequestGetAllRegencyValidPath();
    }

    @Then ( "I received status code 200 OK in request to get all regency" )
    public void receivedStatusCode200OKGetAllRegency() {
        getAllRegency.receivedStatusCode200OKGetAllRegency();
    }

    @And ( "I received all data regency" )
    public void receivedAllDataRegency() {
        getAllRegency.receivedAllDataRegency();
    }

    @Given ( "I set API endpoint invalid for get all regency" )
    public void setAPIEndpointInvalidGetAllRegency() {
        getAllRegency.setAPIEndpointInvalidGetAllRegency();
    }

    @When ( "I send request to get all regency invalid path" )
    public void sendRequestGetAllRegencyInvalidPath() {
        getAllRegency.sendRequestGetAllRegencyInvalidPath();
    }

    @Then ( "I received status code 404 Not Found in request to get all regency" )
    public void receivedStatusCode4040NotFoundGetAllRegency() {
        getAllRegency.receivedStatusCode4040NotFoundGetAllRegency();
    }

    @And ( "I received error message \"Not Found\" response in request get all regency" )
    public void receivedErrorMessageNotFoundInGetAllRegency() {
        getAllRegency.receivedErrorMessageNotFoundInGetAllRegency();
    }
}
