import io.restassured.RestAssured;
import io.restassured.internal.common.assertion.Assertion;
import io.restassured.response.Response;
import org.junit.jupiter.api.Assertions;

public class Test {

    private String access_token = "hipnEdlyzrnAvlm3IxrfI4CtQm66scAcuHZz";


    @org.junit.jupiter.api.Test
    public void test() {
        String body1 = String.format("first_name= Olga& last_name= Shcherbakova& " +
                "gender= female& email=oliaki2@yandex.ru& status=" +
                "active&address=Moscow");
        Response response = RestAssured.
                given().auth().oauth2(access_token).
                with().
                header("Content-Type", "application/x-www-form-urlencoded").
                body(body1).
                get("https://gorest.co.in/public-api/users");
        Assertions.assertEquals(200, response.getStatusCode());
        response.body().prettyPrint();
    }
}