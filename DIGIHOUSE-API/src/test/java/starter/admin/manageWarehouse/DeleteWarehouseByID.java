package starter.admin.manageWarehouse;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.JSONObject;
import starter.utils.GenerateToken;
import starter.utils.JsonSchema;
import starter.utils.JsonSchemaHelper;

import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchema;
import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.*;

public class DeleteWarehouseByID {
    private static final String url = "https://digiwarehouse-app.onrender.com";

    @Step ( "I set API endpoint valid for delete warehouse by ID" )
    public String setAPIEndpointValidDeleteWarehouseByID() {
        return url + "/warehouse/detail/85";
    }

    @Step ( "I send request to delete warehouse by ID" )
    public void sendRequestDeleteWarehouseByID() {
        String Token = GenerateToken.generateToken();
        JSONObject requestBody = new JSONObject();
        SerenityRest.given()
                .header("Content-Type", "application/json")
                .header("Authorization", "Bearer " + Token)
                .body(requestBody.toString())
                .delete(setAPIEndpointValidDeleteWarehouseByID());
    }

    @Step ( "I received status code 200 OK in request delete warehouse by ID" )
    public void receivedStatusCode200OKRequestDeleteWarehouseByID() {
        restAssuredThat(response -> response.statusCode(200));
    }

    @Step ( "I received message \"Success\" response in request delete warehouse by ID" )
    public void receivedMessageSuccessResponseDeleteWarehouseByID() {
        JsonSchemaHelper helper = new JsonSchemaHelper();
        String schema = helper.getResponseSchema(JsonSchema.Delete_Warehouse_By_ID_Response_Schema);
        restAssuredThat(response -> response.body("'status'", notNullValue()));
        restAssuredThat(response -> response.body("'message'", is("Success")));
        restAssuredThat(response -> response.body("'data'", nullValue()));
        restAssuredThat(response -> response.body(matchesJsonSchema(schema)));
    }

    @Step ( "I set API endpoint invalid for can't delete warehouse by ID without the path" )
    public String setAPIEndpointInvalidDeleteWarehouseByIDWithoutPath() {
        return url + "/warehouse/detail";
    }

    @Step ( "I send request to delete warehouse by ID no path" )
    public void sendRequestDeleteWarehouseByIDNoPath() {
        String Token = GenerateToken.generateToken();
        JSONObject requestBody = new JSONObject();
        SerenityRest.given()
                .header("Content-Type", "application/json")
                .header("Authorization", "Bearer " + Token)
                .body(requestBody.toString())
                .delete(setAPIEndpointInvalidDeleteWarehouseByIDWithoutPath());
    }

    @Step ( "I received status code 500 Internal Server Error in request to delete warehouse by ID" )
    public void receivedStatusCode500InternalServerErrorRequestDeleteWarehouseByID() {
        restAssuredThat(response -> response.statusCode(500));
    }

    @Step ( "I received error message \"general error\" response in request delete warehouse by ID" )
    public void receivedErrorMessageGeneralErrorResponseDeleteWarehouseByID() {
    }

    @Step ( "I set API endpoint invalid for can't delete warehouse by ID with invalid ID" )
    public String setAPIEndpointDeleteWarehouseByIDWitInvalidID() {
        return url + "/warehouse/detail/27000";
    }

    @Step ( "I send request to delete warehouse by ID with invalid ID" )
    public void sendRequestDeleteWarehouseByIDWithInvalidID() {
        String Token = GenerateToken.generateToken();
        JSONObject requestBody = new JSONObject();
        SerenityRest.given()
                .header("Content-Type", "application/json")
                .header("Authorization", "Bearer " + Token)
                .body(requestBody.toString())
                .delete(setAPIEndpointDeleteWarehouseByIDWitInvalidID());
    }

    @Step ( "I received status code 404 Not Found in request delete warehouse by ID" )
    public void receivedStatusCode404NotFoundRequestDeleteWarehouseByID() {
        restAssuredThat(response -> response.statusCode(404));
    }

    @Step ( "I received message \"warehouse not found\" response in request delete warehouse by ID" )
    public void receivedMessageWarehouseNotFoundResponseDeleteWarehouseByID() {
    }
}
