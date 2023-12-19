package starter.stepdefinitions.user.authentication;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.user.authentication.Login;

public class LoginSteps {
    @Steps
    Login login;

    @Given("I set API endpoint valid for login user")
    public void setAPIEndpointValidLoginUser() {
        login.setAPIEndpointValidLoginUser();
    }

    //Scenario 1
    @When("I enter a valid email for login user")
    public void enterValidEmailForLoginUser() {
        login.enterValidEmailForLoginUser();
    }

    @And("I enter a valid password")
    public void enterValidPassword() {
        login.enterValidPassword();
    }

    @And("I send request to login user with valid {string} and valid {string}")
    public void sendRequestLoginUserWithValidCredential(String email, String password) {
        login.sendRequestLoginUserWithValidCredential(email, password);
    }

    @Then("I received status code 200 OK login user")
    public void receivedStatusCode200OKLoginUser() { login.receivedStatusCode200OKLoginUser();}

    @And("I received token login user data response")
    public void receivedTokenLoginUserDataResponse() { login.receivedTokenLoginUserDataResponse();}

    //Scenario 2
    @Given("I set API endpoint invalid for login user without the path")
    public void setAPIEndpointInvalidLoginUserWithoutPath() { login.setAPIEndpointInvalidLoginUserWithoutPath();}

    @When("I send request to login user no path")
    public void sendRequestLoginUserNoPath() {login.sendRequestLoginUserNoPath();}

    @Then("I received status code 401 Unauthorized in request to login user")
    public void receivedStatusCode401UnauthorizedRequestLoginUser() {
        login.receivedStatusCode401UnauthorizedRequestLoginUser();}

    @And("I received error message \"invalid token\" login response")
    public void receivedErrorMessageInvalidTokenLoginResponse() { login.receivedErrorMessageInvalidTokenLoginResponse();}

    //Scenario 3
    @When("I blank the login request")
    public void blankLoginRequest() { login.blankLoginRequest();}

    @And("I send a request to the login user")
    public void sendRequestLoginUser() { login.sendRequestLoginUser();}

    @Then("I received status code 400 Bad Request in request to login user")
    public void receivedStatusCode400BadRequestLoginUser() { login.receivedStatusCode400BadRequestLoginUser();}

    @And("I received the error message \"input password has on the required tag\" response")
    public void receivedErrorMessageInputPasswordHasOnTheRequiredTagResponse() { login.receivedErrorMessageInputPasswordHasOnTheRequiredTagResponse();}

    //Scenario 4
    @When("I blank the email request in login")
    public void blankEmailRequestInLogin() { login.blankEmailRequestInLogin();}

    @And("I received the error message \"input email has on the email tag\" login response")
    public void receivedErrorMessageEmailIsRequiredLoginResponse() { login.receivedErrorMessageEmailIsRequiredLoginResponse();}

    //Scenario 5
    @And("I blank the password login request")
    public void blankPasswordLoginRequest() { login.blankPasswordLoginRequest();}

    //Scenario 6
    @When("I enter an invalid email for login")
    public void enterInvalidEmailForLogin() { login.enterInvalidEmailForLogin();}

    @And("I send request to login user with invalid {string} and valid {string}")
    public void sendRequestLoginUserWithInvalidEmail(String email, String password) {
        login.sendRequestLoginUserWithInvalidEmail(email, password);
    }

    @Then("I received status code 404 Not Found in request login user")
    public void receivedStatusCode404NotFoundRequestLoginUser() { login.receivedStatusCode404NotFoundRequestLoginUser();}

    @And("I received an error message \"email not found\" response")
    public void receivedErrorMessageEmailNotFoundResponse() { login.receivedErrorMessageEmailNotFoundResponse();}

    //Scenario 7
    @And("I enter an invalid password")
    public void enterInvalidPassword() { login.enterInvalidPassword();}

    @And("I send request to login user with valid {string} and invalid {string}")
    public void sendRequestLoginUserWithInvalidPassword(String email, String password) {
        login.sendRequestLoginUserWithInvalidPassword(email, password);
    }

    @And("I received an error message \"invalid password\" response")
    public void receivedErrorMessageInvalidPasswordResponse() { login.receivedErrorMessageInvalidPasswordResponse();}
}