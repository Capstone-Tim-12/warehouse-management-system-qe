package starter.admin.transaction;

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

public class GetHistoryTransactionData {
    private static final String url = "https://digiwarehouse-app.onrender.com";

    @Step ( "I set API endpoint valid for get history transaction data" )
    public String setAPIEndpointValidGetHistoryTransactionData() {
        return url + "/dasboard/list/trx-history?page=1&limit=10";
    }

    @Step ( "I send request to get history transaction data" )
    public void sendRequestGetHistoryTransactionData() {
        JSONObject requestBody = new JSONObject();
        String Token = GenerateToken.generateToken();
        SerenityRest.given()
                .header("Content-Type", "application/json")
                .header("Authorization", "Bearer " + Token)
                .body(requestBody.toString())
                .get(setAPIEndpointValidGetHistoryTransactionData());
    }

    @Step ( "I received status code 200 OK in request get history transaction data" )
    public void receivedStatusCode200OKRequestGetHistoryTransactionData() {
        restAssuredThat(response -> response.statusCode(200));
    }

    @Step ( "I received message \"Success\" response in request get history transaction data" )
    public void receivedMessageSuccessResponseGetHistoryTransactionData() {
        JsonSchemaHelper helper = new JsonSchemaHelper();
        String schema = helper.getResponseSchema(JsonSchema.Get_History_Transaction_Data_Response_Schema);
        restAssuredThat(response -> response.body("'status'", notNullValue()));
        restAssuredThat(response -> response.body("'message'", is("Success")));
        restAssuredThat(response -> response.body("'data'", notNullValue()));
        restAssuredThat(response -> response.body(matchesJsonSchema(schema)));
    }

    @Step ( "I set API endpoint invalid for can't get history transaction data without the path" )
    public String setAPIEndpointInvalidGetHistoryTransactionDataWithoutPath() {
        return url + "/dasboard/list";
    }

    @Step ( "I send request to get history transaction data no path" )
    public void sendRequestGetHistoryTransactionDataNoPath() {
        String Token = GenerateToken.generateToken();
        JSONObject requestBody = new JSONObject();
        SerenityRest.given()
                .header("Content-Type", "application/json")
                .header("Authorization", "Bearer " + Token)
                .body(requestBody.toString())
                .get(setAPIEndpointInvalidGetHistoryTransactionDataWithoutPath());
    }

    @Step ( "I received status code 500 Internal Server Error in request to get history transaction data" )
    public void receivedStatusCode500InternalServerErrorRequestGetHistoryTransactionData() {
        restAssuredThat(response -> response.statusCode(500));
    }

    @Step ( "I received error message \"general error\" response in request get history transaction data" )
    public void receivedErrorMessageGeneralErrorResponseGetHistoryTransactionData() {
    }
}
