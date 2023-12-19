package starter.admin.manageUser;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.JSONObject;
import starter.utils.GenerateToken;
import starter.utils.JsonSchema;
import starter.utils.JsonSchemaHelper;

import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchema;
import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.*;

public class GetUserByID {
    private static final String url = "https://digiwarehouse-app.onrender.com";

    @Step ( "I set API endpoint valid for get user by ID" )
    public String setAPIEndpointValidGetUserByID() {
        return url + "/dasboard/user/7";
    }

    @Step ( "I send request to get user by ID" )
    public void sendRequestGetUserByID() {
        String Token = GenerateToken.generateToken();
        JSONObject requestBody = new JSONObject();
        SerenityRest.given()
                .header("Content-Type", "application/json")
                .header("Authorization", "Bearer " + Token)
                .body(requestBody.toString())
                .get(setAPIEndpointValidGetUserByID());
    }

    @Step ( "I received status code 200 OK in request get user by ID" )
    public void receivedStatusCode200OKRequestGetUserByID() {
        restAssuredThat(response -> response.statusCode(200));
    }

    @Step ( "I received message \"Success\" response in request get user by ID" )
    public void receivedMessageSuccessResponseGetUserByID() {
        JsonSchemaHelper helper = new JsonSchemaHelper();
        String schema = helper.getResponseSchema(JsonSchema.Get_User_By_ID_Response_Schema);
        restAssuredThat(response -> response.body("'status'", notNullValue()));
        restAssuredThat(response -> response.body("'message'", is("Success")));
        restAssuredThat(response -> response.body("'data'", notNullValue()));
        restAssuredThat(response -> response.body(matchesJsonSchema(schema)));
    }

    @Step ( "I set API endpoint invalid for can't get user by ID without the path" )
    public String setAPIEndpointInvalidGetUserByIDWithoutPath() {
        return url + "/dasboard/user";
    }

    @Step ( "I send request to get user by ID no path" )
    public void sendRequestGetUserByIDNoPath() {
        String Token = GenerateToken.generateToken();
        JSONObject requestBody = new JSONObject();
        SerenityRest.given()
                .header("Content-Type", "application/json")
                .header("Authorization", "Bearer " + Token)
                .body(requestBody.toString())
                .get(setAPIEndpointInvalidGetUserByIDWithoutPath());
    }

    @Step ( "I received status code 500 Internal Server Error in request to get user by ID" )
    public void receivedStatusCode500InternalServerErrorRequestGetUserByID() {
        restAssuredThat(response -> response.statusCode(500));
    }

    @Step ( "I received error message \"general error\" response in request get user by ID" )
    public void receivedErrorMessageGeneralErrorResponseGetUserByID() {
    }

    @Step ( "I set API endpoint invalid for can't get user by ID with invalid ID" )
    public String setAPIEndpointGetUserByIDWitInvalidID() {
        return url + "/dasboard/user/28000000";
    }

    @Step ( "I send request to get user by ID with invalid ID" )
    public void sendRequestGetUserByIDWithInvalidID() {
        String Token = GenerateToken.generateToken();
        JSONObject requestBody = new JSONObject();
        SerenityRest.given()
                .header("Content-Type", "application/json")
                .header("Authorization", "Bearer " + Token)
                .body(requestBody.toString())
                .get(setAPIEndpointGetUserByIDWitInvalidID());
    }

    @Step ( "I received status code 404 Not Found in request get user by ID" )
    public void receivedStatusCode404NotFoundRequestGetUserByID() {
        restAssuredThat(response -> response.statusCode(404));
    }

    @Step ( "I received message \"Not Found\" response in request get user by ID" )
    public void receivedMessageNotFoundResponseGetUserByID() {
    }
}
