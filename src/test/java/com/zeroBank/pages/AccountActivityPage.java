package com.zeroBank.pages;

import com.zeroBank.utilities.BrowserUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class AccountActivityPage extends BasePage {

    @FindBy(id = "aa_accountId")
    @CacheLookup
    private WebElement dropdownAccounts;

    @FindBy(xpath = "//table//th")
    @CacheLookup
    private List<WebElement> showTransactionsColumns;

    public String getDefaultSelectedAccountText() {
        Select select = new Select(dropdownAccounts);
        WebElement firstSelectedOption = select.getFirstSelectedOption();
        return BrowserUtils.getText(firstSelectedOption);
    }

    public List<String> getAllAccountTypesFromDropDown() {
        Select select = new Select(dropdownAccounts);
        List<WebElement> options = select.getOptions();
        return BrowserUtils.getElementsText(options);
    }

    public List<String> getShowTransactionsColumnTexts() {
        return BrowserUtils.getElementsText(showTransactionsColumns);
    }
}
