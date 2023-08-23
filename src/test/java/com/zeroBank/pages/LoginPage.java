package com.zeroBank.pages;

import com.zeroBank.utilities.BrowserUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{

    @FindBy(css = "button#signin_button")
    private WebElement signInButton;

    @FindBy(css = "input#user_login")
    private WebElement loginBox;

    @FindBy(css = "input#user_password")
    private WebElement passwordBox;

    @FindBy(css = "[type='submit']")
    private WebElement loginButton;

    public void clickOnSignInButton(){
        BrowserUtils.clickWithJS(signInButton);
    }

    public void login(String username, String password){
        BrowserUtils.clearAndSendKeys(loginBox, username);
        BrowserUtils.clearAndSendKeys(passwordBox, password);
        BrowserUtils.clickWithJS(loginButton);
    }
}
