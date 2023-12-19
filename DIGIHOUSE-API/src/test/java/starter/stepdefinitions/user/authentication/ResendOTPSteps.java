package starter.stepdefinitions.user.authentication;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.user.authentication.ResendOTP;

public class ResendOTPSteps {
    @Steps
    ResendOTP resendOTP;

    @Given ("I set API endpoint valid for resend OTP")
    public void setAPIEndpointValidResendOTP() {
        resendOTP.setAPIEndpointValidResendOTP();
    }

    //Scenario 1
    @When ("I enter a valid email for resend OTP")
    public void enterValidEmailForResendOTP() {
        resendOTP.enterValidEmailForResendOTP();
    }

    @And("I send request to resend OTP with valid email")
    public void sendRequestResendOTPWithValidEmail() {
        resendOTP.sendRequestResendOTPWithValidEmail();
    }

    @Then ("I received status code 200 OK in request resend OTP")
    public void receivedStatusCode200OKResendOTP() { resendOTP.receivedStatusCode200OKResendOTP();}

    @And("I received message \"Success\" response resend OTP")
    public void receivedMessageSuccessResponseResendOTP() { resendOTP.receivedMessageSuccessResponseResendOTP();}

    @And("I received email message code OTP in resend OTP")
    public void receivedEmailMessageCodeOTPInResendOTP() { resendOTP.receivedEmailMessageCodeOTPInResendOTP();}

    //Scenario 2
    @Given("I set API endpoint invalid for resend OTP without the path")
    public void setAPIEndpointInvalidResendOTPWithoutPath() { resendOTP.setAPIEndpointInvalidResendOTPWithoutPath();}

    @When("I send request to resend OTP no path")
    public void sendRequestResendOTPNoPath() {resendOTP.sendRequestResendOTPNoPath();}

    @Then("I received status code 401 Unauthorized in request to resend OTP")
    public void receivedStatusCode401UnauthorizedRequestResendOTP() {
        resendOTP.receivedStatusCode401UnauthorizedRequestResendOTP();}

    @And("I received error message \"invalid token\" response in request resend OTP")
    public void receivedErrorMessageInvalidTokenResendOTPResponse() { resendOTP.receivedErrorMessageInvalidTokenResendOTPResponse();}

    //Scenario 3
    @When("I blank the resend OTP request")
    public void blankResendOTPRequest() { resendOTP.blankResendOTPRequest();}

    @And("I send request to resend OTP with blank resend OTP")
    public void sendRequestResendOTPWithBlankResendOTP() {
        resendOTP.sendRequestResendOTPWithBlankResendOTP();
    }

    @Then("I received status code 400 Bad Request in request to resend OTP")
    public void receivedStatusCode400BadRequestResendOTP() { resendOTP.receivedStatusCode400BadRequestResendOTP();}

    @And("I received the error message \"email is empty\" response in resend OTP")
    public void receivedErrorMessageEmailIsEmptyResendOTPResponse() { resendOTP.receivedErrorMessageEmailIsEmptyResendOTPResponse();}

    //Scenario 4
    @When("I enter an invalid email for resend OTP")
    public void enterInvalidEmailForResendOTP() { resendOTP.enterInvalidEmailForResendOTP();}

    @And("I send request to resend OTP with invalid email")
    public void sendRequestResendOTPWithInvalidEmail() {
        resendOTP.sendRequestResendOTPWithInvalidEmail();
    }

    @Then("I received status code 404 Bad Request in request resend OTP")
    public void receivedStatusCode404BadRequestResendOTP() { resendOTP.receivedStatusCode404BadRequestResendOTP();}

    @And("I received an error message \"email not found\" response in request resend OTP")
    public void receivedErrorMessageEmailNotFoundResendOTP() { resendOTP.receivedErrorMessageEmailNotFoundResendOTP();}
}