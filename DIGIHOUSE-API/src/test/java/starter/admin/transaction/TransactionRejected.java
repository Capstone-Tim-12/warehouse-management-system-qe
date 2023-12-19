package starter.admin.transaction;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.JSONObject;
import starter.utils.GenerateToken;
import starter.utils.JsonSchema;
import starter.utils.JsonSchemaHelper;

import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchema;
import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.*;

public class TransactionRejected {
    private static final String url = "https://digiwarehouse-app.onrender.com";

    @Step ( "I set API endpoint valid for transaction rejected" )
    public String setAPIEndpointValidTransactionRejected() {
        return url + "/dasboard/transaction/rejected/4N9NZ2y2khKhbbMg0RyA";
    }

    @Step ( "I send request to transaction rejected" )
    public void sendRequestTransactionRejected() {
        JSONObject requestBody = new JSONObject();
        String Token = GenerateToken.generateToken();
        SerenityRest.given()
                .header("Content-Type", "application/json")
                .header("Authorization", "Bearer " + Token)
                .body(requestBody.toString())
                .put(setAPIEndpointValidTransactionRejected());
    }

    @Step ( "I received status code 200 OK in request transaction rejected" )
    public void receivedStatusCode200OKRequestTransactionRejected() {
        restAssuredThat(response -> response.statusCode(200));
    }

    @Step ( "I received message \"Success\" response in request transaction rejected" )
    public void receivedMessageSuccessResponseTransactionRejected() {
        JsonSchemaHelper helper = new JsonSchemaHelper();
        String schema = helper.getResponseSchema(JsonSchema.Transaction_Rejected_Response_Schema);
        restAssuredThat(response -> response.body("'status'", notNullValue()));
        restAssuredThat(response -> response.body("'message'", is("Success")));
        restAssuredThat(response -> response.body("'data'", nullValue()));
        restAssuredThat(response -> response.body(matchesJsonSchema(schema)));
    }

    @Step ( "I set API endpoint invalid for can't transaction rejected without the path" )
    public String setAPIEndpointInvalidTransactionRejectedWithoutPath() {
        return url + "/dasboard/transaction/rejected";
    }

    @Step ( "I send request to transaction rejected no path" )
    public void sendRequestTransactionRejectedNoPath() {
        String Token = GenerateToken.generateToken();
        JSONObject requestBody = new JSONObject();
        SerenityRest.given()
                .header("Content-Type", "application/json")
                .header("Authorization", "Bearer " + Token)
                .body(requestBody.toString())
                .put(setAPIEndpointInvalidTransactionRejectedWithoutPath());
    }

    @Step ( "I received status code 500 Internal Server Error in request to transaction rejected" )
    public void receivedStatusCode500InternalServerErrorRequestTransactionRejected() {
        restAssuredThat(response -> response.statusCode(500));
    }

    @Step ( "I received error message \"general error\" response in request transaction rejected" )
    public void receivedErrorMessageGeneralErrorResponseTransactionRejected() {
    }

    @Step ( "I set API endpoint invalid for can't transaction rejected with invalid transaction ID" )
    public String setAPIEndpointInvalidTransactionRejectedWithInvalidTransactionID() {
        return url + "/dasboard/transaction/rejected/4N9NZ2y2khKhbbMg0Ry";
    }

    @Step ( "I send request to transaction rejected with invalid transaction ID" )
    public void sendRequestTransactionRejectedWithInvalidTransactionID() {
        String Token = GenerateToken.generateToken();
        JSONObject requestBody = new JSONObject();
        SerenityRest.given()
                .header("Content-Type", "application/json")
                .header("Authorization", "Bearer " + Token)
                .body(requestBody.toString())
                .put(setAPIEndpointInvalidTransactionRejectedWithInvalidTransactionID());
    }

    @Step ( "I received status code 404 Not Found in request transaction rejected" )
    public void receivedStatusCode404NotFoundRequestTransactionRejected() {
        restAssuredThat(response -> response.statusCode(404));
    }

    @Step ( "I received message \"Not Found\" response in request transaction rejected" )
    public void receivedErrorMessageNotFoundResponseTransactionRejected() {
    }

    @Step ( "I set API endpoint invalid for can't transaction rejected if the transaction ID has previously been made" )
    public String setAPIEndpointInvalidTransactionRejectedWithIDHasPreviouslyBeenMade() {
        return url + "/dasboard/transaction/rejected/4N9NZ2y2khKhbbMg0RyA";
    }

    @Step ( "I send request to transaction rejected with transaction ID has previously been made" )
    public void sendRequestTransactionRejectedWithTransactionIDHasPreviouslyBeenMade() {
        String Token = GenerateToken.generateToken();
        JSONObject requestBody = new JSONObject();
        SerenityRest.given()
                .header("Content-Type", "application/json")
                .header("Authorization", "Bearer " + Token)
                .body(requestBody.toString())
                .put(setAPIEndpointInvalidTransactionRejectedWithIDHasPreviouslyBeenMade());
    }

    @Step ( "I received status code 400 Bad Request in request transaction rejected" )
    public void receivedStatusCode400BadRequestRequestTransactionRejected() {
        restAssuredThat(response -> response.statusCode(400));
    }

    @Step ( "I received message \"status transaction not submission\" response in request transaction rejected" )
    public void receivedErrorMessageStatusTransactionNotSubmissionResponseTransactionRejected() {
    }
}
