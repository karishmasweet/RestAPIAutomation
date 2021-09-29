package API_25Sept2021;

import static io.restassured.RestAssured.given;

import java.util.Set;

import org.json.JSONObject;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class Assignment_jsonmuti_id_26sept 
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
		Set<String> all=responsedata.keySet();// all the keys
		for(String s:all)
		{
			System.out.println("key is "+s);
			System.out.println("value is "+responsedata.getString(s));
		}
	}

}
