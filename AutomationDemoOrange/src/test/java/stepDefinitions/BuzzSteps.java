package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.jupiter.api.Assertions;
import pages.BuzzPage;
import utilities.DriverManager;

public class BuzzSteps {

    BuzzPage buzzPage = new BuzzPage(DriverManager.getDriver().driver);

    @And("I Write one message {string} in the Post TextBox")
    public void setPostMessageTextBox(String postMessage) throws InterruptedException {
        Thread.sleep(5000);
        buzzPage.setPostTextBox(postMessage);
    }
    @And("I click on Post Button")
    public void clickOnPostBuzzon() throws InterruptedException{
        Thread.sleep(5000);
        buzzPage.clickOnBuzzButton();
        //Thread.sleep(5000);
    }
    @Then("I verification post message in buzz page is {string}")
    public void verifycorrectMessageIsDisplayed(String message)throws InterruptedException {
        Thread.sleep(5000);
        Assertions.assertEquals(buzzPage.messagePostIsDisplayed(),message);
    }
}
