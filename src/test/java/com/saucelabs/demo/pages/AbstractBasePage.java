package com.saucelabs.demo.pages;

import org.openqa.selenium.WebDriver;

/**
 * All page objects inherit from the base page.
 */
public abstract class AbstractBasePage {
    protected final WebDriver driver;

    public WebDriver getDriver() {
        return this.driver;
    }

    public AbstractBasePage(WebDriver driver) {
        this.driver = driver;
    }

    public void visit() {
        driver.get("https://www.saucedemo.com/" + getPagePart());
    }

    public abstract String getPagePart();
}
