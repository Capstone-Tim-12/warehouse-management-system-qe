package starter.stepdefinitions.user.favorite;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.user.favorite.DeleteFavoriteByID;

public class DeleteFavoriteByIDSteps {
    @Steps
    DeleteFavoriteByID deleteFavoriteByID;

    @Given ( "I set API endpoint valid for delete favorite by ID" )
    public void setAPIEndpointValidDeleteFavoriteByID() {
        deleteFavoriteByID.setAPIEndpointValidDeleteFavoriteByID();
    }

    @When ( "I send request to delete favorite by ID" )
    public void sendRequestDeleteFavoriteByID() {
        deleteFavoriteByID.sendRequestDeleteFavoriteByID();
    }

    @Then ( "I received status code 200 OK in request delete favorite by ID" )
    public void receivedStatusCode200OKRequestDeleteFavoriteByID() {
        deleteFavoriteByID.receivedStatusCode200OKRequestDeleteFavoriteByID();
    }

    @And ( "I received message \"Success\" response in request delete favorite by ID" )
    public void receivedMessageSuccessResponseDeleteFavoriteByID() {
        deleteFavoriteByID.receivedMessageSuccessResponseDeleteFavoriteByID();
    }

    @Given ( "I set API endpoint invalid for can't delete favorite by ID without the path" )
    public void setAPIEndpointInvalidDeleteFavoriteByIDWithoutPath() {
        deleteFavoriteByID.setAPIEndpointInvalidDeleteFavoriteByIDWithoutPath();
    }

    @When ( "I send request to delete favorite by ID no path" )
    public void sendRequestDeleteFavoriteByIDNoPath() {
        deleteFavoriteByID.sendRequestDeleteFavoriteByIDNoPath();
    }

    @Then ( "I received status code 500 Internal Server Error in request to delete favorite by ID" )
    public void receivedStatusCode500InternalServerErrorRequestDeleteFavoriteByID() {
        deleteFavoriteByID.receivedStatusCode500InternalServerErrorRequestDeleteFavoriteByID();
    }

    @And ( "I received error message \"general error\" response in request delete favorite by ID" )
    public void receivedErrorMessageGeneralErrorResponseDeleteFavoriteByID() {
        deleteFavoriteByID.receivedErrorMessageGeneralErrorResponseDeleteFavoriteByID();
    }

    @Given ( "I set API endpoint invalid for can't delete favorite by ID with invalid ID" )
    public void setAPIEndpointDeleteFavoriteByIDWitInvalidID() {
        deleteFavoriteByID.setAPIEndpointDeleteFavoriteByIDWitInvalidID();
    }

    @When ( "I send request to delete favorite by ID with invalid ID" )
    public void sendRequestDeleteFavoriteByIDWithInvalidID() {
        deleteFavoriteByID.sendRequestDeleteFavoriteByIDWithInvalidID();
    }

    @Then ( "I received status code 404 Not Found in request delete favorite by ID" )
    public void receivedStatusCode404NotFoundRequestDeleteFavoriteByID() {
        deleteFavoriteByID.receivedStatusCode404NotFoundRequestDeleteFavoriteByID();
    }

    @And ( "I received message \"Not Found\" response in request delete favorite by ID" )
    public void receivedMessageNotFoundResponseDeleteFavoriteByID() {
        deleteFavoriteByID.receivedMessageNotFoundResponseDeleteFavoriteByID();
    }
}
