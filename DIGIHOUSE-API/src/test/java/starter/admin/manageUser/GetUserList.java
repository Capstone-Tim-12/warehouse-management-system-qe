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

public class GetUserList {
    private static final String url = "https://digiwarehouse-app.onrender.com";

    @Step ( "I set API endpoint valid for get user list" )
    public String setAPIEndpointValidGetUserList() {
        return url + "/dasboard/user/list?page=1&limit=10";
    }

    @Step ( "I send request to get user list" )
    public void sendRequestGetUserList() {
        JSONObject requestBody = new JSONObject();
        String Token = GenerateToken.generateToken();
        SerenityRest.given()
                .header("Content-Type", "application/json")
                .header("Authorization", "Bearer " + Token)
                .body(requestBody.toString())
                .get(setAPIEndpointValidGetUserList());
    }

    @Step ( "I received status code 200 OK in request get user list" )
    public void receivedStatusCode200OKRequestGetUserList() {
        restAssuredThat(response -> response.statusCode(200));
    }

    @Step ( "I received message \"Success\" response in request get user list" )
    public void receivedMessageSuccessResponseGetUserList() {
        JsonSchemaHelper helper = new JsonSchemaHelper();
        String schema = helper.getResponseSchema(JsonSchema.Get_User_List_Response_Schema);
        restAssuredThat(response -> response.body("'status'", notNullValue()));
        restAssuredThat(response -> response.body("'message'", is("Success")));
        restAssuredThat(response -> response.body("'data'", notNullValue()));
        restAssuredThat(response -> response.body(matchesJsonSchema(schema)));
    }

    @Step ( "I set API endpoint invalid for get user list without the path" )
    public String setAPIEndpointInvalidGetUserListWithoutPath() {
        return url + "/dasboard/user";
    }

    @Step ( "I send request to get user list no path" )
    public void sendRequestGetUserListNoPath() {
        String Token = GenerateToken.generateToken();
        JSONObject requestBody = new JSONObject();
        SerenityRest.given()
                .header("Content-Type", "application/json")
                .header("Authorization", "Bearer " + Token)
                .body(requestBody.toString())
                .get(setAPIEndpointInvalidGetUserListWithoutPath());
    }

    @Step ( "I received status code 500 Internal Server Error in request to get user lis" )
    public void receivedStatusCode500InternalServerErrorRequestGetUserList() {
        restAssuredThat(response -> response.statusCode(500));
    }

    @Step ( "I received error message \"general error\" response in request get user list" )
    public void receivedErrorMessageGeneralErrorResponseGetUserList() {
    }
}
