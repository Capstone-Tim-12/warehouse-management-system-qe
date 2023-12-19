package starter.user.applyRental;

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

public class GetPaymentSchema {
    private static final String url = "https://digiwarehouse-app.onrender.com";

    @Step ( "I set API endpoint valid for get payment schema" )
    public String setAPIEndpointValidGetPaymentSchema() {
        return url + "/payment/scheme";
    }

    @Step ( "I send request to get payment schema" )
    public void sendRequestGetPaymentSchema() {
        JSONObject requestBody = new JSONObject();
        String Token = GenerateToken.generateToken();
        SerenityRest.given()
                .header("Content-Type", "application/json")
                .header("Authorization", "Bearer " + Token)
                .body(requestBody.toString())
                .get(setAPIEndpointValidGetPaymentSchema());
    }

    @Step ( "I received status code 200 OK in request get payment schema" )
    public void receivedStatusCode200OKRequestGetPaymentSchema() {
        restAssuredThat(response -> response.statusCode(200));
    }

    @Step ( "I received payment schema data and message \"Success\" response in request get payment schema" )
    public void receivedPaymentSchemaDataAndMessageSuccessResponseGetPaymentSchema() {
        JsonSchemaHelper helper = new JsonSchemaHelper();
        String schema = helper.getResponseSchema(JsonSchema.Get_Payment_Schema_Response_Schema);
        restAssuredThat(response -> response.body("'status'", notNullValue()));
        restAssuredThat(response -> response.body("'message'", is("Success")));
        restAssuredThat(response -> response.body("'data'", notNullValue()));
        restAssuredThat(response -> response.body(matchesJsonSchema(schema)));
    }

    @Step ( "I set API endpoint invalid for get payment schema without the path" )
    public String setAPIEndpointInvalidGetPaymentSchemaWithoutPath() {
        return url + "/payment";
    }

    @Step ( "I send request to get payment schema no path" )
    public void sendRequestGetPaymentSchemaNoPath() {
        String Token = GenerateToken.generateToken();
        JSONObject requestBody = new JSONObject();
        SerenityRest.given()
                .header("Content-Type", "application/json")
                .header("Authorization", "Bearer " + Token)
                .body(requestBody.toString())
                .get(setAPIEndpointInvalidGetPaymentSchemaWithoutPath());
    }

    @Step ( "I received status code 500 Internal Server Error in request to get payment schema" )
    public void receivedStatuscode500InternalServerErrorRequestGetPaymentSchema() {
        restAssuredThat(response -> response.statusCode(500));
    }

    @Step ( "I received error message \"general error\" response in request get payment schema" )
    public void receivedErrorMessageGeneralErrorResponseGetPaymentSchema() {
    }
}
