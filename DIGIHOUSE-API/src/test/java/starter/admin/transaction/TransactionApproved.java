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

public class TransactionApproved {
    private static final String url = "https://digiwarehouse-app.onrender.com";

    @Step ( "I set API endpoint valid for transaction approved" )
    public String setAPIEndpointValidTransactionApproved() {
        return url + "/dasboard/transaction/approval/5IaFdhfxT7ARDwE2wsp2";
    }

    @Step ( "I send request to transaction approved" )
    public void sendRequestTransactionApproved() {
        JSONObject requestBody = new JSONObject();
        String Token = GenerateToken.generateToken();
        SerenityRest.given()
                .header("Content-Type", "application/json")
                .header("Authorization", "Bearer " + Token)
                .body(requestBody.toString())
                .put(setAPIEndpointValidTransactionApproved());
    }

    @Step ( "I received status code 200 OK in request transaction approved" )
    public void receivedStatusCode200OKRequestTransactionApproved() {
        restAssuredThat(response -> response.statusCode(200));
    }

    @Step ( "I received message \"Success\" response in request transaction approved" )
    public void receivedMessageSuccessResponseTransactionApproved() {
        JsonSchemaHelper helper = new JsonSchemaHelper();
        String schema = helper.getResponseSchema(JsonSchema.Transaction_Approved_Response_Schema);
        restAssuredThat(response -> response.body("'status'", notNullValue()));
        restAssuredThat(response -> response.body("'message'", is("Success")));
        restAssuredThat(response -> response.body("'data'", nullValue()));
        restAssuredThat(response -> response.body(matchesJsonSchema(schema)));
    }

    @Step ( "I set API endpoint invalid for can't transaction approved without the path" )
    public String setAPIEndpointInvalidTransactionApprovedWithoutPath() {
        return url + "/dasboard/payment";
    }

    @Step ( "I send request to transaction approved no path" )
    public void sendRequestTransactionApprovedNoPath() {
        String Token = GenerateToken.generateToken();
        JSONObject requestBody = new JSONObject();
        SerenityRest.given()
                .header("Content-Type", "application/json")
                .header("Authorization", "Bearer " + Token)
                .body(requestBody.toString())
                .put(setAPIEndpointInvalidTransactionApprovedWithoutPath());
    }

    @Step ( "I received status code 500 Internal Server Error in request to transaction approved" )
    public void receivedStatusCode500InternalServerErrorRequestTransactionApproved() {
        restAssuredThat(response -> response.statusCode(500));
    }

    @Step ( "I received error message \"general error\" response in request transaction approved" )
    public void receivedErrorMessageGeneralErrorResponseTransactionApproved() {
    }

    @Step ( "I set API endpoint invalid for can't transaction approved with invalid transaction ID" )
    public String setAPIEndpointInvalidTransactionApprovedWithInvalidTransactionID() {
        return url + "/dasboard/transaction/approval/5IaFdhfxT7ARDwE2wsp";
    }

    @Step ( "I send request to transaction approved with invalid transaction ID" )
    public void sendRequestTransactionApprovedWithInvalidTransactionID() {
        String Token = GenerateToken.generateToken();
        JSONObject requestBody = new JSONObject();
        SerenityRest.given()
                .header("Content-Type", "application/json")
                .header("Authorization", "Bearer " + Token)
                .body(requestBody.toString())
                .put(setAPIEndpointInvalidTransactionApprovedWithInvalidTransactionID());
    }

    @Step ( "I received status code 404 Not Found in request transaction approved" )
    public void receivedStatusCode404NotFoundRequestTransactionApproved() {
        restAssuredThat(response -> response.statusCode(404));
    }

    @Step ( "I received message \"Not Found\" response in request transaction approved" )
    public void receivedErrorMessageNotFoundResponseTransactionApproved() {
    }

    @Step ( "I set API endpoint invalid for can't transaction approved if the transaction ID has previously been made" )
    public String setAPIEndpointInvalidTransactionApprovedWithIDHasPreviouslyBeenMade() {
        return url + "/dasboard/transaction/approval/5IaFdhfxT7ARDwE2wsp2";
    }

    @Step ( "I send request to transaction approved with transaction ID has previously been made" )
    public void sendRequestTransactionApprovedWithTransactionIDHasPreviouslyBeenMade() {
        String Token = GenerateToken.generateToken();
        JSONObject requestBody = new JSONObject();
        SerenityRest.given()
                .header("Content-Type", "application/json")
                .header("Authorization", "Bearer " + Token)
                .body(requestBody.toString())
                .put(setAPIEndpointInvalidTransactionApprovedWithIDHasPreviouslyBeenMade());
    }

    @Step ( "I received status code 400 Bad Request in request transaction approved" )
    public void receivedStatusCode400BadRequestRequestTransactionApproved() {
        restAssuredThat(response -> response.statusCode(400));
    }

    @Step ( "I received message \"status transaction not submission\" response in request transaction approved" )
    public void receivedErrorMessageStatusTransactionNotSubmissionResponseTransactionApproved() {
    }
}
