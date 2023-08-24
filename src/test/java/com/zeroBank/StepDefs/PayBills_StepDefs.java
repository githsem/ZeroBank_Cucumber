package com.zeroBank.StepDefs;

import com.zeroBank.pages.PayBillsPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class PayBills_StepDefs {
    PayBillsPage payBillsPage = new PayBillsPage();

    @When("The user sends {int} dollars to the amount box")
    public void the_user_sends_dollars_to_the_amount_box(Integer amount) {
        payBillsPage.fillAmountBox(amount);
    }

    @When("The user sends {string} to the date box")
    public void the_user_sends_to_the_date_box(String date) {
        payBillsPage.fillDateBox(date);
    }

    @When("The user sends {string} data to the description box")
    public void the_user_sends_data_to_the_description_box(String data) {
        payBillsPage.fillDescriptionBox(data);
    }

    @When("The user clicks on Pay button")
    public void the_user_clicks_on_pay_button() {
        payBillsPage.clickOnPayButton();
    }

    @Then("The user should be able to see success message: {string}")
    public void the_user_should_be_able_to_see_success_message(String expectedMessage) {
        String actualMessage = payBillsPage.getSuccessMessage();
        Assert.assertEquals(expectedMessage, actualMessage);
    }

    @Then("The user should be able to see error message: {string} on amount Box")
    public void theUserShouldBeAbleToSeeErrorMessageOnAmountBox(String expectedErrorMessage) {
        String actualErrorMessage = payBillsPage.getErrorMessageOnAmountBox();
        Assert.assertEquals(expectedErrorMessage, actualErrorMessage);

    }

    @Then("The user should be able to verify that the date box is still empty")
    public void theUserShouldBeAbleToVerifyThatTheDateBoxIsStillEmpty() {
        Assert.assertTrue(payBillsPage.isDateBoxEmpty());
    }
}
