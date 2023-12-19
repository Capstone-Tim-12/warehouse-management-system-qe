package starter.user.setting;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.JSONObject;
import starter.utils.GenerateToken;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class UpdateEmail {
    private static final String url = "https://digiwarehouse-app.onrender.com";

    @Step ( "I set API endpoint valid for update email" )
    public String setAPIEndpointValidUpdateEmail() {
        return url + "/user/profile/email";
    }

    @Step ( "I set API endpoint invalid for update email without the path" )
    public String setAPIEndpointInvalidUpdateEmailWithoutPath() {
        return url + "/user/profile";
    }

    @Step ( "I send request to update email no path" )
    public void sendRequestUpdateEmailNoPath() {
        String Token = GenerateToken.generateToken();
        JSONObject requestBody = new JSONObject();
        SerenityRest.given()
                .header("Content-Type", "application/json")
                .header("Authorization", "Bearer " + Token)
                .body(requestBody.toString())
                .put(setAPIEndpointInvalidUpdateEmailWithoutPath());
    }

    @Step ( "I received status code 500 Internal Server Error in request to update email" )
    public void receivedStatusCode500InternalServerErrorRequestUpdateEmail() {
        restAssuredThat(response -> response.statusCode(500));
    }

    @Step ( "I received error message \"general error\" response in request update email" )
    public void receivedErrorMessageGeneralErrorResponseUpdateEmail() {
    }

    @Step ( "I blank the update email request" )
    public void blankUpdateEmailRequest() {
    }

    @Step ( "I send blank request to update email" )
    public void sendBlankRequestUpdateEmail() {
        JSONObject requestBody = new JSONObject();
        String email = "";
        requestBody.put("email", email);
        String Token = GenerateToken.generateToken();
        SerenityRest.given()
                .header("Content-Type", "application/json")
                .header("Authorization", "Bearer " + Token)
                .body(requestBody.toString())
                .put(setAPIEndpointValidUpdateEmail());
    }

    @Step ( "I received status code 400 Bad Request in request to update email" )
    public void receivedStatusCode400BadRequestUpdateEmail() {
        restAssuredThat(response -> response.statusCode(400));
    }

    @Step ( "I received the error message \"input email has on the required tag\" response in update email" )
    public void receivedErrorMessageInputEmailHasonTheRequiredTagResponseUpdateEmail() {
    }

    @Step ( "I enter email already regist in database for update email" )
    public void enterEmailAlreadyRegistInDatabaseUpdateEmail() {
    }

    @Step ( "I send request to update email with email already existing" )
    public void sendRequestUpdateEmailWithEmailAlreadyExisting() {
        JSONObject requestBody = new JSONObject();
        String email = "miaaprilia2803@gmail.com";
        requestBody.put("email", email);
        String Token = GenerateToken.generateToken();
        SerenityRest.given()
                .header("Content-Type", "application/json")
                .header("Authorization", "Bearer " + Token)
                .body(requestBody.toString())
                .put(setAPIEndpointValidUpdateEmail());
    }

    @Step ( "I received the error message \"email is already existing\" response in update email" )
    public void receivedErrorMessageEmailAlreadyExistingResponseUpdateEmail() {
    }

    @Step ( "I enter a email invalid format for update email" )
    public void enterEmailInvalidFormatUpdateEmail() {
    }

    @Step ( "I send request to update email with invalid format email" )
    public void sendRequestUpdateEmailWithInvalidFormatEmail() {
        JSONObject requestBody = new JSONObject();
        String email = "itqa.mia.com";
        requestBody.put("email", email);
        String Token = GenerateToken.generateToken();
        SerenityRest.given()
                .header("Content-Type", "application/json")
                .header("Authorization", "Bearer " + Token)
                .body(requestBody.toString())
                .put(setAPIEndpointValidUpdateEmail());
    }

    @Step ( "I received the error message \"input email has on the email tag\" response in update email" )
    public void receivedErrorMessageInputEmailHasOnTheEmailTagReponseUpdateEmail() {
    }
}
