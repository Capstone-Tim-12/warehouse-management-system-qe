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

public class GetInstallmentListDashboard {
    private static final String url = "https://digiwarehouse-app.onrender.com";

    @Step ( "I set API endpoint valid for get installment list dashboard" )
    public String setAPIEndpointValidGetInstallmentListDashboard() {
        return url + "/payment/instalment/40cIbRJdhZ4HztPMMwNr?page=1&limit=10";
    }

    @Step ( "I send request to get installment list dashboard" )
    public void sendRequestGetInstallmentListDashboard() {
        JSONObject requestBody = new JSONObject();
        String Token = GenerateToken.generateToken();
        SerenityRest.given()
                .header("Content-Type", "application/json")
                .header("Authorization", "Bearer " + Token)
                .body(requestBody.toString())
                .get(setAPIEndpointValidGetInstallmentListDashboard());
    }

    @Step ( "I received status code 200 OK in request get installment list dashboard" )
    public void receivedStatusCode200OKRequestGetInstallmentListDashboard() {
        restAssuredThat(response -> response.statusCode(200));
    }

    @Step ( "I received message \"Success\" response in request get installment list dashboard" )
    public void receivedMessageSuccessResponseGetInstallmentListDashboard() {
        JsonSchemaHelper helper = new JsonSchemaHelper();
        String schema = helper.getResponseSchema(JsonSchema.Get_Installment_List_Dashboard_Response_Schema);
        restAssuredThat(response -> response.body("'status'", notNullValue()));
        restAssuredThat(response -> response.body("'message'", is("Success")));
        restAssuredThat(response -> response.body("'data'", notNullValue()));
        restAssuredThat(response -> response.body(matchesJsonSchema(schema)));
    }

    @Step ( "I set API endpoint invalid for get installment list dashboard without the path" )
    public String setAPIEndpointInvalidGetInstallmentListDashboardWithoutPath() {
        return url + "/payment/instalment";
    }

    @Step ( "I send request to get installment list dashboard no path" )
    public void sendRequestGetInstallmentListDashboardNoPath() {
        String Token = GenerateToken.generateToken();
        JSONObject requestBody = new JSONObject();
        SerenityRest.given()
                .header("Content-Type", "application/json")
                .header("Authorization", "Bearer " + Token)
                .body(requestBody.toString())
                .get(setAPIEndpointInvalidGetInstallmentListDashboardWithoutPath());
    }

    @Step ( "I received status code 500 Internal Server Error in request to get installment list dashboard" )
    public void receivedStatusCode500InternalServerErrorRequestGetInstallementListDashboard() {
        restAssuredThat(response -> response.statusCode(500));
    }

    @Step ( "I received error message \"general error\" response in request get installment list dashboard" )
    public void receivedErrorMessageGeneralErrorResponseGetInstallmentListDashboard() {
    }
}
