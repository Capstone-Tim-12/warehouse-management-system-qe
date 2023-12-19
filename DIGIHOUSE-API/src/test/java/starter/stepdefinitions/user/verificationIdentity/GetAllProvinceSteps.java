package starter.stepdefinitions.user.verificationIdentity;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.user.verificationIdentity.GetAllProvince;

public class GetAllProvinceSteps {
    @Steps
    GetAllProvince getAllProvince;

    @Given ("I set API endpoint valid for get all province")
    public void setAPIEndpointValidGetAllProvince() {
        getAllProvince.setAPIEndpointValidGetAllProvince();
    }

    @When ("I send request to get all province valid path")
    public void sendRequestGetAllProvinceValidPath() {
        getAllProvince.sendRequestGetAllProvinceValidPath();
    }

    @Then ("I received status code 200 OK in request to get all province")
    public void receivedStatusCode200OKGetAllProvince() {
        getAllProvince.receivedStatusCode200OKGetAllProvince();
    }

    @And ("I received all data province")
    public void receivedAllDataProvince() {
        getAllProvince.receivedAllDataProvince();
    }

    @Given("I set API endpoint invalid for get all province")
    public void setAPIEndpointInvalidGetAllProvince() { getAllProvince.setAPIEndpointInvalidGetAllProvince();}

    @When("I send request to get all province invalid path")
    public void sendRequestGetAllProvinceInvalidPath() { getAllProvince.sendRequestGetAllProvinceInvalidPath();}

    @Then("I received status code 404 Not Found in request to get all province")
    public void receivedStatusCode4040NotFoundGetAllProvince() { getAllProvince.receivedStatusCode4040NotFoundGetAllProvince();}

    @And("I received error message \"Not Found\" response in request get all province")
    public void receivedErrorMessageNotFoundInGetAllProvince() {
        getAllProvince.receivedErrorMessageNotFoundInGetAllProvince();
    }

}