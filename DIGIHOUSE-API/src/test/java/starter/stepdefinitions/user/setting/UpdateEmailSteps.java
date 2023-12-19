package starter.stepdefinitions.user.setting;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.user.setting.UpdateEmail;

public class UpdateEmailSteps {
    @Steps
    UpdateEmail updateEmail;

    @Given ( "I set API endpoint valid for update email" )
    public void setAPIEndpointValidUpdateEmail() {
        updateEmail.setAPIEndpointValidUpdateEmail();
    }

    @Given ( "I set API endpoint invalid for update email without the path" )
    public void setAPIEndpointInvalidUpdateEmailWithoutPath() {
        updateEmail.setAPIEndpointInvalidUpdateEmailWithoutPath();
    }

    @When ( "I send request to update email no path" )
    public void sendRequestUpdateEmailNoPath() {
        updateEmail.sendRequestUpdateEmailNoPath();
    }

    @Then ( "I received status code 500 Internal Server Error in request to update email" )
    public void receivedStatusCode500InternalServerErrorRequestUpdateEmail() {
        updateEmail.receivedStatusCode500InternalServerErrorRequestUpdateEmail();
    }

    @And ( "I received error message \"general error\" response in request update email" )
    public void receivedErrorMessageGeneralErrorResponseUpdateEmail() {
        updateEmail.receivedErrorMessageGeneralErrorResponseUpdateEmail();
    }

    @When ( "I blank the update email request" )
    public void blankUpdateEmailRequest() {
        updateEmail.blankUpdateEmailRequest();
    }

    @And ( "I send blank request to update email" )
    public void sendBlankRequestUpdateEmail() {
        updateEmail.sendBlankRequestUpdateEmail();
    }

    @Then ( "I received status code 400 Bad Request in request to update email" )
    public void receivedStatusCode400BadRequestUpdateEmail() {
        updateEmail.receivedStatusCode400BadRequestUpdateEmail();
    }

    @And ( "I received the error message \"input email has on the required tag\" response in update email" )
    public void receivedErrorMessageInputEmailHasonTheRequiredTagResponseUpdateEmail() {
        updateEmail.receivedErrorMessageInputEmailHasonTheRequiredTagResponseUpdateEmail();
    }

    @When ( "I enter email already regist in database for update email" )
    public void enterEmailAlreadyRegistInDatabaseUpdateEmail() {
        updateEmail.enterEmailAlreadyRegistInDatabaseUpdateEmail();
    }

    @And ( "I send request to update email with email already existing" )
    public void sendRequestUpdateEmailWithEmailAlreadyExisting() {
        updateEmail.sendRequestUpdateEmailWithEmailAlreadyExisting();
    }

    @And ( "I received the error message \"email is already existing\" response in update email" )
    public void receivedErrorMessageEmailAlreadyExistingResponseUpdateEmail() {
        updateEmail.receivedErrorMessageEmailAlreadyExistingResponseUpdateEmail();
    }

    @When ( "I enter a email invalid format for update email" )
    public void enterEmailInvalidFormatUpdateEmail() {
        updateEmail.enterEmailInvalidFormatUpdateEmail();
    }

    @And ( "I send request to update email with invalid format email" )
    public void sendRequestUpdateEmailWithInvalidFormatEmail() {
        updateEmail.sendRequestUpdateEmailWithInvalidFormatEmail();
    }

    @And ( "I received the error message \"input email has on the email tag\" response in update email" )
    public void receivedErrorMessageInputEmailHasOnTheEmailTagReponseUpdateEmail() {
        updateEmail.receivedErrorMessageInputEmailHasOnTheEmailTagReponseUpdateEmail();
    }
}
