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

public class UpdateWarehouseByID {
    private static final String url = "https://digiwarehouse-app.onrender.com";

    @Step ( "I set API endpoint valid for update warehouse by ID" )
    public String setAPIEndpointValidUpdateWarehouseByID() {
        return url + "/warehouse/detail/68";
    }

    @Step ( "I update a valid warehouse by ID" )
    public void updateValidWarehouseByID() {
    }

    @Step ( "I send request to update warehouse by ID" )
    public void sendRequestUpdateWarehouseByID() {
        JSONObject requestBody = new JSONObject();
        String Token = GenerateToken.generateToken();
        String name = "Retailer 2 Warehouse";
        String description = "The warehouse is located in a strategic area and has close access to urban areas";
        String districId = "3404100";
        String address = "Jln Lebak Bulus V";
        int surfaceArea = 2000;
        int buildingArea = 3000;
        int price = 600000000;
        String owner = "Mia Aprilia Satya";
        int warehouseTypeId = 1;
        String phoneNumber = "085159932141";
        double longitude = 106.8456;
        double latitude = -6.2088;
        String status = "tersedia";
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
        requestBody.put("status", status);
        requestBody.put("image", image);
        SerenityRest.given()
                .header("Content-Type", "application/json")
                .header("Authorization", "Bearer " + Token)
                .body(requestBody.toString())
                .put(setAPIEndpointValidUpdateWarehouseByID());
    }

    @Step ( "I received status code 200 OK in request update warehouse by ID" )
    public void receivedStatusCode200OKRequestUpdateWarehouseByID() {
        restAssuredThat(response -> response.statusCode(200));
    }

    @Step ( "I received message \"Success\" response in request update warehouse by ID" )
    public void receivedMessageSuccessResponseUpdateWarehouseByID() {
        JsonSchemaHelper helper = new JsonSchemaHelper();
        String schema = helper.getResponseSchema(JsonSchema.Update_Warehouse_By_ID_Response_Schema);
        restAssuredThat(response -> response.body("'status'", notNullValue()));
        restAssuredThat(response -> response.body("'message'", is("Success")));
        restAssuredThat(response -> response.body("'data'", nullValue()));
        restAssuredThat(response -> response.body(matchesJsonSchema(schema)));
    }

    @Step ( "I set API endpoint invalid for can't update warehouse by ID without the path" )
    public String setAPIEndpointInvalidUpdateWarehouseByIDWithoutPath() {
        return url + "/warehouse/detail";
    }

    @Step ( "I send request to update warehouse by ID no path" )
    public void sendRequestUpdateWarehouseByIDNoPath() {
        String Token = GenerateToken.generateToken();
        JSONObject requestBody = new JSONObject();
        SerenityRest.given()
                .header("Content-Type", "application/json")
                .header("Authorization", "Bearer " + Token)
                .body(requestBody.toString())
                .put(setAPIEndpointInvalidUpdateWarehouseByIDWithoutPath());
    }

    @Step ( "I received status code 500 Internal Server Error in request to update warehouse by ID" )
    public void receivedStatusCode500InternalServerErrorRequestUpdateWarehouseByID() {
        restAssuredThat(response -> response.statusCode(500));
    }

    @Step ( "I received error message \"general error\" response in request update warehouse by ID" )
    public void receivedErrorMessageGeneralErrorResponseUpdateWarehouseByID() {
    }

    @Step ( "I set API endpoint invalid for can't update warehouse by ID with invalid ID" )
    public String setAPIEndpointInvalidUpdateWarehouseByIDWithInvalidID() {
        return url + "/warehouse/detail/12000";
    }

    @Step ( "I send request to update warehouse by ID with invalid ID" )
    public void sendRequestUpdateWarehouseByIDWithInvalidID() {
        JSONObject requestBody = new JSONObject();
        String Token = GenerateToken.generateToken();
        String name = "Multi-Purpose Warehouse";
        String description = "The warehouse is located in a strategic area and has close access to urban areas";
        String districId = "3404100";
        String address = "Jln Lebak Bulus V";
        int surfaceArea = 2000;
        int buildingArea = 3000;
        int price = 60000000;
        String owner = "Mia Aprilia Satya";
        int warehouseTypeId = 1;
        String phoneNumber = "085159932141";
        double longitude = 45.67;
        double latitude = 44.78;
        String status = "tidak tersedia";
        String[] image = {"http://google.com/image-1.jpg"};
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
        requestBody.put("status", status);
        requestBody.put("image", image);
        SerenityRest.given()
                .header("Content-Type", "application/json")
                .header("Authorization", "Bearer " + Token)
                .body(requestBody.toString())
                .put(setAPIEndpointInvalidUpdateWarehouseByIDWithInvalidID());
    }

    @Step ( "I received status code 404 Not Found in request update warehouse by ID" )
    public void receivedStatusCode404NotFoundRequestUpdateWarehouseByID() {
        restAssuredThat(response -> response.statusCode(404));
    }

    @Step ( "I received message \"failed to get data warehouse\" response in request update warehouse by ID" )
    public void receivedErrorMessageFailedToGetDataWarehouseResponseUpdateWarehouseByID() {
    }
}
