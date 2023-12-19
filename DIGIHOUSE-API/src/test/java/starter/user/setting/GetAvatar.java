package starter.user.setting;

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

public class GetAvatar {
    private static final String url = "https://digiwarehouse-app.onrender.com";

    @Step ( "I set API endpoint valid for get avatar" )
    public String setAPIEndpointValidGetAvatar() {
        return url + "/user/avatar";
    }

    @Step ( "I send request to get avatar valid path" )
    public void sendRequestGetAvatarValidPath() {
        String Token = GenerateToken.generateToken();
        JSONObject requestBody = new JSONObject();
        SerenityRest.given()
                .header("Content-Type", "application/json")
                .header("Authorization", "Bearer " + Token)
                .body(requestBody.toString())
                .get(setAPIEndpointValidGetAvatar());
    }

    @Step ( "I received status code 200 OK in request to get avatar" )
    public void receivedStatusCode200OKRequestGetAvatar() {
        restAssuredThat(response -> response.statusCode(200));
    }

    @Step ( "I received all avatar data" )
    public void receivedAllAvatarData() {
        JsonSchemaHelper helper = new JsonSchemaHelper();
        String schema = helper.getResponseSchema(JsonSchema.Get_Avatar_Response_Schema);
        restAssuredThat(response -> response.body("'status'", notNullValue()));
        restAssuredThat(response -> response.body("'message'", is("Success")));
        restAssuredThat(response -> response.body("'data'", notNullValue()));
        restAssuredThat(response -> response.body(matchesJsonSchema(schema)));
    }

    @Step ( "I set API endpoint invalid for get avatar" )
    public String setAPIEndpointInvalidGetAvatar() {
        return url + "/user";
    }

    @Step ( "I send request to get avatar invalid path" )
    public void sendRequestGetAvatarInvalidPath() {
        String Token = GenerateToken.generateToken();
        JSONObject requestBody = new JSONObject();
        SerenityRest.given()
                .header("Content-Type", "application/json")
                .header("Authorization", "Bearer " + Token)
                .body(requestBody.toString())
                .get(setAPIEndpointInvalidGetAvatar());
    }

    @Step ( "I received status code 500 Internal Server Error in request to get avatar" )
    public void receivedStatusCode500InternalServerErrorRequestGetAvatar() {
        restAssuredThat(response -> response.statusCode(500));
    }

    @Step ( "I received error message \"general error\" response in request get avatar" )
    public void receivedErrorMessageGeneralErrorResponseGetAvatar() {
    }
}
