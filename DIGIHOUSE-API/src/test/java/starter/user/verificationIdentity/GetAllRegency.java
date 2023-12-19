package starter.user.verificationIdentity;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import starter.utils.JsonSchema;
import starter.utils.JsonSchemaHelper;

import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchema;
import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class GetAllRegency {
    private static final String url = "https://digiwarehouse-app.onrender.com";

    @Step ("I set API endpoint valid for get all regency")
    public String setAPIEndpointValidGetAllRegency() {
        return url + "/user/regency/33";
    }

    @Step("I send request to get all regency valid path")
    public void sendRequestGetAllRegencyValidPath() {
        SerenityRest.given()
                .get(setAPIEndpointValidGetAllRegency());
    }

    @Step("I received status code 200 OK in request to get all regency")
    public void receivedStatusCode200OKGetAllRegency() {
        restAssuredThat(response -> response.statusCode(200));
    }

    @Step("I received all data regency")
    public void receivedAllDataRegency() {
        JsonSchemaHelper helper = new JsonSchemaHelper();
        String schema = helper.getResponseSchema(JsonSchema.Get_All_Regency_Response_Schema);
        restAssuredThat(response -> response.body(matchesJsonSchema(schema)));
    }

    @Step("I set API endpoint invalid for get all regency")
    public String setAPIEndpointInvalidGetAllRegency() {
        return url + "/user/regenc";
    }

    @Step("I send request to get all regency invalid path")
    public void sendRequestGetAllRegencyInvalidPath() {
        SerenityRest.given()
                .get(setAPIEndpointInvalidGetAllRegency());
    }

    @Step("I received status code 404 Not Found in request to get all regency")
    public void receivedStatusCode4040NotFoundGetAllRegency() {
        restAssuredThat(response -> response.statusCode(401));
    }

    @Step("I received error message \"Not Found\" response in request get all regency")
    public void receivedErrorMessageNotFoundInGetAllRegency() {
    }
}
