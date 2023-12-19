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

public class GetListTransactionWarehouse {
    private static final String url = "https://digiwarehouse-app.onrender.com";

    @Step ( "I set API endpoint valid for get list transaction warehouse" )
    public String setAPIEndpointValidGetListTransactionWarehouse() {
        return url + "/dasboard/transaction/warehouse/3?page=1&limit=10";
    }

    @Step ( "I send request to get list transaction warehouse" )
    public void sendRequestGetListTransactionWarehouse() {
        JSONObject requestBody = new JSONObject();
        String Token = GenerateToken.generateToken();
        SerenityRest.given()
                .header("Content-Type", "application/json")
                .header("Authorization", "Bearer " + Token)
                .body(requestBody.toString())
                .get(setAPIEndpointValidGetListTransactionWarehouse());
    }

    @Step ( "I received status code 200 OK in request get list transaction warehouse" )
    public void receivedStatusCode200OKRequestGetListTransactionWarehouse() {
        restAssuredThat(response -> response.statusCode(200));
    }

    @Step ( "I received message \"Success\" response in request get list transaction warehouse" )
    public void receivedMessageSuccessResponseGetListTransactionWarehouse() {
        JsonSchemaHelper helper = new JsonSchemaHelper();
        String schema = helper.getResponseSchema(JsonSchema.Get_List_Transaction_Warehouse_Response_Schema);
        restAssuredThat(response -> response.body("'status'", notNullValue()));
        restAssuredThat(response -> response.body("'message'", is("Success")));
        restAssuredThat(response -> response.body("'data'", nullValue()));
        restAssuredThat(response -> response.body(matchesJsonSchema(schema)));
    }

    @Step ( "I set API endpoint invalid for get list transaction warehouse without the path" )
    public String setAPIEndpointInvalidGetListTransactionWarehouseWithoutPath() {
        return url + "/dasboard/transaction/warehouse";
    }

    @Step ( "I send request to get list transaction warehouse no path" )
    public void sendRequestGetListTransactionWarehouseNoPath() {
        String Token = GenerateToken.generateToken();
        JSONObject requestBody = new JSONObject();
        SerenityRest.given()
                .header("Content-Type", "application/json")
                .header("Authorization", "Bearer " + Token)
                .body(requestBody.toString())
                .get(setAPIEndpointInvalidGetListTransactionWarehouseWithoutPath());
    }

    @Step ( "I received status code 500 Internal Server Error in request to get list transaction warehouse" )
    public void receivedStatusCode500InternalServerErrorRequestGetListTransactionWarehouse() {
        restAssuredThat(response -> response.statusCode(500));
    }

    @Step ( "I received error message \"general error\" response in request get list transaction warehouse" )
    public void receivedErrorMessageGeneralErrorResponseGetListTransactionWarehouse() {
    }
}
