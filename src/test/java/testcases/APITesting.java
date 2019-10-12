package testcases;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static org.junit.Assert.assertThat;

public class APITesting {

//    @BeforeTest
//    public void setup(){
//        RestAssured.baseURI = "https://jsonplaceholder.typicode.com";
//    }
    @Test
    public void task1() {
        RequestSpecification httpRequest = RestAssured.given();
        String expectedResult = "quia et suscipit\n" +
                "suscipit recusandae consequuntur expedita et cum\n" +
                "reprehenderit molestiae ut ut quas totam\n" +
                "nostrum rerum est autem sunt rem eveniet architecto";


        Response response = httpRequest.get("https://jsonplaceholder.typicode.com/posts/1");
        Assert.assertEquals(response.getStatusCode(), 200);
        Assert.assertEquals(response.jsonPath().getString("id"), "1");
        Assert.assertEquals(response.jsonPath().getString("body"), expectedResult);
    }

    @Test
    public void task2(){
        RequestSpecification httpRequest = RestAssured.given();
        String body = "{\"title\": \"foo\",\"body\": \"bar\",\"userId\": 1}";

        Response response = httpRequest.contentType("application/json; charset=UTF-8").body(body).post("https://jsonplaceholder.typicode.com/posts/");
        Assert.assertEquals(response.getStatusCode(), 201);
        Assert.assertEquals(response.jsonPath().getString("id"), "101");;

    }
}
