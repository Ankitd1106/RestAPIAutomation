import io.restassured.response.Response;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import static io.restassured.RestAssured.get;
import static io.restassured.RestAssured.given;

public class APITests {
    @Test
    void test1() {
        Response res = get("https://fake-json-api.mock.beeceptor.com/users");
        System.out.println("Response = " + res.asPrettyString());
        System.out.println("Status code = " + res.getStatusCode());
        System.out.println("Response Body = " + res.getBody().asPrettyString());
        System.out.println("Response time = " + res.getTimeIn(TimeUnit.MILLISECONDS));
        System.out.println("Response header = " + res.getHeader("content-type"));
    }

    @Test
    void test2() {
        given()
                .get("https://fake-json-api.mock.beeceptor.com/users")
                .then()
                .statusCode(200);
    }
}
