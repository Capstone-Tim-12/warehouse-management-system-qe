package starter.user.verificationIdentity;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.JSONObject;
import starter.utils.JsonSchema;
import starter.utils.JsonSchemaHelper;

import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchema;
import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.*;

public class RegisterDataUser {
    private static final String url = "https://digiwarehouse-app.onrender.com";

    @Step ("I set API endpoint valid for register data user")
    public String setAPIEndpointValidRegisterDataUser() {
        return url + "/user/register-data";
    }

    @Step("I enter a valid input register data user")
    public void enterValidInputRegisterDataUser() {
    }

    @Step("I send request to register data user")
    public void sendRequestRegisterDataUser() {
        JSONObject requestBody = new JSONObject();
        String email = "testerhomelte47@gmail.com";
        String nik = "08100989897256900";
        String fullname = "Mia Aprilia Satya";
        String districtId = "3276061";
        String address = "Jln Raya Cinere";
        String gender = "F";
        String placeBirth = "Jakarta";
        String dateBirth = "2001-04-01T12:34:56.789012345Z";
        String work = "Pegawai";
        String citizenship = "WNI";
        requestBody.put("email", email);
        requestBody.put("nik", nik);
        requestBody.put("fullname", fullname);
        requestBody.put("districtId", districtId);
        requestBody.put("address", address);
        requestBody.put("gender", gender);
        requestBody.put("placeBirth", placeBirth);
        requestBody.put("dateBirth", dateBirth);
        requestBody.put("work", work);
        requestBody.put("citizenship", citizenship);
        SerenityRest.given()
                .header("Content-Type", "application/json")
                .body(requestBody.toString())
                .post(setAPIEndpointValidRegisterDataUser());
    }

    @Step("I received status code 201 Created in request register data user")
    public void receivedStatusCode201CreatedRequestRegisterDataUser() {
        restAssuredThat(response -> response.statusCode(201));
    }

    @Step("I received register data user and message \"Success\" response in request register data user")
    public void receivedRegisterDatUserAndMessageSuccessResponseRegisterDataUser() {
        JsonSchemaHelper helper = new JsonSchemaHelper();
        String schema = helper.getResponseSchema(JsonSchema.Register_Data_User_Response_Schema);
        restAssuredThat(response -> response.body("'status'", notNullValue()));
        restAssuredThat(response -> response.body("'message'", is("Success")));
        restAssuredThat(response -> response.body("'data'", nullValue()));
        restAssuredThat(response -> response.body(matchesJsonSchema(schema)));
    }

    @Step("I set API endpoint invalid for register data user without the path")
    public String setAPIEndpointInvalidRegisterDataUserWithoutPath() { return url + "/user";
    }

    @Step("I send request to verification OTP no path")
    public void sendRequestVerificationOTPNoPath() {
        SerenityRest.given()
                .post(setAPIEndpointInvalidRegisterDataUserWithoutPath());
    }

    @Step("I received status code 401 Unauthorized in request to register data user")
    public void receivedStatusCode401UnauthorizedRequestRegisterDataUser() {
        restAssuredThat(response -> response.statusCode(401));
    }

    @Step("I received error message \"invalid token\" response in request to register data user")
    public void receivedErrorMessageInvalidTokenResponseRegisterDataUser() {
    }

    //Negative Case
    @Step("I blank the register data user request")
    public void blankRegisterDataUserRequest() {
    }

    @Step("I send request to register data user with blank register request")
    public void sendRequestRegisterDataUserWithBlankRegisterRequest() {
        JSONObject requestBody = new JSONObject();
        String email = "";
        String nik = "";
        String fullname = "";
        String districtId = "";
        String address = "";
        String gender = "";
        String placeBirth = "";
        String dateBirth = "";
        String work = "";
        String citizenship = "";
        requestBody.put("email", email);
        requestBody.put("nik", nik);
        requestBody.put("fullname", fullname);
        requestBody.put("districtId", districtId);
        requestBody.put("address", address);
        requestBody.put("gender", gender);
        requestBody.put("placeBirth", placeBirth);
        requestBody.put("dateBirth", dateBirth);
        requestBody.put("work", work);
        requestBody.put("citizenship", citizenship);
        SerenityRest.given()
                .header("Content-Type", "application/json")
                .body(requestBody.toString())
                .post(setAPIEndpointValidRegisterDataUser());
    }

    @Step("I received status code 400 Bad Request in request to register data user")
    public void receivedStatusCode400BadRequestRegisterDataUser() {
        restAssuredThat(response -> response.statusCode(400));
    }

    @Step("I received the error message \"invalid request\" response in request register data user")
    public void receivedErrorMessageInvalidRequestResponseRegisterDataUser() {
    }

    //Negative Case
    @Step("I enter an invalid email for register data user")
    public void enterInvalidEmailForRegisterDataUser() {
    }

    @Step("I send request to register data user with invalid email request")
    public void sendRequestRegisterDataUserWithInvalidEmailRequest() {
        JSONObject requestBody = new JSONObject();
        String email = "testerhomelte4@gmail.com";
        String nik = "08100989897256900";
        String fullname = "Mia Aprilia Satya";
        String districtId = "3276061";
        String address = "Jln Raya";
        String gender = "F";
        String placeBirth = "Jakarta";
        String dateBirth = "2023-11-22T12:34:56.789012345Z";
        String work = "work";
        String citizenship = "WNI";
        requestBody.put("email", email);
        requestBody.put("nik", nik);
        requestBody.put("fullname", fullname);
        requestBody.put("districtId", districtId);
        requestBody.put("address", address);
        requestBody.put("gender", gender);
        requestBody.put("placeBirth", placeBirth);
        requestBody.put("dateBirth", dateBirth);
        requestBody.put("work", work);
        requestBody.put("citizenship", citizenship);
        SerenityRest.given()
                .header("Content-Type", "application/json")
                .body(requestBody.toString())
                .post(setAPIEndpointValidRegisterDataUser());
    }

    @Step("I received status code 404 Bad Request in request register data user")
    public void receivedStatusCode404BadRequestRegisterDataUser() {
        restAssuredThat(response -> response.statusCode(404));
    }

    @Step("I received an error message \"email not found\" response in request register data user")
    public void receivedErrorMessageEmailNotFoundResponseRegisterDataUser() {
    }
}
