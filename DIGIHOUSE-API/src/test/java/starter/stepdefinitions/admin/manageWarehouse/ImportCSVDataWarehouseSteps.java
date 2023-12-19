package starter.stepdefinitions.admin.manageWarehouse;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.admin.manageWarehouse.ImportCSVDataWarehouse;

public class ImportCSVDataWarehouseSteps {
    @Steps
    ImportCSVDataWarehouse importCSVDataWarehouse;

    @Given ( "I set API endpoint valid for import CSV data warehouse" )
    public void setAPIEndpointValidImportCSVDataWarehouse() {
        importCSVDataWarehouse.setAPIEndpointValidImportCSVDataWarehouse();
    }

    @When ( "I enter a valid format file CSV" )
    public void enterValidFormatFileCSV() {
        importCSVDataWarehouse.enterValidFormatFileCSV();
    }

    @And ( "I send request to import CSV data warehouse a valid path" )
    public void sendRequestImportCSVDataWarehouseWithValidPath() {
        importCSVDataWarehouse.sendRequestImportCSVDataWarehouseWithValidPath();
    }

    @Then ( "I received status code 200 OK in request import CSV data warehouse" )
    public void receivedStatusCode200OKRequestImportCSVDataWarehouse() {
        importCSVDataWarehouse.receivedStatusCode200OKRequestImportCSVDataWarehouse();
    }

    @And ( "I received message \"Success\" response in request import CSV data warehouse" )
    public void receivedMessageSuccessResponseImportCSVDataWarehouse() {
        importCSVDataWarehouse.receivedMessageSuccessResponseImportCSVDataWarehouse();
    }

    @Given ( "I set API endpoint invalid for import CSV data warehouse without the path" )
    public void setAPIEndpointInvalidImportCSVDataWarehouseWithoutPath() {
        importCSVDataWarehouse.setAPIEndpointInvalidImportCSVDataWarehouseWithoutPath();
    }

    @When ( "I send request to import CSV data warehouse no path" )
    public void sendRequestImportCSVDataWarehouseNoPath() {
        importCSVDataWarehouse.sendRequestImportCSVDataWarehouseNoPath();
    }

    @Then ( "I received status code 500 Internal Server Error in request to import CSV data warehouse" )
    public void receivedStatuscode500InternalServerErrorRequestImportCSVDataWarehouse() {
        importCSVDataWarehouse.receivedStatuscode500InternalServerErrorRequestImportCSVDataWarehouse();
    }

    @And ( "I received error message \"general error\" response in request import CSV data warehouse" )
    public void receivedErrorMessageGeneralErrorResponseImportCSVDataWarehouse() {
        importCSVDataWarehouse.receivedErrorMessageGeneralErrorResponseImportCSVDataWarehouse();
    }

    @When ( "I blank the import CSV data warehouse request" )
    public void blankImportCSVDataWarehouseRequest() {
        importCSVDataWarehouse.blankImportCSVDataWarehouseRequest();
    }

    @And ( "I send request to import CSV data warehouse with blank request" )
    public void sendRequestImportCSVDataWarehouseWithBlankRequest() {
        importCSVDataWarehouse.sendRequestImportCSVDataWarehouseWithBlankRequest();
    }

    @And ( "I received the error message \"request Content Type is not multipart or form data\" response in import CSV data warehouse" )
    public void receivedErrorMessageRequestContentTypeIsNotMultipartResponseImportCSVDataWarehouse() {
        importCSVDataWarehouse.receivedErrorMessageRequestContentTypeIsNotMultipartResponseImportCSVDataWarehouse();
    }

    @When ( "I enter an invalid format file CSV" )
    public void enterInvalidFormateFileCSV() {
        importCSVDataWarehouse.enterInvalidFormateFileCSV();
    }

    @And ( "I send request to import CSV data warehouse with invalid format" )
    public void sendRequestImportCSVDataWarehouseWithInvalidFormat() {
        importCSVDataWarehouse.sendRequestImportCSVDataWarehouseWithInvalidFormat();
    }

    @Then ( "I received status code 400 Bad Request in request to import CSV data warehouse" )
    public void receivedStatusCode400BadRequestInRequestImportCSVDataWarehouse() {
        importCSVDataWarehouse.receivedStatusCode400BadRequestInRequestImportCSVDataWarehouse();
    }

    @And ( "I received the error message \"invalid CSV file\" response in import CSV data warehouse" )
    public void receivedErrormessageInvalidCSVFileResponseImportCSVDataWarehouse() {
        importCSVDataWarehouse.receivedErrormessageInvalidCSVFileResponseImportCSVDataWarehouse();
    }
}
