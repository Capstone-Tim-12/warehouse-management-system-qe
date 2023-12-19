package starter.user.warehouse;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.JSONObject;
import starter.utils.GenerateToken;
import starter.utils.JsonSchema;
import starter.utils.JsonSchemaHelper;

import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchema;
import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.*;

public class GetMyWarehouseRental {
    private static final String url = "https://digiwarehouse-app.onrender.com";

    @Step ( "I set API endpoint valid for get my warehouse rental" )
    public String setAPIEndpointValidGetMyWarehouseRental() {
        return url + "/warehouse/rented?page=1&limit=10";
    }

    @Step ( "I send request to get my warehouse rental" )
    public void sendRequestGetMyWarehouseRental() {
        JSONObject requestBody = new JSONObject();
        String Token = GenerateToken.generateToken();
        SerenityRest.given()
                .header("Content-Type", "application/json")
                .header("Authorization", "Bearer " + Token)
                .body(requestBody.toString())
                .get(setAPIEndpointValidGetMyWarehouseRental());
    }

    @Step ( "I received status code 200 OK in request get my warehouse rental" )
    public void receivedStatusCode200OKRequestGetMyWarehouseRental() {
        restAssuredThat(response -> response.statusCode(200));
    }

    @Step ( "I received data profile and message \"Success\" response in request get my warehouse rental" )
    public void receivedDataWarehouseAndMessageSuccessResponseGetMyWarehouseRental() {
        JsonSchemaHelper helper = new JsonSchemaHelper();
        String schema = helper.getResponseSchema(JsonSchema.Get_My_Warehouse_Rental_Response_Schema);
        restAssuredThat(response -> response.body("'status'", notNullValue()));
        restAssuredThat(response -> response.body("'message'", is("Success")));
        restAssuredThat(response -> response.body("'data'", notNullValue()));
        restAssuredThat(response -> response.body(matchesJsonSchema(schema)));
    }

    @Step ( "I set API endpoint invalid for get my warehouse rental without the path" )
    public String setAPIEndpointInvalidGetMyWarehouseRentalWithoutPath() {
        return url + "/warehouse";
    }

    @Step ( "I send request to get my warehouse rental no path" )
    public void sendRequestGetMyWarehouseRentalNoPath() {
        String Token = GenerateToken.generateToken();
        JSONObject requestBody = new JSONObject();
        SerenityRest.given()
                .header("Content-Type", "application/json")
                .header("Authorization", "Bearer " + Token)
                .body(requestBody.toString())
                .get(setAPIEndpointInvalidGetMyWarehouseRentalWithoutPath());
    }

    @Step ( "I received status code 500 Internal Server Error in request to get my warehouse rental" )
    public void receivedStatuscode500InternalServerErrorRequestGetMyWarehouseRental() {
        restAssuredThat(response -> response.statusCode(500));
    }

    @Step ( "I received error message \"general error\" response in request get my warehouse rental" )
    public void receivedErrorMessageGeneralErrorResponseGetMyWarehouseRental() {
    }
}
