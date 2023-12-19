package starter.admin.dashboard;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.JSONObject;
import starter.utils.GenerateToken;
import starter.utils.JsonSchema;
import starter.utils.JsonSchemaHelper;

import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchema;
import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.*;

public class GetTransactionReport {
    private static final String url = "https://digiwarehouse-app.onrender.com";

    @Step ( "I set API endpoint valid for get transaction report" )
    public String setAPIEndpointValidGetTransactionReport() {
        return url + "/dasboard/home/trx-history?page=1&limit=10";
    }

    @Step ( "I send request to get transaction report" )
    public void sendRequestGetTransactionReport() {
        JSONObject requestBody = new JSONObject();
        String Token = GenerateToken.generateToken();
        SerenityRest.given()
                .header("Content-Type", "application/json")
                .header("Authorization", "Bearer " + Token)
                .body(requestBody.toString())
                .get(setAPIEndpointValidGetTransactionReport());
    }

    @Step ( "I received status code 200 OK in request get transaction report" )
    public void receivedStatusCode200OKRequestGetTransactionReport() {
        restAssuredThat(response -> response.statusCode(200));
    }

    @Step ( "I received message \"Success\" response in request get transaction report" )
    public void receivedMessageSuccessResponseGetTransactionReport() {
        JsonSchemaHelper helper = new JsonSchemaHelper();
        String schema = helper.getResponseSchema(JsonSchema.Get_Transaction_Report_Response_Schema);
        restAssuredThat(response -> response.body("'status'", notNullValue()));
        restAssuredThat(response -> response.body("'message'", is("Success")));
        restAssuredThat(response -> response.body("'data'", notNullValue()));
        restAssuredThat(response -> response.body(matchesJsonSchema(schema)));
    }

    @Step ( "I set API endpoint invalid for get transaction report without the path" )
    public String setAPIEndpointInvalidGetTransactionReportWithoutPath() {
        return url + "/dasboard/home";
    }

    @Step ( "I send request to get transaction report no path" )
    public void sendRequestGetTransactionReportNoPath() {
        String Token = GenerateToken.generateToken();
        JSONObject requestBody = new JSONObject();
        SerenityRest.given()
                .header("Content-Type", "application/json")
                .header("Authorization", "Bearer " + Token)
                .body(requestBody.toString())
                .get(setAPIEndpointInvalidGetTransactionReportWithoutPath());
    }

    @Step ( "I received status code 500 Internal Server Error in request to get transaction report" )
    public void receivedStatuscode500InternalServerErrorRequestGetTransactionReport() {
        restAssuredThat(response -> response.statusCode(500));
    }

    @Step ( "I received error message \"general error\" response in request get transaction report" )
    public void receivedErrorMessageGeneralErrorResponseGetTransactionReport() {
    }
}
