package starter.user.setting;

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

public class UploadPhoto {
    private static final String url = "https://digiwarehouse-app.onrender.com";

    @Step ( "I set API endpoint valid for upload photo" )
    public String setAPIEndpointValidUploadPhoto() {
        return url + "/user/upload/photo";
    }

    @Step ( "I enter a photo" )
    public void enterPhoto() {
    }

    @Step ( "I send request to upload photo with a valid path" )
    public void sendRequestUploadPhotoWithValidPath() {
        JSONObject requestBody = new JSONObject();
        String Token = GenerateToken.generateToken();
        File photo = new File("src/test/resources/image/Avatars/3.png");

        SerenityRest.given()
                .header("Content-Type", "application/json")
                .header("Authorization", "Bearer " + Token)
                .contentType(ContentType.MULTIPART)
                .multiPart("photo",photo)
                .body(requestBody.toString())
                .post(setAPIEndpointValidUploadPhoto());
    }

    @Step ( "I received status code 200 OK in request upload photo" )
    public void receivedStatusCode200OKRequestUploadPhoto() {
        restAssuredThat(response -> response.statusCode(200));
    }

    @Step ( "I received message \"Success\" response in request upload photo" )
    public void receivedMessageSuccessResponseUploadPhoto() {
        JsonSchemaHelper helper = new JsonSchemaHelper();
        String schema = helper.getResponseSchema(JsonSchema.Upload_Photo_Response_Schema);
        restAssuredThat(response -> response.body("'status'", notNullValue()));
        restAssuredThat(response -> response.body("'message'", is("Success")));
        restAssuredThat(response -> response.body("'data'", notNullValue()));
        restAssuredThat(response -> response.body("'data'.'urlImage'", notNullValue()));
        restAssuredThat(response -> response.body(matchesJsonSchema(schema)));
    }

    @Step ( "I set API endpoint invalid for upload photo without the path" )
    public String setAPIEndpointInvalidUploadPhotoWithoutPath() {
        return url + "/user/upload";
    }

    @Step ( "I send request to upload photo no path" )
    public void sendRequestUploadPhotoNoPath() {
        String Token = GenerateToken.generateToken();
        JSONObject requestBody = new JSONObject();
        SerenityRest.given()
                .header("Content-Type", "application/json")
                .header("Authorization", "Bearer " + Token)
                .body(requestBody.toString())
                .post(setAPIEndpointInvalidUploadPhotoWithoutPath());
    }

    @Step ( "I received status code 500 Internal Server Error in request to upload photo" )
    public void receivedStatusCode500InternalServerErrorRequestUploadPhoto() {
        restAssuredThat(response -> response.statusCode(500));
    }

    @Step ( "I received error message \"general error\" response in request upload photo" )
    public void receivedErrorMessageGeneralErrorResponseUploadPhoto() {
    }

    @Step ( "I blank the upload photo request" )
    public void blankUploadPhotoRequest() {
    }

    @Step ( "I send request to upload photo with blank request" )
    public void sendRequestUploadPhotoWithBlankRequest() {
        JSONObject requestBody = new JSONObject();
        String photo = "";
        requestBody.put("photo", photo);
        String Token = GenerateToken.generateToken();
        SerenityRest.given()
                .header("Content-Type", "application/json")
                .header("Authorization", "Bearer " + Token)
                .body(requestBody.toString())
                .post(setAPIEndpointValidUploadPhoto());
    }

    @Step ( "I received status code 400 Bad Request in request to upload photo" )
    public void receivedStatusCode400BadRequestUploadPhoto() {
        restAssuredThat(response -> response.statusCode(400));
    }

    @Step ( "I received the error message \"http: no such file\" response in upload photo" )
    public void receivedErrorMessageNoSuchFileResponseUploadPhoto() {
    }

    @Step ( "I enter a photo invalid format" )
    public void enterPhotoInvalidFormat() {
    }

    @Step ( "I send request to upload photo with invalid format" )
    public void sendRequestUploadPhotoWithInvalidFormat() {
        JSONObject requestBody = new JSONObject();
        String Token = GenerateToken.generateToken();
        File photo = new File("src/test/resources/image/Testimoni/riodewanto.webp");

        SerenityRest.given()
                .header("Content-Type", "application/json")
                .header("Authorization", "Bearer " + Token)
                .contentType(ContentType.MULTIPART)
                .multiPart("photo",photo)
                .body(requestBody.toString())
                .post(setAPIEndpointValidUploadPhoto());
    }

    @Step ( "I received the error message \"only supported file formats are jpg, jpeg and png\" response in upload photo" )
    public void receivedErrorMessageOnlySupportedFileFormatsAreJPGResponseUploadPhoto() {
    }

    @Step ( "I enter a photo with size more than 5 MB" )
    public void enterPhotoWithSizeMoreThan5MB() {
    }

    @Step ( "I send request to upload photo with size more than 5 MB" )
    public void sendRequestUploadPhotoWithSizeMoreThan5MB() {
        JSONObject requestBody = new JSONObject();
        String Token = GenerateToken.generateToken();
        File photo = new File("src/test/resources/image/Photo/Size_More_Than_5MB.JPG");

        SerenityRest.given()
                .header("Content-Type", "application/json")
                .header("Authorization", "Bearer " + Token)
                .contentType(ContentType.MULTIPART)
                .multiPart("photo",photo)
                .body(requestBody.toString())
                .post(setAPIEndpointValidUploadPhoto());
    }

    @Step ( "I received the error message \"image size cannot be more than 5 MB\" response in upload photo" )
    public void receivedErrorMessageImageSizeCannotBeMoreThan5MBResponseUploadPhoto() {
    }
}
