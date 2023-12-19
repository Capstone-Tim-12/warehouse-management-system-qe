package starter.admin.manageUser;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.JSONObject;
import starter.utils.GenerateToken;
import starter.utils.JsonSchema;
import starter.utils.JsonSchemaHelper;

import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchema;
import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.*;

public class GetListTransactionUser {
    private static final String url = "https://digiwarehouse-app.onrender.com";

    @Step ( "I set API endpoint valid for get list transaction user" )
    public String setAPIEndpointValidGetListTransactionUser() {
        return url + "/dasboard/user/7/transaction?page=1&limit=10";
    }

    @Step ( "I send request to get list transaction user" )
    public void sendRequestGetListTransactionUser() {
        String Token = GenerateToken.generateToken();
        JSONObject requestBody = new JSONObject();
        SerenityRest.given()
                .header("Content-Type", "application/json")
                .header("Authorization", "Bearer " + Token)
                .body(requestBody.toString())
                .get(setAPIEndpointValidGetListTransactionUser());
    }

    @Step ( "I received status code 200 OK in request get list transaction user" )
    public void receivedStatusCode200OKRequestGetListTransactionUser() {
        restAssuredThat(response -> response.statusCode(200));
    }

    @Step ( "I received message \"Success\" response in request get list transaction user" )
    public void receivedMessageSuccessResponseGetlistTransactionUser() {
        JsonSchemaHelper helper = new JsonSchemaHelper();
        String schema = helper.getResponseSchema(JsonSchema.Get_List_Transaction_User_Response_Schema);
        restAssuredThat(response -> response.body("'status'", notNullValue()));
        restAssuredThat(response -> response.body("'message'", is("Success")));
        restAssuredThat(response -> response.body("'data'", notNullValue()));
        restAssuredThat(response -> response.body("'pagination'", notNullValue()));
        restAssuredThat(response -> response.body(matchesJsonSchema(schema)));
    }

    @Step ( "I set API endpoint invalid for can't get list transaction user without the path" )
    public String setAPIEndpointInvalidGetListTransactionUserWithoutPath() {
        return url + "/dasboard/user";
    }

    @Step ( "I send request to get list transaction user no path" )
    public void sendRequestGetListTransactionUserNoPath() {
        String Token = GenerateToken.generateToken();
        JSONObject requestBody = new JSONObject();
        SerenityRest.given()
                .header("Content-Type", "application/json")
                .header("Authorization", "Bearer " + Token)
                .body(requestBody.toString())
                .get(setAPIEndpointInvalidGetListTransactionUserWithoutPath());
    }

    @Step ( "I received status code 500 Internal Server Error in request to get list transaction user" )
    public void receivedStatusCode500InternalServerErrorRequestGetListTransactionUser() {
        restAssuredThat(response -> response.statusCode(500));
    }

    @Step ( "I received error message \"general error\" response in request get list transaction user" )
    public void receivedErrorMessageGeneralErrorResponseGetListTransactionUser() {
    }
}
