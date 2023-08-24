package com.zeroBank.pages;

import com.zeroBank.utilities.BrowserUtils;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {

    @FindBy(css = "button#signin_button")
    private WebElement signInButton;

    @FindBy(css = "input#user_login")
    private WebElement loginBox;

    @FindBy(css = "input#user_password")
    private WebElement passwordBox;

    @FindBy(css = "[type='submit']")
    private WebElement loginButton;

    @FindBy(css = ".alert.alert-error")
    @CacheLookup
    private WebElement warningMessage;

    public void clickOnSignInButton() {
        BrowserUtils.clickWithJS(signInButton);
    }

    public void login(String username, String password) {
        BrowserUtils.clearAndSendKeys(loginBox, username);
        BrowserUtils.clearAndSendKeys(passwordBox, password);
        BrowserUtils.clickWithJS(loginButton);
    }

    public String getWarningMessage() {
        return BrowserUtils.getText(warningMessage);
    }

    public void assertWarningMessage(String expectedMessage) {
        String actualMessage = getWarningMessage();
        Assert.assertEquals(expectedMessage, actualMessage);
    }
}
