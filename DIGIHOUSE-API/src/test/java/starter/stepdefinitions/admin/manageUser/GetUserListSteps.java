package starter.stepdefinitions.admin.manageUser;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.admin.manageUser.GetUserList;

public class GetUserListSteps {
    @Steps
    GetUserList getUserList;

    @Given ( "I set API endpoint valid for get user list" )
    public void setAPIEndpointValidGetUserList() {
        getUserList.setAPIEndpointValidGetUserList();
    }

    @When ( "I send request to get user list" )
    public void sendRequestGetUserList() {
        getUserList.sendRequestGetUserList();
    }

    @Then ( "I received status code 200 OK in request get user list" )
    public void receivedStatusCode200OKRequestGetUserList() {
        getUserList.receivedStatusCode200OKRequestGetUserList();
    }

    @And ( "I received message \"Success\" response in request get user list" )
    public void receivedMessageSuccessResponseGetUserList() {
        getUserList.receivedMessageSuccessResponseGetUserList();
    }

    @Given ( "I set API endpoint invalid for get user list without the path" )
    public void setAPIEndpointInvalidGetUserListWithoutPath() {
        getUserList.setAPIEndpointInvalidGetUserListWithoutPath();
    }

    @When ( "I send request to get user list no path" )
    public void sendRequestGetUserListNoPath() {
        getUserList.sendRequestGetUserListNoPath();
    }

    @Then ( "I received status code 500 Internal Server Error in request to get user list" )
    public void receivedStatusCode500InternalServerErrorRequestGetUserList() {
        getUserList.receivedStatusCode500InternalServerErrorRequestGetUserList();
    }

    @And ( "I received error message \"general error\" response in request get user list" )
    public void receivedErrorMessageGeneralErrorResponseGetUserList() {
        getUserList.receivedErrorMessageGeneralErrorResponseGetUserList();
    }
}
