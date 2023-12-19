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

public class DeleteUserByID {
    private static final String url = "https://digiwarehouse-app.onrender.com";

    @Step ( "I set API endpoint valid for delete user by ID" )
    public String setAPIEndpointValidDeleteUserByID() {
        return url + "/dasboard/user/72";
    }

    @Step ( "I send request to delete user by ID" )
    public void sendRequestDeleteUserByID() {
        String Token = GenerateToken.generateToken();
        JSONObject requestBody = new JSONObject();
        SerenityRest.given()
                .header("Content-Type", "application/json")
                .header("Authorization", "Bearer " + Token)
                .body(requestBody.toString())
                .delete(setAPIEndpointValidDeleteUserByID());
    }

    @Step ( "I received status code 200 OK in request delete user by ID" )
    public void receivedStatusCode200OKRequestDeleteUserByID() {
        restAssuredThat(response -> response.statusCode(200));
    }

    @Step ( "I received message \"Success\" response in request delete user by ID" )
    public void receivedMessageSuccessResponseDeleteUserByID() {
        restAssuredThat(response -> response.body("'status'", notNullValue()));
        restAssuredThat(response -> response.body("'message'", is("Success")));
        restAssuredThat(response -> response.body("'data'", nullValue()));
    }

    @Step ( "I set API endpoint invalid for can't delete user by ID without the path" )
    public String setAPIEndpointInvalidDeleteUserByIDWithoutPath() {
        return url + "/dasboard/user";
    }

    @Step ( "I send request to delete user by ID no path" )
    public void sendRequestDeleteUserByIDNoPath() {
        String Token = GenerateToken.generateToken();
        JSONObject requestBody = new JSONObject();
        SerenityRest.given()
                .header("Content-Type", "application/json")
                .header("Authorization", "Bearer " + Token)
                .body(requestBody.toString())
                .delete(setAPIEndpointInvalidDeleteUserByIDWithoutPath());
    }

    @Step ( "I received status code 500 Internal Server Error in request to delete user by ID" )
    public void receivedStatusCode500InternalServerErrorRequestDeleteUserByID() {
        restAssuredThat(response -> response.statusCode(500));
    }

    @Step ( "I received error message \"general error\" response in request delete user by ID" )
    public void receivedErrorMessageGeneralErrorResponseDeleteUserByID() {
    }

    @Step ( "I set API endpoint invalid for can't delete user by ID with invalid ID" )
    public String setAPIEndpointDeleteUserByIDWitInvalidID() {
        return url + "/dasboard/user/1550000";
    }

    @Step ( "I send request to delete user by ID with invalid ID" )
    public void sendRequestDeleteUserByIDWithInvalidID() {
        String Token = GenerateToken.generateToken();
        JSONObject requestBody = new JSONObject();
        SerenityRest.given()
                .header("Content-Type", "application/json")
                .header("Authorization", "Bearer " + Token)
                .body(requestBody.toString())
                .delete(setAPIEndpointDeleteUserByIDWitInvalidID());
    }

    @Step ( "I received status code 404 Not Found in request delete user by ID" )
    public void receivedStatusCode404NotFoundRequestDeleteUserByID() {
        restAssuredThat(response -> response.statusCode(404));
    }

    @Step ( "I received message \"user not found\" response in request delete user by ID" )
    public void receivedMessageUserNotFoundResponseDeleteUserByID() {
    }
}
