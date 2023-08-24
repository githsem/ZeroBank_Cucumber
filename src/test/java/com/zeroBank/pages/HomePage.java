package com.zeroBank.pages;

import com.zeroBank.utilities.BrowserUtils;
import com.zeroBank.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

    @FindBy(xpath = "//a[@class='dropdown-toggle'][./i[@class='icon-user']]")
    private WebElement userName;

    public String getUserNameText() {
        return BrowserUtils.getText(userName);
    }

    public void navigatesTabMenu(String tabMenu) {
        WebElement tab = Driver.get().findElement(By.xpath("//strong[text()='" + tabMenu + "']"));
        BrowserUtils.clickWithJS(tab);
    }
}
