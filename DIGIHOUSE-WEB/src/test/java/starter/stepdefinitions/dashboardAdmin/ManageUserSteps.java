package starter.stepdefinitions.dashboardAdmin;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import org.junit.jupiter.api.Assertions;
import starter.pages.dashboardAdmin.ManageUser;

public class ManageUserSteps{
    @Steps
    ManageUser manageUser;

    @And ( "I tap the Manage User button" )
    public void tapManageUserButton() {
        manageUser.tapManageUserButton();
    }

    @And ( "I enter a valid keyword in the user data" )
    public void enterValidKeywordInTheUserData() {
        manageUser.inputKeyword("tester");
    }

    @And ( "I tap the icon search in a field search" )
    public void tapIconSearch() {
        manageUser.tapIconSearch();
    }

    @Then ( "I see the user data was looking for on the manage user page" )
    public void seeTheUserDataLookingForOnTheManageUserPage() {
        Assertions.assertTrue(manageUser.validateOnManageUserPage());
    }

    @When ( "I enter a invalid keyword in the user data" )
    public void enterInvalidKeywordInTheUserData() {
        manageUser.inputKeyword("tester*&^%");
    }

    @Then ( "I see the message appears \"no data is displayed\"" )
    public void seeMessageAppearNoDataIsDisplayed() {
        Assertions.assertTrue(manageUser.validateOnManageUserPage());
    }

    @When ( "I tap the Lihat button" )
    public void tapLihatButton() {
        manageUser.tapLihatButton();
    }

    @Then ( "I redirected to the detail user page" )
    public void redirectToTheDetailUserPage() {
        Assertions.assertTrue(manageUser.validateOnManageUserPage());
    }

    @And ( "I tap the Hapus button in detail user page" )
    public void tapTheHapusButtonInDetailUserPage() {
        manageUser.tapTheHapusButtonInDetailUserPage();
    }

    @And ( "I tap the Hapus button confirmation in detail user page" )
    public void tapTheHapusDetailConfirmationButton() {
        manageUser.tapTheHapusDetailConfirmationButton();
    }

    @And ( "I successfully delete user data" )
    public void successfullyDeleteUserData() {
        Assertions.assertTrue(manageUser.validateOnManageUserPage());
    }

    @And ( "I tap the Cancel button confirmation in detail user page" )
    public void tapTheCancelDetailConfirmationButton() {
        manageUser.tapTheCancelDetailConfirmationButton();
    }

    @And ( "I still on the user details page" )
    public void stillOnTheUserDetailsPage() {
        Assertions.assertTrue(manageUser.validateOnManageUserPage());
    }

    @When ( "I tap the Hapus button" )
    public void tapTheHapusButton() {
        manageUser.tapTheHapusButton();
    }

    @And ( "I tap the Hapus button in the popup confirmation" )
    public void tapTheHapusButtonInThePopupConfirmation() {
        manageUser.tapTheHapusButtonInThePopupConfirmation();
    }

    @And ( "I tap the Cancel icon in the popup confirmation" )
    public void tapTheCancelButtonInThePopupConfirmation() {
        manageUser.tapTheCancelButtonInThePopupConfirmation();
    }

    @Then ( "I back to the user list page" )
    public void backToTheUserListPage() {
        Assertions.assertTrue(manageUser.validateOnManageUserPage());
    }
}
