package steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;
import org.junit.Assert;
import pages.IndexPage;
import pages.PaymentGetwayPage;
import pages.PaymentProcessPage;

import java.io.IOException;

public class PaymentProcessSteps {
    @Steps
    PaymentProcessPage paymentProcessPage;


    @When("^The user fill information of credit card except Card Number field$")
    public void theUserChooseQuantityProductAndClickByNow() throws IOException { paymentProcessPage.paymentProcess(); }


    @Then("^The message \"([^\"]*)\" is shown$")
    public void theMessageIsShown(String message) {
        Assert.assertEquals(paymentProcessPage.getAlertMessage(), message);
    }
}
