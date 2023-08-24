package com.zeroBank.pages;

import com.zeroBank.utilities.BrowserUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class AccountSummaryPage extends BasePage {

    @FindBy(className = "board-header")
    private List<WebElement> accountTypes;

    @FindBy(xpath = "(//table)[3]//th")
    private List<WebElement> creditAccountsColumns;

    public List<String> getAccountTypesTexts() {
        return BrowserUtils.getElementsText(accountTypes);
    }

    public List<String> getCreditAccountsColumnsTexts() {
        return BrowserUtils.getElementsText(creditAccountsColumns);
    }

}
