package starter.user.payment;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.JSONObject;
import starter.utils.GenerateToken;
import starter.utils.JsonSchema;
import starter.utils.JsonSchemaHelper;

import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchema;
import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.notNullValue;

public class PaymentCheckout {
    private static final String url = "https://digiwarehouse-app.onrender.com";

    @Step ( "I set API endpoint valid for payment checkout" )
    public String setAPIEndpointValidPaymentCheckout() {
        return url + "/payment/checkout";
    }

    @Step ( "I enter a valid payment method ID" )
    public void enterValidPaymentMethodID() {
    }

    @Step ( "I enter a valid installment ID and the installment status \"has not been paid\"" )
    public void enterValidInstallmentIDAndTheInstallmentStatusHasNotBeenPaid() {
    }

    @Step ( "I enter a valid data payment bank code" )
    public void enterValidDataPaymentBankCode() {
    }

    @Step ( "I send request to payment checkout" )
    public void sendRequestPaymentCheckout() {
        JSONObject requestBody = new JSONObject();
        int paymentMethodId = 1;
        int instalmentId = 437;
        String data = "{\"bankCode\":\"Mandiri\"}";
        requestBody.put("paymentMethodId", paymentMethodId);
        requestBody.put("instalmentId", instalmentId);
        requestBody.put("data", data);
        String Token = GenerateToken.generateToken();
        SerenityRest.given()
                .header("Content-Type", "application/json")
                .header("Authorization", "Bearer " + Token)
                .body(requestBody.toString())
                .post(setAPIEndpointValidPaymentCheckout());
    }

    @Step ( "I received status code 200 OK in request payment checkout" )
    public void receivedStatusCode200OKRequestPaymentCheckout() {
        restAssuredThat(response -> response.statusCode(200));
    }

    @Step ( "I received message \"Success\" response in request payment checkout" )
    public void receivedMessageSuccessResponsePaymentCheckout() {
        JsonSchemaHelper helper = new JsonSchemaHelper();
        String schema = helper.getResponseSchema(JsonSchema.Payment_Checkout_Response_Schema);
        restAssuredThat(response -> response.body("'status'", notNullValue()));
        restAssuredThat(response -> response.body("'message'", is("Success")));
        restAssuredThat(response -> response.body("'data'", notNullValue()));
        restAssuredThat(response -> response.body(matchesJsonSchema(schema)));
    }

    @Step ( "I set API endpoint invalid for payment checkout without the path" )
    public String setAPIEndpointInvalidPaymentCheckoutWithoutPath() {
        return url + "/payment";
    }

    @Step ( "I send request to payment checkout no path" )
    public void sendRequestGetPaymentCheckoutNoPath() {
        String Token = GenerateToken.generateToken();
        JSONObject requestBody = new JSONObject();
        SerenityRest.given()
                .header("Content-Type", "application/json")
                .header("Authorization", "Bearer " + Token)
                .body(requestBody.toString())
                .post(setAPIEndpointInvalidPaymentCheckoutWithoutPath());
    }

    @Step ( "I received status code 500 Internal Server Error in request to payment checkout" )
    public void receivedStatuscode500InternalServerErrorRequestPaymentCheckout() {
        restAssuredThat(response -> response.statusCode(500));
    }

    @Step ( "I received error message \"general error\" response in request payment checkout" )
    public void receivedErrorMessageGeneralErrorResponsePaymentCheckout() {
    }

    @Step ( "I blank the payment checkout request" )
    public void blankPaymentCheckoutRequest() {
    }

    @Step ( "I send blank request to payment checkout" )
    public void sendBlankRequestPaymentCheckout() {
        JSONObject requestBody = new JSONObject();
        int paymentMethodId = 0;
        int instalmentId = 0;
        String data = "";
        requestBody.put("paymentMethodId", paymentMethodId);
        requestBody.put("instalmentId", instalmentId);
        requestBody.put("data", data);
        String Token = GenerateToken.generateToken();
        SerenityRest.given()
                .header("Content-Type", "application/json")
                .header("Authorization", "Bearer " + Token)
                .body(requestBody.toString())
                .post(setAPIEndpointValidPaymentCheckout());
    }

    @Step ( "I received status code 400 Bad Request in request to payment checkout" )
    public void receivedStatuscode400BadRequestInRequestPaymentCheckout() {
        restAssuredThat(response -> response.statusCode(400));
    }

