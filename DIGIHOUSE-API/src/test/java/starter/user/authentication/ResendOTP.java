package starter.user.authentication;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.JSONObject;
import starter.utils.JsonSchema;
import starter.utils.JsonSchemaHelper;

import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchema;
import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class ResendOTP {
    private static final String url = "https://digiwarehouse-app.onrender.com";


    @Step ("I set API endpoint valid for resend OTP")
    public String setAPIEndpointValidResendOTP() {
        return url + "/user/resend-otp";
    }

    @Step("I enter a valid email for resend OTP")
    public void enterValidEmailForResendOTP() {}

    @Step("I send request to resend OTP with valid email")
    public void sendRequestResendOTPWithValidEmail() {
        JSONObject requestBody = new JSONObject();
        String email = "itqa.mia@gmail.com";
        requestBody.put("email", email);
        SerenityRest.given()
                .header("Content-Type", "application/json")
                .body(requestBody.toString())
                .post(setAPIEndpointValidResendOTP());}

    @Step("I received status code 200 OK in request resend OTP")
    public void receivedStatusCode200OKResendOTP() {
        restAssuredThat(response -> response.statusCode(200));
    }

    @Step("I received message \"Success\" response resend OTP")
    public void receivedMessageSuccessResponseResendOTP() {
        JsonSchemaHelper helper = new JsonSchemaHelper();
        String schema = helper.getResponseSchema(JsonSchema.Resend_OTP_Response_Schema);
        restAssuredThat(response -> response.body(matchesJsonSchema(schema)));
    }

    @Step("I received email message code OTP in resend OTP")
    public void receivedEmailMessageCodeOTPInResendOTP() {
    }

    @Step("I set API endpoint invalid for resend OTP without the path")
    public String setAPIEndpointInvalidResendOTPWithoutPath() {
        return url + "/user";
    }

    @Step("I send request to resend OTP no path")
    public void sendRequestResendOTPNoPath() {
        SerenityRest.given()
                .post(setAPIEndpointInvalidResendOTPWithoutPath());
    }

    @Step("I received status code 401 Unauthorized in request to resend OTP")
    public void receivedStatusCode401UnauthorizedRequestResendOTP() {
        restAssuredThat(response -> response.statusCode(401));
    }

    @Step("I received error message \"invalid token\" response in request resend OTP")
    public void receivedErrorMessageInvalidTokenResendOTPResponse() {
    }

    @Step("I blank the resend OTP request")
    public void blankResendOTPRequest() {
    }

    @Step("I send request to resend OTP with blank resend OTP")
    public void sendRequestResendOTPWithBlankResendOTP() {
        JSONObject requestBody = new JSONObject();
        String email = "";
        requestBody.put("email", email);
        SerenityRest.given()
                .header("Content-Type", "application/json")
                .body(requestBody.toString())
                .post(setAPIEndpointValidResendOTP());}

    @Step("I received status code 400 Bad Request in request to resend OTP")
    public void receivedStatusCode400BadRequestResendOTP() {
        restAssuredThat(response -> response.statusCode(400));
    }

    @Step("I received the error message \"email is empty\" response in resend OTP")
    public void receivedErrorMessageEmailIsEmptyResendOTPResponse() {
    }

    @Step("I enter an invalid email for resend OTP")
    public void enterInvalidEmailForResendOTP() {
    }

    @Step("I send request to resend OTP with invalid email")
    public void sendRequestResendOTPWithInvalidEmail() {
        JSONObject requestBody = new JSONObject();
        String email = "itqa.mi@gmail.com";
        requestBody.put("email", email);
        SerenityRest.given()
                .header("Content-Type", "application/json")
                .body(requestBody.toString())
                .post(setAPIEndpointValidResendOTP());}

    @Step("I received status code 404 Bad Request in request resend OTP")
    public void receivedStatusCode404BadRequestResendOTP() {
        restAssuredThat(response -> response.statusCode(404));
    }

    @Step("I received an error message \"email not found\" response in request resend OTP")
    public void receivedErrorMessageEmailNotFoundResendOTP() {
    }
}
