package starter.stepdefinitions.user.favorite;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.user.favorite.GetListFavorite;

public class GetListFavoriteSteps {
    @Steps
    GetListFavorite getListFavorite;

    @Given ( "I set API endpoint valid for get list favorite" )
    public void setAPIEndpointValidGetListFavorite() {
        getListFavorite.setAPIEndpointValidGetListFavorite();
    }

    @When ( "I send request to get list favorite" )
    public void sendRequestGetListFavorite() {
        getListFavorite.sendRequestGetListFavorite();
    }

    @Then ( "I received status code 200 OK in request get list favorite" )
    public void receivedStatusCode200OKRequestGetListFavorite() {
        getListFavorite.receivedStatusCode200OKRequestGetListFavorite();
    }

    @And ( "I received detail favorite warehouse and message \"Success\" response in request get list favorite" )
    public void receivedDetailFavoriteWarehouseAndMessageSuccessResponseGetListFavorite() {
        getListFavorite.receivedDetailFavoriteWarehouseAndMessageSuccessResponseGetListFavorite();
    }

    @Given ( "I set API endpoint invalid for can't get list favorite without the path" )
    public void setAPIEndpointInvalidGetListFavoriteWithoutPath() {
        getListFavorite.setAPIEndpointInvalidGetListFavoriteWithoutPath();
    }

    @When ( "I send request to get list favorite no path" )
    public void sendrequestGetListFavoriteNoPath() {
        getListFavorite.sendrequestGetListFavoriteNoPath();
    }

    @Then ( "I received status code 500 Internal Server Error in request to get list favorite" )
    public void receivedStatusCode500InternalServerErrorRequestGetListFavorite() {
        getListFavorite.receivedStatusCode500InternalServerErrorRequestGetListFavorite();
    }

    @And ( "I received error message \"general error\" response in request get list favorite" )
    public void receivedErrorMessageGeneralErrorResponseGetListFavorite() {
        getListFavorite.receivedErrorMessageGeneralErrorResponseGetListFavorite();
    }
}
