package starter.user.verificationIdentity;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import starter.utils.JsonSchema;
import starter.utils.JsonSchemaHelper;

import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchema;
import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class GetAllDistrict {
    private static final String url = "https://digiwarehouse-app.onrender.com";

    @Step ("I set API endpoint valid for get all district")
    public String setAPIEndpointValidGetAllDistrict() {
        return url + "/user/district/1102";
    }

    @Step("I send request to get all district valid path")
    public void sendRequestGetAllDistrictValidPath() {
        SerenityRest.given()
                .get(setAPIEndpointValidGetAllDistrict());
    }

    @Step("I received status code 200 OK in request to get all district")
    public void receivedStatusCode200OKGetAllDistrict() {
        restAssuredThat(response -> response.statusCode(200));
    }

    @Step("I received all data district")
    public void receivedAllDataDistrict() {
        JsonSchemaHelper helper = new JsonSchemaHelper();
        String schema = helper.getResponseSchema(JsonSchema.Get_All_District_Response_Schema);
        restAssuredThat(response -> response.body(matchesJsonSchema(schema)));
    }

    @Step("I set API endpoint invalid for get all district")
    public String setAPIEndpointInvalidGetAllDistrict() {
        return url + "/user/distric";
    }

    @Step("I send request to get all district invalid path")
    public void sendRequestGetAllDistrictInvalidPath() {
        SerenityRest.given()
                .get(setAPIEndpointInvalidGetAllDistrict());
    }

    @Step("I received status code 404 Not Found in request to get all district")
    public void receivedStatusCode4040NotFoundGetAllDistrict() {
        restAssuredThat(response -> response.statusCode(401));
    }

    @Step("I received error message \"Not Found\" response in request get all district")
    public void receivedErrorMessageNotFoundInGetAllDistrict() {
    }
}

