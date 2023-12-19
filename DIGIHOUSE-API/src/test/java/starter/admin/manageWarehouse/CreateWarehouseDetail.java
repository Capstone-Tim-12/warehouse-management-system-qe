package starter.admin.manageWarehouse;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.JSONObject;
import starter.utils.GenerateToken;
import starter.utils.JsonSchema;
import starter.utils.JsonSchemaHelper;

import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchema;
import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.*;

public class CreateWarehouseDetail {
    private static final String url = "https://digiwarehouse-app.onrender.com";

    @Step ( "I set API endpoint valid for create warehouse detail" )
    public String setAPIEndpointValidCreateWarehouseDetail() {
        return url + "/warehouse/detail";
    }

    @Step ( "I enter a valid input create warehouse detail" )
    public void enterValidInputCreateWarehouseDetail() {
    }

    @Step ( "I send request to create warehouse detail" )
    public void sendRequestCreateWarehouseDetail() {
        JSONObject requestBody = new JSONObject();
        String Token = GenerateToken.generateToken();
        String name = "Retailer Warehouse";
        String description = "The warehouse is located in a strategic area and has close access to urban areas";
        String districId = "5171010";
        String address = "Jln Denpasar Bali";
        int surfaceArea = 9000;
        int buildingArea = 10000;
        int price = 100000000;
        String owner = "Mia Aprilia Satya";
        int warehouseTypeId = 3;
        String phoneNumber = "085159932141";
        double longitude = 106.8456;
        double latitude = -6.2088;
        String[] image = {"https://www.dropbox.com/scl/fi/izuhi0v5kdsq3bzzf1gdx/file_UBidK0fLmIydRKU61CaU.jpg?rlkey=9rrdl3zngy2wzumfqdl0w719g&raw=1",
                "https://www.dropbox.com/scl/fi/izuhi0v5kdsq3bzzf1gdx/file_UBidK0fLmIydRKU61CaU.jpg?rlkey=9rrdl3zngy2wzumfqdl0w719g&raw=1",
                "https://www.dropbox.com/scl/fi/2tson6smle7v750p5bti1/file_QZ8A6FWuOdBFlaMRIHbm.png?rlkey=v0obierxiwpm2wzms8re27qka&raw=1",
                "https://www.dropbox.com/scl/fi/izuhi0v5kdsq3bzzf1gdx/file_UBidK0fLmIydRKU61CaU.jpg?rlkey=9rrdl3zngy2wzumfqdl0w719g&raw=1"};
        requestBody.put("name", name);
        requestBody.put("description", description);
        requestBody.put("districId", districId);
        requestBody.put("address", address);
        requestBody.put("surfaceArea", surfaceArea);
        requestBody.put("buildingArea", buildingArea);
        requestBody.put("price", price);
        requestBody.put("owner", owner);
        requestBody.put("warehouseTypeId", warehouseTypeId);
        requestBody.put("phoneNumber", phoneNumber);
        requestBody.put("longitude", longitude);
        requestBody.put("latitude", latitude);
        requestBody.put("image", image);
        SerenityRest.given()
                .header("Content-Type", "application/json")
                .header("Authorization", "Bearer " + Token)
                .body(requestBody.toString())
                .post(setAPIEndpointValidCreateWarehouseDetail());
    }

    @Step ( "I received status code 201 Created in request create warehouse detail" )
    public void receivedStatusCode201CreatedRequestCreateWarehouseDetail() {
        restAssuredThat(response -> response.statusCode(201));
    }

    @Step ( "I received message \"Success\" response in request create warehouse detail" )
    public void receivedMessageSuccessResponseCreateWarehouseDetail() {
        JsonSchemaHelper helper = new JsonSchemaHelper();
        String schema = helper.getResponseSchema(JsonSchema.Create_Warehouse_Detail_Response_Schema);
        restAssuredThat(response -> response.body("'status'", notNullValue()));
        restAssuredThat(response -> response.body("'message'", is("Success")));
        restAssuredThat(response -> response.body("'data'", nullValue()));
        restAssuredThat(response -> response.body(matchesJsonSchema(schema)));
    }

    @Step ( "I set API endpoint invalid for create warehouse detail without the path" )
    public String setAPIEndpointInvalidCreateWarehouseDetailWithoutPath() {
        return url + "/warehouse";
    }

    @Step ( "I send request to create warehouse detail no path" )
    public void sendRequestCreateWarehouseDetailNoPath() {
        String Token = GenerateToken.generateToken();
        JSONObject requestBody = new JSONObject();
        SerenityRest.given()
                .header("Content-Type", "application/json")
                .header("Authorization", "Bearer " + Token)
                .body(requestBody.toString())
                .post(setAPIEndpointInvalidCreateWarehouseDetailWithoutPath());
    }

    @Step ( "I received status code 500 Internal Server Error in request to create warehouse detail" )
    public void receivedStatusCode500InternalServerErrorRequestCreateWarehouseDetail() {
        restAssuredThat(response -> response.statusCode(500));
    }

    @Step ( "I received error message \"general error\" response in request create warehouse detail" )
    public void receivedErrorMessageGeneralErrorResponseCreateWarehouseDetail() {
    }

    @Step ( "I blank the create warehouse detail request" )
    public void blankCreateWarehouseDetailRequest() {
    }

    @Step ( "I send request to create warehouse detail with blank warehouse request" )
    public void sendRequestCreateWarehouseDetailWithBlankRequest() {
        JSONObject requestBody = new JSONObject();
        String Token = GenerateToken.generateToken();
        String name = "";
        String description = "";
        String districId = "";
        String address = "";
        int surfaceArea = 0;
        int buildingArea = 0;
        int price = 0;
        String owner = "";
        int warehouseTypeId = 0;
        String phoneNumber = "";
        double longitude = 0;
        double latitude = 0;
        String[] image = {""};
        requestBody.put("name", name);
        requestBody.put("description", description);
        requestBody.put("districId", districId);
        requestBody.put("address", address);
        requestBody.put("surfaceArea", surfaceArea);
        requestBody.put("buildingArea", buildingArea);
        requestBody.put("price", price);
        requestBody.put("owner", owner);
        requestBody.put("warehouseTypeId", warehouseTypeId);
        requestBody.put("phoneNumber", phoneNumber);
        requestBody.put("longitude", longitude);
        requestBody.put("latitude", latitude);
        requestBody.put("image", image);
        SerenityRest.given()
                .header("Content-Type", "application/json")
                .header("Authorization", "Bearer " + Token)
                .body(requestBody.toString())
                .post(setAPIEndpointValidCreateWarehouseDetail());
    }

    @Step ( "I received status code 400 Bad Request in request to create warehouse detail" )
    public void receivedStatusCode400BadRequestInRequestCreateWarehouseDetail() {
        restAssuredThat(response -> response.statusCode(400));
    }

    @Step ( "I received the error message \"input price has on the required tag\" response in request create warehouse detail" )
    public void receivedErrorMessageInputPriceHasOnTheRequiredTagResponseCreateWarehouseDetail() {
    }
}
