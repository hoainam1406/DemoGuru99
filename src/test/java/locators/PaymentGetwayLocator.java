package locators;

import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;
import pages.MyPageObject;

public class PaymentGetwayLocator extends MyPageObject {
    @FindBy(xpath = "//body/section[@id='three']/div[1]/form[1]/div[1]/div[4]/select[1]")
    public WebElementFacade ddlQuatity;

    @FindBy(xpath = "//option[contains(text(),'9')]")
    public WebElementFacade quantity;

    @FindBy(xpath = "//h3[contains(text(),'Price: $20')]")
    public WebElementFacade price;

    @FindBy(xpath = "//body/section[@id='three']/div[1]/form[1]/div[1]/div[8]/ul[1]/li[1]/input[1]")
    public WebElementFacade buttonByNow;
}
