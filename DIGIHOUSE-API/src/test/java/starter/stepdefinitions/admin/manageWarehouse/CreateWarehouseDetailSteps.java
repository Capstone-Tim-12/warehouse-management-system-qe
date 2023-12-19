package starter.stepdefinitions.admin.manageWarehouse;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.admin.manageWarehouse.CreateWarehouseDetail;

public class CreateWarehouseDetailSteps {
    @Steps
    CreateWarehouseDetail createWarehouseDetail;

    @Given ( "I set API endpoint valid for create warehouse detail" )
    public void setAPIEndpointValidCreateWarehouseDetail() {
        createWarehouseDetail.setAPIEndpointValidCreateWarehouseDetail();
    }

    @When ( "I enter a valid input create warehouse detail" )
    public void enterValidInputCreateWarehouseDetail() {
        createWarehouseDetail.enterValidInputCreateWarehouseDetail();
    }

    @And ( "I send request to create warehouse detail" )
    public void sendRequestCreateWarehouseDetail() {
        createWarehouseDetail.sendRequestCreateWarehouseDetail();
    }

    @Then ( "I received status code 201 Created in request create warehouse detail" )
    public void receivedStatusCode201CreatedRequestCreateWarehouseDetail() {
        createWarehouseDetail.receivedStatusCode201CreatedRequestCreateWarehouseDetail();
    }

    @And ( "I received message \"Success\" response in request create warehouse detail" )
    public void receivedMessageSuccessResponseCreateWarehouseDetail() {
        createWarehouseDetail.receivedMessageSuccessResponseCreateWarehouseDetail();
    }

    @Given ( "I set API endpoint invalid for create warehouse detail without the path" )
    public void setAPIEndpointInvalidCreateWarehouseDetailWithoutPath() {
        createWarehouseDetail.setAPIEndpointInvalidCreateWarehouseDetailWithoutPath();
    }

    @When ( "I send request to create warehouse detail no path" )
    public void sendRequestCreateWarehouseDetailNoPath() {
        createWarehouseDetail.sendRequestCreateWarehouseDetailNoPath();
    }

    @Then ( "I received status code 500 Internal Server Error in request to create warehouse detail" )
    public void receivedStatusCode500InternalServerErrorRequestCreateWarehouseDetail() {
        createWarehouseDetail.receivedStatusCode500InternalServerErrorRequestCreateWarehouseDetail();
    }

    @And ( "I received error message \"general error\" response in request create warehouse detail" )
    public void receivedErrorMessageGeneralErrorResponseCreateWarehouseDetail() {
        createWarehouseDetail.receivedErrorMessageGeneralErrorResponseCreateWarehouseDetail();
    }

    @When ( "I blank the create warehouse detail request" )
    public void blankCreateWarehouseDetailRequest() {
        createWarehouseDetail.blankCreateWarehouseDetailRequest();
    }

    @And ( "I send request to create warehouse detail with blank warehouse request" )
    public void sendRequestCreateWarehouseDetailWithBlankRequest() {
        createWarehouseDetail.sendRequestCreateWarehouseDetailWithBlankRequest();
    }

    @Then ( "I received status code 400 Bad Request in request to create warehouse detail" )
    public void receivedStatusCode400BadRequestInRequestCreateWarehouseDetail() {
        createWarehouseDetail.receivedStatusCode400BadRequestInRequestCreateWarehouseDetail();
    }

    @And ( "I received the error message \"input price has on the required tag\" response in request create warehouse detail" )
    public void receivedErrorMessageInputPriceHasOnTheRequiredTagResponseCreateWarehouseDetail() {
        createWarehouseDetail.receivedErrorMessageInputPriceHasOnTheRequiredTagResponseCreateWarehouseDetail();
    }
}
