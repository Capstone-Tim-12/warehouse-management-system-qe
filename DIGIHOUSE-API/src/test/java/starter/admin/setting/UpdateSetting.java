package starter.admin.setting;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.JSONObject;
import starter.utils.GenerateToken;
import starter.utils.JsonSchema;
import starter.utils.JsonSchemaHelper;

import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchema;
import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.*;

public class UpdateSetting {
    private static final String url = "https://digiwarehouse-app.onrender.com";

    @Step ( "I set API endpoint valid for update setting" )
    public String setAPIEndpointValidUpdateSetting() {
        return url + "/dasboard/user/setting";
    }

    @Step ( "I enter a valid update setting request" )
    public void enterValidUpdateSettingRequest() {
    }

    @Step ( "I send request to update setting" )
    public void sendRequestUpdateSetting() {
        JSONObject requestBody = new JSONObject();
        String Token = GenerateToken.generateToken();
        String username = "Mia Aprilia Satya";
        String email = "itqa.mia@gmail.com";
        String password = "Testing1";

        requestBody.put("username", username);
        requestBody.put("email", email);
        requestBody.put("password", password);
        SerenityRest.given()
                .header("Content-Type", "application/json")
                .header("Authorization", "Bearer " + Token)
                .body(requestBody.toString())
                .put(setAPIEndpointValidUpdateSetting());
    }

    @Step ( "I received status code 200 OK in request update setting" )
    public void receivedStatusCode200OKRequestUpdateSetting() {
        restAssuredThat(response -> response.statusCode(200));
    }

    @Step ( "I received message \"Success\" response in request update setting" )
    public void receivedMessageSuccessResponseUpdateSetting() {
        JsonSchemaHelper helper = new JsonSchemaHelper();
        String schema = helper.getResponseSchema(JsonSchema.Update_Setting_Response_Schema);
        restAssuredThat(response -> response.body("'status'", notNullValue()));
        restAssuredThat(response -> response.body("'message'", is("Success")));
        restAssuredThat(response -> response.body("'data'", nullValue()));
        restAssuredThat(response -> response.body(matchesJsonSchema(schema)));
    }

    @Step ( "I set API endpoint invalid for update setting without the path" )
    public String setAPIEndpointInvalidUpdateSettingWithoutPath() {
        return url + "/dasboard/user";
    }

    @Step ( "I send request to update setting no path" )
    public void sendRequestUpdateSettingNoPath() {
        JSONObject requestBody = new JSONObject();
        String Token = GenerateToken.generateToken();
        String username = "Mia Aprilia Satya";
        String email = "itqa.mia@gmail.com";
        String password = "Testing1";

        requestBody.put("username", username);
        requestBody.put("email", email);
        requestBody.put("password", password);
        SerenityRest.given()
                .header("Content-Type", "application/json")
                .header("Authorization", "Bearer " + Token)
                .body(requestBody.toString())
                .put(setAPIEndpointInvalidUpdateSettingWithoutPath());
    }

    @Step ( "I received status code 500 Internal Server Error in request to update setting" )
    public void receivedStatusCode500InternalServerErrorRequestUpdateSetting() {
        restAssuredThat(response -> response.statusCode(500));
    }

    @Step ( "I received error message \"general error\" response in request update setting" )
    public void receivedErrorMessageGeneralErrorResponseUpdateSetting() {
    }

    @Step ( "I blank the update setting request" )
    public void blankUpdateSettingRequest() {
    }

    @Step ( "I send blank request to update setting" )
    public void sendBlankRequestUpdateSetting() {
        JSONObject requestBody = new JSONObject();
        String Token = GenerateToken.generateToken();
        String username = "";
        String email = "";
        String password = "";

        requestBody.put("username", username);
        requestBody.put("email", email);
        requestBody.put("password", password);
        SerenityRest.given()
                .header("Content-Type", "application/json")
                .header("Authorization", "Bearer " + Token)
                .body(requestBody.toString())
                .put(setAPIEndpointValidUpdateSetting());
    }

    @Step ( "I received status code 400 Bad Request in request to update setting" )
    public void receivedStatusCode400BadRequestRequestUpdateSetting() {
        restAssuredThat(response -> response.statusCode(400));
    }

    @Step ( "I received the error message \"input password has on the required tag\" response in update setting" )
    public void receivedMessageInputPasswordHasOnTheRequiredTagResponseUpdateSetting() {
    }

    @Step ( "I blank the username request for update setting" )
    public void blankUsernameRequestForUpdateSetting() {
    }

    @Step ( "I enter a email valid format for update setting" )
    public void enterEmailValidFormatForUpdateSetting() {
    }

    @Step ( "I enter password for update setting" )
    public void enterPasswordForUpdateSetting() {
    }

    @Step ( "I send request to update setting user with blank username request" )
    public void sendRequestUpdateSettingWithBlankUsername() {
        JSONObject requestBody = new JSONObject();
        String Token = GenerateToken.generateToken();
        String username = "";
        String email = "itqa.mia@gmail.com";
        String password = "Testing1";

        requestBody.put("username", username);
        requestBody.put("email", email);
        requestBody.put("password", password);
        SerenityRest.given()
                .header("Content-Type", "application/json")
                .header("Authorization", "Bearer " + Token)
                .body(requestBody.toString())
                .put(setAPIEndpointValidUpdateSetting());
    }

    @Step ( "I received the error message \"input username has on the required tag\" response in update setting" )
    public void receivedMessageInputUsernameHasOnTheRequiredTagResponseUpdateSetting() {
    }

    @Step ( "I enter a username for update setting" )
    public void enterUsernameForUpdateSetting() {
    }

    @Step ( "I blank the email request for update setting" )
    public void blankEmailRequestForUpdateSetting() {
    }

    @Step ( "I send request to update setting user with blank email request" )
    public void sendRequestUpdateSettingWithBlankEmail() {
        JSONObject requestBody = new JSONObject();
        String Token = GenerateToken.generateToken();
        String username = "Mia Aprilia Satya";
        String email = "";
        String password = "Testing1";

        requestBody.put("username", username);
        requestBody.put("email", email);
        requestBody.put("password", password);
        SerenityRest.given()
                .header("Content-Type", "application/json")
                .header("Authorization", "Bearer " + Token)
                .body(requestBody.toString())
                .put(setAPIEndpointValidUpdateSetting());
    }

    @Step ( "I received the error message \"input email has on the required tag\" response in update setting" )
    public void receivedMessageInputEmailHasOnTheRequiredTagResponseUpdateSetting() {
    }

    @Step ( "I blank the password for update setting" )
    public void blankPasswordForUpdateSetting() {
    }

    @Step ( "I send request to update setting user with blank password request" )
    public void sendRequestUpdateSettingWithBlankPassword() {
        JSONObject requestBody = new JSONObject();
        String Token = GenerateToken.generateToken();
        String username = "Mia Aprilia Satya";
        String email = "itqa.mia@gmail.com";
        String password = "";

        requestBody.put("username", username);
        requestBody.put("email", email);
        requestBody.put("password", password);
        SerenityRest.given()
                .header("Content-Type", "application/json")
                .header("Authorization", "Bearer " + Token)
                .body(requestBody.toString())
                .put(setAPIEndpointValidUpdateSetting());
    }
}
