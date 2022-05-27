package com.saucelabs.demo.pages;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Page Object for Login page.
 */
public class LoginPage extends AbstractBasePage {
    private final By usernameFieldLocator = By.id("user-name");
    private final By passwordFieldLocator = By.id("password");
    private final By submitButtonLocator = By.id("login-button");

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public String getPagePart() {
        return "";
    }

    /**
     * Log in on page.
     *
     * @param userName the name of the user to log in
     */
    public void login(String userName) {
        // Create an instance of a Selenium explicit wait to dynamically wait for an element
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        // wait for the user name field to be visible and store that element into a variable
        wait.until((driver) -> driver.findElement(usernameFieldLocator).isDisplayed());

        WebElement userNameField = driver.findElement(usernameFieldLocator);
        WebElement passwordField = driver.findElement(passwordFieldLocator);
        WebElement submitButton = driver.findElement(submitButtonLocator);

        userNameField.sendKeys(userName);
        passwordField.sendKeys("secret_sauce");
        submitButton.click();
    }
}
