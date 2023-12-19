package starter.pages.dashboardAdmin;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class Dashboard extends PageObject {
    private By DashboardButton() {
        return By.id("dashboard");
    }

    @Step
    public boolean validateOnDashboardPage() {
        waitForCondition().until(webDriver -> webDriver.findElement(DashboardButton()).isDisplayed());
        return $(DashboardButton()).isDisplayed();
    }
    @Step
    public void tapDashboardButton() {
        $(DashboardButton()).click();
    }
}
