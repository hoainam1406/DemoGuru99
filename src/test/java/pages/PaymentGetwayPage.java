package pages;

import locators.PaymentGetwayLocator;

public class PaymentGetwayPage extends PaymentGetwayLocator {
    public void paymentGetway() {
        ddlQuatity.click();
        quantity.click();
        buttonByNow.click();
    }
}
