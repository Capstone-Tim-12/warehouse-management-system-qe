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

public class GetReason {
    private static final String url = "https://digiwarehouse-app.onrender.com";

    @Step ( "I set API endpoint valid for get reason" )
    public String setAPIEndpointValidGetReason() {
        return url + "/dasboard/payment/reasone";
    }

    @Step ( "I send request to get reason" )
    public void sendRequestGetReason() {
        JSONObject requestBody = new JSONObject();
        String Token = GenerateToken.generateToken();
        SerenityRest.given()
                .header("Content-Type", "application/json")
                .header("Authorization", "Bearer " + Token)
                .body(requestBody.toString())
                .get(setAPIEndpointValidGetReason());
    }

    @Step ( "I received status code 200 OK in request get reason" )
    public void receivedStatusCode200OKRequestGetReason() {
        restAssuredThat(response -> response.statusCode(200));
    }

    @Step ( "I received message \"Success\" response in request get reason" )
    public void receivedMessageSuccessResponseGetReason() {
        JsonSchemaHelper helper = new JsonSchemaHelper();
        String schema = helper.getResponseSchema(JsonSchema.Get_Reason_Response_Schema);
        restAssuredThat(response -> response.body("'status'", notNullValue()));
        restAssuredThat(response -> response.body("'message'", is("Success")));
        restAssuredThat(response -> response.body("'data'", nullValue()));
        restAssuredThat(response -> response.body(matchesJsonSchema(schema)));
    }

    @Step ( "I set API endpoint invalid for get reason without the path" )
    public String setAPIEndpointInvalidGetReasonWithoutPath() {
        return url + "/dasboard/payment";
    }

    @Step ( "I send request to get reason no path" )
    public void sendRequestGetLReasonNoPath() {
        String Token = GenerateToken.generateToken();
        JSONObject requestBody = new JSONObject();
        SerenityRest.given()
                .header("Content-Type", "application/json")
                .header("Authorization", "Bearer " + Token)
                .body(requestBody.toString())
                .get(setAPIEndpointInvalidGetReasonWithoutPath());
    }

    @Step ( "I received status code 500 Internal Server Error in request to get reason" )
    public void receivedStatusCode500InternalServerErrorRequestGetReason() {
        restAssuredThat(response -> response.statusCode(500));
    }

    @Step ( "I received error message \"general error\" response in request get reason" )
    public void receivedErrorMessageGeneralErrorResponseGetReason() {
    }
}