    @Step ( "I received the error message \"invalid request\" response in payment checkout" )
    public void receivedErrorMessageInvalidRequestResponsePaymentCheckout() {
    }

    @Step ( "I blank the payment method ID request in payment checkout" )
    public void blankPaymentMethodIDRequestPaymentCheckout() {
    }

    @Step ( "I send blank payment method ID request to payment checkout" )
    public void sendBlankPaymentMethodIDRequestPaymentCheckout() {
        JSONObject requestBody = new JSONObject();
        int paymentMethodId = 0;
        int instalmentId = 437;
        String data = "{\"bankCode\":\"BCA\"}";
        requestBody.put("paymentMethodId", paymentMethodId);
        requestBody.put("instalmentId", instalmentId);
        requestBody.put("data", data);
        String Token = GenerateToken.generateToken();
        SerenityRest.given()
                .header("Content-Type", "application/json")
                .header("Authorization", "Bearer " + Token)
                .body(requestBody.toString())
                .post(setAPIEndpointValidPaymentCheckout());
    }

    @Step ( "I blank the installment ID request in payment checkout" )
    public void blankInstallmentIDRequestPaymentCheckout() {
    }

    @Step ( "I send blank installment ID request to payment checkout" )
    public void sendBlankInstallmentIDRequestPaymentCheckout() {
        JSONObject requestBody = new JSONObject();
        int paymentMethodId = 1;
        int instalmentId = 0;
        String data = "{\"bankCode\":\"BCA\"}";
        requestBody.put("paymentMethodId", paymentMethodId);
        requestBody.put("instalmentId", instalmentId);
        requestBody.put("data", data);
        String Token = GenerateToken.generateToken();
        SerenityRest.given()
                .header("Content-Type", "application/json")
                .header("Authorization", "Bearer " + Token)
                .body(requestBody.toString())
                .post(setAPIEndpointValidPaymentCheckout());
    }

    @Step ( "I blank the data payment bank code request in payment checkout" )
    public void blankDataPaymentBankCodePaymentCheckout() {
    }

    @Step ( "I send blank data payment bank code request to payment checkout" )
    public void sendBlankDataPaymentBankCodeRequestPaymentCheckout() {
        JSONObject requestBody = new JSONObject();
        int paymentMethodId = 1;
        int instalmentId = 437;
        String data = "";
        requestBody.put("paymentMethodId", paymentMethodId);
        requestBody.put("instalmentId", instalmentId);
        requestBody.put("data", data);
        String Token = GenerateToken.generateToken();
        SerenityRest.given()
                .header("Content-Type", "application/json")
                .header("Authorization", "Bearer " + Token)
                .body(requestBody.toString())
                .post(setAPIEndpointValidPaymentCheckout());
    }

    @Step ( "I received the error message \"payment is due please contant admin\" response in payment checkout" )
    public void receivedErrorMessagePaymentIsDuePleaseContantAdminResponsePaymentCheckout() {
    }

    @Step ( "I enter a valid installment ID and the installment status \"has been paid/wait for payment\"" )
    public void enterValidInstallmentIDAndTheInstallmentStatusHasBeenPaid() {
    }

    @Step ( "I send request valid installment ID and installment status \"has been paid or wait for payment\" to payment checkout" )
    public void sendRequestValidInstallmentIDAndInstallmentStatusHasBeenPaid() {
        JSONObject requestBody = new JSONObject();
        int paymentMethodId = 1;
        int instalmentId = 436;
        String data = "{\"bankCode\":\"BCA\"}";
        requestBody.put("paymentMethodId", paymentMethodId);
        requestBody.put("instalmentId", instalmentId);
        requestBody.put("data", data);
        String Token = GenerateToken.generateToken();
        SerenityRest.given()
                .header("Content-Type", "application/json")
                .header("Authorization", "Bearer " + Token)
                .body(requestBody.toString())
                .post(setAPIEndpointValidPaymentCheckout());
    }

    @Step ( "I received the error message \"Please make sure the previous payment has been completed\" response in payment checkout" )
    public void receivedErrorMessagePleaseMakeSurePreviousPaymentHasBeenCompletedResponsePaymentCheckout() {
    }
}
