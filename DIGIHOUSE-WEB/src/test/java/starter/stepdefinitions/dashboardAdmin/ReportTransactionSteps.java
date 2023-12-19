package starter.stepdefinitions.dashboardAdmin;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import net.thucydides.core.annotations.Steps;
import org.junit.jupiter.api.Assertions;
import starter.pages.dashboardAdmin.ReportTransaction;

public class ReportTransactionSteps {
    @Steps
    ReportTransaction reportTransaction;

    @And ( "I tap the Report Transaction button" )
    public void tapReportTransactionButton() {
        reportTransaction.tapReportTransactionButton();
    }

    @And ( "I choose the transaction type" )
    public void chooseTheTransactionType() {
        reportTransaction.chooseTheTransactionType();
    }

    @And ( "I choose the transaction type \"Weekly\"" )
    public void chooseTransactionWeekly() {
        reportTransaction.transactionWeekly();
    }

    @Then ( "I see the report transaction data was looking for based on transaction type weekly on the report transaction page" )
    public void seeReportTransactionTypeWeekly() {
        Assertions.assertTrue(reportTransaction.validateOnTransactionTypeWeekly());
    }

    @And ( "I choose the transaction type \"Monthly\"" )
    public void chooseTransactionMonthly() {
        reportTransaction.transactionMonthly();
    }

    @Then ( "I see the report transaction data was looking for based on transaction type monthly on the report transaction page" )
    public void seeReportTransactionTypeMonthly() {
        Assertions.assertTrue(reportTransaction.validateOnTransactionTypeMonthly());
    }

    @And ( "I choose the transaction type \"Annual\"" )
    public void chooseTransactionAnnual() {
        reportTransaction.transactionAnnual();
    }

    @Then ( "I see the report transaction data was looking for based on transaction type annual on the report transaction page" )
    public void seeReportTransactionTypeAnnual() {
        Assertions.assertTrue(reportTransaction.validateOnTransactionTypeAnnaul());
    }

    @And ( "I enter a valid keyword in the transaction data" )
    public void enterValidKeywordInTheTransaction() {
        reportTransaction.keywordTransaction("5000000");
    }

    @And ( "I tap the icon search in a field search the report transaction" )
    public void tapIconSearch() {
        reportTransaction.tapIconSearch();
    }

    @Then ( "I see the transaction data was looking for on the report transaction page" )
    public void seeTheUserDataLookingForOnTheManageUserPage() {
        Assertions.assertTrue(reportTransaction.validateSearch());
    }

    @And ( "I enter an invalid keyword in the transaction data" )
    public void enterInvalidKeywordInTheTransaction() {
        reportTransaction.keywordTransaction("Rp 5.000.000,00");
    }

    @Then ( "I see the message appears \"no data is displayed\" on the report transaction page" )
    public void seeMessageAppearsNoDataDisplayed() {
        Assertions.assertTrue(reportTransaction.validateSearch());
    }
}
