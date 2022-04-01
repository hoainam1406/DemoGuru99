package pages;

import au.com.bytecode.opencsv.CSVReader;
import locators.PaymentProcessLocator;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.FileReader;
import java.io.IOException;

public class PaymentProcessPage extends PaymentProcessLocator {
    public String getPaymentAmount() throws InterruptedException {
        Thread thread = new Thread(() -> {
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        thread.start();
        thread.join();
        return paymentAmount.getText();
    }


    String CSV_file = "E:\\SMD_Project\\DemoGuru99\\src\\test\\Data.csv";
    public void paymentProcess() throws IOException {
        CSVReader reader = new CSVReader(new FileReader(CSV_file));
        String[] cell;
        while((cell = reader.readNext()) != null) {
            for (int i=0; i<1; i++){
                String cvvCode = cell [0];
                ddlExpirationMonth.click();
                month.click();
                ddlExpirationYear.click();
                year.click();
                txtCVVCode.sendKeys(cvvCode);
                btnPay.click();
            }
        }
    }



    public String getAlertMessage(){
        String errorMessage;
        try
        {
            waitForAlertPresence();
            errorMessage =  getDriver().switchTo().alert().getText();
        }
        catch(NoAlertPresentException Ex)
        {
            return "Alert not found";
        }
        return errorMessage;
    }

    public void waitForAlertPresence() {
        try {
            WebDriverWait wait = new WebDriverWait(getDriver(), 2000);
            wait.until(ExpectedConditions.alertIsPresent());
        } catch (Exception e) {
            System.out.println("Alert not found");
        }
    }
}
