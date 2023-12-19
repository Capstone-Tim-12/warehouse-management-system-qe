package starter.stepdefinitions.dashboardAdmin;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import net.thucydides.core.annotations.Steps;
import org.junit.jupiter.api.Assertions;
import starter.pages.dashboardAdmin.Dashboard;

public class DashboardSteps {
    @Steps
    Dashboard dashboard;

    @And ( "I tap the Dashboard button" )
    public void tapDashboardButton() {
        dashboard.tapDashboardButton();
    }

    @Then ( "I see the analytics and reporting in the dashboard page" )
    public void seeTheAnalyticsAndReportingInTheDashboardPage() {
        Assertions.assertTrue(dashboard.validateOnDashboardPage());
    }
}
