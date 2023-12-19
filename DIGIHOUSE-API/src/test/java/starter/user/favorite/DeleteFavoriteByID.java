package starter.user.favorite;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.JSONObject;
import starter.utils.GenerateToken;
import starter.utils.JsonSchema;
import starter.utils.JsonSchemaHelper;

import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchema;
import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.*;

public class DeleteFavoriteByID {
    private static final String url = "https://digiwarehouse-app.onrender.com";

    @Step ( "I set API endpoint valid for delete favorite by ID" )
    public String setAPIEndpointValidDeleteFavoriteByID() {
        return url + "/warehouse/favorit/68";
    }

    @Step ( "I send request to delete favorite by ID" )
    public void sendRequestDeleteFavoriteByID() {
        String Token = GenerateToken.generateToken();
        JSONObject requestBody = new JSONObject();
        SerenityRest.given()
                .header("Content-Type", "application/json")
                .header("Authorization", "Bearer " + Token)
                .body(requestBody.toString())
                .delete(setAPIEndpointValidDeleteFavoriteByID());
    }

    @Step ( "I received status code 200 OK in request delete favorite by ID" )
    public void receivedStatusCode200OKRequestDeleteFavoriteByID() {
        restAssuredThat(response -> response.statusCode(200));
    }

    @Step ( "I received message \"Success\" response in request delete favorite by ID" )
    public void receivedMessageSuccessResponseDeleteFavoriteByID() {
        JsonSchemaHelper helper = new JsonSchemaHelper();
        String schema = helper.getResponseSchema(JsonSchema.Delete_Favorite_By_ID_Response_Schema);
        restAssuredThat(response -> response.body("'status'", notNullValue()));
        restAssuredThat(response -> response.body("'message'", is("Success")));
        restAssuredThat(response -> response.body("'data'", nullValue()));
        restAssuredThat(response -> response.body(matchesJsonSchema(schema)));
    }

    @Step ( "I set API endpoint invalid for can't delete favorite by ID without the path" )
    public String setAPIEndpointInvalidDeleteFavoriteByIDWithoutPath() {
        return url + "/warehouse/favorit";
    }

    @Step ( "I send request to delete favorite by ID no path" )
    public void sendRequestDeleteFavoriteByIDNoPath() {
        String Token = GenerateToken.generateToken();
        JSONObject requestBody = new JSONObject();
        SerenityRest.given()
                .header("Content-Type", "application/json")
                .header("Authorization", "Bearer " + Token)
                .body(requestBody.toString())
                .delete(setAPIEndpointInvalidDeleteFavoriteByIDWithoutPath());
    }

    @Step ( "I received status code 500 Internal Server Error in request to delete favorite by ID" )
    public void receivedStatusCode500InternalServerErrorRequestDeleteFavoriteByID() {
        restAssuredThat(response -> response.statusCode(500));
    }

    @Step ( "I received error message \"general error\" response in request delete favorite by ID" )
    public void receivedErrorMessageGeneralErrorResponseDeleteFavoriteByID() {
    }

    @Step ( "I set API endpoint invalid for can't delete favorite by ID with invalid ID" )
    public String setAPIEndpointDeleteFavoriteByIDWitInvalidID() {
        return url + "/warehouse/favorit/23";
    }

    @Step ( "I send request to delete favorite by ID with invalid ID" )
    public void sendRequestDeleteFavoriteByIDWithInvalidID() {
        String Token = GenerateToken.generateToken();
        JSONObject requestBody = new JSONObject();
        SerenityRest.given()
                .header("Content-Type", "application/json")
                .header("Authorization", "Bearer " + Token)
                .body(requestBody.toString())
                .delete(setAPIEndpointDeleteFavoriteByIDWitInvalidID());
    }

    @Step ( "I received status code 404 Not Found in request delete favorite by ID" )
    public void receivedStatusCode404NotFoundRequestDeleteFavoriteByID() {
        restAssuredThat(response -> response.statusCode(404));
    }

    @Step ( "I received message \"Not Found\" response in request delete favorite by ID" )
    public void receivedMessageNotFoundResponseDeleteFavoriteByID() {
    }
}
