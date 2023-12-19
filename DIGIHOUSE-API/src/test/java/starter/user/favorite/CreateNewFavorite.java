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

public class CreateNewFavorite {
    private static final String url = "https://digiwarehouse-app.onrender.com";

    @Step ("I set API endpoint valid for create new favorite")
    public String setAPIEndpointValidCreateNewFavorite() {
        return url + "/warehouse/favorit";
    }

    @Step("I enter a warehouse ID in create new favorite")
    public void enterWarehouseIDInCreateNewFavorite() {}

    @Step("I send request to create new favorite")
    public void sendRequestCreateNewFavorite() {
        String Token = GenerateToken.generateToken();
        JSONObject requestBody = new JSONObject();
        int warehouseId = 68;
        requestBody.put("warehouseId", warehouseId);
        SerenityRest.given()
                .header("Content-Type","application/json")
                .header("Authorization", "Bearer " + Token)
                .body(requestBody.toString())
                .post(setAPIEndpointValidCreateNewFavorite());
    }

    @Step("I received status code 201 Created in request create new favorite")
    public void receivedStatusCode201CreatedRequestCreateNewFavorite() {
        restAssuredThat(response -> response.statusCode(201));
    }

    @Step("I received message \"Success\" response in request create new favorite")
    public void receivedMessageSuccessResponseCreateNewFavorite() {
        JsonSchemaHelper helper = new JsonSchemaHelper();
        String schema = helper.getResponseSchema(JsonSchema.Create_New_Favorite_Response_Schema);
        restAssuredThat(response -> response.body("'status'", notNullValue()));
        restAssuredThat(response -> response.body("'message'", is("Success")));
        restAssuredThat(response -> response.body("'data'", nullValue()));
        restAssuredThat(response -> response.body(matchesJsonSchema(schema)));
    }

    @Step("I set API endpoint invalid for create new favorite without the path")
    public String setAPIEndpointInvalidCreateNewFavoriteWithoutPath() { return url + "/warehouse";
    }

    @Step("I send request to create new favorite no path")
    public void sendRequestCreateNewFavoriteNoPath() {
        String Token = GenerateToken.generateToken();
        JSONObject requestBody = new JSONObject();
        SerenityRest.given()
                .header("Content-Type","application/json")
                .header("Authorization", "Bearer " + Token)
                .body(requestBody.toString())
                .post(setAPIEndpointInvalidCreateNewFavoriteWithoutPath());
    }

    @Step("I received status code 500 Internal Server Error in request to create new favorite")
    public void receivedStatusCode500InternalServerErrorRequestCreateNewFavorite() {
        restAssuredThat(response -> response.statusCode(500));
    }

    @Step("I received error message \"general error\" response in request create new favorite")
    public void receivedErrorMessageGeneralErrorResponseCreateNewFavorite() {
    }

    @Step("I blank the warehouse ID request")
    public void blankWarehouseIDRequest() {
    }

    @Step("I send blank request to create new favorite")
    public void sendBlankRequestCreateNewFavorite() {
        String Token = GenerateToken.generateToken();
        JSONObject requestBody = new JSONObject();
        String warehouseId = "";
        requestBody.put("warehouseId", warehouseId);
        SerenityRest.given()
                .header("Content-Type","application/json")
                .header("Authorization", "Bearer " + Token)
                .body(requestBody.toString())
                .post(setAPIEndpointValidCreateNewFavorite());
    }

    @Step("I received status code 400 Bad Request in request to create new favorite")
    public void receivedStatusCode400BadRequestCreateNewFavorite() {
        restAssuredThat(response -> response.statusCode(400));
    }

    @Step("I received the error message \"invalid request\" response in create new favorite")
    public void receivedErrorMessageInvalidRequestResponseCreateNewFavorite() {
        restAssuredThat(response -> response.body("'status'", notNullValue()));
        restAssuredThat(response -> response.body("'message'", is("invalid request")));
        restAssuredThat(response -> response.body("'data'", notNullValue()));
    }
}
