package com.zeroBank.StepDefs;

import com.zeroBank.pages.LoginPage;
import com.zeroBank.utilities.ConfigurationReader;
import com.zeroBank.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login_StepDefs {
    LoginPage loginPage = new LoginPage();

    @Given("The user is on the home zero bank entrance page")
    public void the_user_is_on_the_home_zero_bank_entrance_page() {
        Driver.get().get(ConfigurationReader.get("url"));
    }

    @When("The user clicks on sign in button")
    public void the_user_clicks_on_sign_in_button() {
        loginPage.clickOnSignInButton();
    }

    @When("The user logins with credentials {string} and {string}")
    public void the_user_logins_with_credentials_and(String username, String password) {
        loginPage.login(username, password);
    }

    @When("The user navigates back")
    public void the_user_navigates_back() {
        Driver.get().navigate().back();
    }

    @Then("The warning {string} should be appear")
    public void the_warning_should_be_appear(String expectedMessage) {
        loginPage.assertWarningMessage(expectedMessage);
    }
}
