import io.restassured.RestAssured;
import io.restassured.http.ContentType;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

import org.testng.annotations.Test;


public class Status {

	@Test
public void Test1()
{


		RestAssured.baseURI="http://dummy.restapiexample.com";

		given().

		       when().
		       get("/api/v1/employees").
		       then().assertThat().statusCode(200);

		       /*header("dfd","fsdfds").
		       cookie("dsfs","csder").
		       body()*/


}

}
