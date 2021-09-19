package API_11Sept2021;

import java.util.Scanner;

import org.json.JSONObject;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import static io.restassured.RestAssured.*;

public class Assignment_simple_orgjson 
{
	public static void main(String[] args) 
	{
		JSONObject karishma=new JSONObject();
		
		karishma.put("firstname","kanika");
		karishma.put("lastname","malhotra");
		karishma.put("age","30");
		karishma.put("id","2000279");
		karishma.put("Company name","clicklabs");
		karishma.put("Address", "chandigarh");
		
		Response r=
		given ()
		.contentType(ContentType.JSON)
		.body(karishma.toString())
		.when()
		.post("http://localhost:3000/APIFolks");
		
		System.out.println("status code is ");
		System.out.println(r.statusCode());
		System.out.println("response is");
		System.out.println(r.asString());
		
		
		
	}

}
