package starter.user.applyRental;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.JSONObject;
import starter.utils.GenerateToken;
import starter.utils.JsonSchema;
import starter.utils.JsonSchemaHelper;

import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchema;
import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.*;

public class RentalApplication {
    private static final String url = "https://digiwarehouse-app.onrender.com";

    @Step ( "I set API endpoint valid for rental application" )
    public String setAPIEndpointValidRentalApplication() {
        return url + "/payment/user/submission";
    }

    @Step ( "I send request to rental application" )
    public void sendRequestRentalApplication() {
        JSONObject requestBody = new JSONObject();
        int warehouseId = 84;
        int paymentSchemeId = 1;
        int duration = 10;
        String dateEntry = "2024-01-01T21:30:56.789012345Z";
        requestBody.put("warehouseId", warehouseId);
        requestBody.put("paymentSchemeId", paymentSchemeId);
        requestBody.put("duration", duration);
        requestBody.put("dateEntry", dateEntry);
        String Token = GenerateToken.generateToken();
        SerenityRest.given()
                .header("Content-Type", "application/json")
                .header("Authorization", "Bearer " + Token)
                .body(requestBody.toString())
                .post(setAPIEndpointValidRentalApplication());
    }

    @Step ( "I received status code 200 OK in request rental application" )
    public void receivedStatusCode200OKRequestRentalApplication() {
        restAssuredThat(response -> response.statusCode(200));
    }

    @Step ( "I received message \"Success\" response in request rental application" )
    public void receivedMessageSuccessRentalApplication() {
        JsonSchemaHelper helper = new JsonSchemaHelper();
        String schema = helper.getResponseSchema(JsonSchema.Rental_Application_Response_Schema);
        restAssuredThat(response -> response.body("'status'", notNullValue()));
        restAssuredThat(response -> response.body("'message'", is("Success")));
        restAssuredThat(response -> response.body("'data'", nullValue()));
        restAssuredThat(response -> response.body(matchesJsonSchema(schema)));
    }

    @Step ( "I set API endpoint invalid for rental application without the path" )
    public String setAPIEndpointInvalidRentalApplicationWithoutPath() {
        return url + "/payment/user";
    }

    @Step ( "I send request to rental application no path" )
    public void sendRequestRentalApplicationNoPath() {
        String Token = GenerateToken.generateToken();
        JSONObject requestBody = new JSONObject();
        SerenityRest.given()
                .header("Content-Type", "application/json")
                .header("Authorization", "Bearer " + Token)
                .body(requestBody.toString())
                .post(setAPIEndpointInvalidRentalApplicationWithoutPath());
    }

    @Step ( "I received status code 500 Internal Server Error in request to rental application" )
    public void receivedStatusCode500InternalServerErrorRequestRentalApplication() {
        restAssuredThat(response -> response.statusCode(500));
    }

    @Step ( "I received error message \"general error\" response in request rental application" )
    public void receivedErrorMessageGeneralErrorResponseRentalApplication() {
    }

    @Step ( "I blank the rental application request" )
    public void blankRentalApplicationRequest() {
    }

    @Step ( "I send blank request to rental application" )
    public void sendBlankRequestRentalApplication() {
        JSONObject requestBody = new JSONObject();
        int warehouseId = 0;
        int paymentSchemeId = 0;
        int duration = 0;
        String dateEntry = "";
        requestBody.put("warehouseId", warehouseId);
        requestBody.put("paymentSchemeId", paymentSchemeId);
        requestBody.put("duration", duration);
        requestBody.put("dateEntry", dateEntry);
        String Token = GenerateToken.generateToken();
        SerenityRest.given()
                .header("Content-Type", "application/json")
                .header("Authorization", "Bearer " + Token)
                .body(requestBody.toString())
                .post(setAPIEndpointValidRentalApplication());
    }

    @Step ( "I received status code 400 Bad Request in request to rental application" )
    public void receivedStatusCode400BadRequestRentalApplication() {
        restAssuredThat(response -> response.statusCode(400));
    }

    @Step ( "I received the error message \"invalid request\" response in rental application" )
    public void receivedErrorMessageInvalidRequestResponseRentalApplication() {
    }

    @Step ( "I enter a warehouse ID in rental application" )
    public void enterWarehouseIDInRentalApplication() {
    }

    @Step ( "I enter a payment schema ID" )
    public void enterPaymentSchemaID() {
    }

    @Step ( "I enter a duration" )
    public void enterDuration() {
    }

    @Step ( "I enter an invalid data entry" )
    public void enterInvalidDataEntry() {
    }

    @Step ( "I send invalid data entry request to rental application" )
    public void sendInvalidDataEntryRequestRentalApplication() {
        JSONObject requestBody = new JSONObject();
        int warehouseId = 84;
        int paymentSchemeId = 1;
        int duration = 10;
        String dateEntry = "2023-12-03T21:30:56.789012345Z";
        requestBody.put("warehouseId", warehouseId);
        requestBody.put("paymentSchemeId", paymentSchemeId);
        requestBody.put("duration", duration);
        requestBody.put("dateEntry", dateEntry);
        String Token = GenerateToken.generateToken();
        SerenityRest.given()
                .header("Content-Type", "application/json")
                .header("Authorization", "Bearer " + Token)
                .body(requestBody.toString())
                .post(setAPIEndpointValidRentalApplication());
    }

    @Step ( "I received the error message \"date cannot be less than the current date\" response in rental application" )
    public void receivedErrorMessageDateCannotBeLessThanCurrentDateResponseRentalApplication() {
    }
}
