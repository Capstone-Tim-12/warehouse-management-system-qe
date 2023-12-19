package starter.stepdefinitions.user.payment;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.user.payment.PaymentCheckout;

public class PaymentCheckoutSteps {
    @Steps
    PaymentCheckout paymentCheckout;

    @Given ( "I set API endpoint valid for payment checkout" )
    public void setAPIEndpointValidPaymentCheckout() {
        paymentCheckout.setAPIEndpointValidPaymentCheckout();
    }

    @When ( "I enter a valid payment method ID" )
    public void enterValidPaymentMethodID() {
        paymentCheckout.enterValidPaymentMethodID();
    }

    @And ( "I enter a valid installment ID and the installment status \"has not been paid\"" )
    public void enterValidInstallmentIDAndTheInstallmentStatusHasNotBeenPaid() {
        paymentCheckout.enterValidInstallmentIDAndTheInstallmentStatusHasNotBeenPaid();
    }

    @And ( "I enter a valid data payment bank code" )
    public void enterValidDataPaymentBankCode() {
        paymentCheckout.enterValidDataPaymentBankCode();
    }

    @And ( "I send request to payment checkout" )
    public void sendRequestPaymentCheckout() {
        paymentCheckout.sendRequestPaymentCheckout();
    }

    @Then ( "I received status code 200 OK in request payment checkout" )
    public void receivedStatusCode200OKRequestPaymentCheckout() {
        paymentCheckout.receivedStatusCode200OKRequestPaymentCheckout();
    }

    @And ( "I received message \"Success\" response in request payment checkout" )
    public void receivedMessageSuccessResponsePaymentCheckout() {
        paymentCheckout.receivedMessageSuccessResponsePaymentCheckout();
    }

    @Given ( "I set API endpoint invalid for payment checkout without the path" )
    public void setAPIEndpointInvalidPaymentCheckoutWithoutPath() {
        paymentCheckout.setAPIEndpointInvalidPaymentCheckoutWithoutPath();
    }

    @When ( "I send request to payment checkout no path" )
    public void sendRequestGetPaymentCheckoutNoPath() {
        paymentCheckout.sendRequestGetPaymentCheckoutNoPath();
    }

    @Then ( "I received status code 500 Internal Server Error in request to payment checkout" )
    public void receivedStatuscode500InternalServerErrorRequestPaymentCheckout() {
        paymentCheckout.receivedStatuscode500InternalServerErrorRequestPaymentCheckout();
    }

    @And ( "I received error message \"general error\" response in request payment checkout" )
    public void receivedErrorMessageGeneralErrorResponsePaymentCheckout() {
        paymentCheckout.receivedErrorMessageGeneralErrorResponsePaymentCheckout();
    }

    @When ( "I blank the payment checkout request" )
    public void blankPaymentCheckoutRequest() {
        paymentCheckout.blankPaymentCheckoutRequest();
    }

    @And ( "I send blank request to payment checkout" )
    public void sendBlankRequestPaymentCheckout() {
        paymentCheckout.sendBlankRequestPaymentCheckout();
    }

    @Then ( "I received status code 400 Bad Request in request to payment checkout" )
    public void receivedStatuscode400BadRequestInRequestPaymentCheckout() {
        paymentCheckout.receivedStatuscode400BadRequestInRequestPaymentCheckout();
    }

    @And ( "I received the error message \"invalid request\" response in payment checkout" )
    public void receivedErrorMessageInvalidRequestResponsePaymentCheckout() {
        paymentCheckout.receivedErrorMessageInvalidRequestResponsePaymentCheckout();
    }

    @When ( "I blank the payment method ID request in payment checkout" )
    public void blankPaymentMethodIDRequestPaymentCheckout() {
        paymentCheckout.blankPaymentMethodIDRequestPaymentCheckout();
    }

    @And ( "I send blank payment method ID request to payment checkout" )
    public void sendBlankPaymentMethodIDRequestPaymentCheckout() {
        paymentCheckout.sendBlankPaymentMethodIDRequestPaymentCheckout();
    }

    @And ( "I blank the installment ID request in payment checkout" )
    public void blankInstallmentIDRequestPaymentCheckout() {
        paymentCheckout.blankInstallmentIDRequestPaymentCheckout();
    }

    @And ( "I send blank installment ID request to payment checkout" )
    public void sendBlankInstallmentIDRequestPaymentCheckout() {
        paymentCheckout.sendBlankInstallmentIDRequestPaymentCheckout();
    }

    @And ( "I blank the data payment bank code request in payment checkout" )
    public void blankDataPaymentBankCodePaymentCheckout() {
        paymentCheckout.blankDataPaymentBankCodePaymentCheckout();
    }

    @And ( "I send blank data payment bank code request to payment checkout" )
    public void sendBlankDataPaymentBankCodeRequestPaymentCheckout() {
        paymentCheckout.sendBlankDataPaymentBankCodeRequestPaymentCheckout();
    }

    @And ( "I received the error message \"payment is due please contant admin\" response in payment checkout" )
    public void receivedErrorMessagePaymentIsDuePleaseContantAdminResponsePaymentCheckout() {
        paymentCheckout.receivedErrorMessagePaymentIsDuePleaseContantAdminResponsePaymentCheckout();
    }

    @And ( "I enter a valid installment ID and the installment status \"has been paid or wait for payment\"" )
    public void enterValidInstallmentIDAndTheInstallmentStatusHasBeenPaid() {
        paymentCheckout.enterValidInstallmentIDAndTheInstallmentStatusHasBeenPaid();
    }

    @And ( "I send request valid installment ID and installment status \"has been paid or wait for payment\" to payment checkout" )
    public void sendRequestValidInstallmentIDAndInstallmentStatusHasBeenPaid() {
        paymentCheckout.sendRequestValidInstallmentIDAndInstallmentStatusHasBeenPaid();
    }

    @And ( "I received the error message \"Please make sure the previous payment has been completed\" response in payment checkout" )
    public void receivedErrorMessagePleaseMakeSurePreviousPaymentHasBeenCompletedResponsePaymentCheckout() {
        paymentCheckout.receivedErrorMessagePleaseMakeSurePreviousPaymentHasBeenCompletedResponsePaymentCheckout();
    }
}
