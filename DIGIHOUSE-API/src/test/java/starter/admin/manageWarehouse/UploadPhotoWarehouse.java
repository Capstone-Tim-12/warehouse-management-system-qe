package starter.admin.manageWarehouse;

import io.restassured.http.ContentType;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.JSONObject;
import starter.utils.GenerateToken;
import starter.utils.JsonSchema;
import starter.utils.JsonSchemaHelper;

import java.io.File;

import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchema;
import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.notNullValue;

public class UploadPhotoWarehouse {
    private static final String url = "https://digiwarehouse-app.onrender.com";

    @Step ( "I set API endpoint valid for upload photo warehouse" )
    public String setAPIEndpointValidUploadPhotoWarehouse() {
        return url + "/warehouse/photo/upload";
    }

    @Step ( "I enter a valid format photo warehouse" )
    public void enterValidFormatPhotoWarehouse() {
    }

    @Step ( "I send request to upload photo warehouse with a valid path" )
    public void sendRequestUploadPhotoWarehouseWithValidPath() {
        JSONObject requestBody = new JSONObject();
        String Token = GenerateToken.generateToken();
        File photos = new File("src/test/resources/image/Warehouse/4.jpeg");

        SerenityRest.given()
                .header("Content-Type", "application/json")
                .header("Authorization", "Bearer " + Token)
                .contentType(ContentType.MULTIPART)
                .multiPart("photos",photos)
                .body(requestBody.toString())
                .post(setAPIEndpointValidUploadPhotoWarehouse());
    }

    @Step ( "I received status code 200 OK in request upload photo warehouse" )
    public void receivedStatusCode200OKRequestUploadPhotoWarehouse() {
        restAssuredThat(response -> response.statusCode(200));
    }

    @Step ( "I received message \"Success\" response in request upload photo warehouse" )
    public void receivedMessageSuccessResponseUploadPhotoWarehouse() {
        JsonSchemaHelper helper = new JsonSchemaHelper();
        String schema = helper.getResponseSchema(JsonSchema.Upload_Photo_Warehouse_Response_Schema);
        restAssuredThat(response -> response.body("'status'", notNullValue()));
        restAssuredThat(response -> response.body("'message'", is("Success")));
        restAssuredThat(response -> response.body("'data'", notNullValue()));
        restAssuredThat(response -> response.body("'data'.'images'", notNullValue()));
        restAssuredThat(response -> response.body(matchesJsonSchema(schema)));
    }

    @Step ( "I set API endpoint invalid for upload photo warehouse without the path" )
    public String setAPIEndpointInvalidUploadPhotoWarehouseWithoutPath() {
        return url + "/warehouse/photo";
    }

    @Step ( "I send request to upload photo warehouse no path" )
    public void sendRequestUploadPhotoWarehouseNoPath() {
        String Token = GenerateToken.generateToken();
        JSONObject requestBody = new JSONObject();
        SerenityRest.given()
                .header("Content-Type", "application/json")
                .header("Authorization", "Bearer " + Token)
                .body(requestBody.toString())
                .post(setAPIEndpointInvalidUploadPhotoWarehouseWithoutPath());
    }

    @Step ( "I received status code 500 Internal Server Error in request to upload photo warehouse" )
    public void receivedStatuscode500InternalServerErrorRequestUploadPhotoWarehouse() {
        restAssuredThat(response -> response.statusCode(500));
    }

    @Step ( "I received error message \"general error\" response in request upload photo warehouse" )
    public void receivedErrorMessageGeneralErrorResponseUploadPhotoWarehouse() {
    }

    @Step ( "I blank the upload photo warehouse request" )
    public void blankUploadPhotoWarehouseRequest() {
    }

    @Step ( "I send request to upload photo warehouse with blank request" )
    public void sendRequestUploadPhotoWarehouseWithBlankRequest() {
        JSONObject requestBody = new JSONObject();
        String photo = "";
        requestBody.put("photo", photo);
        String Token = GenerateToken.generateToken();
        SerenityRest.given()
                .header("Content-Type", "application/json")
                .header("Authorization", "Bearer " + Token)
                .body(requestBody.toString())
                .post(setAPIEndpointValidUploadPhotoWarehouse());
    }

    @Step ( "I received error message \"Internal Server Error\" response in request upload photo warehouse" )
    public void receivedErrorMessageInternalServerErrorResponseUploadPhotoWarehouse() {
    }

    @Step ( "I enter a photo warehouse invalid format" )
    public void enterPhotoWarehouseInvalidFormat() {
    }

    @Step ( "I send request to upload photo warehouse with invalid format" )
    public void sendRequestUploadPhotoWarehouseWithInvalidFormat() {
        JSONObject requestBody = new JSONObject();
        String Token = GenerateToken.generateToken();
        File photos = new File("src/test/resources/image/Warehouse/3.webp");

        SerenityRest.given()
                .header("Content-Type", "application/json")
                .header("Authorization", "Bearer " + Token)
                .contentType(ContentType.MULTIPART)
                .multiPart("photos",photos)
                .body(requestBody.toString())
                .post(setAPIEndpointValidUploadPhotoWarehouse());
    }

    @Step ( "I received status code 400 Bad Request in request to upload photo warehouse" )
    public void receivedStatusCode400BadRequestInRequestUploadPhotoWarehouse() {
        restAssuredThat(response -> response.statusCode(400));
    }

    @Step ( "I received the error message \"only supported file formats are jpg, jpeg and png\" response in upload photo warehouse" )
    public void receivedErrormessageOnlySupportedFileFormatsResponseUploadPhotoWarehouse() {
    }

    @Step ( "I enter a photo warehouse with size more than 5 MB" )
    public void enterPhotoWarehouseWithSizeMoreThan5MB() {
    }

    @Step ( "I send request to upload photo warehouse with size more than 5 MB" )
    public void sendRequestUploadPhotoWarehouseWithSizeMoreThan5MB() {
        JSONObject requestBody = new JSONObject();
        String Token = GenerateToken.generateToken();
        File photos = new File("src/test/resources/image/Photo/Size_More_than_5MB.JPG");

        SerenityRest.given()
                .header("Content-Type", "application/json")
                .header("Authorization", "Bearer " + Token)
                .contentType(ContentType.MULTIPART)
                .multiPart("photos",photos)
                .body(requestBody.toString())
                .post(setAPIEndpointValidUploadPhotoWarehouse());
    }

    @Step ( "I received the error message \"image size cannot be more than 5 MB\" response in upload photo warehouse" )
    public void receivedErrormessageImageSizeCannotBeMoreThan5MBResponseUploadPhotoWarehouse() {
    }

    @Step ( "I enter a photo warehouse with more than 6 photo" )
    public void enterPhotoWarehouseWithMoreThan6Photo() {
    }

    @Step ( "I send request to upload photo warehouse with more than 6 photo" )
    public void sendRequestUploadPhotoWarehouseWithMoreThan6Photo() {
        JSONObject requestBody = new JSONObject();
        String Token = GenerateToken.generateToken();
        File photos = new File("src/test/resources/image/Photo/Size_More_than_5MB.JPG");

        SerenityRest.given()
                .header("Content-Type", "application/json")
                .header("Authorization", "Bearer " + Token)
                .contentType(ContentType.MULTIPART)
                .multiPart("photos",photos)
                .body(requestBody.toString())
                .post(setAPIEndpointValidUploadPhotoWarehouse());
    }

    @Step ( "I received the error message \"maximum of 6 images permitted\" response in upload photo warehouse" )
    public void receivedErrormessageMaximumOf6ImagesPermittedResponseUploadPhotoWarehouse() {
    }
}
