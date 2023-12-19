package starter.user.verificationIdentity;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import starter.utils.JsonSchema;
import starter.utils.JsonSchemaHelper;

import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchema;
import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class GetAllProvince {
    private static final String url = "https://digiwarehouse-app.onrender.com";

    @Step ("I set API endpoint valid for get all province")
    public String setAPIEndpointValidGetAllProvince() {
        return url + "/user/province";
    }

    @Step("I send request to get all province valid path")
    public void sendRequestGetAllProvinceValidPath() {
        SerenityRest.given()
                .get(setAPIEndpointValidGetAllProvince());
    }

    @Step("I received status code 200 OK in request to get all province")
    public void receivedStatusCode200OKGetAllProvince() {
        restAssuredThat(response -> response.statusCode(200));
    }

    @Step("I received all data province")
    public void receivedAllDataProvince() {
        JsonSchemaHelper helper = new JsonSchemaHelper();
        String schema = helper.getResponseSchema(JsonSchema.Get_All_Province_Response_Schema);
        restAssuredThat(response -> response.body(matchesJsonSchema(schema)));
    }

    @Step("I set API endpoint invalid for get all province")
    public String setAPIEndpointInvalidGetAllProvince() {
        return url + "/user/provinc";
    }

    @Step("I send request to get all province invalid path")
    public void sendRequestGetAllProvinceInvalidPath() {
        SerenityRest.given()
                .get(setAPIEndpointInvalidGetAllProvince());
    }

    @Step("I received status code 404 Not Found in request to get all province")
    public void receivedStatusCode4040NotFoundGetAllProvince() {
        restAssuredThat(response -> response.statusCode(401));
    }

    @Step("I received error message \"Not Found\" response in request get all province")
    public void receivedErrorMessageNotFoundInGetAllProvince() {
    }
}
