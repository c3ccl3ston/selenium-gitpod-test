package com.saucelabs.quickstarts;

import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * Runs Selenium test for the demo app https://www.saucedemo.com
 */
@RunWith(JUnit4.class)
public class SauceDemoTest {

  WebDriver driver;

    @BeforeClass
    public static void setupClass() {
        WebDriverManager.chromedriver().setup();
    }

    @Before
    public void setupTest() {
        driver = new ChromeDriver();
    }

    @After
    public void teardown() {
        if (driver != null) {
            driver.quit();
        }
    }

  @Test
  public void basicTest() {
    // Navigate the browser to the Sauce demo app.
    driver.get("https://www.saucedemo.com");
    assertTrue(driver.getTitle().contains("Swag Labs"));
  }
}
