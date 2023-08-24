package com.zeroBank.StepDefs;

import com.zeroBank.pages.HomePage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Home_StepDefs {
    HomePage homePage = new HomePage();

    @Then("The user should be able to see own name: {string} on the home page")
    public void theUserShouldBeAbleToSeeOwnNameOnTheHomePage(String expectedUsername) {
        String actualUserName = homePage.getUserNameText();
        Assert.assertEquals(expectedUsername, actualUserName);
    }

    @When("The user navigates to {string} tab menu")
    public void the_user_navigates_to_tab_menu(String tabMenu) {
        homePage.navigatesTabMenu(tabMenu);
    }
}
