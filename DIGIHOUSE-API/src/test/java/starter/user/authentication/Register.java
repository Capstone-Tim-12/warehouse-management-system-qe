package starter.user.authentication;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.JSONObject;
import starter.utils.JsonSchema;
import starter.utils.JsonSchemaHelper;

import java.io.FileWriter;
import java.io.IOException;

import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchema;
import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.notNullValue;

public class Register {
    private static final String url = "https://digiwarehouse-app.onrender.com";

    @Step("I set API endpoint valid for register new user")
    public String setAPIEndpointValidRegisterNewUser() {
        return url + "/user/register";
    }

    @Step("I enter username")
    public void enterUsername() {
    }

    @Step("I enter a email valid format")
    public void enterEmailValidFormat() {
    }

    @Step("I enter password")
    public void enterPassword() {
    }

    @Step ("I send request to register user")
    public void sendRequestRegisterUser() {
        JSONObject requestBody = new JSONObject();
        String username = "Mia Aprilia Satya";
        String email = "testerhomelte47@gmail.com";
        String password = "Testing1";
        requestBody.put("username", username);
        requestBody.put("email", email);
        requestBody.put("password", password);
        String filePath = "src/test/resources/sample/Testing.json";

        try {
            String jsonString = requestBody.toString();
            FileWriter fileWriter = new FileWriter(filePath);
            fileWriter.write(jsonString);
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        SerenityRest.given()
                .header("Content-Type", "application/json")
                .body(requestBody.toString())
                .post(setAPIEndpointValidRegisterNewUser());
    }

    @Step("I received status code 201 Created register user")
    public void receivedStatusCode201CreatedRegisterUser() {
        restAssuredThat(response -> response.statusCode(201));
    }

    @Step("I received register user data response register user")
    public void receivedRegisterUserDataResponseRegisterUser() {
        JsonSchemaHelper helper = new JsonSchemaHelper();
        String schema = helper.getResponseSchema(JsonSchema.Register_Response_Schema);
        restAssuredThat(response -> response.body("'status'", notNullValue()));
        restAssuredThat(response -> response.body("'message'", notNullValue()));
        restAssuredThat(response -> response.body("'data'.'email'", notNullValue()));
        restAssuredThat(response -> response.body(matchesJsonSchema(schema)));
    }

    @Step("I set API endpoint invalid for register user without the path")
    public String setAPIEndpointInvalidRegisterUserWithoutPath() { return url + "/user";
    }

    @Step("I send request to register user no path")
    public void sendRequestRegisterUserNoPath() {
        SerenityRest.given()
                .post(setAPIEndpointInvalidRegisterUserWithoutPath());
    }

    @Step("I received status code 401 Unauthorized in request to register user")
    public void receivedStatusCode401UnauthorizedRequestRegisterUser() {
        restAssuredThat(response -> response.statusCode(401));
    }

    @Step("I received error message \"invalid token\" register response")
    public void receivedErrorMessageInvalidTokenRegisterResponse() {
    }

    //Negative Case
    @Step("I blank the register request in register")
    public void blankRegisterRequestInRegister() {
    }

    @Step ("I send request to register user with blank register request")
    public void sendRequestRegisterUserWithBlankRegisterRequest() {
        JSONObject requestBody = new JSONObject();
        String email = "";
        String password = "";
        String username = "";
        requestBody.put("email", email);
        requestBody.put("password", password);
        requestBody.put("username", username);
        String filePath = "src/test/resources/sample/Testing.json";

        try {
            String jsonString = requestBody.toString();
            FileWriter fileWriter = new FileWriter(filePath);
            fileWriter.write(jsonString);
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        SerenityRest.given()
                .header("Content-Type", "application/json")
                .body(requestBody.toString())
                .post(setAPIEndpointValidRegisterNewUser());
    }

    @Step("I received status code 400 Bad Request in request to register user")
    public void receivedStatusCode400BadRequestRegisterUser() {
        restAssuredThat(response -> response.statusCode(400));
    }

    @Step("I received the error message \"input password has on the min tag\" response")
    public void receivedErrorMessageInputPasswordHasOnTheMintagRegisterResponse() {
    }

    //Negative Case
    @Step("I blank the username request")
    public void blankUsernameRequest() {
    }

    @Step ("I send request to register user with blank username request")
    public void sendRequestRegisterUserWithBlankUsernameRequest() {
        JSONObject requestBody = new JSONObject();
        String username = "";
        String email = "testerhomelte47@gmail.com";
        String password = "Testing1";
        requestBody.put("username", username);
        requestBody.put("email", email);
        requestBody.put("password", password);
        String filePath = "src/test/resources/sample/Testing.json";

        try {
            String jsonString = requestBody.toString();
            FileWriter fileWriter = new FileWriter(filePath);
            fileWriter.write(jsonString);
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        SerenityRest.given()
                .header("Content-Type", "application/json")
                .body(requestBody.toString())
                .post(setAPIEndpointValidRegisterNewUser());
    }

    @Step("I received the error message \"fullname is required\" response")
    public void receivedErrorMessageFullnameIsRequiredResponse() {
    }

    //Negative Case
    @Step("I blank the email request")
    public void blankEmailRequest() {
    }

    @Step ("I send request to register user with blank email request")
    public void sendRequestRegisterUserWithBlankEmailRequest() {
        JSONObject requestBody = new JSONObject();
        String username = "Mia Aprilia Satya";
        String email = "";
        String password = "Testing1";
        requestBody.put("username", username);
        requestBody.put("email", email);
        requestBody.put("password", password);
        String filePath = "src/test/resources/sample/Testing.json";

        try {
            String jsonString = requestBody.toString();
            FileWriter fileWriter = new FileWriter(filePath);
            fileWriter.write(jsonString);
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        SerenityRest.given()
                .header("Content-Type", "application/json")
                .body(requestBody.toString())
                .post(setAPIEndpointValidRegisterNewUser());
    }

    @Step("I received the error message \"email is required\" register response")
    public void receivedErrorMessageEmailIsRequiredRegisterResponse() {
    }

    //Negative Case
    @Step("I blank the password request")
    public void blankPasswordRequest() {
    }

    @Step ("I send request to register user with blank password request")
    public void sendRequestRegisterUserWithBlankPasswordRequest() {
        JSONObject requestBody = new JSONObject();
        String username = "Mia Aprilia Satya";
        String email = "testerhomelte47@gmail.com";
        String password = "";
        requestBody.put("username", username);
        requestBody.put("email", email);
        requestBody.put("password", password);
        String filePath = "src/test/resources/sample/Testing.json";

        try {
            String jsonString = requestBody.toString();
            FileWriter fileWriter = new FileWriter(filePath);
            fileWriter.write(jsonString);
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        SerenityRest.given()
                .header("Content-Type", "application/json")
                .body(requestBody.toString())
                .post(setAPIEndpointValidRegisterNewUser());
    }

    @Step("I received the error message \"password is required\" response")
    public void receivedErrorMessagePasswordIsRequiredResponse() {
    }

    //Negative Case
    @Step("I enter email already regist in database")
    public void enterEmailAlreadyRegistInDatabase() {
    }

    @Step ("I send request to register user with email already regist in database request")
    public void sendRequestRegisterUserWithEmailAlreadyRegistInDatabaseRequest() {
        JSONObject requestBody = new JSONObject();
        String username = "Mia Aprilia Satya";
        String email = "itqa.mia@gmail.com";
        String password = "Testing1";
        requestBody.put("username", username);
        requestBody.put("email", email);
        requestBody.put("password", password);
        String filePath = "src/test/resources/sample/Testing.json";

        try {
            String jsonString = requestBody.toString();
            FileWriter fileWriter = new FileWriter(filePath);
            fileWriter.write(jsonString);
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        SerenityRest.given()
                .header("Content-Type", "application/json")
                .body(requestBody.toString())
                .post(setAPIEndpointValidRegisterNewUser());
    }

    @Step("I received status code 409 Conflict in request to register user")
    public void receivedStatusCode409ConflictRequestRegisterUser() {
        restAssuredThat(response -> response.statusCode(409));
    }

    @Step("I received the error message \"email or username already exists\" response")
    public void receivedErrorMessageEmailAlreadyRegisterResponse() {
    }

    //Negative Case
    @Step("I enter email invalid format")
    public void enterEmailInvalidFormat() {
    }

    @Step ("I send request to register user with email invalid format request")
    public void sendRequestRegisterUserWithEmailInvalidFormatRequest() {
        JSONObject requestBody = new JSONObject();
        String username = "Mia Aprilia Satya";
        String email = "testerhomelte47gmail.com";
        String password = "Testing1";
        requestBody.put("username", username);
        requestBody.put("email", email);
        requestBody.put("password", password);
        String filePath = "src/test/resources/sample/Testing.json";

        try {
            String jsonString = requestBody.toString();
            FileWriter fileWriter = new FileWriter(filePath);
            fileWriter.write(jsonString);
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        SerenityRest.given()
                .header("Content-Type", "application/json")
                .body(requestBody.toString())
                .post(setAPIEndpointValidRegisterNewUser());
    }

    @Step("I received the error message \"unkown email format\" response")
    public void receivedErrorMessageUnkownEmailFormatResponse() {
    }
}

