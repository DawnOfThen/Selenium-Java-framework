package tests;

import base.BaseTests;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pages.LoginPage;
import utils.ConfigReader;

public class LoginTest extends BaseTests {

    @Test
    public void validLoginTest() {
        LoginPage loginPage = new LoginPage(driver);

        loginPage.open(ConfigReader.getProperty("baseUrl"));
        loginPage.login(
                ConfigReader.getProperty("username"),
                ConfigReader.getProperty("password")
        );

        Assertions.assertTrue(
                loginPage.getSuccessMessage().contains("You logged into a secure area!"),
                "Login was not successful."
        );
    }

    @Test
    public void invalidLoginTest() {
        LoginPage loginPage = new LoginPage(driver);

        loginPage.open(ConfigReader.getProperty("baseUrl"));
        loginPage.login("wrongUser", "wrongPass");

        Assertions.assertTrue(
                loginPage.getSuccessMessage().contains("Your username is invalid!"),
                "Error message was not displayed as expected."
        );
    }
    @Test
    public void logoutTest() {
        LoginPage loginPage = new LoginPage(driver);

        loginPage.open(ConfigReader.getProperty("baseUrl"));
        loginPage.login(
                ConfigReader.getProperty("username"),
                ConfigReader.getProperty("password")
        );

        loginPage.clickLogout();

        Assertions.assertTrue(
                loginPage.getSuccessMessage().contains("You logged out of the secure area!"),
                "Logout was not successful."
        );
    }
}