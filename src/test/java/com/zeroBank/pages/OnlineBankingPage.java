package com.zeroBank.pages;

import com.zeroBank.utilities.BrowserUtils;
import com.zeroBank.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class OnlineBankingPage extends BasePage {
    public void navigatesBankingSections(String sectionName) {
        WebElement section = Driver.get().findElement(By.xpath("//span[text()='" + sectionName + "']"));
        BrowserUtils.clickWithJS(section);
    }
}
