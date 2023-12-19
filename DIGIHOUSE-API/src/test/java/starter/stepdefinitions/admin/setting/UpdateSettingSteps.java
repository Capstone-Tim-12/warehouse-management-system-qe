package starter.stepdefinitions.admin.setting;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.admin.setting.UpdateSetting;

public class UpdateSettingSteps {
    @Steps
    UpdateSetting updateSetting;

    @Given ( "I set API endpoint valid for update setting" )
    public void setAPIEndpointValidUpdateSetting() {
        updateSetting.setAPIEndpointValidUpdateSetting();
    }

    @When ( "I enter a valid update setting request" )
    public void enterValidUpdateSettingRequest() {
        updateSetting.enterValidUpdateSettingRequest();
    }

    @And ( "I send request to update setting" )
    public void sendRequestUpdateSetting() {
        updateSetting.sendRequestUpdateSetting();
    }

    @Then ( "I received status code 200 OK in request update setting" )
    public void receivedStatusCode200OKRequestUpdateSetting() {
        updateSetting.receivedStatusCode200OKRequestUpdateSetting();
    }

    @And ( "I received message \"Success\" response in request update setting" )
    public void receivedMessageSuccessResponseUpdateSetting() {
        updateSetting.receivedMessageSuccessResponseUpdateSetting();
    }

    @Given ( "I set API endpoint invalid for update setting without the path" )
    public void setAPIEndpointInvalidUpdateSettingWithoutPath() {
        updateSetting.setAPIEndpointInvalidUpdateSettingWithoutPath();
    }

    @When ( "I send request to update setting no path" )
    public void sendRequestUpdateSettingNoPath() {
        updateSetting.sendRequestUpdateSettingNoPath();
    }

    @Then ( "I received status code 500 Internal Server Error in request to update setting" )
    public void receivedStatusCode500InternalServerErrorRequestUpdateSetting() {
        updateSetting.receivedStatusCode500InternalServerErrorRequestUpdateSetting();
    }

    @And ( "I received error message \"general error\" response in request update setting" )
    public void receivedErrorMessageGeneralErrorResponseUpdateSetting() {
        updateSetting.receivedErrorMessageGeneralErrorResponseUpdateSetting();
    }
    @When ( "I blank the update setting request" )
    public void blankUpdateSettingRequest() {
        updateSetting.blankUpdateSettingRequest();
    }

    @And ( "I send blank request to update setting" )
    public void sendBlankRequestUpdateSetting() {
        updateSetting.sendBlankRequestUpdateSetting();
    }

    @Then ( "I received status code 400 Bad Request in request to update setting" )
    public void receivedStatusCode400BadRequestRequestUpdateSetting() {
        updateSetting.receivedStatusCode400BadRequestRequestUpdateSetting();
    }

    @And ( "I received the error message \"input password has on the required tag\" response in update setting" )
    public void receivedMessageInputPasswordHasOnTheRequiredTagResponseUpdateSetting() {
        updateSetting.receivedMessageInputPasswordHasOnTheRequiredTagResponseUpdateSetting();
    }

    @When ( "I blank the username request for update setting" )
    public void blankUsernameRequestForUpdateSetting() {
        updateSetting.blankUsernameRequestForUpdateSetting();
    }

    @And ( "I enter a email valid format for update setting" )
    public void enterEmailValidFormatForUpdateSetting() {
        updateSetting.enterEmailValidFormatForUpdateSetting();
    }

    @And ( "I enter password for update setting" )
    public void enterPassword() {
        updateSetting.enterPasswordForUpdateSetting();
    }

    @And ( "I send request to update setting user with blank username request" )
    public void sendRequestUpdateSettingWithBlankUsername() {
        updateSetting.sendRequestUpdateSettingWithBlankUsername();
    }

    @And ( "I received the error message \"input username has on the required tag\" response in update setting" )
    public void receivedMessageInputUsernameHasOnTheRequiredTagResponseUpdateSetting() {
        updateSetting.receivedMessageInputUsernameHasOnTheRequiredTagResponseUpdateSetting();
    }

    @When ( "I enter a username for update setting" )
    public void enterUsernameForUpdateSetting() {
        updateSetting.enterUsernameForUpdateSetting();
    }

    @And ( "I blank the email request for update setting" )
    public void blankEmailRequestForUpdateSetting() {
        updateSetting.blankEmailRequestForUpdateSetting();
    }

    @And ( "I send request to update setting user with blank email request" )
    public void sendRequestUpdateSettingWithBlankEmail() {
        updateSetting.sendRequestUpdateSettingWithBlankEmail();
    }

    @And ( "I received the error message \"input email has on the required tag\" response in update setting" )
    public void receivedMessageInputEmailHasOnTheRequiredTagResponseUpdateSetting() {
        updateSetting.receivedMessageInputEmailHasOnTheRequiredTagResponseUpdateSetting();
    }

    @And ( "I blank the password for update setting" )
    public void blankPasswordForUpdateSetting() {
        updateSetting.blankPasswordForUpdateSetting();
    }

    @And ( "I send request to update setting user with blank password request" )
    public void sendRequestUpdateSettingWithBlankPassword() {
        updateSetting.sendRequestUpdateSettingWithBlankPassword();
    }
}
