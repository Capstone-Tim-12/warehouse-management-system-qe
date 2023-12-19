package starter.stepdefinitions.user.payment;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.user.payment.GetBankVirtualAccount;
public class GetBankVirtualAccountSteps {
    @Steps
    GetBankVirtualAccount getBankVirtualAccount;

    @Given ( "I set API endpoint valid for get bank virtual account" )
    public void setAPIEndpointValidGetBankVirtualAccount() {
        getBankVirtualAccount.setAPIEndpointValidGetBankVirtualAccount();
    }

    @When ( "I send request to get bank virtual account" )
    public void sendRequestGetBankVirtualAccount() {
        getBankVirtualAccount.sendRequestGetBankVirtualAccount();
    }

    @Then ( "I received status code 200 OK in request get bank virtual account" )
    public void receivedStatusCode200OKRequestGetBankVirtualAccount() {
        getBankVirtualAccount.receivedStatusCode200OKRequestGetBankVirtualAccount();
    }

    @And ( "I received message \"Success\" response in request get bank virtual account" )
    public void receivedMessageSuccessResponseGetBankVirtualAccount() {
        getBankVirtualAccount.receivedMessageSuccessResponseGetBankVirtualAccount();
    }

    @Given ( "I set API endpoint invalid for get bank virtual account without the path" )
    public void setAPIEndpointInvalidGetBankVirtualAccountWithoutPath() {
        getBankVirtualAccount.setAPIEndpointInvalidGetBankVirtualAccountWithoutPath();
    }

    @When ( "I send request to get bank virtual account no path" )
    public void sendRequestGetBankVirtualAccountNoPath() {
        getBankVirtualAccount.sendRequestGetBankVirtualAccountNoPath();
    }

    @Then ( "I received status code 500 Internal Server Error in request to get bank virtual account" )
    public void receivedStatuscode500InternalServerErrorRequestGetBankVirtualAccount() {
        getBankVirtualAccount.receivedStatuscode500InternalServerErrorRequestGetBankVirtualAccount();
    }

    @And ( "I received error message \"general error\" response in request get bank virtual account" )
    public void receivedErrorMessageGeneralErrorResponseGetBankVirtualAcocunt() {
        getBankVirtualAccount.receivedErrorMessageGeneralErrorResponseGetBankVirtualAcocunt();
    }
}
