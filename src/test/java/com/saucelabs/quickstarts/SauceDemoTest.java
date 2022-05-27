package com.saucelabs.quickstarts;

import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Runs Selenium test for the demo app https://www.saucedemo.com
 */
@RunWith(JUnit4.class)
public class SauceDemoTest {

  private WebDriver driver;

  // @BeforeClass
  // public static void setBatch() {

  // // Must be before ALL tests (at Class-level)
  // batch = new BatchInfo("Demo batch");
  // }

  @Before
  public void beforeEach() {
    // Use Chrome browser
    driver = new ChromeDriver();
    driver.manage().window().setSize(new Dimension(1920, 1080));
  }

  @Test
  public void basicTest() {
    // Navigate the browser to the Sauce demo app.
    driver.get("https://www.saucedemo.com");
    assertTrue(driver.getTitle().contains("Swag Labs"));
  }

  @After
  public void afterEach() {
    // Close the browser.
    driver.quit();
  }
}
