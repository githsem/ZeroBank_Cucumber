package com.zeroBank.pages;

import com.zeroBank.utilities.BrowserUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{

    @FindBy(xpath = "//a[@class='dropdown-toggle'][./i[@class='icon-user']]")
    private WebElement userName;

    public String getUserNameText(){
        return BrowserUtils.getText(userName);
    }
}
