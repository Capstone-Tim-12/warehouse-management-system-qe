package starter.user.setting;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.JSONObject;
import starter.utils.GenerateToken;
import starter.utils.JsonSchema;
import starter.utils.JsonSchemaHelper;

import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchema;
import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.*;

public class UpdatePhotoProfile {
    private static final String url = "https://digiwarehouse-app.onrender.com";

    @Step ( "I set API endpoint valid for update photo profile" )
    public String setAPIEndpointValidUpdatePhotoProfile() {
        return url + "/user/profile/photo";
    }

    @Step ( "I enter a url image" )
    public void enterURLImage() {
    }

    @Step ( "I send request to update photo profile" )
    public void sendRequestUpdatePhotoProfile() {
        JSONObject requestBody = new JSONObject();
        String URLImage = "https://www.dropbox.com/scl/fi/ycm3xzpcwq9gsiri18mtb/file_8WhJzYwZ2oUnSOn00AEj.jpeg?rlkey=f4s5xurnvovyfit4o4g9mcs6x&raw=1";
        requestBody.put("URLImage", URLImage);
        String Token = GenerateToken.generateToken();
        SerenityRest.given()
                .header("Content-Type", "application/json")
                .header("Authorization", "Bearer " + Token)
                .body(requestBody.toString())
                .put(setAPIEndpointValidUpdatePhotoProfile());
    }

    @Step ( "I received status code 200 OK in request update photo profile" )
    public void receivedStatusCode200OKRequestUpdatePhotoProfile() {
        restAssuredThat(response -> response.statusCode(200));
    }

    @Step ( "I received message \"Success\" response in request update photo profile" )
    public void receivedMessageSuccessResponseUpdatePhotoProfile() {
        JsonSchemaHelper helper = new JsonSchemaHelper();
        String schema = helper.getResponseSchema(JsonSchema.Update_Photo_Profile_Response_Schema);
        restAssuredThat(response -> response.body("'status'", notNullValue()));
        restAssuredThat(response -> response.body("'message'", is("Success")));
        restAssuredThat(response -> response.body("'data'", nullValue()));
        restAssuredThat(response -> response.body(matchesJsonSchema(schema)));
    }

    @Step ( "I set API endpoint invalid for update photo profile without the path" )
    public String setAPIEndpointInvalidUpdatePhotoProfileWithoutPath() {
        return url + "/user/profile";
    }

    @Step ( "I send request to update photo profile no path" )
    public void sendRequestUpdatePhotoProfileNoPath() {
        String Token = GenerateToken.generateToken();
        JSONObject requestBody = new JSONObject();
        SerenityRest.given()
                .header("Content-Type", "application/json")
                .header("Authorization", "Bearer " + Token)
                .body(requestBody.toString())
                .put(setAPIEndpointInvalidUpdatePhotoProfileWithoutPath());
    }

    @Step ( "I received status code 500 Internal Server Error in request to update photo profile" )
    public void receivedStatusCode500InternalServerErrorRequestUpdatePhotoProfile() {
        restAssuredThat(response -> response.statusCode(500));
    }

    @Step ( "I received error message \"general error\" response in request update photo profile" )
    public void receivedErrorMessageGeneralErrorResponseUpdatePhotoProfile() {
    }

    @Step ( "I blank the update photo profile request" )
    public void blankUpdatePhotoProfileRequest() {
    }

    @Step ( "I send request to update photo profile with blank update photo profile" )
    public void sendRequestUpdatePhotoProfileWithBlankUpdatePhotoProfile() {
        JSONObject requestBody = new JSONObject();
        String URLImage = "";
        requestBody.put("URLImage", URLImage);
        String Token = GenerateToken.generateToken();
        SerenityRest.given()
                .header("Content-Type", "application/json")
                .header("Authorization", "Bearer " + Token)
                .body(requestBody.toString())
                .put(setAPIEndpointValidUpdatePhotoProfile());
    }

    @Step ( "I received status code 400 Bad Request in request to update photo profile" )
    public void receivedStatusCode400BadRequestUpdatePhotoProfile() {
        restAssuredThat(response -> response.statusCode(400));
    }

    @Step ( "I received the error message \"input urlimage has on the url tag\" response in update photo profile" )
    public void receivedErrorMessageInputURLImageHasOnURLTagResponseUpdatePhotoProfile() {
    }
}
