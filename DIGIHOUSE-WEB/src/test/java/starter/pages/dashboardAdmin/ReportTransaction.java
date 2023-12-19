package starter.pages.dashboardAdmin;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class ReportTransaction extends PageObject {
    private By buttonReportTransaction() {
        return By.id("laporan-transaksi");
    }

    private By chooseTransactionType() {
        return By.id("select-filter");
    }

    private By chooseWeekly() {
        return By.id("weekly");
    }

    private By ChooseMonthly() {
        return By.id("monthly");
    }

    private By ChooseAnnual() {
        return By.id("annual");
    }

    private By inputKeywordTransaction() {
        return By.id("input-search");
    }

    private By buttonSearch() {
        return By.id("button-search");
    }

    @Step
    public void tapReportTransactionButton() {
        $(buttonReportTransaction()).click();
    }

    @Step
    public void chooseTheTransactionType() {
        $(chooseTransactionType()).click();
    }

    @Step
    public void transactionWeekly() {
        $(chooseWeekly()).click();
    }

    @Step
    public boolean validateOnTransactionTypeWeekly() {
        waitForCondition().until(webDriver -> webDriver.findElement(chooseWeekly()).isDisplayed());
        return $(chooseWeekly()).isDisplayed();
    }

    @Step
    public void transactionMonthly() {
        $(ChooseMonthly()).click();
    }

    @Step
    public boolean validateOnTransactionTypeMonthly() {
        waitForCondition().until(webDriver -> webDriver.findElement(ChooseMonthly()).isDisplayed());
        return $(ChooseMonthly()).isDisplayed();
    }

    @Step
    public void transactionAnnual() {
        $(ChooseAnnual()).click();
    }

    @Step
    public boolean validateOnTransactionTypeAnnaul() {
        waitForCondition().until(webDriver -> webDriver.findElement(ChooseAnnual()).isDisplayed());
        return $(ChooseAnnual()).isDisplayed();
    }

    @Step
    public void keywordTransaction(String keywordTransaction) {
        $(inputKeywordTransaction()).type(keywordTransaction);
    }

    @Step
    public void tapIconSearch() {
        $(buttonSearch()).click();
    }

    @Step
    public boolean validateSearch() {
        waitForCondition().until(webDriver -> webDriver.findElement(buttonSearch()).isDisplayed());
        return $(buttonSearch()).isDisplayed();
    }
}
