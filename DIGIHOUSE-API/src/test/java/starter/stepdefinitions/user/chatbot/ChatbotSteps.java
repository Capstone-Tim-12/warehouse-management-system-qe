package starter.stepdefinitions.user.chatbot;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.user.chatbot.Chatbot;

public class ChatbotSteps {
    @Steps
    Chatbot chatbot;

    @Given ( "I set API endpoint valid for chatbot" )
    public void setAPIEndpointValidChatbot() {
        chatbot.setAPIEndpointValidChatbot();
    }

    @When ( "I send request to chatbot" )
    public void sendRequestChatbot() {
        chatbot.sendRequestChatbot();
    }

    @Then ( "I received status code 200 OK in request chatbot" )
    public void receivedStatusCode200OKRequestChatbot() {
        chatbot.receivedStatusCode200OKRequestChatbot();
    }

    @And ( "I received message \"Success\" response in request chatbot" )
    public void receivedMessageSuccessResponseChatbot() {
        chatbot.receivedMessageSuccessResponseChatbot();
    }

    @Given ( "I set API endpoint invalid for chatbot without the path" )
    public void setAPIEndpointInvalidChatbotWithoutPath() {
        chatbot.setAPIEndpointInvalidChatbotWithoutPath();
    }

    @When ( "I send request to chatbot no path" )
    public void sendRequestChatbotNoPath() {
        chatbot.sendRequestChatbotNoPath();
    }

    @Then ( "I received status code 500 Internal Server Error in request to chatbot" )
    public void receivedStatuscode500InternalServerErrorRequestChatbot() {
        chatbot.receivedStatuscode500InternalServerErrorRequestChatbot();
    }

    @And ( "I received error message \"general error\" response in request chatbot" )
    public void receivedErrorMessageGeneralErrorResponseChatbot() {
        chatbot.receivedErrorMessageGeneralErrorResponseChatbot();
    }

    @When ( "I blank the chatbot request" )
    public void blankChatbotRequest() {
        chatbot.blankChatbotRequest();
    }

    @And ( "I send blank request to chatbot" )
    public void sendBlankRequestChatbot() {
        chatbot.sendBlankRequestChatbot();
    }

    @Then ( "I received status code 400 Bad Request in request to chatbot" )
    public void receivedStatuscode400BadRequestInRequestChatbot() {
        chatbot.receivedStatuscode400BadRequestInRequestChatbot();
    }

    @And ( "I received the error message \"input text has on the required tag\" response in chatbot" )
    public void receivedErrorMessageInputTextHasOnRequiredResponseChatbot() {
        chatbot.receivedErrorMessageInputTextHasOnRequiredResponseChatbot();
    }
}
