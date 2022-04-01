package steps;

import cucumber.api.PendingException;
import pages.IndexPage;
import pages.PaymentGetwayPage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;
import org.junit.Assert;
import pages.PaymentProcessPage;

public class PaymentSteps {
    @Steps
    PaymentGetwayPage paymentGetwayPage;
    PaymentProcessPage paymentProcessPage;
    IndexPage indexPage;

    @Given("^Open home page$")
    public void openHomePage() {indexPage.open();}

    @When("^The user choose quantity product and click By Now$")
    public void theUserChooseQuantityProductAndClickByNow() { paymentGetwayPage.paymentGetway();}


    @Then("^The payment amount \"([^\"]*)\" is shown$")
    public void thePaymentAmountIsShown(String amount) throws Throwable {
        Assert.assertEquals(paymentProcessPage.getPaymentAmount(), amount);
    }

}
