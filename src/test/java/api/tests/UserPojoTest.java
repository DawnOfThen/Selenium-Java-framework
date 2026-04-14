package api.tests;

import api.base.ApiBase;
import api.models.User;
import io.restassured.RestAssured;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class UserPojoTest extends ApiBase {

    @Test
    public void getUsersWithPojoTest() {

        List<User> users =
                RestAssured
                        .given()
                        .when()
                        .get("/users")
                        .then()
                        .statusCode(200)
                        .extract()
                        .jsonPath()
                        .getList("", User.class);

        // Assertions
        assertEquals(10, users.size());
        assertEquals(1, users.get(0).getId());
        assertNotNull(users.get(0).getUsername());

        System.out.println("First user: " + users.get(0).getUsername());
    }
}