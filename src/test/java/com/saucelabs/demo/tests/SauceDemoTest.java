package com.saucelabs.demo.tests;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import com.saucelabs.demo.pages.LoginPage;
import com.saucelabs.demo.pages.ProductsPage;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.openqa.selenium.TimeoutException;

/**
 * Runs Selenium test for the demo app https://www.saucedemo.com
 */
@RunWith(JUnit4.class)
public class SauceDemoTest extends AbstractTestBase {

  @Test()
  public void loginWorks() {
    LoginPage loginPage = new LoginPage(driver);
    loginPage.visit();
    loginPage.login("standard_user");
    assertTrue(new ProductsPage(driver).isDisplayed());
  }

  @Test(expected = TimeoutException.class)
  public void lockedOutUser() {
    LoginPage loginPage = new LoginPage(driver);
    loginPage.visit();
    loginPage.login("locked_out_user");
    assertFalse(new ProductsPage(driver).isDisplayed());
  }

  @Test(expected = TimeoutException.class)
  public void invalidCredentials() {
    LoginPage loginPage = new LoginPage(driver);
    loginPage.visit();
    loginPage.login("foo_bar_user");
    assertFalse(new ProductsPage(driver).isDisplayed());
  }
}
