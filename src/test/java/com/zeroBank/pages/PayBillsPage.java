package com.zeroBank.pages;

import com.zeroBank.utilities.BrowserUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PayBillsPage extends BasePage {

    @FindBy(css = "#sp_amount")
    private WebElement amountBox;

    @FindBy(css = "#sp_date")
    private WebElement dateBox;

    @FindBy(css = "#sp_description")
    private WebElement descriptionBox;

    @FindBy(css = "#pay_saved_payees")
    private WebElement payButton;

    @FindBy(css = "#alert_content>span")
    private WebElement successPayMessage;

    public void fillAmountBox(Integer amount) {
        BrowserUtils.clearAndSendKeys(amountBox, Integer.toString(amount));
    }

    public void fillDateBox(String date) {
        BrowserUtils.clearAndSendKeys(dateBox, date);
    }

    public void fillDescriptionBox(String data) {
        BrowserUtils.clearAndSendKeys(descriptionBox, data);
    }

    public void clickOnPayButton() {
        BrowserUtils.clickWithJS(payButton);
    }

    public String getSuccessMessage() {
        return BrowserUtils.getText(successPayMessage);
    }

    public String getErrorMessageOnAmountBox() {
        return amountBox.getAttribute("validationMessage");
    }

    public boolean isDateBoxEmpty() {
        String value = dateBox.getAttribute("value");
        return value.isEmpty();
    }
}
