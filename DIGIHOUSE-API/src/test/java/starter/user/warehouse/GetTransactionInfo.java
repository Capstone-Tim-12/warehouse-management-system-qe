package starter.user.warehouse;

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

public class GetTransactionInfo {
    private static final String url = "https://digiwarehouse-app.onrender.com";

    @Step ( "I set API endpoint valid for get transaction info" )
    public String setAPIEndpointValidGetTransactionInfo() {
        return url + "/payment/transaction/m9ZkOUEtUROpuHkX7ASA";
    }

    @Step ( "I send request to get transaction info" )
    public void sendRequestGetTransactionInfo() {
        JSONObject requestBody = new JSONObject();
        String Token = GenerateToken.generateToken();
        SerenityRest.given()
                .header("Content-Type", "application/json")
                .header("Authorization", "Bearer " + Token)
                .body(requestBody.toString())
                .get(setAPIEndpointValidGetTransactionInfo());
    }

    @Step ( "I received status code 200 OK in request get transaction info" )
    public void receivedStatusCode200OKRequestGetTransactionInfo() {
        restAssuredThat(response -> response.statusCode(200));
    }

    @Step ( "I received transaction data and message \"Success\" response in request get transaction info" )
    public void receivedTransactionDataAndMessageSuccessResponseGetTransactionInfo() {
        JsonSchemaHelper helper = new JsonSchemaHelper();
        String schema = helper.getResponseSchema(JsonSchema.Get_Transaction_Info_Response_Schema);
        restAssuredThat(response -> response.body("'status'", notNullValue()));
        restAssuredThat(response -> response.body("'message'", is("Success")));
        restAssuredThat(response -> response.body("'data'", notNullValue()));
        restAssuredThat(response -> response.body("'data'.'dateEntry'", notNullValue()));
        restAssuredThat(response -> response.body("'data'.'dateOut'", notNullValue()));
        restAssuredThat(response -> response.body("'data'.'paymentScheme'", notNullValue()));
        restAssuredThat(response -> response.body("'data'.'duration'", notNullValue()));
        restAssuredThat(response -> response.body("'data'.'username'", notNullValue()));
        restAssuredThat(response -> response.body("'data'.'email'", notNullValue()));
        restAssuredThat(response -> response.body(matchesJsonSchema(schema)));
    }

    @Step ( "I set API endpoint invalid for get transaction info without the path" )
    public String setAPIEndpointInvalidGetTransactionInfoWithoutPath() {
        return url + "/payment/transaction";
    }

    @Step ( "I send request to get transaction info no path" )
    public void sendRequestGetTransactionInfoNoPath() {
        String Token = GenerateToken.generateToken();
        JSONObject requestBody = new JSONObject();
        SerenityRest.given()
                .header("Content-Type", "application/json")
                .header("Authorization", "Bearer " + Token)
                .body(requestBody.toString())
                .get(setAPIEndpointInvalidGetTransactionInfoWithoutPath());
    }

    @Step ( "I received status code 500 Internal Server Error in request to get transaction info" )
    public void receivedStatuscode500InternalServerErrorRequestGetTransactionInfo() {
        restAssuredThat(response -> response.statusCode(500));
    }

    @Step ( "I received error message \"general error\" response in request get transaction info" )
    public void receivedErrorMessageGeneralErrorResponseGetTransactionInfo() {
    }
}
