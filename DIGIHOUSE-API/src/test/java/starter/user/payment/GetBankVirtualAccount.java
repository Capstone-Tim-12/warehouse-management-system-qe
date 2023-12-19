package starter.user.payment;

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

public class GetBankVirtualAccount {
    private static final String url = "https://digiwarehouse-app.onrender.com";

    @Step ( "I set API endpoint valid for get bank virtual account" )
    public String setAPIEndpointValidGetBankVirtualAccount() {
        return url + "/payment/va/bank";
    }

    @Step ( "I send request to get bank virtual account" )
    public void sendRequestGetBankVirtualAccount() {
        JSONObject requestBody = new JSONObject();
        String Token = GenerateToken.generateToken();
        SerenityRest.given()
                .header("Content-Type", "application/json")
                .header("Authorization", "Bearer " + Token)
                .body(requestBody.toString())
                .get(setAPIEndpointValidGetBankVirtualAccount());
    }

    @Step ( "I received status code 200 OK in request get bank virtual account" )
    public void receivedStatusCode200OKRequestGetBankVirtualAccount() {
        restAssuredThat(response -> response.statusCode(200));
    }

    @Step ( "I received message \"Success\" response in request get bank virtual account" )
    public void receivedMessageSuccessResponseGetBankVirtualAccount() {
        JsonSchemaHelper helper = new JsonSchemaHelper();
        String schema = helper.getResponseSchema(JsonSchema.Get_Bank_Virtual_Account_Response_Schema);
        restAssuredThat(response -> response.body("'status'", notNullValue()));
        restAssuredThat(response -> response.body("'message'", is("Success")));
        restAssuredThat(response -> response.body("'data'", notNullValue()));
        restAssuredThat(response -> response.body(matchesJsonSchema(schema)));
    }

    @Step ( "I set API endpoint invalid for get bank virtual account without the path" )
    public String setAPIEndpointInvalidGetBankVirtualAccountWithoutPath() {
        return url + "/payment/va";
    }

    @Step ( "I send request to get bank virtual account no path" )
    public void sendRequestGetBankVirtualAccountNoPath() {
        String Token = GenerateToken.generateToken();
        JSONObject requestBody = new JSONObject();
        SerenityRest.given()
                .header("Content-Type", "application/json")
                .header("Authorization", "Bearer " + Token)
                .body(requestBody.toString())
                .get(setAPIEndpointInvalidGetBankVirtualAccountWithoutPath());
    }

    @Step ( "I received status code 500 Internal Server Error in request to get bank virtual account" )
    public void receivedStatuscode500InternalServerErrorRequestGetBankVirtualAccount() {
        restAssuredThat(response -> response.statusCode(500));
    }

    @Step ( "I received error message \"general error\" response in request get bank virtual account" )
    public void receivedErrorMessageGeneralErrorResponseGetBankVirtualAcocunt() {
    }
}
