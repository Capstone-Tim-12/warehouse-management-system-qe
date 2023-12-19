package starter.stepdefinitions.dashboardAdmin;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import net.thucydides.core.annotations.Steps;
import org.junit.jupiter.api.Assertions;
import starter.pages.dashboardAdmin.SettingAccount;

public class SettingAccountSteps {

    @Steps
    SettingAccount settingAccount;

    @And ( "I tap the Setting button" )
    public void tapSettingButton() {
        settingAccount.tapSettingButton();
    }

    @And ( "I enter a name update" )
    public void nameUpdate() {
        settingAccount.nameUpdate("Mia Aprilia Satya");
    }

    @And ( "I enter a email update" )
    public void emailUpdate() {
        settingAccount.emailUpdate("itqa.mia@gmail.com");
    }

    @And ( "I enter a password update" )
    public void passwordUpdate() {
        settingAccount.passwordUpdate("Testing1");
    }

    @And ( "I tap the Simpan button" )
    public void tapSimpanButton() {
        settingAccount.tapSimpanButton();
    }

    @Then ( "I received message appear \"SUCCESS UPDATE USER\" in setting account update page" )
    public void receivedMessageAppearSuccessUpdateUser() {
        Assertions.assertTrue(settingAccount.validateOnSettingPage());
    }

    @And ( "I blank the name update" )
    public void blankNameUpdate() {
        settingAccount.nameUpdate("");
    }

    @And ( "I blank the email update" )
    public void blankEmailUpdate() {
        settingAccount.emailUpdate("");
    }

    @And ( "I blank the password update" )
    public void blankPasswordUpdate() {
        settingAccount.passwordUpdate("");
    }

    @Then ( "I received error message appear \"Masukkan Password!\" in setting account update page" )
    public void receivedMessageAppearMesukkanPassword() {
        Assertions.assertTrue(settingAccount.validateOnSettingPage());
    }

    @Then ( "I received error message appear \"FAILED UPDATE USER\" in setting account update page" )
    public void receivedMessageAppearFailedUpdateUser() {
        Assertions.assertTrue(settingAccount.validateOnSettingPage());
    }
}
