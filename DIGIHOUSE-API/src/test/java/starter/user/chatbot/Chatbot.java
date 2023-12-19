package starter.user.chatbot;

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

public class Chatbot {
    private static final String url = "https://digiwarehouse-app.onrender.com";

    @Step ( "I set API endpoint valid for chatbot" )
    public String setAPIEndpointValidChatbot() {
        return url + "/user/chatbot";
    }

    @Step ( "I send request to chatbot" )
    public void sendRequestChatbot() {
        JSONObject requestBody = new JSONObject();
        String text = "How can I view warehouse information?";
        requestBody.put("text", text);
        String Token = GenerateToken.generateToken();
        SerenityRest.given()
                .header("Content-Type", "application/json")
                .header("Authorization", "Bearer " + Token)
                .body(requestBody.toString())
                .post(setAPIEndpointValidChatbot());
    }

    @Step ( "I received status code 200 OK in request chatbot" )
    public void receivedStatusCode200OKRequestChatbot() {
        restAssuredThat(response -> response.statusCode(200));
    }

    @Step ( "I received message \"Success\" response in request chatbot" )
    public void receivedMessageSuccessResponseChatbot() {
        JsonSchemaHelper helper = new JsonSchemaHelper();
        String schema = helper.getResponseSchema(JsonSchema.Chatbot_Response_Schema);
        restAssuredThat(response -> response.body("'status'", notNullValue()));
        restAssuredThat(response -> response.body("'message'", is("Success")));
        restAssuredThat(response -> response.body("'data'", notNullValue()));
        restAssuredThat(response -> response.body(matchesJsonSchema(schema)));
    }

    @Step ( "I set API endpoint invalid for chatbot without the path" )
    public String setAPIEndpointInvalidChatbotWithoutPath() {
        return url + "/user";
    }

    @Step ( "I send request to chatbot no path" )
    public void sendRequestChatbotNoPath() {
        String Token = GenerateToken.generateToken();
        JSONObject requestBody = new JSONObject();
        SerenityRest.given()
                .header("Content-Type", "application/json")
                .header("Authorization", "Bearer " + Token)
                .body(requestBody.toString())
                .post(setAPIEndpointInvalidChatbotWithoutPath());
    }

    @Step ( "I received status code 500 Internal Server Error in request to chatbot" )
    public void receivedStatuscode500InternalServerErrorRequestChatbot() {
        restAssuredThat(response -> response.statusCode(500));
    }

    @Step ( "I received error message \"general error\" response in request chatbot" )
    public void receivedErrorMessageGeneralErrorResponseChatbot() {
    }

    @Step ( "I blank the chatbot request" )
    public void blankChatbotRequest() {
    }

    @Step ( "I send blank request to chatbot" )
    public void sendBlankRequestChatbot() {
        JSONObject requestBody = new JSONObject();
        String text = "";
        requestBody.put("text", text);
        String Token = GenerateToken.generateToken();
        SerenityRest.given()
                .header("Content-Type", "application/json")
                .header("Authorization", "Bearer " + Token)
                .body(requestBody.toString())
                .post(setAPIEndpointValidChatbot());
    }

    @Step ( "I received status code 400 Bad Request in request to chatbot" )
    public void receivedStatuscode400BadRequestInRequestChatbot() {
        restAssuredThat(response -> response.statusCode(400));
    }

    @Step ( "I received the error message \"input text has on the required tag\" response in chatbot" )
    public void receivedErrorMessageInputTextHasOnRequiredResponseChatbot() {
    }
}
