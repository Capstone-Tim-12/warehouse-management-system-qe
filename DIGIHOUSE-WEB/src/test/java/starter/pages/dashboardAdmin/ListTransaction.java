package starter.pages.dashboardAdmin;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class ListTransaction extends PageObject {
    private By buttonTransaction() {
        return By.id("transaksi");
    }

    private By buttonListTransaction() {
        return By.id("daftar-transaksi");
    }

    private By selectLocation() {
        return By.id("filer-location");
    }

    private By chooseLocation() {
        return By.id("list-location");
    }

    private By selectStatusTransaction() {
        return By.id("filter-status");
    }

    private By chooseNeedApproval() {
        return By.id("need-approval");
    }

    private By chooseApproved() {
        return By.id("approve");
    }

    private By chooseRejected() {
        return By.id("reject");
    }

    private By buttonStatus() {
        return By.id("button-status");
    }

    private By buttonTerima() {
        return By.id("approve-button");
    }

    private By buttonTolak() {
        return By.id("reject-button");
    }

    private By buttonReason() {
        return By.id("reason");
    }

    private By chooseReason() {
        return By.id("reason-4");
    }

    private By buttonKirim() {
        return By.id("transaction-rejected");
    }

    @Step
    public void tapTransactionButton() {
        $(buttonTransaction()).click();
    }

    @Step
    public void tapListTransactionButton() {
        $(buttonListTransaction()).click();
    }

    @Step
    public void tapSelectLocation() {
        $(selectLocation()).click();
    }

    @Step
    public void chooseTheLocation() {
        waitForCondition().until(webDriver -> webDriver.findElement(chooseLocation()).isDisplayed());
        $(chooseLocation()).click();
    }

    @Step
    public boolean validateOnLocation() {
        waitForCondition().until(webDriver -> webDriver.findElement(chooseLocation()).isDisplayed());
        return $(chooseLocation()).isDisplayed();
    }

    @Step
    public void seeTransactionBasedOnStatusTransaction() {
        $(selectStatusTransaction()).click();
    }

    @Step
    public void statusNeedApproval() {
        $(chooseNeedApproval()).click();
    }

    @Step
    public boolean validateOnStatusTransactionNeedApproval() {
        waitForCondition().until(webDriver -> webDriver.findElement(chooseNeedApproval()).isDisplayed());
        return $(chooseNeedApproval()).isDisplayed();
    }

    @Step
    public void statusApproved() {
        $(chooseApproved()).click();
    }

    @Step
    public boolean validateOnStatusTransactionApproved() {
        waitForCondition().until(webDriver -> webDriver.findElement(chooseApproved()).isDisplayed());
        return $(chooseApproved()).isDisplayed();
    }

    @Step
    public void statusRejected() {
        $(chooseRejected()).click();
    }

    @Step
    public boolean validateOnStatusTransactionRejected() {
        waitForCondition().until(webDriver -> webDriver.findElement(chooseRejected()).isDisplayed());
        return $(chooseRejected()).isDisplayed();
    }

    @Step
    public void tapTheStatusButton() {
        $(buttonStatus()).click();
    }

    @Step
    public void tapTheTerimaButton() {
        $(buttonTerima()).click();
    }

    @Step
    public boolean validateApprovedStatusTransaction() {
        waitForCondition().until(webDriver -> webDriver.findElement(buttonTerima()).isDisplayed());
        return $(buttonTerima()).isDisplayed();
    }

    @Step
    public void tapTheTolakButton() {
        $(buttonTolak()).click();
    }

    @Step
    public void tapTheSelectReason() {
        $(buttonReason()).click();
    }

    @Step
    public void chooseTheReason() {
        $(chooseReason()).click();
    }

    @Step
    public void tapTheKirimButton() {
        $(buttonKirim()).click();
    }

    @Step
    public boolean validateRejectedStatusTransaction() {
        waitForCondition().until(webDriver -> webDriver.findElement(buttonKirim()).isDisplayed());
        return $(buttonKirim()).isDisplayed();
    }
}
