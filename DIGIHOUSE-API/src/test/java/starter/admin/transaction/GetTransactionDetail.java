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

public class GetTransactionDetail {
    private static final String url = "https://digiwarehouse-app.onrender.com";

    @Step ( "I set API endpoint valid for get transaction detail" )
    public String setAPIEndpointValidGetTransactionDetail() {
        return url + "/dasboard/transaction/detail/lAzAUNHjX9HdAu3p2bFl";
    }

    @Step ( "I send request to get transaction detail" )
    public void sendRequestGetTransactionDetail() {
        JSONObject requestBody = new JSONObject();
        String Token = GenerateToken.generateToken();
        SerenityRest.given()
                .header("Content-Type", "application/json")
                .header("Authorization", "Bearer " + Token)
                .body(requestBody.toString())
                .get(setAPIEndpointValidGetTransactionDetail());
    }

    @Step ( "I received status code 200 OK in request get transaction detail" )
    public void receivedStatusCode200OKRequestGetTransactionDetail() {
        restAssuredThat(response -> response.statusCode(200));
    }

    @Step ( "I received message \"Success\" response in request get transaction detail" )
    public void receivedMessageSuccessResponseGetTransactionDetail() {
        JsonSchemaHelper helper = new JsonSchemaHelper();
        String schema = helper.getResponseSchema(JsonSchema.Get_Transaction_Detail_Response_Schema);
        restAssuredThat(response -> response.body("'status'", notNullValue()));
        restAssuredThat(response -> response.body("'message'", is("Success")));
        restAssuredThat(response -> response.body("'data'", notNullValue()));
        restAssuredThat(response -> response.body(matchesJsonSchema(schema)));
    }

    @Step ( "I set API endpoint invalid for can't get transaction detail without the path" )
    public String setAPIEndpointInvalidGetTransactionDetailWithoutPath() {
        return url + "/dasboard/transaction/detail";
    }

    @Step ( "I send request to get transaction detail no path" )
    public void sendRequestGetTransactionDetailNoPath() {
        String Token = GenerateToken.generateToken();
        JSONObject requestBody = new JSONObject();
        SerenityRest.given()
                .header("Content-Type", "application/json")
                .header("Authorization", "Bearer " + Token)
                .body(requestBody.toString())
                .get(setAPIEndpointInvalidGetTransactionDetailWithoutPath());
    }

    @Step ( "I received status code 500 Internal Server Error in request to get transaction detail" )
    public void receivedStatusCode500InternalServerErrorRequestGetTransactionDetail() {
        restAssuredThat(response -> response.statusCode(500));
    }

    @Step ( "I received error message \"general error\" response in request get transaction detail" )
    public void receivedErrorMessageGeneralErrorResponseGetTransactionDetail() {
    }
}
