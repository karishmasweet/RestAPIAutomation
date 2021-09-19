package API_11Sept2021;

import static io.restassured.RestAssured.*;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class Get 
{
	public static void main(String[] args)
	{
		Response r=
		given()
		.contentType(ContentType.JSON)
		.when()
		.get("http://localhost:3000/APIFolks");
		
		System.out.println("status code is "+r.statusCode());
		System.out.println("data is");
		System.out.println(r.asString());
	}

}
