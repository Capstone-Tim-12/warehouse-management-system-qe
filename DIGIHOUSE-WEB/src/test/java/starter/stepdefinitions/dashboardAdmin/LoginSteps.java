package starter.stepdefinitions.dashboardAdmin;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import org.junit.jupiter.api.Assertions;
import starter.pages.dashboardAdmin.Login;
import starter.pages.dashboardAdmin.Dashboard;

public class LoginSteps {
    @Steps
    Login login;

    @Steps
    Dashboard dashboard;

    @Given ( "I set the endpoint on the login page" )
    public void setEndpointLoginPage() {
        login.openUrl("https://digihouse-jaya.netlify.app/admin/login-admin");
        login.validateOnLoginPage();
    }

    @When ( "I enter a valid email" )
    public void enterValidEmail() {
        login.inputEmail("itqa.mia@gmail.com");
    }

    @And ( "I enter a valid password" )
    public void enterValidPassword() {
        login.inputPassword("Testing1");
    }

    @And ( "I tap the Login button" )
    public void tapLoginButton() {
        login.tapLoginButton();
    }

    @Then ( "I redirect to dashboard page" )
    public void redirectDashboardPage() {
        Assertions.assertTrue(dashboard.validateOnDashboardPage());
    }

    @When ( "I blank form login" )
    public void blankFormLogin() {
        login.inputForm("","");
    }

    @Then ( "I see error message appear \"Email or password is required\" on login page" )
    public void seeErrorMessageAppearEmailOrPasswordIsRequiredOnLoginPage() {
        Assertions.assertTrue(login.validateOnLoginPage());
    }

    @When ( "I blank the email" )
    public void blankEmail() {
        login.inputEmail("");
    }

    @Then ( "I see error message appear \"Masukkan Email !\" in login page" )
    public void seeErrorMessageAppearMasukanEmailInLoginPage() {
        Assertions.assertTrue(login.validateOnLoginPage());
    }

    @And ( "I blank the password" )
    public void blankPassword() {
        login.inputPassword("");
    }

    @Then ( "I see error message appear \"Masukkan Password !\" in login page" )
    public void seeErrorMessageAppearMasukanPasswordInLoginPage() {
        Assertions.assertTrue(login.validateOnLoginPage());
    }

    @When ( "I enter an invalid email" )
    public void enterInvalidEmail() {
        login.inputEmail("itqa.mi@gmail.com");
    }

    @Then ( "I see error message appear \"Email atau Password tidak valid !\" in login page" )
    public void seeErrorMessageAppearEmailAtauPasswordTidakValidInLoginPage() {
        Assertions.assertTrue(login.validateOnLoginPage());
    }

    @And ( "I enter an invalid password" )
    public void enterInvalidPassword() {
        login.inputPassword("Testing");
    }

    @When ( "I enter an unregistered email" )
    public void enterUnregisteredEmail() {
        login.inputEmail("tester@gmail.com");
    }

    @When ( "I enter an email that is not an admin role" )
    public void enterEmailIsNotAdminRole() {
        login.inputEmail("miaaprilia2803@gmail.com");
    }

    @Then ( "I see error message appear \"Anda tidak memiliki izin untuk masuk sebagai admin\" in login page" )
    public void seeErrorMessageAppearIsNotAdminRoleInLoginPage() {
        Assertions.assertTrue(login.validateOnLoginPage());
    }

    @And ( "I tap the Reset button" )
    public void tapResetButton() {
        login.tapResetButton();
    }

    @Then ( "I see that the input in each column was deleted on the login page" )
    public void seeThatTheInputEachColumnWasDeletedOnTheLoginPage() {
        Assertions.assertTrue(login.validateOnLoginPage());
    }
}
