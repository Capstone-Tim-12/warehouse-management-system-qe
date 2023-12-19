package starter.user.setting;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.JSONObject;
import starter.utils.GenerateToken;
import starter.utils.JsonSchema;
import starter.utils.JsonSchemaHelper;

import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchema;
import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.*;

public class UpdateUsername {
    private static final String url = "https://digiwarehouse-app.onrender.com";

    @Step ( "I set API endpoint valid for update username" )
    public String setAPIEndpointValidUpdateUsername() {
        return url + "/user/profile/username";
    }

    @Step ( "I enter a username" )
    public void enterUsername() {
    }

    @Step ( "I send request to update username" )
    public void sendRequestUpdateUsername() {
        JSONObject requestBody = new JSONObject();
        String username = "Mia Aprilia Satya";
        requestBody.put("username", username);
        String Token = GenerateToken.generateToken();
        SerenityRest.given()
                .header("Content-Type", "application/json")
                .header("Authorization", "Bearer " + Token)
                .body(requestBody.toString())
                .put(setAPIEndpointValidUpdateUsername());
    }

    @Step ( "I received status code 200 OK in request update username" )
    public void receivedStatusCode200OKRequestUpdateUsername() {
        restAssuredThat(response -> response.statusCode(200));
    }

    @Step ( "I received message \"Success\" response in request update username" )
    public void receivedMessageSuccessResponseUpdateUsername() {
        JsonSchemaHelper helper = new JsonSchemaHelper();
        String schema = helper.getResponseSchema(JsonSchema.Update_Username_Response_Schema);
        restAssuredThat(response -> response.body("'status'", notNullValue()));
        restAssuredThat(response -> response.body("'message'", is("Success")));
        restAssuredThat(response -> response.body("'data'", nullValue()));
        restAssuredThat(response -> response.body(matchesJsonSchema(schema)));
    }

    @Step ( "I set API endpoint invalid for update username without the path" )
    public String setAPIEndpointInvalidUpdateUsernameWithoutPath() {
        return url + "/user/profile";
    }

    @Step ( "I send request to update username no path" )
    public void sendRequestUpdateUsernameNoPath() {
        String Token = GenerateToken.generateToken();
        JSONObject requestBody = new JSONObject();
        SerenityRest.given()
                .header("Content-Type", "application/json")
                .header("Authorization", "Bearer " + Token)
                .body(requestBody.toString())
                .put(setAPIEndpointInvalidUpdateUsernameWithoutPath());
    }

    @Step ( "I received status code 500 Internal Server Error in request to update username" )
    public void receivedStatusCode500InternalServerErrorRequestUpdateUsername() {
        restAssuredThat(response -> response.statusCode(500));
    }

    @Step ( "I received error message \"general error\" response in request update username" )
    public void receivedErrorMessageGeneralErrorResponseUpdateUsername() {
    }

    @Step ( "I blank the update username request" )
    public void blankUpdateUsernameRequest() {
    }

    @Step ( "I send blank request to update username" )
    public void sendBlankRequestUpdateUsername() {
        JSONObject requestBody = new JSONObject();
        String username = "";
        requestBody.put("username", username);
        String Token = GenerateToken.generateToken();
        SerenityRest.given()
                .header("Content-Type", "application/json")
                .header("Authorization", "Bearer " + Token)
                .body(requestBody.toString())
                .put(setAPIEndpointValidUpdateUsername());
    }

    @Step ( "I received status code 400 Bad Request in request to update username" )
    public void receivedStatusCode400BadRequestUpdateUsername() {
        restAssuredThat(response -> response.statusCode(400));
    }

    @Step ( "I received the error message \"username is empty\" response in update username" )
    public void receivedErrorMessageUsernameIsEmptyResponseUpdateUsername() {
    }
}
