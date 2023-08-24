package com.zeroBank.pages;

import com.zeroBank.utilities.Driver;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {
    public BasePage() {
        PageFactory.initElements(Driver.get(), this);
    }

    public String getPageTitle() {
        return Driver.get().getTitle();
    }
}
