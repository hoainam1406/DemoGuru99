package tests;

import cucumber.api.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = {"src/test/resources/features/TC1.feature"},
        glue = {"steps"},
        plugin = {"pretty", "html:target/cucumber-reports"},
        monochrome = true
)

public class PaymentGetwayTest extends AbstractTestNGCucumberTests {
}
