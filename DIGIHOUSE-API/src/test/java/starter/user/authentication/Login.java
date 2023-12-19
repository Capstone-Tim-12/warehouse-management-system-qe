package starter.user.authentication;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.JSONObject;
import starter.utils.JsonSchema;
import starter.utils.JsonSchemaHelper;
import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchema;
import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.notNullValue;

public class Login {
    private static final String url = "https://digiwarehouse-app.onrender.com";


    @Step("I set API endpoint valid for login user")
    public String setAPIEndpointValidLoginUser() {
        return url + "/user/login";
    }

    @Step("I enter a valid email for login user")
    public void enterValidEmailForLoginUser() {}

    @Step("I enter a valid password")
    public void enterValidPassword() {}

    @Step ("I send request to login user with valid {string} and valid {string}")
    public void sendRequestLoginUserWithValidCredential(String email, String password) {
        JSONObject requestBody = new JSONObject();
        requestBody.put("email", email);
        requestBody.put("password", password);
        SerenityRest.given()
                .header("Content-Type", "application/json")
                .body(requestBody.toString())
                .post(setAPIEndpointValidLoginUser());}

    @Step("I received status code 200 OK login user")
    public void receivedStatusCode200OKLoginUser() {
        restAssuredThat(response -> response.statusCode(200));
    }

    @Step("I received token login user data response")
    public void receivedTokenLoginUserDataResponse() {
        JsonSchemaHelper helper = new JsonSchemaHelper();
        String schema = helper.getResponseSchema(JsonSchema.Login_Response_Schema);
        restAssuredThat(response -> response.body(matchesJsonSchema(schema)));
        restAssuredThat(response -> response.body("'status'", notNullValue()));
        restAssuredThat(response -> response.body("'message'", is("Success")));
        restAssuredThat(response -> response.body("'data'.'userId'", notNullValue()));
        restAssuredThat(response -> response.body("'data'.'name'", notNullValue()));
        restAssuredThat(response -> response.body("'data'.'role'", notNullValue()));
        restAssuredThat(response -> response.body("'data'.'token'", notNullValue()));
    }

    @Step("I set API endpoint invalid for login user without the path")
    public String setAPIEndpointInvalidLoginUserWithoutPath() {
        return url + "/user";
    }

    @Step("I send request to login user no path")
    public void sendRequestLoginUserNoPath() {
        SerenityRest.given()
                .post(setAPIEndpointInvalidLoginUserWithoutPath());
    }

    @Step("I received status code 401 Unauthorized in request to login user")
    public void receivedStatusCode401UnauthorizedRequestLoginUser() {
        restAssuredThat(response -> response.statusCode(401));
    }

    @Step("I received error message \"invalid token\" login response")
    public void receivedErrorMessageInvalidTokenLoginResponse() {
    }

    @Step("I blank the login request")
    public void blankLoginRequest() {
    }

    @Step("I send a request to the login user")
    public void sendRequestLoginUser() {
        SerenityRest.given()
                .post(setAPIEndpointValidLoginUser());
    }

    @Step("I received status code 400 Bad Request in request to login user")
    public void receivedStatusCode400BadRequestLoginUser() {
        restAssuredThat(response -> response.statusCode(400));
    }

    @Step("I received the error message \"input password has on the required tag\" response")
    public void receivedErrorMessageInputPasswordHasOnTheRequiredTagResponse() {
    }

    @Step("I blank the email request in login")
    public void blankEmailRequestInLogin() {
    }

    @Step("I received the error message \"input email has on the email tag\" login response")
    public void receivedErrorMessageEmailIsRequiredLoginResponse() {
    }

    @Step("I blank the password login request")
    public void blankPasswordLoginRequest() {
    }

    @Step("I enter an invalid email for login")
    public String enterInvalidEmailForLogin() {
        return url + "/user/login";
    }

    @Step("I send request to login user with invalid {string} and valid {string}")
    public void sendRequestLoginUserWithInvalidEmail(String email, String password) {
        JSONObject requestBody = new JSONObject();
        requestBody.put("email", email);
        requestBody.put("password", password);
        SerenityRest.given()
                .header("Content-Type", "application/json")
                .body(requestBody.toString())
                .post(enterInvalidEmailForLogin());
    }

    @Step("I received status code 404 Not Found in request login user")
    public void receivedStatusCode404NotFoundRequestLoginUser() {
        restAssuredThat(response -> response.statusCode(404));
    }

    @Step("I received an error message \"email not found\" response")
    public void receivedErrorMessageEmailNotFoundResponse() {
        JsonSchemaHelper helper = new JsonSchemaHelper();
        String schema = helper.getResponseSchema(JsonSchema.Login_Invalid_Email_Response_Schema);
        restAssuredThat(response -> response.body(matchesJsonSchema(schema)));
    }

    @Step("I enter an invalid password")
    public String enterInvalidPassword() {
        return url + "/user/login";
    }

    @Step("I send request to login user with valid {string} and invalid {string}")
    public void sendRequestLoginUserWithInvalidPassword(String email, String password) {
        JSONObject requestBody = new JSONObject();
        requestBody.put("email", email);
        requestBody.put("password", password);
        SerenityRest.given()
                .header("Content-Type", "application/json")
                .body(requestBody.toString())
                .post(enterInvalidPassword());
    }

    @Step("I received an error message \"invalid password\" response")
    public void receivedErrorMessageInvalidPasswordResponse() {
        JsonSchemaHelper helper = new JsonSchemaHelper();
        String schema = helper.getResponseSchema(JsonSchema.Login_Invalid_Password_Response_Schema);
        restAssuredThat(response -> response.body(matchesJsonSchema(schema)));
    }
}