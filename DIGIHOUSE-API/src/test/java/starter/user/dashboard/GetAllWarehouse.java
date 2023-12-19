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

public class GetAllWarehouse {
    private static final String url = "https://digiwarehouse-app.onrender.com";

    @Step ("I set API endpoint valid for get all warehouse")
    public String setAPIEndpointValidGetAllWarehouse() {
        return url + "/warehouse/user/list?page=1&limit=10";
    }

    @Step("I send request to get all warehouse")
    public void sendRequestGetAllWarehouse() {
        String Token = GenerateToken.generateToken();
        JSONObject requestBody = new JSONObject();
        SerenityRest.given()
                .header("Content-Type","application/json")
                .header("Authorization", "Bearer " + Token)
                .body(requestBody.toString())
                .get(setAPIEndpointValidGetAllWarehouse());
    }

    @Step("I received status code 200 OK in request get all warehouse")
    public void receivedStatusCode200OKRequestGetAllWarehouse() {
        restAssuredThat(response -> response.statusCode(200));
    }

    @Step("I received all warehouse data and message \"Success\" response in request get all warehouse")
    public void receivedAllWarehouseDataAndMessageSuccessResponseGetAllWarehouse() {
        JsonSchemaHelper helper = new JsonSchemaHelper();
        String schema = helper.getResponseSchema(JsonSchema.Get_All_Warehouse_Response_Schema);
        restAssuredThat(response -> response.body("'status'", notNullValue()));
        restAssuredThat(response -> response.body("'message'", is("Success")));
        restAssuredThat(response -> response.body("'data'", notNullValue()));
        restAssuredThat(response -> response.body(matchesJsonSchema(schema)));
    }

    @Step("I set API endpoint invalid for get all warehouse")
    public String setAPIEndpointInvalidGetAllWarehouse() { return url + "/warehouse/user";
    }

    @Step("I send request to get all warehouse no path")
    public void sendRequestGetAllWarehouseNoPath() {
        String Token = GenerateToken.generateToken();
        JSONObject requestBody = new JSONObject();
        SerenityRest.given()
                .header("Content-Type","application/json")
                .header("Authorization", "Bearer " + Token)
                .body(requestBody.toString())
                .get(setAPIEndpointInvalidGetAllWarehouse());
    }

    @Step("I received status code 500 Internal Server Error in request to get all warehouse")
    public void receivedStatusCode500InternalServerErrorRequestGetAllWarehouse() {
        restAssuredThat(response -> response.statusCode(500));
    }

    @Step("I received error message \"general error\" response in request get all warehouse")
    public void receivedErrorMessageGeneralErrorResponseGetAllWarehouse() {
    }
}
