package API_25Sept2021;

import static io.restassured.RestAssured.given;

import org.json.JSONObject;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class Assignment_Jsonsingleid_26sept 
{

	public static void main(String[] args)
	{
		Response r=
		given()
		.contentType(ContentType.JSON)
		.when()
		.get("http://localhost:3000/APIFolks/1189");
		
		System.out.println("status code is ");
		System.out.println(r.statusCode());
		
		JSONObject responsedata=new JSONObject(r.asString());
		System.out.println(responsedata.get("id"));
	}

}
