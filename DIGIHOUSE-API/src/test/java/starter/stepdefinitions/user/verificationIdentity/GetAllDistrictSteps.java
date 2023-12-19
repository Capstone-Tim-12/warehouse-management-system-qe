package starter.stepdefinitions.user.verificationIdentity;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.user.verificationIdentity.GetAllDistrict;

public class GetAllDistrictSteps {
    @Steps
    GetAllDistrict getAllDistrict;

    @Given ( "I set API endpoint valid for get all district" )
    public void setAPIEndpointValidGetAllDistrict() {
        getAllDistrict.setAPIEndpointValidGetAllDistrict();
    }

    @When ( "I send request to get all district valid path" )
    public void sendRequestGetAllDistrictValidPath() {
        getAllDistrict.sendRequestGetAllDistrictValidPath();
    }

    @Then ( "I received status code 200 OK in request to get all district" )
    public void receivedStatusCode200OKGetAllDistrict() {
        getAllDistrict.receivedStatusCode200OKGetAllDistrict();
    }

    @And ( "I received all data district" )
    public void receivedAllDataDistrict() {
        getAllDistrict.receivedAllDataDistrict();
    }

    @Given ( "I set API endpoint invalid for get all district" )
    public void setAPIEndpointInvalidGetAllDistrict() {
        getAllDistrict.setAPIEndpointInvalidGetAllDistrict();
    }

    @When ( "I send request to get all district invalid path" )
    public void sendRequestGetAllDistrictInvalidPath() {
        getAllDistrict.sendRequestGetAllDistrictInvalidPath();
    }

    @Then ( "I received status code 404 Not Found in request to get all district" )
    public void receivedStatusCode4040NotFoundGetAllDistrict() {
        getAllDistrict.receivedStatusCode4040NotFoundGetAllDistrict();
    }

    @And ( "I received error message \"Not Found\" response in request get all district" )
    public void receivedErrorMessageNotFoundInGetAllDistrict() {
        getAllDistrict.receivedErrorMessageNotFoundInGetAllDistrict();
    }
}

