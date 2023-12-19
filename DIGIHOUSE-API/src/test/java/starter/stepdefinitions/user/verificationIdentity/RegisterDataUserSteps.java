package starter.stepdefinitions.user.verificationIdentity;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.user.verificationIdentity.RegisterDataUser;

public class RegisterDataUserSteps {
    @Steps
    RegisterDataUser registerDataUser;

    @Given ("I set API endpoint valid for register data user")
    public void setAPIEndpointValidRegisterDataUser() {
        registerDataUser.setAPIEndpointValidRegisterDataUser();
    }

    @When ("I enter a valid input register data user")
    public void enterValidInputRegisterDataUser() {
        registerDataUser.enterValidInputRegisterDataUser();
    }

    @And ("I send request to register data user")
    public void sendRequestRegisterDataUser() {
        registerDataUser.sendRequestRegisterDataUser();
    }

    @Then("I received status code 201 Created in request register data user")
    public void receivedStatusCode201CreatedRequestRegisterDataUser() {
        registerDataUser.receivedStatusCode201CreatedRequestRegisterDataUser();
    }

    @And("I received register data user and message \"Success\" response in request register data user")
    public void receivedRegisterDatUserAndMessageSuccessResponseRegisterDataUser() {
        registerDataUser.receivedRegisterDatUserAndMessageSuccessResponseRegisterDataUser();
    }

    @Given("I set API endpoint invalid for register data user without the path")
    public void setAPIEndpointInvalidRegisterDataUserWithoutPath() { registerDataUser.setAPIEndpointInvalidRegisterDataUserWithoutPath();}

    @When("I send request to verification OTP no path")
    public void sendRequestVerificationOTPNoPath() { registerDataUser.sendRequestVerificationOTPNoPath();}

    @Then("I received status code 401 Unauthorized in request to register data user")
    public void receivedStatusCode401UnauthorizedRequestRegisterDataUser() { registerDataUser.receivedStatusCode401UnauthorizedRequestRegisterDataUser();}

    @And("I received error message \"invalid token\" response in request to register data user")
    public void receivedErrorMessageInvalidTokenResponseRegisterDataUser() { registerDataUser.receivedErrorMessageInvalidTokenResponseRegisterDataUser();}

    @When("I blank the register data user request")
    public void blankRegisterDataUserRequest() { registerDataUser.blankRegisterDataUserRequest();}

    @And("I send request to register data user with blank register request")
    public void sendRequestRegisterDataUserWithBlankRegisterRequest() {
        registerDataUser.sendRequestRegisterDataUserWithBlankRegisterRequest();
    }

    @Then("I received status code 400 Bad Request in request to register data user")
    public void receivedStatusCode400BadRequestRegisterDataUser() { registerDataUser.receivedStatusCode400BadRequestRegisterDataUser();}

    @And("I received the error message \"invalid request\" response in request register data user")
    public void receivedErrorMessageInvalidRequestResponseRegisterDataUser() { registerDataUser.receivedErrorMessageInvalidRequestResponseRegisterDataUser();}

    @When("I enter an invalid email for register data user")
    public void enterInvalidEmailForRegisterDataUser() { registerDataUser.enterInvalidEmailForRegisterDataUser();}

    @And("I send request to register data user with invalid email request")
    public void sendRequestRegisterDataUserWithInvalidEmailRequest() {
        registerDataUser.sendRequestRegisterDataUserWithInvalidEmailRequest();
    }

    @Then("I received status code 404 Bad Request in request register data user")
    public void receivedStatusCode404BadRequestRegisterDataUser() { registerDataUser.receivedStatusCode404BadRequestRegisterDataUser();}

    @And("I received an error message \"email not found\" response in request register data user")
    public void receivedErrorMessageEmailNotFoundResponseRegisterDataUser() { registerDataUser.receivedErrorMessageEmailNotFoundResponseRegisterDataUser();}
}