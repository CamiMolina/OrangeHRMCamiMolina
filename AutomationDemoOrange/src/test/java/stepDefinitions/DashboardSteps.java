package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.jupiter.api.Assertions;
import pages.DashboardPage;
import utilities.DriverManager;

public class DashboardSteps {
    DashboardPage dashboardPage = new DashboardPage(DriverManager.getDriver().driver);

    @Then("The home page should be displayed")
    public void verifyDashboardPageIsDisplayed() throws InterruptedException {
        Thread.sleep(5000);
        Assertions.assertTrue(dashboardPage.pageDashboardTitleIsDisplayed());
    }

    @Then("I click on the my info button")
    public void clickOnButtonMyInfo() throws InterruptedException {
        //necesita un waiters
        Thread.sleep(5000);
        dashboardPage.clickOnMyInfoButton();
    }

    @Then("I click on the buzz button")
    public void clickOnBuzzButton() throws InterruptedException {
        Thread.sleep(5000);
        dashboardPage.clickOnBuzzButton();
    }



    @And("I click on the logout button")
    public void clickOnLogout() throws InterruptedException {
        Thread.sleep(5000);
        dashboardPage.clickOnLogoutOrangePage();
    }


}
