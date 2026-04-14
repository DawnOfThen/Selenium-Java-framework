package api.tests;

import api.base.ApiBase;
import io.restassured.RestAssured;
import org.junit.jupiter.api.Test;

import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.hasSize;

public class ApiTest extends ApiBase {

    @Test
    public void getUsersTest() {
        RestAssured
                .given()
                .when()
                .get("/users")
                .then()
                .statusCode(200)
                .body("$", hasSize(10))
                .body("[0].id", equalTo(1));
    }

    @Test
    public void createPostTest() {
        String requestBody = """
            {
              "title": "foo",
              "body": "bar",
              "userId": 1
            }
            """;

        RestAssured
                .given()
                .header("Content-Type", "application/json")
                .body(requestBody)
                .when()
                .post("/posts")
                .then()
                .statusCode(201)
                .body("title", equalTo("foo"))
                .body("body", equalTo("bar"))
                .body("userId", equalTo(1));
    }
}

