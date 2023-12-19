package starter.stepdefinitions.user.authentication;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.user.authentication.Register;

public class RegisterSteps {
    @Steps
    Register register;

    @Given("I set API endpoint valid for register new user")
    public void setAPIEndpointValidRegisterNewUser() {
        register.setAPIEndpointValidRegisterNewUser();
    }

    @And("I enter username")
    public void enterUsername() { register.enterUsername();
    }

    @When("I enter a email valid format")
    public void enterEmailValidFormat() {
        register.enterEmailValidFormat();
    }

    @And("I enter password")
    public void enterPassword() {
        register.enterPassword();
    }

    @And("I send request to register user")
    public void sendRequestRegisterUser() {
        register.sendRequestRegisterUser();
    }

    @Then("I received status code 201 Created register user")
    public void receivedStatusCode201CreatedRegisterUser() { register.receivedStatusCode201CreatedRegisterUser();}

    @And("I received register user data response register user")
    public void receivedRegisterUserDataResponseRegisterUser() { register.receivedRegisterUserDataResponseRegisterUser();}

    @Given("I set API endpoint invalid for register user without the path")
    public void setAPIEndpointInvalidRegisterUserWithoutPath() { register.setAPIEndpointInvalidRegisterUserWithoutPath();}

    @When("I send request to register user no path")
    public void sendRequestRegisterUserNoPath() { register.sendRequestRegisterUserNoPath();}

    @Then("I received status code 401 Unauthorized in request to register user")
    public void receivedStatusCode401UnauthorizedRequestRegisterUser() { register.receivedStatusCode401UnauthorizedRequestRegisterUser();}

    @And("I received error message \"invalid token\" register response")
    public void receivedErrorMessageInvalidTokenRegisterResponse() { register.receivedErrorMessageInvalidTokenRegisterResponse();}

    @When("I blank the register request in register")
    public void blankRegisterRequestInRegister() { register.blankRegisterRequestInRegister();}

    @And("I send request to register user with blank register request")
    public void sendRequestRegisterUserWithBlankRegisterRequest() {
        register.sendRequestRegisterUserWithBlankRegisterRequest();
    }

    @Then("I received status code 400 Bad Request in request to register user")
    public void receivedStatusCode400BadRequestRegisterUser() { register.receivedStatusCode400BadRequestRegisterUser();}

    @And("I received the error message \"input password has on the min tag\" response")
    public void receivedErrorMessageInputPasswordHasOnTheMintagRegisterResponse() { register.receivedErrorMessageInputPasswordHasOnTheMintagRegisterResponse();}

    @When("I blank the username request")
    public void blankUsernameRequest() { register.blankUsernameRequest();}

    @And("I send request to register user with blank username request")
    public void sendRequestRegisterUserWithBlankUsernameRequest() {
        register.sendRequestRegisterUserWithBlankUsernameRequest();
    }

    @And("I received the error message \"fullname is required\" response")
    public void receivedErrorMessageFullnameIsRequiredResponse() { register.receivedErrorMessageFullnameIsRequiredResponse();}

    @And("I blank the email request")
    public void blankEmailRequest() { register.blankEmailRequest();}

    @And("I send request to register user with blank email request")
    public void sendRequestRegisterUserWithBlankEmailRequest() {
        register.sendRequestRegisterUserWithBlankEmailRequest();
    }

    @And("I received the error message \"email is required\" register response")
    public void receivedErrorMessageEmailIsRequiredRegisterResponse() { register.receivedErrorMessageEmailIsRequiredRegisterResponse();}

    @And("I blank the password request")
    public void blankPasswordRequest() { register.blankPasswordRequest();}

    @And("I send request to register user with blank password request")
    public void sendRequestRegisterUserWithBlankPasswordRequest() {
        register.sendRequestRegisterUserWithBlankPasswordRequest();
    }

    @And("I received the error message \"password is required\" response")
    public void receivedErrorMessagePasswordIsRequiredResponse() { register.receivedErrorMessagePasswordIsRequiredResponse();}

    @And("I enter email already regist in database")
    public void enterEmailAlreadyRegistInDatabase() { register.enterEmailAlreadyRegistInDatabase();}

    @And("I send request to register user with email already regist in database request")
    public void sendRequestRegisterUserWithEmailAlreadyRegistInDatabaseRequest() {
        register.sendRequestRegisterUserWithEmailAlreadyRegistInDatabaseRequest();
    }

    @Then("I received status code 409 Conflict in request to register user")
    public void receivedStatusCode409ConflictRequestRegisterUser() { register.receivedStatusCode409ConflictRequestRegisterUser();}

    @And("I received the error message \"email or username already exists\" response")
    public void receivedErrorMessageEmailAlreadyRegisterResponse() { register.receivedErrorMessageEmailAlreadyRegisterResponse();}

    @When("I enter email invalid format")
    public void enterEmailInvalidFormat() { register.enterEmailInvalidFormat();}

    @And("I send request to register user with email invalid format request")
    public void sendRequestRegisterUserWithEmailInvalidFormatRequest() {
        register.sendRequestRegisterUserWithEmailInvalidFormatRequest();
    }

    @And("I received the error message \"unkown email format\" response")
    public void receivedErrorMessageUnkownEmailFormatResponse() { register.receivedErrorMessageUnkownEmailFormatResponse();}
}
