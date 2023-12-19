package starter.stepdefinitions.dashboardAdmin;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import org.junit.jupiter.api.Assertions;
import starter.pages.dashboardAdmin.Login;
import starter.pages.dashboardAdmin.Logout;

public class LogoutSteps {
    @Steps
    Logout logout;

    @Steps
    Login login;

    @And ( "I tap the Logout button" )
    public void tapLogoutButton() {
        logout.tapLogoutButton();
    }

    @And ( "I tap the Ya button" )
    public void tapYaButton() {
        logout.tapYaButton();
    }

    @Then ( "I redirected to the login page" )
    public void redirectLoginPage() {
        Assertions.assertTrue(login.validateOnLoginPage());
    }

    @And ( "I tap the Batal button" )
    public void tapBatalButton() {
        logout.tapBatalButton();
    }

    @Then ( "I still on the dashboard admin page" )
    public void stillOnTheDashboardPage() {
        Assertions.assertTrue(logout.validateOnLogoutPage());
    }
}
