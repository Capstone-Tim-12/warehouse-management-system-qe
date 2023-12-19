package starter.pages.dashboardAdmin;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class Login extends PageObject {
    private By emailField() {
        return By.id("username");
    }

    private By passwordField() {
        return By.id("password");
    }

    private By loginButton() {
        return By.id("login");
    }

    private By resetButton() {
        return By.id("reset");
    }

    @Step
    public boolean validateOnLoginPage() {
        waitForCondition().until(webDriver -> webDriver.findElement(loginButton()).isDisplayed());
        return $(loginButton()).isDisplayed();
    }

    @Step
    public void inputForm(String email, String password) {
        $(emailField()).type(email);
        $(passwordField()).type(password);
    }

    @Step
    public void inputEmail(String email) {
        $(emailField()).type(email);
    }

    @Step
    public void inputPassword(String password) {
        $(passwordField()).type(password);
    }

    @Step
    public void tapLoginButton() {
        $(loginButton()).click();
    }

    @Step
    public void tapResetButton() {
        $(resetButton()).click();
    }
}
