package API_11Sept2021;
import java.util.Scanner;

import org.json.JSONObject;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import static io.restassured.RestAssured.*;

public class Assignment_complex_orgjson 
{
	public static void main(String[] args)
	{
		JSONObject aanchal=new JSONObject();
		aanchal.put("Sector", "288");
		aanchal.put("Houseno", "207889");
		
		JSONObject karishma=new JSONObject();
		karishma.put("firstname","kanikasanjay");
		karishma.put("lastname","vermasharma");
		karishma.put("age","312");
		karishma.put("id","2000978790");
		karishma.put("Company name","roundclassonejhjh");
		karishma.put("Address",aanchal);
		
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
