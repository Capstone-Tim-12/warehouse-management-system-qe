package starter.user.setting;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.JSONObject;
import starter.utils.GenerateToken;
import starter.utils.JsonSchema;
import starter.utils.JsonSchemaHelper;

import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchema;
import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.notNullValue;

public class GetProfile {
    private static final String url = "https://digiwarehouse-app.onrender.com";

    @Step ( "I set API endpoint valid for get profile" )
    public String setAPIEndpointValidGetProfile() {
        return url + "/user/profile";
    }

    @Step ( "I enter a email valid format for get profile" )
    public void enterEmailValidFormatGetProfile() {
    }

    @Step ( "I send request to get profile" )
    public void sendRequestGetProfile() {
        JSONObject requestBody = new JSONObject();
        String Token = GenerateToken.generateToken();
        SerenityRest.given()
                .header("Content-Type", "application/json")
                .header("Authorization", "Bearer " + Token)
                .body(requestBody.toString())
                .get(setAPIEndpointValidGetProfile());
    }

    @Step ( "I received status code 200 OK in request get profile" )
    public void receivedStatusCode200OKRequestGetProfile() {
        restAssuredThat(response -> response.statusCode(200));
    }

    @Step ( "I received data profile and message \"Success\" response in request get profile" )
    public void receivedDataProfileAndMessageSuccessResponseGetProfile() {
        JsonSchemaHelper helper = new JsonSchemaHelper();
        String schema = helper.getResponseSchema(JsonSchema.Get_Profile_Response_Schema);
        restAssuredThat(response -> response.body("'status'", notNullValue()));
        restAssuredThat(response -> response.body("'message'", is("Success")));
        restAssuredThat(response -> response.body("'data'", notNullValue()));
        restAssuredThat(response -> response.body("'data'.'id'", notNullValue()));
        restAssuredThat(response -> response.body("'data'.'username'", notNullValue()));
        restAssuredThat(response -> response.body("'data'.'email'", notNullValue()));
        restAssuredThat(response -> response.body("'data'.'isVerifyAccount'", notNullValue()));
        restAssuredThat(response -> response.body("'data'.'isVerifyIdentity'", notNullValue()));
        restAssuredThat(response -> response.body("'data'.'address'", notNullValue()));
        restAssuredThat(response -> response.body("'data'.'country'", notNullValue()));
        restAssuredThat(response -> response.body("'data'.'photo'", notNullValue()));
        restAssuredThat(response -> response.body("'data'.'nik'", notNullValue()));
        restAssuredThat(response -> response.body("'data'.'fullName'", notNullValue()));
        restAssuredThat(response -> response.body("'data'.'gender'", notNullValue()));
        restAssuredThat(response -> response.body("'data'.'placeOfBirth'", notNullValue()));
        restAssuredThat(response -> response.body("'data'.'dateBirth'", notNullValue()));
        restAssuredThat(response -> response.body("'data'.'work'", notNullValue()));
        restAssuredThat(response -> response.body("'data'.'citizenship'", notNullValue()));
        restAssuredThat(response -> response.body("'data'.'provinceID'", notNullValue()));
        restAssuredThat(response -> response.body("'data'.'provinceName'", notNullValue()));
        restAssuredThat(response -> response.body("'data'.'regencyID'", notNullValue()));
        restAssuredThat(response -> response.body("'data'.'regencyName'", notNullValue()));
        restAssuredThat(response -> response.body("'data'.'districtID'", notNullValue()));
        restAssuredThat(response -> response.body("'data'.'districtName'", notNullValue()));
        restAssuredThat(response -> response.body(matchesJsonSchema(schema)));
    }

    @Step ( "I set API endpoint invalid for get profile without the path" )
    public String setAPIEndpointInvalidGetProfileWithoutPath() {
        return url + "/user";
    }

    @Step ( "I send request to get profile no path" )
    public void sendRequestGetProfileNoPath() {
        String Token = GenerateToken.generateToken();
        JSONObject requestBody = new JSONObject();
        SerenityRest.given()
                .header("Content-Type", "application/json")
                .header("Authorization", "Bearer " + Token)
                .body(requestBody.toString())
                .get(setAPIEndpointInvalidGetProfileWithoutPath());
    }

    @Step ( "I received status code 500 Internal Server Error in request to get profile" )
    public void receivedStatusCode500InternalServerErrorRequestGetProfile() {
        restAssuredThat(response -> response.statusCode(500));
    }

    @Step ( "I received error message \"general error\" response in request get profile" )
    public void receivedErrorMessageGeneralErrorResponseGetProfile() {
    }
}
