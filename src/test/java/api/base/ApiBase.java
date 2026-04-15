package api.base;

import io.restassured.RestAssured;
import org.junit.jupiter.api.BeforeAll;
import utils.ConfigReader;

public class ApiBase {

    @BeforeAll
    public static void setup() {
        RestAssured.baseURI = ConfigReader.getProperty("api.base.url");
    }
}