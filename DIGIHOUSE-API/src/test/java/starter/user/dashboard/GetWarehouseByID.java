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

public class GetWarehouseByID {
    private static final String url = "https://digiwarehouse-app.onrender.com";

    @Step ("I set API endpoint valid for get warehouse by ID")
    public String setAPIEndpointValidGetWarehouseByID() {
        return url + "/warehouse/detail/68";
    }

    @Step("I send request to get warehouse by ID")
    public void sendRequestGetWarehouseByID() {
        String Token = GenerateToken.generateToken();
        JSONObject requestBody = new JSONObject();
        SerenityRest.given()
                .header("Content-Type","application/json")
                .header("Authorization", "Bearer " + Token)
                .body(requestBody.toString())
                .get(setAPIEndpointValidGetWarehouseByID());
    }

    @Step("I received status code 200 OK in request get warehouse by ID")
    public void receivedStatusCode200OKRequestGetWarehouseByID() {
        restAssuredThat(response -> response.statusCode(200));
    }

    @Step("I received all warehouse data and message \"Success\" response in request get warehouse by ID")
    public void receivedAllWarehouseDataAndMessageSuccessResponseGetWarehouseByID() {
        JsonSchemaHelper helper = new JsonSchemaHelper();
        String schema = helper.getResponseSchema(JsonSchema.Get_Warehouse_By_ID_Response_Schema);
        restAssuredThat(response -> response.body("'status'", notNullValue()));
        restAssuredThat(response -> response.body("'message'", is("Success")));
        restAssuredThat(response -> response.body("'data'", notNullValue()));
        restAssuredThat(response -> response.body("'data'.'name'", notNullValue()));
        restAssuredThat(response -> response.body("'data'.'description'", notNullValue()));
        restAssuredThat(response -> response.body("'data'.'provinceId'", notNullValue()));
        restAssuredThat(response -> response.body("'data'.'provinceName'", notNullValue()));
        restAssuredThat(response -> response.body("'data'.'regencyId'", notNullValue()));
        restAssuredThat(response -> response.body("'data'.'regencyName'", notNullValue()));
        restAssuredThat(response -> response.body("'data'.'districtId'", notNullValue()));
        restAssuredThat(response -> response.body("'data'.'districtName'", notNullValue()));
        restAssuredThat(response -> response.body("'data'.'address'", notNullValue()));
        restAssuredThat(response -> response.body("'data'.'surfaceArea'", notNullValue()));
        restAssuredThat(response -> response.body("'data'.'buildingArea'", notNullValue()));
        restAssuredThat(response -> response.body("'data'.'owner'", notNullValue()));
        restAssuredThat(response -> response.body("'data'.'phoneNumber'", notNullValue()));
        restAssuredThat(response -> response.body("'data'.'longitude'", notNullValue()));
        restAssuredThat(response -> response.body("'data'.'latitude'", notNullValue()));
        restAssuredThat(response -> response.body("'data'.'status'", notNullValue()));
        restAssuredThat(response -> response.body("'data'.'weeklyPrice'", notNullValue()));
        restAssuredThat(response -> response.body("'data'.'monthlyPrice'", notNullValue()));
        restAssuredThat(response -> response.body("'data'.'annualPrice'", notNullValue()));
        restAssuredThat(response -> response.body("'data'.'warehouseTypeId'", notNullValue()));
        restAssuredThat(response -> response.body("'data'.'warehouseType'", notNullValue()));
        restAssuredThat(response -> response.body("'data'.'image'", notNullValue()));
        restAssuredThat(response -> response.body(matchesJsonSchema(schema)));
    }

    @Step("I set API endpoint invalid for get warehouse by ID")
    public String setAPIEndpointInvalidGetWarehouseByID() { return url + "/warehouse/detail";
    }

    @Step("I send request to get warehouse by ID no path")
    public void sendRequestGetWarehouseByIDNoPath() {
        String Token = GenerateToken.generateToken();
        JSONObject requestBody = new JSONObject();
        SerenityRest.given()
                .header("Content-Type","application/json")
                .header("Authorization", "Bearer " + Token)
                .body(requestBody.toString())
                .get(setAPIEndpointInvalidGetWarehouseByID());
    }

    @Step("I received status code 500 Internal Server Error in request to get warehouse by ID")
    public void receivedStatusCode500InternalServerErrorRequestGetWarehouseByID() {
        restAssuredThat(response -> response.statusCode(500));
    }

    @Step("I received error message \"general error\" response in request get warehouse by ID")
    public void receivedErrorMessageGeneralErrorResponseGetWarehouseByID() {
    }

    @Step("I set API endpoint invalid for get a single warehouse data invalid ID")
    public String setAPIEndpointInvalidGetSingleWarehouseDataInvalidID() { return url + "/warehouse/detail/80IIk876k@&5";
    }

    @Step("I send request to get a single warehouse data invalid ID")
    public void sendRequestGetSingleWarehouseDataInvalidID() {
        String Token = GenerateToken.generateToken();
        JSONObject requestBody = new JSONObject();
        SerenityRest.given()
                .header("Content-Type","application/json")
                .header("Authorization", "Bearer " + Token)
                .body(requestBody.toString())
                .get(setAPIEndpointInvalidGetSingleWarehouseDataInvalidID());
    }

    @Step("I received status code 400 Bad Request in request to get warehouse by ID")
    public void receivedStatusCode400BadRequestInRequestGetWarehouseByID() {
        restAssuredThat(response -> response.statusCode(400));
    }

    @Step("I received error message \"Bad Request\" response in request get warehouse by ID")
    public void receivedErrorMessageBadRequestResponseGetWarehouseByID() {
    }

    @Step("I received error message \"failed find warehouse\" response in request get warehouse by ID")
    public void receivedErrorMessageFailedFindWarehouseResponseGetWarehouseByID() {
    }

    @Step("I set API endpoint invalid for get a single warehouse data ID not exist in database")
    public String setAPIEndpointInvalidGetSingleWarehouseDataIDNotExistInDatabase() { return url + "/warehouse/detail/800000000000";
    }

    @Step("I send request to get a single warehouse data ID not exist in database")
    public void sendRequestGetSingleWarehouseDataIDNotExistInDatabase() {
        String Token = GenerateToken.generateToken();
        JSONObject requestBody = new JSONObject();
        SerenityRest.given()
                .header("Content-Type","application/json")
                .header("Authorization", "Bearer " + Token)
                .body(requestBody.toString())
                .get(setAPIEndpointInvalidGetSingleWarehouseDataIDNotExistInDatabase());
    }
}
