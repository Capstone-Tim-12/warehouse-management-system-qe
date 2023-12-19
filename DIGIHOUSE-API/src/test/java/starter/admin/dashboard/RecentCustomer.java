package starter.admin.dashboard;

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

public class RecentCustomer {
    private static final String url = "https://digiwarehouse-app.onrender.com";

    @Step ( "I set API endpoint valid for recent customer" )
    public String setAPIEndpointValidRecentCustomer() {
        return url + "/dasboard/list/trx-history?page=1&limit=10";
    }

    @Step ( "I send request to recent customer" )
    public void sendRequestRecentCustomer() {
        JSONObject requestBody = new JSONObject();
        String Token = GenerateToken.generateToken();
        SerenityRest.given()
                .header("Content-Type", "application/json")
                .header("Authorization", "Bearer " + Token)
                .body(requestBody.toString())
                .get(setAPIEndpointValidRecentCustomer());
    }

    @Step ( "I received status code 200 OK in request recent customer" )
    public void receivedStatusCode200OKRequestRecentCustomer() {
        restAssuredThat(response -> response.statusCode(200));
    }

    @Step ( "I received message \"Success\" response in request recent customer" )
    public void receivedMessageSuccessResponseRecentCustomer() {
        JsonSchemaHelper helper = new JsonSchemaHelper();
        String schema = helper.getResponseSchema(JsonSchema.Recent_Customer_Response_Schema);
        restAssuredThat(response -> response.body("'status'", notNullValue()));
        restAssuredThat(response -> response.body("'message'", is("Success")));
        restAssuredThat(response -> response.body("'data'", notNullValue()));
        restAssuredThat(response -> response.body(matchesJsonSchema(schema)));
    }

    @Step ( "I set API endpoint invalid for recent customer without the path" )
    public String setAPIEndpointInvalidRecentCustomerWithoutPath() {
        return url + "/dasboard/list";
    }

    @Step ( "I send request to recent customer no path" )
    public void sendRequestRecentCustomerNoPath() {
        String Token = GenerateToken.generateToken();
        JSONObject requestBody = new JSONObject();
        SerenityRest.given()
                .header("Content-Type", "application/json")
                .header("Authorization", "Bearer " + Token)
                .body(requestBody.toString())
                .get(setAPIEndpointInvalidRecentCustomerWithoutPath());
    }

    @Step ( "I received status code 500 Internal Server Error in request to recent customer" )
    public void receivedStatuscode500InternalServerErrorRequestRecentCustomer() {
        restAssuredThat(response -> response.statusCode(500));
    }

    @Step ( "I received error message \"general error\" response in request recent customer" )
    public void receivedErrorMessageGeneralErrorResponseRecentCustomer() {
    }
}
