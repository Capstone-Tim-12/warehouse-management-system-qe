package starter.user.warehouse;

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

public class GetInstallmentList {
    private static final String url = "https://digiwarehouse-app.onrender.com";

    @Step ( "I set API endpoint valid for get installment list" )
    public String setAPIEndpointValidGetInstallmentList() {
        return url + "/payment/instalment/sXEfShDIeMLY9YxN5ZZR";
    }

    @Step ( "I send request to get installment list" )
    public void sendRequestGetInstallmentList() {
        JSONObject requestBody = new JSONObject();
        String Token = GenerateToken.generateToken();
        SerenityRest.given()
                .header("Content-Type", "application/json")
                .header("Authorization", "Bearer " + Token)
                .body(requestBody.toString())
                .get(setAPIEndpointValidGetInstallmentList());
    }

    @Step ( "I received status code 200 OK in request get installment list" )
    public void receivedStatusCode200OKRequestGetInstallmentList() {
        restAssuredThat(response -> response.statusCode(200));
    }

    @Step ( "I received installment data and message \"Success\" response in request get installment list" )
    public void receivedInstallmentDataAndMessageSuccessResponseGetInstallmentList() {
        JsonSchemaHelper helper = new JsonSchemaHelper();
        String schema = helper.getResponseSchema(JsonSchema.Get_Installment_List_Response_Schema);
        restAssuredThat(response -> response.body("'status'", notNullValue()));
        restAssuredThat(response -> response.body("'message'", is("Success")));
        restAssuredThat(response -> response.body("'data'", notNullValue()));
        restAssuredThat(response -> response.body(matchesJsonSchema(schema)));
    }

    @Step ( "I set API endpoint invalid for get installment list without the path" )
    public String setAPIEndpointInvalidGetInstallmentListWithoutPath() {
        return url + "/payment/instalment";
    }

    @Step ( "I send request to get installment list no path" )
    public void sendRequestGetInstallmentListNoPath() {
        String Token = GenerateToken.generateToken();
        JSONObject requestBody = new JSONObject();
        SerenityRest.given()
                .header("Content-Type", "application/json")
                .header("Authorization", "Bearer " + Token)
                .body(requestBody.toString())
                .get(setAPIEndpointInvalidGetInstallmentListWithoutPath());
    }

    @Step ( "I received status code 500 Internal Server Error in request to get installment list" )
    public void receivedStatuscode500InternalServerErrorRequestGetInstallmentList() {
        restAssuredThat(response -> response.statusCode(500));
    }

    @Step ( "I received error message \"general error\" response in request get installment list" )
    public void receivedErrorMessageGeneralErrorResponseGetInstallmentList() {
    }
}
