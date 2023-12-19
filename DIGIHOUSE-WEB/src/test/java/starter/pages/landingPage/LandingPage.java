package starter.pages.landingPage;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class LandingPage extends PageObject{
    private By TentangButton() {
        return By.id("tentang");
    }

    private By FAQButton() {
        return By.id("faq");
    }

    private By KontakButton() {
        return By.id("kontak");
    }

    private By BerandaButton() {
        return By.id("beranda");
    }

    private By ChatbotButton() {
        return By.id("chatbot-toggle");
    }

    private By InputMessage() {
        return By.id("input-message");
    }

    private By SendMessageButton() {
        return By.id("button-send-message");
    }

    @Step
    public void setEndpointValidLandingPage() {
        $(BerandaButton()).isDisplayed();
    }

    @Step
    public void tapTheTentangButton() {
        $(TentangButton()).click();
    }

    @Step
    public boolean redirectedToTheTentangSection() {
        return $(TentangButton()).isDisplayed();
    }

    @Step
    public void tapTheFAQButton() {
        $(FAQButton()).click();
    }

    @Step
    public boolean redirectedToTheFAQSection() {
        return $(FAQButton()).isDisplayed();
    }

    @Step
    public void tapTheKontakButton() {
        $(KontakButton()).click();
    }

    @Step
    public boolean redirectToTheKontakSection() {
        return $(KontakButton()).isDisplayed();
    }

    @Step
    public void tapTheBerandaButton() {
        $(BerandaButton()).click();
    }

    @Step
    public boolean redirectedToTheBerandaSection() {
        return $(BerandaButton()).isDisplayed();
    }

    @Step
    public void tapTheChatbotButton() {
        $(ChatbotButton()).click();
    }

    @Step
    public void enterMessageWithBahasa(String bahasa) {
        $(InputMessage()).type(bahasa);
    }

    @Step
    public void tapSendButton() {
        waitForCondition().until(webDriver -> webDriver.findElement(SendMessageButton()).isDisplayed());
        $(SendMessageButton()).click();
    }

    @Step
    public void enterMessageWithEnglish(String english) {
        $(InputMessage()).type(english);
    }
}
