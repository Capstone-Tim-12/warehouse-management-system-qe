package starter.stepdefinitions.admin.dashboard;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.admin.dashboard.RecentCustomer;

public class RecentCustomerSteps {
    @Steps
    RecentCustomer recentCustomer;

    @Given ( "I set API endpoint valid for recent customer" )
    public void setAPIEndpointValidRecentCustomer() {
        recentCustomer.setAPIEndpointValidRecentCustomer();
    }

    @When ( "I send request to recent customer" )
    public void sendRequestRecentCustomer() {
        recentCustomer.sendRequestRecentCustomer();
    }

    @Then ( "I received status code 200 OK in request recent customer" )
    public void receivedStatusCode200OKRequestRecentCustomer() {
        recentCustomer.receivedStatusCode200OKRequestRecentCustomer();
    }

    @And ( "I received message \"Success\" response in request recent customer" )
    public void receivedMessageSuccessResponseRecentCustomer() {
        recentCustomer.receivedMessageSuccessResponseRecentCustomer();
    }

    @Given ( "I set API endpoint invalid for recent customer without the path" )
    public void setAPIEndpointInvalidRecentCustomerWithoutPath() {
        recentCustomer.setAPIEndpointInvalidRecentCustomerWithoutPath();
    }

    @When ( "I send request to recent customer no path" )
    public void sendRequestRecentCustomerNoPath() {
        recentCustomer.sendRequestRecentCustomerNoPath();
    }

    @Then ( "I received status code 500 Internal Server Error in request to recent customer" )
    public void receivedStatuscode500InternalServerErrorRequestRecentCustomer() {
        recentCustomer.receivedStatuscode500InternalServerErrorRequestRecentCustomer();
    }

    @And ( "I received error message \"general error\" response in request recent customer" )
    public void receivedErrorMessageGeneralErrorResponseRecentCustomer() {
        recentCustomer.receivedErrorMessageGeneralErrorResponseRecentCustomer();
    }
}
