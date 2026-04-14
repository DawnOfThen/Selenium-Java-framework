package integration.tests;

import api.base.ApiBase;
import api.utilities.UserApiHelper;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class IntegrationTest extends ApiBase {

    @Test
    public void apiDataDrivenIntegrationTest() {

        String username = UserApiHelper.getFirstUsername();
        String email = UserApiHelper.getFirstEmail();

        System.out.println("Username: " + username);
        System.out.println("Email: " + email);

        Assertions.assertNotNull(username);
        Assertions.assertFalse(username.isBlank());

        Assertions.assertNotNull(email);
        Assertions.assertTrue(email.contains("@"));
    }
}