package locators;

import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;
import pages.MyPageObject;

public class PaymentProcessLocator extends MyPageObject {
    @FindBy(xpath = "//font[contains(text(),'$180.00')]")
    public WebElementFacade paymentAmount;

    @FindBy(xpath = "//input[@id='cvv_code']")
    public WebElementFacade txtCVVCode;

    @FindBy(xpath = "//select[@id='month']")
    public WebElementFacade ddlExpirationMonth;

    @FindBy(xpath = "//body/section[@id='three']/div[1]/form[1]/div[2]/div[1]/div[6]/div[1]/select[1]/option[3]")
    public WebElementFacade month;

    @FindBy(xpath = "//select[@id='year']")
    public WebElementFacade ddlExpirationYear;

    @FindBy(xpath = "//option[contains(text(),'2021')]")
    public WebElementFacade year;

    @FindBy(xpath = "//body/section[@id='three']/div[1]/form[1]/div[2]/div[1]/ul[1]/li[1]/input[1]")
    public WebElementFacade btnPay;
}
