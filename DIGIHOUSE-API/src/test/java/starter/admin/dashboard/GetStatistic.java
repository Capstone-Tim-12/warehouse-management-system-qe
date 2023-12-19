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

public class GetStatistic {
    private static final String url = "https://digiwarehouse-app.onrender.com";

    @Step ( "I set API endpoint valid for get statistic" )
    public String setAPIEndpointValidGetStatistic() {
        return url + "/dasboard/payment/statistic";
    }

    @Step ( "I send request to get statistic" )
    public void sendRequestGetStatistic() {
        JSONObject requestBody = new JSONObject();
        String Token = GenerateToken.generateToken();
        SerenityRest.given()
                .header("Content-Type", "application/json")
                .header("Authorization", "Bearer " + Token)
                .body(requestBody.toString())
                .get(setAPIEndpointValidGetStatistic());
    }

    @Step ( "I received status code 200 OK in request get statistic" )
    public void receivedStatusCode200OKRequestGetStatistic() {
        restAssuredThat(response -> response.statusCode(200));
    }

    @Step ( "I received message \"Success\" response in request get statistic" )
    public void receivedMessageSuccessResponseGetStatistic() {
        JsonSchemaHelper helper = new JsonSchemaHelper();
        String schema = helper.getResponseSchema(JsonSchema.Get_Statistic_Response_Schema);
        restAssuredThat(response -> response.body("'status'", notNullValue()));
        restAssuredThat(response -> response.body("'message'", is("Success")));
        restAssuredThat(response -> response.body("'data'", notNullValue()));
        restAssuredThat(response -> response.body(matchesJsonSchema(schema)));
    }

    @Step ( "I set API endpoint invalid for get statistic without the path" )
    public String setAPIEndpointInvalidGetStatisticWithoutPath() {
        return url + "/dasboard/payment";
    }

    @Step ( "I send request to get statistic no path" )
    public void sendRequestGetTStatisticNoPath() {
        String Token = GenerateToken.generateToken();
        JSONObject requestBody = new JSONObject();
        SerenityRest.given()
                .header("Content-Type", "application/json")
                .header("Authorization", "Bearer " + Token)
                .body(requestBody.toString())
                .get(setAPIEndpointInvalidGetStatisticWithoutPath());
    }

    @Step ( "I received status code 500 Internal Server Error in request to get statistic" )
    public void receivedStatuscode500InternalServerErrorRequestGetStatistic() {
        restAssuredThat(response -> response.statusCode(500));
    }

    @Step ( "I received error message \"general error\" response in request get statistic" )
    public void receivedErrorMessageGeneralErrorResponseGetStatistic() {
    }
}
