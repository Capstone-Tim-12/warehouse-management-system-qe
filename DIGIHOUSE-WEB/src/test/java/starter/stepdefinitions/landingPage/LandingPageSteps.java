package starter.stepdefinitions.landingPage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import org.junit.jupiter.api.Assertions;
import starter.pages.landingPage.LandingPage;

public class LandingPageSteps {
    @Steps
    LandingPage landingPage;

    @Given ( "I set the endpoint valid on the landing page" )
    public void setEndpointValidLandingPage() {
        landingPage.openUrl("https://digihouse-jaya.netlify.app/");
        landingPage.setEndpointValidLandingPage();
    }

    @When ( "I tap the Tentang button" )
    public void tapTheTentangButton() {
        landingPage.tapTheTentangButton();
    }

    @Then ( "I redirected to the Tentang section" )
    public void redirectedToTheTentangSection() {
        Assertions.assertTrue(landingPage.redirectedToTheTentangSection());
    }

    @When ( "I tap the FAQ button" )
    public void tapTheFAQButton() {
        landingPage.tapTheFAQButton();
    }

    @Then ( "I redirected to the FAQ section" )
    public void redirectedToTheFAQSection() {
        Assertions.assertTrue(landingPage.redirectedToTheFAQSection());
    }

    @When ( "I tap the Kontak button" )
    public void tapTheKontakButton() {
        landingPage.tapTheKontakButton();
    }

    @Then ( "I redirected to the Kontak section" )
    public void redirectToTheKontakSection() {
        Assertions.assertTrue(landingPage.redirectToTheKontakSection());
    }

    @When ( "I tap the Beranda button" )
    public void tapTheBerandaButton() {
        landingPage.tapTheBerandaButton();
    }

    @Then ( "I redirected to the Beranda section" )
    public void redirectedToTheBerandaSection() {
        Assertions.assertTrue(landingPage.redirectedToTheBerandaSection());
    }

    @When ( "I tap the Chatbot button" )
    public void tapTheChatbotButton() {
        landingPage.tapTheChatbotButton();
    }

    @And ( "I enter a message with bahasa language" )
    public void enterMessageWithBahasa() {
        landingPage.enterMessageWithBahasa("Bagaimana cara melihat informasi gudang?");
    }

    @And ( "I tap the Send button for message request in chatbot" )
    public void tapSendButton() {
        landingPage.tapSendButton();
    }

    @Then ( "I received message respond bot with bahasa language in chatbot" )
    public void receivedMessageBahasaLanguage() {
        Assertions.assertTrue(landingPage.redirectedToTheBerandaSection());
    }

    @When ( "I enter a message with english language" )
    public void enterMessageWithEnglish() {
        landingPage.enterMessageWithEnglish("How can I view warehouse information?");
    }

    @Then ( "I received message respond bot with english language in chatbot" )
    public void receivedMessageEnglishLanguage() {
        Assertions.assertTrue(landingPage.redirectedToTheBerandaSection());
    }
}

