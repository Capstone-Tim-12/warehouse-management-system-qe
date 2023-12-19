package starter.pages.dashboardAdmin;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class Logout extends PageObject {
    private By buttonLogout() {
        return By.id("logout");
    }

    private By buttonYa() {
        return By.id("btn-ok");
    }

    private By buttonBatal() {
        return By.id("cancel-btn");
    }

    @Step
    public boolean validateOnLogoutPage() {
        waitForCondition().until(webDriver -> webDriver.findElement(buttonLogout()).isDisplayed());
        return $(buttonLogout()).isDisplayed();
    }

    @Step
    public void tapLogoutButton() {
        $(buttonLogout()).click();
    }

    @Step
    public void tapYaButton() {
        $(buttonYa()).click();
    }

    @Step
    public void tapBatalButton() {
        $(buttonBatal()).click();
    }
}
