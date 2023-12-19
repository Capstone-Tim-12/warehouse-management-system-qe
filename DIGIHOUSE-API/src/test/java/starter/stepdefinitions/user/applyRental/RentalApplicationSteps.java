package starter.stepdefinitions.user.applyRental;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.user.applyRental.RentalApplication;

public class RentalApplicationSteps {
    @Steps
    RentalApplication rentalApplication;

    @Given ( "I set API endpoint valid for rental application" )
    public void setAPIEndpointValidRentalApplication() {
        rentalApplication.setAPIEndpointValidRentalApplication();
    }

    @When ( "I send request to rental application" )
    public void sendRequestRentalApplication() {
        rentalApplication.sendRequestRentalApplication();
    }

    @Then ( "I received status code 200 OK in request rental application" )
    public void receivedStatusCode200OKRequestRentalApplication() {
        rentalApplication.receivedStatusCode200OKRequestRentalApplication();
    }

    @And ( "I received message \"Success\" response in request rental application" )
    public void receivedMessageSuccessRentalApplication() {
        rentalApplication.receivedMessageSuccessRentalApplication();
    }

    @Given ( "I set API endpoint invalid for rental application without the path" )
    public void setAPIEndpointInvalidRentalApplicationWithoutPath() {
        rentalApplication.setAPIEndpointInvalidRentalApplicationWithoutPath();
    }

    @When ( "I send request to rental application no path" )
    public void sendRequestRentalApplicationNoPath() {
        rentalApplication.sendRequestRentalApplicationNoPath();
    }

    @Then ( "I received status code 500 Internal Server Error in request to rental application" )
    public void receivedStatusCode500InternalServerErrorRequestRentalApplication() {
        rentalApplication.receivedStatusCode500InternalServerErrorRequestRentalApplication();
    }

    @And ( "I received error message \"general error\" response in request rental application" )
    public void receivedErrorMessageGeneralErrorResponseRentalApplication() {
        rentalApplication.receivedErrorMessageGeneralErrorResponseRentalApplication();
    }

    @When ( "I blank the rental application request" )
    public void blankRentalApplicationRequest() {
        rentalApplication.blankRentalApplicationRequest();
    }

    @And ( "I send blank request to rental application" )
    public void sendBlankRequestRentalApplication() {
        rentalApplication.sendBlankRequestRentalApplication();
    }

    @Then ( "I received status code 400 Bad Request in request to rental application" )
    public void receivedStatusCode400BadRequestRentalApplication() {
        rentalApplication.receivedStatusCode400BadRequestRentalApplication();
    }

    @And ( "I received the error message \"invalid request\" response in rental application" )
    public void receivedErrorMessageInvalidRequestResponseRentalApplication() {
        rentalApplication.receivedErrorMessageInvalidRequestResponseRentalApplication();
    }

    @When ( "I enter a warehouse ID in rental application" )
    public void enterWarehouseIDInRentalApplication() {
        rentalApplication.enterWarehouseIDInRentalApplication();
    }

    @And ( "I enter a payment schema ID" )
    public void enterPaymentSchemaID() {
        rentalApplication.enterPaymentSchemaID();
    }

    @And ( "I enter a duration" )
    public void enterDuration() {
        rentalApplication.enterDuration();
    }

    @And ( "I enter an invalid data entry" )
    public void enterInvalidDataEntry() {
        rentalApplication.enterInvalidDataEntry();
    }

    @And ( "I send invalid data entry request to rental application" )
    public void sendInvalidDataEntryRequestRentalApplication() {
        rentalApplication.sendInvalidDataEntryRequestRentalApplication();
    }

    @And ( "I received the error message \"date cannot be less than the current date\" response in rental application" )
    public void receivedErrorMessageDateCannotBeLessThanCurrentDateResponseRentalApplication() {
        rentalApplication.receivedErrorMessageDateCannotBeLessThanCurrentDateResponseRentalApplication();
    }
}
