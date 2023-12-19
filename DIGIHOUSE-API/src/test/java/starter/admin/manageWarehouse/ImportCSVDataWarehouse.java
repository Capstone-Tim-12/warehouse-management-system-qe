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
import static org.hamcrest.Matchers.*;

public class ImportCSVDataWarehouse {
    private static final String url = "https://digiwarehouse-app.onrender.com";

    @Step ( "I set API endpoint valid for import CSV data warehouse" )
    public String setAPIEndpointValidImportCSVDataWarehouse() {
        return url + "/warehouse/import-data";
    }

    @Step ( "I enter a valid format file CSV" )
    public void enterValidFormatFileCSV() {
    }

    @Step ( "I send request to import CSV data warehouse a valid path" )
    public void sendRequestImportCSVDataWarehouseWithValidPath() {
        JSONObject requestBody = new JSONObject();
        String Token = GenerateToken.generateToken();
        File file = new File("src/test/resources/importCSV/warehouse.csv");

        SerenityRest.given()
                .header("Content-Type", "application/json")
                .header("Authorization", "Bearer " + Token)
                .contentType(ContentType.MULTIPART)
                .multiPart("file",file)
                .body(requestBody.toString())
                .post(setAPIEndpointValidImportCSVDataWarehouse());
    }

    @Step ( "I received status code 200 OK in request import CSV data warehouse" )
    public void receivedStatusCode200OKRequestImportCSVDataWarehouse() {
        restAssuredThat(response -> response.statusCode(200));
    }

    @Step ( "I received message \"Success\" response in request import CSV data warehouse" )
    public void receivedMessageSuccessResponseImportCSVDataWarehouse() {
        JsonSchemaHelper helper = new JsonSchemaHelper();
        String schema = helper.getResponseSchema(JsonSchema.Import_CSV_Data_Warehouse_Response_Schema);
        restAssuredThat(response -> response.body("'status'", notNullValue()));
        restAssuredThat(response -> response.body("'message'", is("Success")));
        restAssuredThat(response -> response.body("'data'", nullValue()));
        restAssuredThat(response -> response.body(matchesJsonSchema(schema)));
    }

    @Step ( "I set API endpoint invalid for import CSV data warehouse without the path" )
    public String setAPIEndpointInvalidImportCSVDataWarehouseWithoutPath() {
        return url + "/warehouse";
    }

    @Step ( "I send request to import CSV data warehouse no path" )
    public void sendRequestImportCSVDataWarehouseNoPath() {
        String Token = GenerateToken.generateToken();
        JSONObject requestBody = new JSONObject();
        SerenityRest.given()
                .header("Content-Type", "application/json")
                .header("Authorization", "Bearer " + Token)
                .body(requestBody.toString())
                .post(setAPIEndpointInvalidImportCSVDataWarehouseWithoutPath());
    }

    @Step ( "I received status code 500 Internal Server Error in request to import CSV data warehouse" )
    public void receivedStatuscode500InternalServerErrorRequestImportCSVDataWarehouse() {
        restAssuredThat(response -> response.statusCode(500));
    }

    @Step ( "I received error message \"general error\" response in request import CSV data warehouse" )
    public void receivedErrorMessageGeneralErrorResponseImportCSVDataWarehouse() {
    }

    @Step ( "I blank the import CSV data warehouse request" )
    public void blankImportCSVDataWarehouseRequest() {
    }

    @Step ( "I send request to import CSV data warehouse with blank request" )
    public void sendRequestImportCSVDataWarehouseWithBlankRequest() {
        JSONObject requestBody = new JSONObject();
        String file = "";
        requestBody.put("file", file);
        String Token = GenerateToken.generateToken();
        SerenityRest.given()
                .header("Content-Type", "application/json")
                .header("Authorization", "Bearer " + Token)
                .body(requestBody.toString())
                .post(setAPIEndpointValidImportCSVDataWarehouse());
    }

    @Step ( "I received the error message \"request Content Type is not multipart or form data\" response in import CSV data warehouse" )
    public void receivedErrorMessageRequestContentTypeIsNotMultipartResponseImportCSVDataWarehouse() {
    }

    @Step ( "I enter an invalid format file CSV" )
    public void enterInvalidFormateFileCSV() {
    }

    @Step ( "I received status code 400 Bad Request in request to import CSV data warehouse" )
    public void receivedStatusCode400BadRequestInRequestImportCSVDataWarehouse() {
        restAssuredThat(response -> response.statusCode(400));
    }

    @Step ( "I send request to import CSV data warehouse with invalid format" )
    public void sendRequestImportCSVDataWarehouseWithInvalidFormat() {
        JSONObject requestBody = new JSONObject();
        String Token = GenerateToken.generateToken();
        File file = new File("src/test/resources/importCSV/InvalidFormat.docx");

        SerenityRest.given()
                .header("Content-Type", "application/json")
                .header("Authorization", "Bearer " + Token)
                .contentType(ContentType.MULTIPART)
                .multiPart("file",file)
                .body(requestBody.toString())
                .post(setAPIEndpointValidImportCSVDataWarehouse());
    }

    @Step ( "I received the error message \"invalid CSV file\" response in import CSV data warehouse" )
    public void receivedErrormessageInvalidCSVFileResponseImportCSVDataWarehouse() {
    }
}
