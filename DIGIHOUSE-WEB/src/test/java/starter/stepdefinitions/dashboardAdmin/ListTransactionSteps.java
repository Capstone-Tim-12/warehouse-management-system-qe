package starter.stepdefinitions.dashboardAdmin;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import net.thucydides.core.annotations.Steps;
import org.junit.jupiter.api.Assertions;
import starter.pages.dashboardAdmin.ListTransaction;

public class ListTransactionSteps {
    @Steps
    ListTransaction listTransaction;

    @And ( "I tap the Transaction button" )
    public void tapTransactionButton() {
        listTransaction.tapTransactionButton();
    }

    @And ( "I tap the List Transaction button" )
    public void tapListTransactionButton() {
        listTransaction.tapListTransactionButton();
    }

    @And ( "I tap the select location" )
    public void tapSelectLocation() {
        listTransaction.tapSelectLocation();
    }

    @And ( "I choose the location" )
    public void chooseTheLocation() {
        listTransaction.chooseTheLocation();
    }

    @Then ( "I see the transaction data was looking for based on location on the list transaction page" )
    public void validateBasedOnLocation() {
        Assertions.assertTrue(listTransaction.validateOnLocation());
    }

    @And ( "I tap the select status transaction" )
    public void tapSelectStatusTransaction() {
        listTransaction.seeTransactionBasedOnStatusTransaction();
    }

    @And ( "I choose the status transaction \"Need Approval\"" )
    public void chooseStatusTransactionNeedApproval() {
        listTransaction.statusNeedApproval();
    }

    @Then ( "I see the transaction data was looking for based on status transaction need approval on the list transaction page" )
    public void validateOnStatusTransactionNeedApproval() {
        Assertions.assertTrue(listTransaction.validateOnStatusTransactionNeedApproval());
    }

    @And ( "I choose the status transaction \"Approved\"" )
    public void chooseStatusTransactionApproved() {
        listTransaction.statusApproved();
    }

    @Then ( "I see the transaction data was looking for based on status transaction approved on the list transaction page" )
    public void seeTransactionBasedOnStatusTransactionApproved() {
        Assertions.assertTrue(listTransaction.validateOnStatusTransactionApproved());
    }

    @And ( "I choose the status transaction \"Rejected\"" )
    public void chooseStatusTransactionRejected() {
        listTransaction.statusRejected();
    }

    @Then ( "I see the transaction data was looking for based on status transaction rejected on the list transaction page" )
    public void seeTransactionBasedOnStatusTransactionRejected() {
        Assertions.assertTrue(listTransaction.validateOnStatusTransactionRejected());
    }

    @And ( "I tap the Status button" )
    public void tapTheStatusButton() {
        listTransaction.tapTheStatusButton();
    }

    @And ( "I tap the Terima button" )
    public void tapTheTerimaButton() {
        listTransaction.tapTheTerimaButton();
    }

    @Then ( "I successfully approved the transaction data" )
    public void successfullyApprovedTheTransactionData() {
        Assertions.assertTrue(listTransaction.validateApprovedStatusTransaction());
    }

    @And ( "I tap the Tolak button" )
    public void tapTheTolakButton() {
        listTransaction.tapTheTolakButton();
    }

    @And ( "I tap the select reason" )
    public void tapTheSelectReason() {
        listTransaction.tapTheSelectReason();
    }

    @And ( "I choose the reason" )
    public void chooseTheReason() {
        listTransaction.chooseTheReason();
    }

    @And ( "I tap the Kirim button" )
    public void tapTheKirimButton() {
        listTransaction.tapTheKirimButton();
    }

    @Then ( "I successfully rejected the transaction data" )
    public void validateRejectedStatusTransaction() {
        Assertions.assertTrue(listTransaction.validateRejectedStatusTransaction());
    }
}
