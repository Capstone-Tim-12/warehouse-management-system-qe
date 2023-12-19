package starter.user.favorite;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.JSONObject;
import starter.utils.GenerateToken;
import starter.utils.JsonSchema;
import starter.utils.JsonSchemaHelper;

import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchema;
import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.*;

public class GetListFavorite {
    private static final String url = "https://digiwarehouse-app.onrender.com";

    @Step ( "I set API endpoint valid for get list favorite" )
    public String setAPIEndpointValidGetListFavorite() {
        return url + "/warehouse/favorit?page=1&limit=10";
    }

    @Step ( "I send request to get list favorite" )
    public void sendRequestGetListFavorite() {
        String Token = GenerateToken.generateToken();
        JSONObject requestBody = new JSONObject();
        SerenityRest.given()
                .header("Content-Type", "application/json")
                .header("Authorization", "Bearer " + Token)
                .body(requestBody.toString())
                .get(setAPIEndpointValidGetListFavorite());
    }

    @Step ( "I received status code 200 OK in request get list favorite" )
    public void receivedStatusCode200OKRequestGetListFavorite() {
        restAssuredThat(response -> response.statusCode(200));
    }

    @Step ( "I received detail favorite warehouse and message \"Success\" response in request get list favorite" )
    public void receivedDetailFavoriteWarehouseAndMessageSuccessResponseGetListFavorite() {
        JsonSchemaHelper helper = new JsonSchemaHelper();
        String schema = helper.getResponseSchema(JsonSchema.Get_List_Favorite_Response_Schema);
        restAssuredThat(response -> response.body("'status'", notNullValue()));
        restAssuredThat(response -> response.body("'message'", is("Success")));
        restAssuredThat(response -> response.body("'data'", notNullValue()));
        restAssuredThat(response -> response.body(matchesJsonSchema(schema)));
    }

    @Step ( "I set API endpoint invalid for can't get list favorite without the path" )
    public String setAPIEndpointInvalidGetListFavoriteWithoutPath() {
        return url + "/warehouse";
    }

    @Step ( "I send request to get list favorite no path" )
    public void sendrequestGetListFavoriteNoPath() {
        String Token = GenerateToken.generateToken();
        JSONObject requestBody = new JSONObject();
        SerenityRest.given()
                .header("Content-Type", "application/json")
                .header("Authorization", "Bearer " + Token)
                .body(requestBody.toString())
                .get(setAPIEndpointInvalidGetListFavoriteWithoutPath());
    }

    @Step ( "I received status code 500 Internal Server Error in request to get list favorite" )
    public void receivedStatusCode500InternalServerErrorRequestGetListFavorite() {
        restAssuredThat(response -> response.statusCode(500));
    }

    @Step ( "I received error message \"general error\" response in request get list favorite" )
    public void receivedErrorMessageGeneralErrorResponseGetListFavorite() {
    }
}