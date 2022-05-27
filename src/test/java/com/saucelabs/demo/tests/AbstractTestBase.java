package com.saucelabs.demo.tests;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * All Tests need to extend this class to get the correct behavior.
 */
public abstract class AbstractTestBase {

    protected WebDriver driver;

    @Before
    public void setupTest() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }

    @After
    public void tearDownTest() {
        if (driver != null) {
            driver.quit();
        }
    }
}
