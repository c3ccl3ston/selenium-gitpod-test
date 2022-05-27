package com.saucelabs.demo.pages;

import org.openqa.selenium.WebDriver;

/**
 * Page Object representing shopping cart page.
 */
public class ShoppingCartPage extends AbstractBasePage {
    public ShoppingCartPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public String getPagePart() {
        return "cart.html";
    }
}
