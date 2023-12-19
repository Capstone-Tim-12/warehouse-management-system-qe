package starter.stepdefinitions.admin.dashboard;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.admin.dashboard.GetStatistic;

public class GetStatisticSteps {
    @Steps
    GetStatistic getStatistic;

    @Given ( "I set API endpoint valid for get statistic" )
    public void setAPIEndpointValidGetStatistic() {
        getStatistic.setAPIEndpointValidGetStatistic();
    }

    @When ( "I send request to get statistic" )
    public void sendRequestGetStatistic() {
        getStatistic.sendRequestGetStatistic();
    }

    @Then ( "I received status code 200 OK in request get statistic" )
    public void receivedStatusCode200OKRequestGetStatistic() {
        getStatistic.receivedStatusCode200OKRequestGetStatistic();
    }

    @And ( "I received message \"Success\" response in request get statistic" )
    public void receivedMessageSuccessResponseGetStatistic() {
        getStatistic.receivedMessageSuccessResponseGetStatistic();
    }

    @Given ( "I set API endpoint invalid for get statistic without the path" )
    public void setAPIEndpointInvalidGetStatisticWithoutPath() {
        getStatistic.setAPIEndpointInvalidGetStatisticWithoutPath();
    }

    @When ( "I send request to get statistic no path" )
    public void sendRequestGetTStatisticNoPath() {
        getStatistic.sendRequestGetTStatisticNoPath();
    }

    @Then ( "I received status code 500 Internal Server Error in request to get statistic" )
    public void receivedStatuscode500InternalServerErrorRequestGetStatistic() {
        getStatistic.receivedStatuscode500InternalServerErrorRequestGetStatistic();
    }

    @And ( "I received error message \"general error\" response in request get statistic" )
    public void receivedErrorMessageGeneralErrorResponseGetStatistic() {
        getStatistic.receivedErrorMessageGeneralErrorResponseGetStatistic();
    }
}
