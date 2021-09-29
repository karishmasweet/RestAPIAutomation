package API_25Sept2021;

import static io.restassured.RestAssured.given;

import org.json.JSONArray;
import org.json.JSONObject;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class Assignment_jsonallkey_26sept 
{
	public static void main(String[] args)
	{
	Response r=
			given()
			.contentType(ContentType.JSON)
			.when()
			.get("http://localhost:3000/APIFolks");
	
	System.out.println("status code is ");
	System.out.println(r.statusCode());
	
	JSONArray js=new JSONArray (r.asString());
	int length=js.length();
	
	for(int i=0;i<length;i++)
		
	{
		JSONObject ob=js.getJSONObject(i);
		System.out.println("id is "+ob.get("id"));
	}
			
	
	}

}
