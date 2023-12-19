package starter.user.dashboard;

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

public class GetUserInfo {
    private static final String url = "https://digiwarehouse-app.onrender.com";

    @Step ("I set API endpoint valid for get user profile")
    public String setAPIEndpointValidGetUserProfile() {
        return url + "/user/info";
    }

    @Step("I send request to get user profile valid path")
    public void sendRequestGetUserProfileValidPath() {
        String Token = GenerateToken.generateToken();
        JSONObject requestBody = new JSONObject();
        SerenityRest.given()
                .header("Content-Type","application/json")
                .header("Authorization", "Bearer " + Token)
                .body(requestBody.toString())
                .get(setAPIEndpointValidGetUserProfile());
    }

    @Step("I received status code 200 OK in request to get user profile")
    public void receivedStatusCode200OKRequestGetUserProfile() {
        restAssuredThat(response -> response.statusCode(200));
    }

    @Step("I received all data profile user")
    public void receivedAllDataProfileUser() {
        JsonSchemaHelper helper = new JsonSchemaHelper();
        String schema = helper.getResponseSchema(JsonSchema.Get_User_Info_Response_Schema);
        restAssuredThat(response -> response.body("'status'", notNullValue()));
        restAssuredThat(response -> response.body("'message'", is("Success")));
        restAssuredThat(response -> response.body("'data'", notNullValue()));
        restAssuredThat(response -> response.body("'data'.'userId'", notNullValue()));
        restAssuredThat(response -> response.body("'data'.'username'", notNullValue()));
        restAssuredThat(response -> response.body("'data'.'fullName'", notNullValue()));
        restAssuredThat(response -> response.body("'data'.'email'", notNullValue()));
        restAssuredThat(response -> response.body("'data'.'photo'", notNullValue()));
        restAssuredThat(response -> response.body("'data'.'regencyName'", notNullValue()));
        restAssuredThat(response -> response.body("'data'.'districtName'", notNullValue()));
        restAssuredThat(response -> response.body(matchesJsonSchema(schema)));
    }

    @Step("I set API endpoint invalid for get user profile")
    public String setAPIEndpointInvalidGetUserProfile() { return url + "/user";
    }

    @Step("I send request to get user profile invalid path")
    public void sendRequestGetUserProfileInvalidPath() {
        String Token = GenerateToken.generateToken();
        JSONObject requestBody = new JSONObject();
        SerenityRest.given()
                .header("Content-Type","application/json")
                .header("Authorization", "Bearer " + Token)
                .body(requestBody.toString())
                .get(setAPIEndpointInvalidGetUserProfile());
    }

    @Step("I received status code 500 Internal Server Error in request to get user profile")
    public void receivedStatusCode500InternalServerErrorRequestGetUserProfile() {
        restAssuredThat(response -> response.statusCode(500));
    }

    @Step("I received error message \"general error\" response in request get user profile")
    public void receivedErrorMessageGeneralErrorResponseGetUserProfile() {
    }
}
