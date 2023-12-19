package starter.pages.dashboardAdmin;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class SettingAccount extends PageObject {

    private By settingButton() {
        return By.id("pengaturan");
    }

    private By inputName() {
        return By.id("inpt-setting-username");
    }

    private By inputEmail() {
        return By.id("inpt-setting-email");
    }

    private By inputPassword() {
        return By.id("inpt-setting-secure-password");
    }

    private By simpanButton() {
        return By.id("save-profile-setting");
    }

    @Step
    public boolean validateOnSettingPage() {
        waitForCondition().until(webDriver -> webDriver.findElement(settingButton()).isDisplayed());
        return $(settingButton()).isDisplayed();
    }

    @Step
    public void tapSettingButton() {
        $(settingButton()).click();
    }

    @Step
    public void nameUpdate(String name) {
        $(inputName()).type(name);
    }

    @Step
    public void emailUpdate(String email) {
        $(inputEmail()).type(email);
    }

    @Step
    public void passwordUpdate(String password) {
        $(inputPassword()).type(password);
    }

    @Step
    public void tapSimpanButton() {
        waitForCondition().until(webDriver -> webDriver.findElement(settingButton()).isDisplayed());
        $(simpanButton()).click();
    }
}
