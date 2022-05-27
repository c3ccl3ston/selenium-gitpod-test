package com.saucelabs.demo.pages;

import org.openqa.selenium.WebDriver;

/**
 * Page Object for Checkout Step One.
 */
public class CheckoutStepOnePage extends AbstractBasePage {
    public CheckoutStepOnePage(WebDriver driver) {
        super(driver);
    }

    @Override
    public String getPagePart() {
        return "checkout-step-one.html";
    }
}
