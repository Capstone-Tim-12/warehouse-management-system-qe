package starter.admin.manageUser;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.JSONObject;
import starter.utils.GenerateToken;
import starter.utils.JsonSchema;
import starter.utils.JsonSchemaHelper;

import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchema;
import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.*;

public class GetTransactionDetailUser {
    private static final String url = "https://digiwarehouse-app.onrender.com";

    @Step ( "I set API endpoint valid for get transaction detail user" )
    public String setAPIEndpointValidGetTransactionDetailUser() {
        return url + "/dasboard/user/transaction/lAzAUNHjX9HdAu3p2bFl";
    }

    @Step ( "I send request to get transaction detail user" )
    public void sendRequestGetTransactionDetailUser() {
        String Token = GenerateToken.generateToken();
        JSONObject requestBody = new JSONObject();
        SerenityRest.given()
                .header("Content-Type", "application/json")
                .header("Authorization", "Bearer " + Token)
                .body(requestBody.toString())
                .get(setAPIEndpointValidGetTransactionDetailUser());
    }

    @Step ( "I received status code 200 OK in request get transaction detail user" )
    public void receivedStatusCode200OKRequestGetTransactionDetailUser() {
        restAssuredThat(response -> response.statusCode(200));
    }

    @Step ( "I received message \"Success\" response in request get transaction detail user" )
    public void receivedMessageSuccessResponseGetTransactionDetailUser() {
        JsonSchemaHelper helper = new JsonSchemaHelper();
        String schema = helper.getResponseSchema(JsonSchema.Get_Transaction_Detail_User_Response_Schema);
        restAssuredThat(response -> response.body("'status'", notNullValue()));
        restAssuredThat(response -> response.body("'message'", is("Success")));
        restAssuredThat(response -> response.body("'data'", notNullValue()));
        restAssuredThat(response -> response.body(matchesJsonSchema(schema)));
    }

    @Step ( "I set API endpoint invalid for can't get transaction detail user without the path" )
    public String setAPIEndpointInvalidGetTransactionDetailUserWithoutPath() {
        return url + "/dasboard/user";
    }

    @Step ( "I send request to get transaction detail user no path" )
    public void sendRequestGetTransactionDetailUserNoPath() {
        String Token = GenerateToken.generateToken();
        JSONObject requestBody = new JSONObject();
        SerenityRest.given()
                .header("Content-Type", "application/json")
                .header("Authorization", "Bearer " + Token)
                .body(requestBody.toString())
                .get(setAPIEndpointInvalidGetTransactionDetailUserWithoutPath());
    }

    @Step ( "I received status code 500 Internal Server Error in request to get transaction detail user" )
    public void receivedStatusCode500InternalServerErrorRequestGetTransactionDetailUser() {
        restAssuredThat(response -> response.statusCode(500));
    }

    @Step ( "I received error message \"general error\" response in request get transaction detail user" )
    public void receivedErrorMessageGeneralErrorResponseGetTransactionDetailUser() {
    }
}
