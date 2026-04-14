package api.utilities;

import io.restassured.RestAssured;

public class UserApiHelper {

    public static String getFirstUsername() {
        return RestAssured
                .given()
                .when()
                .get("/users")
                .then()
                .statusCode(200)
                .extract()
                .path("[0].username");
    }

    public static String getFirstEmail() {
        return RestAssured
                .given()
                .when()
                .get("/users")
                .then()
                .statusCode(200)
                .extract()
                .path("[0].email");
    }
}