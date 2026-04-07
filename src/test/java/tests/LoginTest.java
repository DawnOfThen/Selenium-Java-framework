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
}
