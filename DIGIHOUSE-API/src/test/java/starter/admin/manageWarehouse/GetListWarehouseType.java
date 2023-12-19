package starter.admin.manageWarehouse;

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

public class GetListWarehouseType {
    private static final String url = "https://digiwarehouse-app.onrender.com";

    @Step ( "I set API endpoint valid for get list warehouse type" )
    public String setAPIEndpointValidGetListWarehouseType() {
        return url + "/dasboard/warehouse/type";
    }

    @Step ( "I send request to get list warehouse type" )
    public void sendRequestGetListWarehouseType() {
        JSONObject requestBody = new JSONObject();
        String Token = GenerateToken.generateToken();
        SerenityRest.given()
                .header("Content-Type", "application/json")
                .header("Authorization", "Bearer " + Token)
                .body(requestBody.toString())
                .get(setAPIEndpointValidGetListWarehouseType());
    }

    @Step ( "I received status code 200 OK in request get list warehouse type" )
    public void receivedStatusCode200OKRequestGetListWarehouseType() {
        restAssuredThat(response -> response.statusCode(200));
    }

    @Step ( "I received message \"Success\" response in request get list warehouse type" )
    public void receivedMessageSuccessResponseGetListWarehouseType() {
        JsonSchemaHelper helper = new JsonSchemaHelper();
        String schema = helper.getResponseSchema(JsonSchema.Get_List_Warehouse_Type_Response_Schema);
        restAssuredThat(response -> response.body("'status'", notNullValue()));
        restAssuredThat(response -> response.body("'message'", is("Success")));
        restAssuredThat(response -> response.body("'data'", notNullValue()));
        restAssuredThat(response -> response.body(matchesJsonSchema(schema)));
    }

    @Step ( "I set API endpoint invalid for get list warehouse type without the path" )
    public String setAPIEndpointInvalidGetListWarehouseTypeWithoutPath() {
        return url + "/dasboard/warehouse";
    }

    @Step ( "I send request to get list warehouse type no path" )
    public void sendRequestGetListWarehouseTypeNoPath() {
        String Token = GenerateToken.generateToken();
        JSONObject requestBody = new JSONObject();
        SerenityRest.given()
                .header("Content-Type", "application/json")
                .header("Authorization", "Bearer " + Token)
                .body(requestBody.toString())
                .get(setAPIEndpointInvalidGetListWarehouseTypeWithoutPath());
    }

    @Step ( "I received status code 500 Internal Server Error in request to get list warehouse type" )
    public void receivedStatusCode500InternalServerErrorRequestGetListWarehouseType() {
        restAssuredThat(response -> response.statusCode(500));
    }

    @Step ( "I received error message \"general error\" response in request get list warehouse type" )
    public void receivedErrorMessageGeneralErrorResponseGetListWarehouseType() {
    }
}
