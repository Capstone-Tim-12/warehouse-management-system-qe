package starter.stepdefinitions.user.favorite;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.user.favorite.CreateNewFavorite;

public class CreateNewFavoriteSteps {
    @Steps
    CreateNewFavorite createNewFavorite;

    @Given ( "I set API endpoint valid for create new favorite" )
    public void setAPIEndpointValidCreateNewFavorite() {
        createNewFavorite.setAPIEndpointValidCreateNewFavorite();
    }

    @When ( "I enter a warehouse ID in create new favorite" )
    public void enterWarehouseIDInCreateNewFavorite() {
        createNewFavorite.enterWarehouseIDInCreateNewFavorite();
    }

    @And ( "I send request to create new favorite" )
    public void sendRequestCreateNewFavorite() {
        createNewFavorite.sendRequestCreateNewFavorite();
    }

    @Then ( "I received status code 201 Created in request create new favorite" )
    public void receivedStatusCode201CreatedRequestCreateNewFavorite() {
        createNewFavorite.receivedStatusCode201CreatedRequestCreateNewFavorite();
    }

    @And ( "I received message \"Success\" response in request create new favorite" )
    public void receivedMessageSuccessResponseCreateNewFavorite() {
        createNewFavorite.receivedMessageSuccessResponseCreateNewFavorite();
    }

    @Given ( "I set API endpoint invalid for create new favorite without the path" )
    public void setAPIEndpointInvalidCreateNewFavoriteWithoutPath() {
        createNewFavorite.setAPIEndpointInvalidCreateNewFavoriteWithoutPath();
    }

    @When ( "I send request to create new favorite no path" )
    public void sendRequestCreateNewFavoriteNoPath() {
        createNewFavorite.sendRequestCreateNewFavoriteNoPath();
    }

    @Then ( "I received status code 500 Internal Server Error in request to create new favorite" )
    public void receivedStatusCode500InternalServerErrorRequestCreateNewFavorite() {
        createNewFavorite.receivedStatusCode500InternalServerErrorRequestCreateNewFavorite();
    }

    @And ( "I received error message \"general error\" response in request create new favorite" )
    public void receivedErrorMessageGeneralErrorResponseCreateNewFavorite() {
        createNewFavorite.receivedErrorMessageGeneralErrorResponseCreateNewFavorite();
    }

    @When ( "I blank the warehouse ID request" )
    public void blankWarehouseIDRequest() {
        createNewFavorite.blankWarehouseIDRequest();
    }

    @And ( "I send blank request to create new favorite" )
    public void sendBlankRequestCreateNewFavorite() {
        createNewFavorite.sendBlankRequestCreateNewFavorite();
    }

    @Then ( "I received status code 400 Bad Request in request to create new favorite" )
    public void receivedStatusCode400BadRequestCreateNewFavorite() {
        createNewFavorite.receivedStatusCode400BadRequestCreateNewFavorite();
    }

    @And ( "I received the error message \"invalid request\" response in create new favorite" )
    public void receivedErrorMessageInvalidRequestResponseCreateNewFavorite() {
        createNewFavorite.receivedErrorMessageInvalidRequestResponseCreateNewFavorite();
    }
}
